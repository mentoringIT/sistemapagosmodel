package mx.com.mentoringit.model.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import mx.com.mentoringit.model.dto.CourseDTO;
import mx.com.mentoringit.model.dto.StudentDTO;

@Repository
public class CourseDAO implements ICourse {
	private JdbcTemplate jdbcTemplate;

	@Autowired
	public void setJdbcTemplate(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}

	public CourseDAO() {
	};

	public List<CourseDTO> select() throws Exception {
		String select = "select * from tbl_course";
		List<CourseDTO> lCourse = this.jdbcTemplate.query(select, new RowMapper<CourseDTO>() {

			public CourseDTO mapRow(ResultSet rs, int rowNum) throws SQLException {
				CourseDTO course = new CourseDTO();

				course.setId(rs.getInt("ID"));
				course.setHierarchy_id(rs.getInt("HIERARCHY_ID"));
				course.setName(rs.getString("NAME"));
				course.setResume(rs.getString("RESUME"));
				course.setProfile(rs.getString("PROFILE"));
				course.setDescription(rs.getString("DESCRIPTION"));
				course.setAlias(rs.getString("ALIAS"));
				course.setContent(rs.getString("CONTENT"));
				course.setRanking(rs.getShort("RANKING"));
				course.setPublished_price(rs.getDouble("PUBLISHED_PRICE"));
				course.setStatus(rs.getShort("STATUS"));

				return course;
			}
		});

		return lCourse;
	}
	
	public CourseDTO selectName(Integer idCourse) throws Exception {
		CourseDTO course = this.jdbcTemplate.queryForObject(
		        "select c.name from tbl_course as c where c.id = ?",
		        new Object[]{idCourse},
		        new RowMapper<CourseDTO>() {
		            public CourseDTO mapRow(ResultSet rs, int rowNum) throws SQLException {
		                CourseDTO course = new CourseDTO();
		                
		                course.setName(rs.getString("name"));
		                
		                return course;
		            }
		        });
		return course;
	}
	 

}
