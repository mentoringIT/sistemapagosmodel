package mx.com.mentoringit.model.dao;

import java.util.List;

import mx.com.mentoringit.model.dto.ProfileDTO;
import mx.com.mentoringit.model.dto.StudentDTO;

public interface IStudent {
	
	public List<StudentDTO> select() throws Exception;
	public void insertStudent(StudentDTO student) throws Exception;
//	public void insertProfile(ProfileDTO profile) throws Exception;
	public StudentDTO selectIdMax() throws Exception;
	public StudentDTO selectStudent(Integer idStudent) throws Exception;

}
