package mx.com.mentoringit.model.dto;

import java.util.Date;

public class PSPDTO {
	private Date datePayment;
	private String studentName;
	private String email;
	private String phone;
	private String courseName;
	private Integer numPayment;
	private Double amountPayment;
	private String typePayment;
	private Double totalCourse;
	
	public PSPDTO(){}
		
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

	public Integer getNumPayment() {
		return numPayment;
	}

	public void setNumPayment(Integer numPayment) {
		this.numPayment = numPayment;
	}

	public Double getAmountPayment() {
		return amountPayment;
	}

	public void setAmountPayment(Double amountPayment) {
		this.amountPayment = amountPayment;
	}

	public String getTypePayment() {
		return typePayment;
	}

	public void setTypePayment(String typePayment) {
		this.typePayment = typePayment;
	}

	public Double getTotalCourse() {
		return totalCourse;
	}

	public void setTotalCourse(Double totalCourse) {
		this.totalCourse = totalCourse;
	}

}
