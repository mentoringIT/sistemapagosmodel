package mx.com.mentoringit.model.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import mx.com.mentoringit.model.dto.PSPDTO;


@Repository
public class PSPDAO implements IPSP{
	private JdbcTemplate jdbcTemplate;

	@Autowired
	public void setJdbcTemplate(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	public List<PSPDTO> lastPayment(){
		String select = "select p.date_payment,s.name, s.email,s.phone,pr.name as courseName," +
				 		"p.num_payment,p.amount_payment,p.type_payment,p.total_course "+
						"from tbl_payment as p, tbl_student as s, tbl_product as pr "+
						"where p.student_id = s.id "+
						"and p.product_id = pr.id " +
						"and p.type_register = 's' order by p.ID desc";
		
		List<PSPDTO> lpsp = this.jdbcTemplate.query(select, new RowMapper<PSPDTO>(){

			public PSPDTO mapRow(ResultSet rs, int rowNum) throws SQLException {
				PSPDTO psp = new PSPDTO();
				
				psp.setDatePayment(rs.getDate("date_payment"));
				psp.setStudentName(rs.getString("name"));
				psp.setEmail(rs.getString("email"));
				psp.setPhone(rs.getString("phone"));
				psp.setCourseName(rs.getString("courseName"));
				psp.setNumPayment(rs.getInt("num_payment"));
				psp.setAmountPayment(rs.getDouble("amount_payment"));
				psp.setTypePayment(rs.getString("type_payment"));
				psp.setTotalCourse(rs.getDouble("total_course"));
				
				return psp;
			}});
		
		return lpsp;
	}
	
	 public List<PSPDTO> paymentByStudent(Integer idStudent,Integer idProduct) throws Exception {
		String select = "select p.date_payment,s.name, s.email,s.phone,pr.name as courseName,p.num_payment,"+
						"p.amount_payment,p.type_payment,p.total_course "+ 
						"from tbl_payment as p, tbl_student as s, tbl_product as pr "+
						"where p.student_id = s.id "+
						"and p.product_id = pr.id "+
						"and p.student_id = ? "+
						"and p.product_id = ?";
		
		List<PSPDTO> payments = this.jdbcTemplate.query(select, new Object[]{idStudent,idProduct}, new RowMapper<PSPDTO>(){

			public PSPDTO mapRow(ResultSet rs, int rowNum) throws SQLException {
				PSPDTO ps = new PSPDTO();
								
				ps.setDatePayment(rs.getDate("date_payment"));
				ps.setStudentName(rs.getString("name"));
				ps.setEmail(rs.getString("email"));
				ps.setPhone(rs.getString("phone"));
				ps.setCourseName(rs.getString("courseName"));
				ps.setNumPayment(rs.getInt("num_payment"));
				ps.setAmountPayment(rs.getDouble("amount_payment"));
				ps.setTypePayment(rs.getString("type_payment"));
				ps.setTotalCourse(rs.getDouble("total_course"));
				
				return ps;
			}
		});		
				
		return payments;
	}

	


}
