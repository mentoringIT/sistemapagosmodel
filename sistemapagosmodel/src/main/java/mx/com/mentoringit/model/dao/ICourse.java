package mx.com.mentoringit.model.dao;

import java.util.List;

import mx.com.mentoringit.model.dto.CourseDTO;

public interface ICourse {
	public List<CourseDTO> select() throws Exception;

}
