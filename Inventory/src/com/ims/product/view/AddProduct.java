package com.ims.product.view;



import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class AddProduct implements ActionListener{
	public JTextField txtId,txtPrice,txtQuantity;
	public JLabel lblId,lblPrice,lblQuantity;
	public JButton bSubmit;
	public JFrame a;

	public AddProduct(){
		
		a= new JFrame("Add Product Details");
		
		lblId = new JLabel("Enter Id ");
		lblId.setBounds(50,125,100,30);
		txtId = new JTextField();
		txtId.setBounds(155,125,127,30);
		
		lblPrice = new JLabel("Enter Price");
		lblPrice.setBounds(50,155,100,30);
		txtPrice = new JTextField("0.0");
		txtPrice.setBounds(155,155,127,30);
		
		lblQuantity = new JLabel("Enter Quantity");
		lblQuantity.setBounds(50,185,125,30);
		txtQuantity = new JTextField("0.0");
		txtQuantity.setBounds(155,185,127,30);
		
		
		
 bSubmit =  new JButton("Add");	
bSubmit.setBounds(155,210,125,30);
	bSubmit.addActionListener(this);

 	a.add(lblId);
	a.add(lblPrice);
	a.add(lblQuantity);
	a.add(txtId);
	a.add(txtPrice);
	a.add(txtQuantity);
	a.add(bSubmit);
	a.setSize(475,375); 
	
	  Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
	    int x = (int) ((dimension.getWidth() - a.getWidth()) / 2);
	    int y = (int) ((dimension.getHeight() - a.getHeight()) / 2);
	    a.setLocation(x, y);
	    a.setResizable(false);
    a.setLayout(null);  
    a.setVisible(true);
    
	}

	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		a.dispose();
	}

}
