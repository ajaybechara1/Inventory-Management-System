package com.ims.product.view;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import com.ims.product.controller.UpdateProductController;

public class InputId  extends UpdateProductController implements ActionListener{
	public JTextField txtId;
	JLabel lblId;
	public JButton bSubmit;
	JFrame a;
	
	public InputId(){
		a= new JFrame("Product Id Scanner");
		
		lblId = new JLabel("Enter Id ");
		lblId.setBounds(50,125,100,30);
		txtId = new JTextField();
		txtId.setBounds(155,125,127,30);
		
		bSubmit =  new JButton("OK");	
	 	bSubmit.setBounds(155,210,125,30);
	 	
	 	bSubmit.addActionListener(
	 			new ActionListener() {
					
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						a.dispose();
					}
				}
	 			
	 			);

	 	a.add(lblId);
		a.add(txtId);
		a.add(bSubmit);
		a.setSize(475,375);  
		  Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
		    int x = (int) ((dimension.getWidth() - a.getWidth()) / 2);
		    int y = (int) ((dimension.getHeight() - a.getHeight()) / 2);
		    a.setLocation(x, y);
		    a.setFocusable(true);
		    a.setResizable(false);
	    a.setLayout(null);  
	    a.setVisible(true);

	}

	
}	
