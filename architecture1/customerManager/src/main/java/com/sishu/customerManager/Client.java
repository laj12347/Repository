package com.sishu.customerManager;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

import com.sishu.customerManager.dao.CustomerDAO;
import com.sishu.customerManager.vo.CustomerModel;
import com.sishu.customerManager.vo.CustomerQueryModel;
@Service
public class Client {
	
	@Autowired
	private CustomerDAO	dao=null;
	
	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Client client= (Client) ctx.getBean(Client.class);
		
		
//		for (int i = 0; i < 40; i++) {
//			CustomerModel customerModel=new CustomerModel();
//			customerModel.setCustomerId("c"+i);
//			customerModel.setPwd("c"+i);
//			customerModel.setShowName("c"+i);
//			customerModel.setRegisterTime("registerTime");
//			customerModel.setTrueName("registerTime");
//			client.dao.create(customerModel);
//		}
//		
		CustomerQueryModel c = new CustomerQueryModel();
		c.getPage().setCurrentPage(1);
		List<CustomerModel> list =client.dao.getByConditionPage(c);
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).getCustomerId());
		}
		
		
		 
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
}
