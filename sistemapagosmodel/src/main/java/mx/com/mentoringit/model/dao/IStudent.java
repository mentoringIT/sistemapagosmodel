package mx.com.mentoringit.model.dao;

import java.util.List;

import mx.com.mentoringit.model.dto.StudentDTO;

public interface IStudent {
	
	public List<StudentDTO> select() throws Exception;
	public void insertStudent(StudentDTO student) throws Exception;
	public StudentDTO selectIdMax() throws Exception;

}
