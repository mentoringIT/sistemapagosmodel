package mx.com.mentoringit.model.dto;

import java.util.Date;

public class ProductDTO {
	
	private Integer id;
	private Integer course_id;
	private Date start_date;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getCourse_id() {
		return course_id;
	}
	public void setCourse_id(Integer course_id) {
		this.course_id = course_id;
	}
	public Date getStart_date() {
		return start_date;
	}
	public void setStart_date(Date start_date) {
		this.start_date = start_date;
	}
	
	@Override
	public String toString() {
		return start_date+"";
	}
	
	
	
}
