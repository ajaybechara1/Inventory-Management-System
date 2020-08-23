package com.ims.product.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import com.ims.product.model.MatchProductId;
import com.ims.product.model.Product;
import com.ims.product.model.ProductValidation;
import com.ims.product.model.ReadProduct;
import com.ims.product.model.UpdateProductDetails;

public class UpdateProductController implements ActionListener{
	public String productId;
	ArrayList<Product> products;
	ProductIdScanController PSC;
	public Product newUpdatedProduct;
	ProductScanForUpdateController nowChange;
	public void actionPerformed(ActionEvent e) {
		//Get Id FromUser
		PSC =  new ProductIdScanController();
		/////////////////////////*****************//////////////////
		PSC.inputId.bSubmit.addActionListener(
				new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
						productId = PSC.inputId.txtId.getText();	
		try 
		{
				products = ReadProduct.readProduct();
				if(MatchProductId.matchProductId(productId, products)){
					nowChange = new ProductScanForUpdateController(productId);
					nowChange.updatedProductView.addValueForUpdate.bSubmit.addActionListener(
							
							new ActionListener() {
								
								public void actionPerformed(ActionEvent e) {
									try {
										nowChange.isValid = new ProductValidation(nowChange.updatedProductView.addValueForUpdate);
										newUpdatedProduct =  new Product(productId,nowChange.isValid.p,nowChange.isValid.q);
										new UpdateProductDetails(productId,newUpdatedProduct,products);
										
									}
									catch (Exception e1)
									{
									}
									
								}
							}
					);
				}else
				JOptionPane.showMessageDialog(new JFrame(), "ProductId Not Matched!", "WRONG", JOptionPane.OK_CANCEL_OPTION);			
		} 
		catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		// If Product Exist then...Update
					}
		});
		////////////////////////////****************////////////////
				
	} // End of UpdateProductController's addActionListener method
}
