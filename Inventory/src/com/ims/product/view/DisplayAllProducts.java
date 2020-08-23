package com.ims.product.view;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import com.ims.product.model.Product;

public class DisplayAllProducts {

	public DisplayAllProducts(ArrayList<Product> products) {
		
	    JFrame frame = new JFrame();
	    Object[][] rowData  =  new Object[products.size()][3];
	    for(int i=0 ; i<products.size() ; i++) {
	    	rowData[i][0] = (products.get(i)).getId();
	    	rowData[i][1] = (products.get(i)).getPrice();
	    	rowData[i][2] = (products.get(i)).getQuantity();
	    }
	    
	    Object columnNames[] = { "Product Id", "Price", "Quantity" };
	    
	    JTable table = new JTable(rowData, columnNames);
	    JScrollPane scrollPane = new JScrollPane(table);
	    frame.add(scrollPane, BorderLayout.CENTER);
	    frame.setSize(475,375); 
		  Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
		    int x = (int) ((dimension.getWidth() - frame.getWidth()) / 2);
		    int y = (int) ((dimension.getHeight() - frame.getHeight()) / 2);
		    frame.setLocation(x, y);
		    frame.setResizable(true);
		    frame.setVisible(true);
	
	}
	
}	
	