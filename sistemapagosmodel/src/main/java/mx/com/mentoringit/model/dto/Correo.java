package mx.com.mentoringit.model.dto;

public class Correo {
	private String userEmail;
	private String password;
	private String from;
	private String subject;
	private String message;
	
	public String getUserEmail() {
		return userEmail;
	}
	public String getPassword() {
		return password;
	}
	public String getFrom() {
		return from;
	}
	public String getSubject() {
		return subject;
	}
	public String getMessage() {
		return message;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public void setMessage(String message) {
		this.message = message;
	}


}
