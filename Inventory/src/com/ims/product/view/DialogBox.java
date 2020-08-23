package com.ims.product.view;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class DialogBox {

	public DialogBox(String message , String title) {
	//	JOptionPane.showMessageDialog(new JFrame(), "ProductId Not Matched!", "WRONG", JOptionPane.OK_CANCEL_OPTION);			
		JOptionPane.showMessageDialog(new JFrame(), message, title, JOptionPane.OK_OPTION);
	}
}
