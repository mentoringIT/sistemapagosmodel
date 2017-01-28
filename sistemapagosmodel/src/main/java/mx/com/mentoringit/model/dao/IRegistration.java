package mx.com.mentoringit.model.dao;

import java.util.List;

import mx.com.mentoringit.model.dto.StudentDTO;

public interface IRegistration {
	public List<StudentDTO> select(Integer id, String date) throws Exception;

}
