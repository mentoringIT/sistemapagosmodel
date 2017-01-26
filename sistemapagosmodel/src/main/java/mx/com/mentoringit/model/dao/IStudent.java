package mx.com.mentoringit.model.dao;

import java.util.List;

import mx.com.mentoringit.model.dto.StudentDTO;

public interface IStudent {
	
	public List<StudentDTO> select() throws Exception;

}
