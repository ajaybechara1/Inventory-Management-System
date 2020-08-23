package com.ims.product.model;

import java.util.ArrayList;

public class MatchProductId {
	public static int index;
	public static boolean matchProductId(String productId,ArrayList<Product> products){
		
		for(int i=0 ; i< products.size() ; i++) {
			if(((products.get(i)).getId()).equals(productId)) {
				index = i;
				return true;
			}
		}
		return false;
	}
}
