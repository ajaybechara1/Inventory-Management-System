package com.ims.product.view;

import java.awt.Color;

public class ProductScanForUpdate {
	public AddProduct addValueForUpdate;
	public ProductScanForUpdate(String productId) {
		
		addValueForUpdate = new AddProduct();
		addValueForUpdate.lblId.setText("Product Id");
		addValueForUpdate.txtId.setText(productId);
		addValueForUpdate.txtId.setBackground(Color.yellow);
		addValueForUpdate.txtId.setEnabled(false);
		addValueForUpdate.a.setName("Add Product Details for Update");
		addValueForUpdate.bSubmit.setText("Update");
		
	}
}
