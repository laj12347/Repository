package com.sishu.customerManager.vo;

import com.sishu.util.PageInfo;

public class CustomerQueryModel extends CustomerModel {

	public PageInfo<CustomerModel> page = new PageInfo<CustomerModel>();

	public PageInfo<CustomerModel> getPage() {
		return page;
	}

	public void setPage(PageInfo<CustomerModel> page) {
		this.page = page;
	}

}
