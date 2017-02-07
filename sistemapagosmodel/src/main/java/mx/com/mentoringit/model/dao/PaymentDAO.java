package mx.com.mentoringit.model.dao;

import java.sql.Date;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import mx.com.mentoringit.model.dto.PaymentDTO;

@Repository
public class PaymentDAO implements IPayment{
	
	private JdbcTemplate jdbcTemplate;
	
	@Autowired
	public void setJdbcTemplate(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	public void insertPayment(PaymentDTO payment) throws Exception {
		String insert ="insert into tbl_payment " +
						"(student_id,course_id,num_payment,amount_payment,type_payment,date_payment,total_course,product_id) " +
						"values (?,?,?,?,?,?,?,?)";
		
		Date date = new Date(payment.getDate_payment().getTime());
		
		this.jdbcTemplate.update(insert,payment.getStudent_id(),payment.getCourse_id(),
				payment.getNum_payment(),payment.getAmount_payment(),payment.getType_payment(),date,
				payment.getTotal_course(),payment.getProduct_id());
	
		
	}
	
}
