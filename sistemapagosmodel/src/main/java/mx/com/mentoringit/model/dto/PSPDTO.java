package mx.com.mentoringit.model.dto;

import java.util.Date;

public class PSPDTO {
	private Date datePayment;
	private String studentName;
	private String email;
	private String phone;
	private String courseName;
	
	public PSPDTO(){}
	
	public PSPDTO(Date datePayment, String studentName, String email, String phone, String courseName) {
		super();
		this.datePayment = datePayment;
		this.studentName = studentName;
		this.email = email;
		this.phone = phone;
		this.courseName = courseName;
	}
	
	public Date getDatePayment() {
		return datePayment;
	}
	public void setDatePayment(Date datePayment) {
		this.datePayment = datePayment;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

}
