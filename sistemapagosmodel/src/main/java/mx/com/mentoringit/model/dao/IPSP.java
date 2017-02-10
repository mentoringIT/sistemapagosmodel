package mx.com.mentoringit.model.dao;

import java.util.List;

import mx.com.mentoringit.model.dto.PSPDTO;

public interface IPSP {
	public List<PSPDTO> lastPayment() throws Exception;

}
