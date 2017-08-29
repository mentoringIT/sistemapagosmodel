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
import mx.com.mentoringit.model.dto.ProfileDTO;
import mx.com.mentoringit.model.dto.StudentDTO;

import mx.com.mentoringit.model.dto.UpdateInstructorDTO;
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
		String select = "select * from tbl_student where type_register = 't'";
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
		StudentDTO student = this.jdbcTemplate.queryForObject("select max(s.id) as ID from tbl_student as s",
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
		String insert = "insert into tbl_student(email,name,phone,status,type_register) " + "values (?,?,?,?,?)";

		this.jdbcTemplate.update(insert, student.getEmail(), student.getName(), student.getPhone(), student.getStatus(),
				student.getType_register());

	}

	public StudentDTO selectStudent(Integer idStudent) throws Exception {
		StudentDTO student = this.jdbcTemplate.queryForObject("select * from tbl_student as s where s.id = ?",
				new Object[] { idStudent }, new RowMapper<StudentDTO>() {
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

	public UpdateInstructorDTO selectInstructor(Integer idInstructor) throws Exception {
		String select = "select * from tbl_student as s,tbl_profile as p where s.ID = p.STUDENT_ID and s.id = ?";

		UpdateInstructorDTO instructor = this.jdbcTemplate.queryForObject(select, new Object[] { idInstructor },
				new RowMapper<UpdateInstructorDTO>() {
					public UpdateInstructorDTO mapRow(ResultSet rs, int rowNum) throws SQLException {
						UpdateInstructorDTO instructor = new UpdateInstructorDTO();

						instructor.setId(rs.getInt("ID"));
						instructor.setEmail(rs.getString("EMAIL"));
						instructor.setName(rs.getString("NAME"));
						instructor.setPhone(rs.getString("PHONE"));
						instructor.setAddres(rs.getString("ADDRESS"));
						instructor.setStatus(rs.getShort("STATUS"));
						instructor.setType_register(rs.getString("type_register"));
						instructor.setStudentId(rs.getInt("STUDENT_ID"));
						instructor.setTypeStudy(rs.getString("TYPE_STUDY"));
						instructor.setCertification(rs.getString("CERTIFICATION"));
						instructor.setDegree(rs.getString("DEGREE"));
						instructor.setCedula(rs.getString("CEDULA"));

						return instructor;
					}
				});
		return instructor;
	}

	public void updateInstructor(UpdateInstructorDTO instructorDTO) throws Exception {
		String update = "update tbl_student as s, tbl_profile as p "
				+ "set s.phone = ?, s.email = ? , p.type_study = ?, p.certification = ?, p.degree = ?, p.cedula = ? "
				+ "where s.id = p.student_id " + "and s.id = ";

		this.jdbcTemplate.update(update, instructorDTO.getPhone(), instructorDTO.getEmail(), instructorDTO.getTypeStudy(), instructorDTO.getCertification(),
				instructorDTO.getDegree(), instructorDTO.getCedula(), instructorDTO.getId());

	}

}
