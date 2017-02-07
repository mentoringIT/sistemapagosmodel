package mx.com.mentoringit.model.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import mx.com.mentoringit.model.dto.ProductDTO;

@Repository
public class ProductDAO implements IProduct{
	
	private JdbcTemplate jdbcTemplate;
	@Autowired
	public void setJdbcTemplate(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	 public List<ProductDTO> startDate(int id, String date1, String date2) throws Exception {
		String select = "select  p.id, p.course_id, p.start_date from tbl_product as p "+
						"where p.course_id = ? "+
						"and p.start_date between ? and ?";
		
		
		List<ProductDTO> productDTO = this.jdbcTemplate.query(select, new Object[]{id,date1,date2}, new RowMapper<ProductDTO>(){

			public ProductDTO mapRow(ResultSet rs, int rowNum) throws SQLException {
				ProductDTO product = new ProductDTO();
				product.setId(rs.getInt("ID"));
				product.setCourse_id(rs.getInt("COURSE_ID"));
				product.setStart_date(rs.getDate("START_DATE"));
				
				return product;
			}
		});		
				
		return productDTO;

	} 

}
