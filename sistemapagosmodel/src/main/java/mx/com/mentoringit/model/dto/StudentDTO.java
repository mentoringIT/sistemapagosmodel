package mx.com.mentoringit.model.dto;

public class StudentDTO {
	private Integer id;
	private String email;
	private String name;
	private String phone;
	private String addres;
	private Short status;
	private String type_register;
	
	public StudentDTO(){}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAddres() {
		return addres;
	}
	public void setAddres(String addres) {
		this.addres = addres;
	}
	public Short getStatus() {
		return status;
	}
	public void setStatus(Short status) {
		this.status = status;
	}
	
	public String getType_register() {
		return type_register;
	}
	public void setType_register(String type_register) {
		this.type_register = type_register;
	}
	@Override
	public String toString() {
		return  name;
	}
	
	

}
