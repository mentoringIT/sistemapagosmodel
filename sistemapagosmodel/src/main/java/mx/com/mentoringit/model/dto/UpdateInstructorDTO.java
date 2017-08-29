package mx.com.mentoringit.model.dto;

public class UpdateInstructorDTO {
	private Integer id;
	private String email;
	private String name;
	private String phone;
	private String addres;
	private Short status;
	private String type_register;
	private Integer studentId;
	private String typeStudy;
	private String certification;
	private String degree;
	private String cedula;
	
	public Integer getId() {
		return id;
	}
	public String getEmail() {
		return email;
	}
	public String getName() {
		return name;
	}
	public String getPhone() {
		return phone;
	}
	public String getAddres() {
		return addres;
	}
	public Short getStatus() {
		return status;
	}
	public String getType_register() {
		return type_register;
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
	public void setId(Integer id) {
		this.id = id;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public void setAddres(String addres) {
		this.addres = addres;
	}
	public void setStatus(Short status) {
		this.status = status;
	}
	public void setType_register(String type_register) {
		this.type_register = type_register;
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
	public Integer getStudentId() {
		return studentId;
	}
	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}
	@Override
	public String toString() {
		return "UpdateInstructorDTO [id=" + id + ", email=" + email + ", name=" + name + ", phone=" + phone
				+ ", addres=" + addres + ", status=" + status + ", type_register=" + type_register + ", studentId="
				+ studentId + ", typeStudy=" + typeStudy + ", certification=" + certification + ", degree=" + degree
				+ ", cedula=" + cedula + "]";
	}



}
