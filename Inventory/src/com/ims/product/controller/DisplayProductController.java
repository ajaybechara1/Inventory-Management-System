package com.ims.product.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.ArrayList;

import com.ims.product.model.Product;
import com.ims.product.model.ReadProduct;
import com.ims.product.view.DialogBox;
import com.ims.product.view.DisplayAllProducts;

public class DisplayProductController implements ActionListener{

	public void actionPerformed(ActionEvent e) {
		
			// Display Product
			try {
				ArrayList<Product> products = ReadProduct.readProduct();
				if(!products.isEmpty())
					new DisplayAllProducts(products);
				else
					new DialogBox("There were No Product!", "Message");
			} catch (ClassNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			// Display all products by array list
		
	}
}