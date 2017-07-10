package mx.com.mentoringit.model.dao;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import mx.com.mentoringit.model.dto.ProductDTO;
import mx.com.mentoringit.model.dto.ProfileDTO;

@Repository
public class ProfileDAO implements IProfile {

	private JdbcTemplate jdbcTemplate;

	@Autowired
	public void setJdbcTemplate(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}

	public void insertProfile(ProfileDTO profile) throws Exception {
		String insert = "insert into tbl_profile(student_id,type_study,certification,degree,cedula) "
				+ "values((select max(?) from tbl_student),?,?,?,?)";

		this.jdbcTemplate.update(insert, profile.getStudentId(),profile.getTypeStudy(),profile.getCertification(),
				profile.getDegree(),profile.getCedula());

	}

}
