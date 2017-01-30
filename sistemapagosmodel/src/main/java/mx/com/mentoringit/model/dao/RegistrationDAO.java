package mx.com.mentoringit.model.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import mx.com.mentoringit.model.dto.StudentDTO;

@Repository
public class RegistrationDAO implements IRegistration{
	
	private JdbcTemplate jdbcTemplate;

	@Autowired
	public void setDataSource(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}


	public List<StudentDTO> select(Integer id) throws Exception {
		String select = "select tbl_student.name " + 
						"from tbl_student, tbl_registration " +
						"where tbl_registration.student_id = tbl_student.id " +
						"and tbl_registration.course_id = ? ";
		
		List<StudentDTO> lstd = this.jdbcTemplate.query(select, new Object[]{id}, new RowMapper<StudentDTO>(){

			public StudentDTO mapRow(ResultSet rs, int rowNum) throws SQLException {
				StudentDTO std = new StudentDTO();
				std.setName(rs.getString("NAME"));
				
				return std;
			}
		});		
				
		return lstd;
	}

}
