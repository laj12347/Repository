package com.sishu.customerManager.dao;

import java.util.List;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.sishu.customerManager.vo.CustomerModel;
import com.sishu.customerManager.vo.CustomerQueryModel;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class CustomerDAOTest {
	@Autowired
	CustomerDAO customerDAO;

	@Test
	public void ma() {
		CustomerQueryModel c = new CustomerQueryModel();
		c.getPage().setCurrentPage(1);;
		List<CustomerModel> tt = customerDAO.getByConditionPage(c);
		System.out.println(tt.size());
	}

}
