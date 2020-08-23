package com.ims.product.model;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class DataStore {
	
	public DataStore(Product newProduct) throws IOException{
		// new Product := Which we want to add to file

		ObjectOutputStream dataOut = null;
		try {
		// Which file you want to store
		File file = new File("product.txt");

		// This is Main Important to Write Object into the file
		if(file.exists()) 
		{
			dataOut = new AppendableObjectOutputStream(new FileOutputStream(file,true));
			//AppendableObjectOutputStream is class := SEE INNER CLASS OF THIS CLASS
		}
		else
		{
			dataOut = new ObjectOutputStream(new FileOutputStream(file,true));
		}

		/// Write Object to file...
		dataOut.writeObject(newProduct);
		
		}catch(Exception e){
			System.out.println("Exception = " + e );
		}
		finally {
			// Close Stream!!!
			if(dataOut != null)
				dataOut.close();
		}
		
	}


	/// This is written by Sujoy Sir mailed us...
	public class AppendableObjectOutputStream extends ObjectOutputStream {

		public AppendableObjectOutputStream(OutputStream out) throws IOException{
			super(out);
		}
		
		protected void writeStreamHeader() throws IOException
		{
				reset();
		}
	}

	
	
}
