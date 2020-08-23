package com.ims.product.controller;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import com.ims.product.view.Operation;
import com.ims.product.view.WelcomeView;

public class MainController {
	static Operation operation;
	static WelcomeView first = null;
		public static void main(String[] argv){
			first = new WelcomeView();
			first.takeTour.addActionListener(
					new ActionListener() {
						
						public void actionPerformed(ActionEvent e) {
							// TODO Auto-generated method stub
							operation = new Operation();
							try{
								operation.addProductButton.addActionListener(new AddProductController());
								operation.updateProductButton.addActionListener(new UpdateProductController());
								operation.displayProductButton.addActionListener(new DisplayProductController());
								
								}catch(NullPointerException e1) {
									System.out.println("Exception");
								}

						}
					}
					);

			
		}

}
