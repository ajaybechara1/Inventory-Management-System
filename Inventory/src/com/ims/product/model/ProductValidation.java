package com.ims.product.model;


import com.ims.product.view.AddProduct;
import com.ims.product.view.DataEnterException;

public class ProductValidation {
	public double p,q;

	public ProductValidation(AddProduct addProduct) throws Exception {
		try{    
				try {
					if((addProduct.txtId.getText()).equals(""))
						throw new DataEnterException("Plz Enter Product Id");
				}catch(Exception e){
					throw e;
				}
			
			try{	
				
					try {
					p= Double.parseDouble(addProduct.txtPrice.getText());
					}catch(Exception e) {
						throw new DataEnterException("Plz Enter a Double Value in Price");
					}
					if(p < 0 )
						throw new DataEnterException("Price should be positive");
					else if(p == 0)
						throw new DataEnterException("Price Can not be Zero");
					
			   }
			catch(Exception e1){
					throw e1;
		        }

		
			try{	
				
				try {
				q= Double.parseDouble(addProduct.txtQuantity.getText());
				}catch(Exception e) {
					throw new DataEnterException("Plz Enter a Double Value in Quantity");
				}
				if(q < 0 )
					throw new DataEnterException("Quantity should be positive");
				
		   }
		catch(Exception e1){
				throw e1;
	        }
		
		
		}
		catch(Exception e3)
		{
			throw e3;
		}
		
	}


}