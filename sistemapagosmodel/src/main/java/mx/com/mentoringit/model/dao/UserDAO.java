package mx.com.mentoringit.model.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import mx.com.mentoringit.model.dto.UserDTO;

@Repository
public class UserDAO implements IUser {

	public UserDAO() {
	}
	private JdbcTemplate jdbcTemplate;

	@Autowired
	public void setDataSource(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}

	public UserDTO userLogin(UserDTO userDTO) throws Exception {
		UserDTO user = this.jdbcTemplate.queryForObject(
		        "SELECT username FROM tbl_users where  username = ? and password  = ? ",
		        new Object[]{userDTO.getUsername(), userDTO.getPassword()},
		        new RowMapper<UserDTO>() {
		            public UserDTO mapRow(ResultSet rs, int rowNum) throws SQLException {
		                UserDTO user = new UserDTO();
		                user.setUsername(rs.getString("username"));
		                return user;
		            }
		        });
		return user;
	}
}