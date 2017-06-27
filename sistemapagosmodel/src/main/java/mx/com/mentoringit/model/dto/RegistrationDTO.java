package mx.com.mentoringit.model.dto;

public class RegistrationDTO {
	private Integer courseId;
	private Integer studentId;
	private Short status;
	private Integer productoId;
	private String comment;
	
	public RegistrationDTO(){
		status = 1;
		comment = "it is good";
		
	}
	
	public Integer getCourseId() {
		return courseId;
	}
	public Integer getStudentId() {
		return studentId;
	}
	public Short getStatus() {
		return status;
	}
	
	public String getComment() {
		return comment;
	}
	public void setCourseId(Integer courseId) {
		this.courseId = courseId;
	}
	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}
	public void setStatus(Short status) {
		this.status = status;
	}
	
	public void setComment(String comment) {
		this.comment = comment;
	}

	public Integer getProductoId() {
		return productoId;
	}

	public void setProductoId(Integer productoId) {
		this.productoId = productoId;
	}

}
