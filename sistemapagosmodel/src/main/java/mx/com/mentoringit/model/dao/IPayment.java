package mx.com.mentoringit.model.dao;

import mx.com.mentoringit.model.dto.PaymentDTO;

public interface IPayment {
	public void insertPayment(PaymentDTO payment) throws Exception; 

}
