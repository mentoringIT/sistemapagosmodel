package mx.com.mentoringit.model.dto;

public class UserDTO {

	private Integer id;
	private String username;
	private String password;
	private String email;
	private String activkey;
	private Integer createtime;
	private Integer lastvisit;
	private Integer superuser;
	private Integer status;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getActivkey() {
		return activkey;
	}

	public void setActivkey(String activkey) {
		this.activkey = activkey;
	}

	public Integer getCreatetime() {
		return createtime;
	}

	public void setCreatetime(Integer createtime) {
		this.createtime = createtime;
	}

	public Integer getLastvisit() {
		return lastvisit;
	}

	public void setLastvisit(Integer lastvisit) {
		this.lastvisit = lastvisit;
	}

	public Integer getSuperuser() {
		return superuser;
	}

	public void setSuperuser(Integer superuser) {
		this.superuser = superuser;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "UserDTO [id=" + id + ", username=" + username + ", password=" + password + ", email=" + email
				+ ", activkey=" + activkey + ", createtime=" + createtime + ", lastvisit=" + lastvisit + ", superuser="
				+ superuser + ", status=" + status + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((activkey == null) ? 0 : activkey.hashCode());
		result = prime * result + ((createtime == null) ? 0 : createtime.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((lastvisit == null) ? 0 : lastvisit.hashCode());
		result = prime * result + ((password == null) ? 0 : password.hashCode());
		result = prime * result + ((status == null) ? 0 : status.hashCode());
		result = prime * result + ((superuser == null) ? 0 : superuser.hashCode());
		result = prime * result + ((username == null) ? 0 : username.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		UserDTO other = (UserDTO) obj;
		if (activkey == null) {
			if (other.activkey != null)
				return false;
		} else if (!activkey.equals(other.activkey))
			return false;
		if (createtime == null) {
			if (other.createtime != null)
				return false;
		} else if (!createtime.equals(other.createtime))
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (lastvisit == null) {
			if (other.lastvisit != null)
				return false;
		} else if (!lastvisit.equals(other.lastvisit))
			return false;
		if (password == null) {
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password))
			return false;
		if (status == null) {
			if (other.status != null)
				return false;
		} else if (!status.equals(other.status))
			return false;
		if (superuser == null) {
			if (other.superuser != null)
				return false;
		} else if (!superuser.equals(other.superuser))
			return false;
		if (username == null) {
			if (other.username != null)
				return false;
		} else if (!username.equals(other.username))
			return false;
		return true;
	}

}
