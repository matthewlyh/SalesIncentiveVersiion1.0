package com.chinaTele.SalesIncentive.SalesIncentive.service;
import com.chinaTele.SalesIncentive.SalesIncentive.model.ProductModel;

/**
 * Created by Administrator on 2017/10/25.
 */
public interface ProductService {

    ProductModel FindProByID (int product_id);
    void updateOrAdd(ProductModel productmodel);
    void delete(String product_id);
}
