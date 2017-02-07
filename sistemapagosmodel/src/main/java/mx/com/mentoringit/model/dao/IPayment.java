package mx.com.mentoringit.model.dao;

import java.util.List;

import mx.com.mentoringit.model.dto.PaymentDTO;

public interface IPayment {
	public void insertPayment(PaymentDTO payment) throws Exception; 
	public List<PaymentDTO> selectPayment(Integer idStudent, Integer idProduct) throws Exception;

}
