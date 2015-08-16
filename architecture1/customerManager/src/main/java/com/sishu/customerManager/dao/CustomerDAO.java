package com.sishu.customerManager.dao;

import org.springframework.stereotype.Repository;
import com.sishu.common.dao.BaseDao;
import com.sishu.customerManager.vo.CustomerModel;
import com.sishu.customerManager.vo.CustomerQueryModel;

@Repository
public interface CustomerDAO extends BaseDao<CustomerModel, CustomerQueryModel> {

}
