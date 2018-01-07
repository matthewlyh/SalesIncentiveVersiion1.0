package com.chinaTele.SalesIncentive.SalesIncentive.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Component;

import com.chinaTele.SalesIncentive.SalesIncentive.dao.ProductMapper;
import com.chinaTele.SalesIncentive.SalesIncentive.model.Product;
import com.chinaTele.SalesIncentive.SalesIncentive.service.ProductService;

@Component
public class ProductServiceImpl implements ProductService {
	
	@Autowired
	ProductMapper productMapper;

	@Override
	public Product selectByPrimaryKey(Integer productId) {
		// TODO 自动生成的方法存根
		return productMapper.selectByPrimaryKey(productId);
	}

}
