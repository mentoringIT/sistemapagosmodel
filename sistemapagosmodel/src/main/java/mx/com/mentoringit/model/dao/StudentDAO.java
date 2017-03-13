package mx.com.mentoringit.model.dao;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import mx.com.mentoringit.model.dto.PaymentDTO;
import mx.com.mentoringit.model.dto.StudentDTO;
import mx.com.mentoringit.model.dto.UserDTO;

@Repository
public class StudentDAO implements IStudent {

	public StudentDAO() {
	};

	private JdbcTemplate jdbcTemplate;

	@Autowired
	public void setJdbcTemplate(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}

	public List<StudentDTO> select() throws Exception {
		String select = "select * from tbl_student";
		List<StudentDTO> lAlumnos = this.jdbcTemplate.query(select, new RowMapper<StudentDTO>() {
			public StudentDTO mapRow(ResultSet rs, int rowNum) throws SQLException {
				StudentDTO student = new StudentDTO();
				student.setId(rs.getInt("ID"));
				student.setEmail(rs.getString("EMAIL"));
				student.setName(rs.getString("NAME"));
				student.setPhone(rs.getString("PHONE"));
				student.setAddres(rs.getString("ADDRESS"));
				student.setStatus(rs.getShort("STATUS"));
				return student;
			}
		});

		return lAlumnos;
	}
	
	public StudentDTO selectIdMax() throws Exception {
		StudentDTO student = this.jdbcTemplate.queryForObject(
		        "select max(s.id) as ID from tbl_student as s",
		        new RowMapper<StudentDTO>() {
		            public StudentDTO mapRow(ResultSet rs, int rowNum) throws SQLException {
		                StudentDTO student = new StudentDTO();
		                student.setId(rs.getInt("ID"));
		                return student;
		            }
		        });
		return student;
	}
	
	
	public void insertStudent(StudentDTO student) throws Exception {
		String insert ="insert into tbl_student(email,name,phone,status) "+ 
						"values (?,?,?,1)";
		
		this.jdbcTemplate.update(insert,student.getEmail(),student.getName(),student.getPhone());	
		
	}
	
	 public StudentDTO selectStudent(Integer idStudent) throws Exception {
		StudentDTO student = this.jdbcTemplate.queryForObject(
		        "select * from tbl_student as s where s.id = ?",
		        new Object[]{idStudent},
		        new RowMapper<StudentDTO>() {
		            public StudentDTO mapRow(ResultSet rs, int rowNum) throws SQLException {
		                StudentDTO student = new StudentDTO();
		                
		                student.setId(rs.getInt("ID"));
						student.setEmail(rs.getString("EMAIL"));
						student.setName(rs.getString("NAME"));
						student.setPhone(rs.getString("PHONE"));
						student.setAddres(rs.getString("ADDRESS"));
						student.setStatus(rs.getShort("STATUS"));
		                
		                return student;
		            }
		        });
		return student;
	}
	 

}
