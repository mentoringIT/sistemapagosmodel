package mx.com.mentoringit.model.dao;

import java.util.List;

import mx.com.mentoringit.model.dto.ProductDTO;

public interface IProduct {
	public List<ProductDTO> startDate(int id, String date1, String date2) throws Exception;

}
