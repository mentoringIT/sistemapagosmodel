package mx.com.mentoringit.model.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import mx.com.mentoringit.model.dto.RegistrationDTO;
import mx.com.mentoringit.model.dto.StudentDTO;

@Repository
public class RegistrationDAO implements IRegistration{
	
	private JdbcTemplate jdbcTemplate;

	@Autowired
	public void setDataSource(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}


	public List<StudentDTO> select(Integer id) throws Exception {
		String studentByCourse = "select s.id, s.name " + 
								 "from tbl_student as s, tbl_registration as r " + 
								 "where r.student_id = s.id " + 
								 "and r.course_id = ?";
		
		List<StudentDTO> lstd = this.jdbcTemplate.query(studentByCourse, new Object[]{id}, new RowMapper<StudentDTO>(){

			public StudentDTO mapRow(ResultSet rs, int rowNum) throws SQLException {
				StudentDTO std = new StudentDTO();
				std.setId(rs.getInt("ID"));
				std.setName(rs.getString("NAME"));
				
				return std;
			}
		});		
				
		return lstd;
	}
	
	public void insertRegister(RegistrationDTO registrationDTO){
		String insert = "insert into tbl_registration (course_id,student_id,status,date_joined,comment) " +
					    "value(?,?,?,(select start_date from tbl_product where id = ?),?)";
				
		this.jdbcTemplate.update(insert, registrationDTO.getCourseId(),registrationDTO.getStudentId(),
				registrationDTO.getStatus(),registrationDTO.getProductoId(),registrationDTO.getComment());
		
	}

}
