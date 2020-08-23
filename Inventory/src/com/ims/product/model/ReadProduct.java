package com.ims.product.model;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class ReadProduct {

	public static  ArrayList<Product> readProduct() throws ClassNotFoundException, IOException{
		// ArrayList which will contains objects of Product 
		// We will read it from file and Store into the ArrayList
		ArrayList<Product> products = new ArrayList<Product>();
		ObjectInputStream dataOut =  null;
		
		try {
		File file = new File("product.txt");
		dataOut = new ObjectInputStream(new FileInputStream(file));
		// Here I am Reading Objects From File
	    while(true)
        {
		    try
		    {
		    		products.add((Product) dataOut.readObject());
		    } 
		    catch (EOFException e)
		    {
		    	break;
		    }
	    }	

		}finally 
		{
				// We have to close Streams
		    	if(dataOut != null)
		    		dataOut.close();
		}
		//returning products ArrayList Which Contains the all Products
		return products;
	}
	
}




/*
package com.ims.product.model;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class ReadProduct {

	public static  ArrayList<Product> readProduct() throws ClassNotFoundException, IOException{
		// ArrayList which will contains objects of Product 
		// We will read it from file and Store into the ArrayList
		ArrayList<Product> products = new ArrayList<Product>();
		ObjectInputStream dataOut =  null;
		
		try {
		File file = new File("product.txt");
		
		if(file.exists())
		{
			try {
				dataOut = new ObjectInputStream(new FileInputStream(file));
			    while(true)
		        {
				    try
				    {
				    		products.add((Product) dataOut.readObject());
				    } 
				    catch (EOFException e)
				    {
				    	break;
				    }
			    }	

			}catch(Exception e) {
				System.out.println(e);
			}
	    
		}
		}finally 
		{
				// We have to close Streams
		    	if(dataOut != null)
		    		dataOut.close();
		}
		//returning products ArrayList Which Contains the all Products
		return products;
	}
	
}
*/