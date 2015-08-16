package com.sishu.customerManager.dao;

import java.util.List;

import org.springframework.stereotype.Repository;
import com.sishu.customerManager.vo.CustomerModel;
import com.sishu.customerManager.vo.CustomerQueryModel;

@Repository
public interface CustomerDAO {

	public void create(CustomerModel customerModel);
	
	public void update(CustomerModel customerModel);
	
	public void delete(int uuid);
	
	public CustomerModel getByUuid(int uuid);
	
	public List<CustomerModel> getByConditionPage(CustomerQueryModel customerQueryModel);
	
}
