package com.ims.product.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import com.ims.product.view.AddProduct;

public class AddProductController implements ActionListener{
	
	public void actionPerformed(ActionEvent e) {
		
		try {
			AddProduct addProduct = new AddProduct();
			addProduct.bSubmit.addActionListener(new DataStoreController(addProduct));
			
		} catch (Exception e1) {
			JOptionPane.showMessageDialog(new JFrame(), "Some thing is wrong!!\nProduct Not Added", "ERROR", JOptionPane.ERROR_MESSAGE);
		}
		
	}

}
