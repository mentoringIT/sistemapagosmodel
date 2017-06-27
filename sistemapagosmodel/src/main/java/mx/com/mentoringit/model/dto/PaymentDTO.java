package mx.com.mentoringit.model.dto;

import java.util.Date;

public class PaymentDTO {
	private Integer id;
	private Integer student_id;
	private Integer course_id;
	private Integer num_payment;
	private Double amount_payment;
	private String type_payment;
	private Date date_payment;
	private Double total_course;
	private Integer product_id;
	private String type_register;
	
	
	
	public PaymentDTO() {	
		this.num_payment = null;
		this.total_course = 0.0;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getStudent_id() {
		return student_id;
	}
	public void setStudent_id(Integer student_id) {
		this.student_id = student_id;
	}
	public Integer getCourse_id() {
		return course_id;
	}
	public void setCourse_id(Integer course_id) {
		this.course_id = course_id;
	}
	public Integer getNum_payment() {
		return num_payment;
	}
	public void setNum_payment(Integer num_payment) {
		this.num_payment = num_payment;
	}
	public Double getAmount_payment() {
		return amount_payment;
	}
	public void setAmount_payment(Double amount_payment) {
		this.amount_payment = amount_payment;
	}
	public String getType_payment() {
		return type_payment;
	}
	public void setType_payment(String type_payment) {
		this.type_payment = type_payment;
	}
	
	public Double getTotal_course() {
		return total_course;
	}
	public void setTotal_course(Double total_course) {
		this.total_course = total_course;
	}
	public Integer getProduct_id() {
		return product_id;
	}
	public void setProduct_id(Integer product_id) {
		this.product_id = product_id;
	}
	public Date getDate_payment() {
		return date_payment;
	}
	public void setDate_payment(Date date_payment) {
		this.date_payment = date_payment;
	}
	public String getType_register() {
		return type_register;
	}
	public void setType_register(String type_register) {
		this.type_register = type_register;
	}
	

}
