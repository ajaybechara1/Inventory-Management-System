package com.ims.product.controller;

import com.ims.product.model.ProductValidation;
import com.ims.product.view.ProductScanForUpdate;

public class ProductScanForUpdateController extends UpdateProductController{

	public  ProductScanForUpdate updatedProductView ;
	public  ProductValidation isValid;
	public ProductScanForUpdateController(String productId) {
		
		updatedProductView = new ProductScanForUpdate(productId);
	
	}

}
