package com.ims.product.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import com.ims.product.model.DataStore;
import com.ims.product.model.Product;
import com.ims.product.model.ProductValidation;
import com.ims.product.view.AddProduct;
import com.ims.product.view.DialogBox;

public class DataStoreController implements ActionListener{

	private AddProduct addProduct;
	public DataStoreController(AddProduct addProduct) {
		this.addProduct = addProduct;
	}

	public void actionPerformed(ActionEvent e) {
		try{    
				ProductValidation isValid = new ProductValidation(addProduct);
				new DataStore(new Product(addProduct.txtId.getText(),isValid.p,isValid.q));
				new DialogBox("Product Added SuccessFully", "Successfull Operation");
			}
		catch(Exception e3)
		{
		}
		
	}

}
