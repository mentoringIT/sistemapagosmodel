package mx.com.mentoringit.model.dao;

import mx.com.mentoringit.model.dto.UserDTO;

public interface IUser {

	UserDTO userLogin(UserDTO  userDTO) throws Exception;
	
}