package com.ims.product.view;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Operation extends JFrame implements ActionListener{

	private static final long serialVersionUID = 1L;
	static int choice=0;
	JFrame f;
	public JButton addProductButton;
	public JButton updateProductButton;
	public JButton displayProductButton;
	
	public Operation() {

		f= new JFrame("Operation");
		  Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
		  	int x;
		    int y;
			JPanel operations = new JPanel();

		addProductButton = new JButton("Add The Product");
		addProductButton.setBounds(125,125,200,30);

		updateProductButton = new JButton("Update Product Details");
		updateProductButton.setBounds(125,155,200,30);
		
		displayProductButton = new JButton("Display All Product");
		displayProductButton.setBounds(125,185,200,30);
		
		f.add(addProductButton);
		f.add(displayProductButton);
		f.add(updateProductButton);
		
		operations.setVisible(true);
			  
	    f.setSize(475,375); 
		  dimension = Toolkit.getDefaultToolkit().getScreenSize();
		    x = (int) ((dimension.getWidth() - f.getWidth()) / 2);
		    y = (int) ((dimension.getHeight() - f.getHeight()) / 2);
		    f.setLocation(x, y);
		    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		    f.add(operations);
		     x = (int) ((475 - 240) / 2);
		     y = (int) ((375- 100) / 2);
			operations.setBounds(x, y, 240, 100);
			f.setLayout(new GridLayout());
		    f.setResizable(false);
		    f.setLayout(null);  
	    f.setVisible(true);  
	}

	public void actionPerformed(ActionEvent e) {
	}
}