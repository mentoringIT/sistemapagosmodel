package mx.com.mentoringit.model.dto;

public class ProfileDTO {
	private Integer studentId;
	private String typeStudy;
	private String certification;
	private String degree;
	private String cedula;
	
	public ProfileDTO() {}

	public Integer getStudentId() {
		return studentId;
	}

	public String getTypeStudy() {
		return typeStudy;
	}

	public String getCertification() {
		return certification;
	}

	public String getDegree() {
		return degree;
	}

	public String getCedula() {
		return cedula;
	}

	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}

	public void setTypeStudy(String typeStudy) {
		this.typeStudy = typeStudy;
	}

	public void setCertification(String certification) {
		this.certification = certification;
	}

	public void setDegree(String degree) {
		this.degree = degree;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}
	
	
}
