package mx.com.mentoringit.model.dto;

public class ReportData {
	
	private String studentName;
	private String courseName;
	private String numPayment;
	private String amountPayment;
	private String datePayment;
	private String typePayment;
	private String remaining;
	private String totalCourse;
	
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public String getNumPayment() {
		return numPayment;
	}
	public void setNumPayment(String numPayment) {
		this.numPayment = numPayment;
	}
	public String getAmountPayment() {
		return amountPayment;
	}
	public void setAmountPayment(String amountPayment) {
		this.amountPayment = amountPayment;
	}
	public String getDatePayment() {
		return datePayment;
	}
	public void setDatePayment(String datePayment) {
		this.datePayment = datePayment;
	}
	public String getTypePayment() {
		return typePayment;
	}
	public void setTypePayment(String typePayment) {
		this.typePayment = typePayment;
	}
	public String getRemaining() {
		return remaining;
	}
	public void setRemaining(String remaining) {
		this.remaining = remaining;
	}
	public String getTotalCourse() {
		return totalCourse;
	}
	public void setTotalCourse(String totalCourse) {
		this.totalCourse = totalCourse;
	}
	@Override
	public String toString() {
		return "ReportData [studentName=" + studentName + ", courseName=" + courseName + "]";
	}
	
	

}
