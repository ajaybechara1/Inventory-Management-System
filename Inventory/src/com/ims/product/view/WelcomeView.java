package com.ims.product.view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class WelcomeView extends JFrame implements ActionListener{
	
	private static final long serialVersionUID = 1L;
	public JFrame frame = null;
	JPanel header;
	public JButton takeTour;
	public WelcomeView(){

		  Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
		    int x ;
		    int y ;
		
		// Declare Frame & Panel
        frame= new JFrame("Welcome!");  
        
/*        JPanel imagePanel = new JPanel();
        JLabel imageLabel = new JLabel((Icon) new Image("/eclipse-workspace/Inventory_Management_System_JAINAM.tar.gz_expanded/software.jpg"));
        imageLabel.setBounds(100,25,100,40);
        imagePanel.add(imageLabel);
 //       imagePanel.setBounds(500, 10, 100, 40);
        imagePanel.setVisible(true);
        frame.add(imageLabel);
*/        
        header=new JPanel();  
        header.setBounds(5,100,500,200);    				// Panel Bounds Set
//        header.setBackground(Color.BLUE);  		// Panel Color change
        
        // Create welcomeNote label
        JLabel welcomeNote = new JLabel("Welecome to AJ's Software");
        welcomeNote.setBounds(10, 10, 300, 200);
        welcomeNote.setFont(new Font("Serif", Font.BOLD, 25));
        welcomeNote.setForeground(Color.BLUE);
        header.add(welcomeNote);							// Add label to header panel
        
//        Border practiceMatteBorder;						// Define border for button
  //      practiceMatteBorder = BorderFactory.createMatteBorder(10, 10, 10, 10, Color.cyan);
        takeTour = new JButton("Take A Tour");  // Button
//        takeTour.setBounds(45,300,400,40);
//        takeTour.setBorder(practiceMatteBorder);		// Set boundary
        frame.add(takeTour);							// Add button to panel
       takeTour.addActionListener(
    		   new ActionListener() {
				
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					frame.dispose();
				}
			}
    		   );
              
        // Create Panel for header
	    frame.setSize(510,400);    						// Frame SIZE
       	takeTour.setSize(400, 40);
		    dimension = Toolkit.getDefaultToolkit().getScreenSize();
		    x = (int) ((frame.getWidth() - takeTour.getWidth()) / 2);
		    	int count = ((int)(frame.getHeight() / takeTour.getHeight())) - 2 ;
		    y = (int) (takeTour.getHeight() * count);

		takeTour.setLocation(x, y);
		frame.add(header);								// Add header panel to frame
		    dimension = Toolkit.getDefaultToolkit().getScreenSize();
		    x = (int) ((dimension.getWidth() - frame.getWidth()) / 2);
		    y = (int) ((dimension.getHeight() - frame.getHeight()) / 2);
		frame.setLocation(x, y);
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    frame.setResizable(false);
        frame.setLayout(null);    						
        frame.setVisible(true);    						// Make frame a visible
		
	}
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
	}

}