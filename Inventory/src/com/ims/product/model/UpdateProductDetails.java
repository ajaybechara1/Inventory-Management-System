package com.ims.product.model;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import com.ims.product.view.DialogBox;

public class UpdateProductDetails extends MatchProductId{
	public String product_Id;
	
	public UpdateProductDetails(String productId,Product newUpdatedProduct,ArrayList<Product> products) throws FileNotFoundException, IOException {
		// Update Product in file
		product_Id = productId;
		
		products.remove(index);
		products.add(index, newUpdatedProduct);
		
		ObjectOutputStream oOut = new ObjectOutputStream(new FileOutputStream("product.txt"));
		for(int i=0 ; i<products.size() ; i++)
			oOut.writeObject(products.get(i));
		
		if(oOut!= null)
			oOut.close();
							
						}
		
	DialogBox d = new DialogBox("Product Updated Successfully", "Successfull Operation");
	
}



/*							try {
					ObjectOutputStream  oWrite = null;
					ObjectInputStream oRead = null;
					File oldFile = new File("customer.txt");
					File newFile = new File("temp.txt");
					try {
						oWrite = new ObjectOutputStream(new FileOutputStream(newFile));
						oRead = new ObjectInputStream(new FileInputStream(oldFile));
						System.out.println("UpdateProductDetails");
						System.out.println("productId" + productId);
						System.out.println("newUpdatedProduct" + newUpdatedProduct);
						
						while(true)
				        {
					    	System.out.println("In Loop");
						    try
						    {
						    	Product update =  (Product)oRead.readObject();
						    	System.out.println("\n"+ update +"\n");
						    	if(!(update.getId().equals(product_Id)))
						    			oWrite.writeObject(update);
						    	else
						    			oWrite.writeObject(newUpdatedProduct);
						    	
						    } 
						    catch (EOFException e2)
						    {
						    	break;
						    }
						    catch(ClassNotFoundException e3)
						    {
						    }
					    }	
						oWrite.flush();
					} catch (FileNotFoundException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					finally {
							try {
								oldFile.delete();
								newFile.renameTo(new File("customer.txt"));
								if(oWrite != null)
									oWrite.close();
								if(oRead != null)
									oRead.close();
							} catch (IOException e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							}
					}
					} catch (Exception e4) {
						// TODO Auto-generated catch block
						System.out.println("HERE");
					}*/
