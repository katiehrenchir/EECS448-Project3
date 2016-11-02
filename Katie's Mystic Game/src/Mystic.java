import javax.imageio.ImageIO;
import javax.swing.*;

import java.awt.Component;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Mystic
{
	private JPanel panel1;
	private JPanel panel2;
	private JPanel panel3;
	private JPanel mainPanel;
	
	private BufferedImage zeldaPic;

	private JLabel picLabel;
	private JLabel instructions;
	private JTextField question;
	private JButton submit;
	
	public Mystic()  
	{		
		try {
			zeldaPic = ImageIO.read(new File("fortuneteller.jpg"));

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		JLabel picLabel = new JLabel(new ImageIcon(zeldaPic));

		instructions = new JLabel("Enter a few keywords related to the question you seek an answer to.\n");
		question = new JTextField(20);
		
		submit = new JButton("Ask Zelda For Her Sage Advice");
		submit.addActionListener( submitAction() );
		
		panel1 = new JPanel();
		panel1.add(picLabel);
						
		panel2 = new JPanel();
		panel2.add(instructions);
		panel2.add(question);
		
		panel3 = new JPanel();
		panel3.add(submit);

		mainPanel = new JPanel();
		mainPanel.add(panel1);
		mainPanel.add(panel2);
		mainPanel.add(panel3);
	}
	
	public Component getContent()
	{
		return(mainPanel);
	}
	
	
	private ActionListener submitAction() 
	{
		//Create and define an action listener for button1
        ActionListener action = new ActionListener() {
            public void actionPerformed(ActionEvent e) 
            {
            	
            }
        };
        return action;
    }
	
}