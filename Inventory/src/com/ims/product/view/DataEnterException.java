package com.ims.product.view;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class DataEnterException extends Exception{
	
	private static final long serialVersionUID = 1L;

	public DataEnterException(String message) {
		super();
		JOptionPane.showMessageDialog(new JFrame(), message, "ERROR", JOptionPane.ERROR_MESSAGE);
	}

}
