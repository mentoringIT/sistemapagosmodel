package mx.com.mentoringit.model.dto;

public class CourseDTO {
	private Integer id;
	private Integer hierarchy_id;
	private String name;
	private String resume;
	private String profile;
	private String description;
	private String alias;
	private String content;
	private Short ranking;
	private Double published_price;
	private Short status;
	
	public CourseDTO(){};
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getHierarchy_id() {
		return hierarchy_id;
	}
	public void setHierarchy_id(Integer hierarchy_id) {
		this.hierarchy_id = hierarchy_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getResume() {
		return resume;
	}
	public void setResume(String resume) {
		this.resume = resume;
	}
	public String getProfile() {
		return profile;
	}
	public void setProfile(String profile) {
		this.profile = profile;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getAlias() {
		return alias;
	}
	public void setAlias(String alias) {
		this.alias = alias;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	

	public Short getRanking() {
		return ranking;
	}
	public void setRanking(Short ranking) {
		this.ranking = ranking;
	}
	public Double getPublished_price() {
		return published_price;
	}
	public void setPublished_price(Double published_price) {
		this.published_price = published_price;
	}
	public Short getStatus() {
		return status;
	}
	public void setStatus(Short status) {
		this.status = status;
	}
	
	@Override
	public String toString() {
		return id + name;
	}	

}
