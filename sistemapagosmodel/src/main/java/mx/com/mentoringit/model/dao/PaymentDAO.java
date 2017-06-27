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

import mx.com.mentoringit.model.dto.CourseDTO;
import mx.com.mentoringit.model.dto.PaymentDTO;
import mx.com.mentoringit.model.dto.StudentDTO;

@Repository
public class PaymentDAO implements IPayment{
	
	private JdbcTemplate jdbcTemplate;
	
	@Autowired
	public void setJdbcTemplate(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	public void insertPayment(PaymentDTO payment) throws Exception {
		String insert ="insert into tbl_payment " +
						"(student_id,course_id,num_payment,amount_payment,type_payment,date_payment,total_course,product_id,type_register) " +
						"values (?,?,?,?,?,?,?,?,?)";
		
		Date date = new Date(payment.getDate_payment().getTime());
		
		this.jdbcTemplate.update(insert,payment.getStudent_id(),payment.getCourse_id(),
				payment.getNum_payment(),payment.getAmount_payment(),payment.getType_payment(),date,
				payment.getTotal_course(),payment.getProduct_id(),payment.getType_register());
	
		
	}
	
	public List<PaymentDTO> selectPayment(Integer idStudent, Integer idProduct ) throws Exception {
		String select = "select * from tbl_payment as p where p.student_id = ? and p.product_id = ?";
		
		List<PaymentDTO> payment = this.jdbcTemplate.query(select, new Object[]{idStudent,idProduct}, new RowMapper<PaymentDTO>(){

			public PaymentDTO mapRow(ResultSet rs, int rowNum) throws SQLException {
				PaymentDTO paymentDTO = new PaymentDTO();
				
				paymentDTO.setId(rs.getInt("ID"));
				paymentDTO.setStudent_id(rs.getInt("STUDENT_ID"));
				paymentDTO.setCourse_id(rs.getInt("COURSE_ID"));
				paymentDTO.setNum_payment(rs.getInt("NUM_PAYMENT"));
				paymentDTO.setAmount_payment(rs.getDouble("AMOUNT_PAYMENT"));
				paymentDTO.setType_payment(rs.getString("TYPE_PAYMENT"));
				paymentDTO.setDate_payment(rs.getDate("DATE_PAYMENT"));
				paymentDTO.setTotal_course(rs.getDouble("TOTAL_COURSE"));
				paymentDTO.setProduct_id(rs.getInt("PRODUCT_ID"));				
				
				return paymentDTO;
			}
		});		
				
		return payment;
	}


	
}
