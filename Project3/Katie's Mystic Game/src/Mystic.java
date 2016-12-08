import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Mystic
{
	private JPanel panel1;
	private JPanel panel2;
	private JPanel panel3;
	private JPanel panel4;

	private JPanel mainPanel;
	
	private BufferedImage zeldaPic;

	private JLabel picLabel;
	private JLabel instructions;
	private JTextField question;
	private JButton submit;
	
	private JTextArea response;
	
	private String userQuestion = "";
	private String answer = "";
	private String cats = "baby cat and mollie";
	
	public Mystic()  
	{		
		try {
			zeldaPic = ImageIO.read(new File("ball.png"));

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		JLabel picLabel = new JLabel(new ImageIcon(zeldaPic));

		instructions = new JLabel("Enter a few keywords related to the question you seek an answer to.\n");
		question = new JTextField(20);
		
		submit = new JButton("Ask Zelda For Her Sage Advice");
		submit.addActionListener( submitAction() );
		
	    response = new JTextArea(35, 60);
		response.setWrapStyleWord(true);
		response.setLineWrap(true);
		response.setEditable(true);
		response.setText("Zelda's Response: \n");
		
		panel1 = new JPanel();
		panel1.add(picLabel);
						
		panel2 = new JPanel();
		panel2.add(instructions);
		panel2.add(question);
		
		panel3 = new JPanel();
		panel3.add(submit);
		
		panel4 = new JPanel();
		panel4.add(response);

		mainPanel = new JPanel();
		mainPanel.add(panel1);
		mainPanel.add(panel2);
		mainPanel.add(panel3);
		mainPanel.add(panel4);
	}
	
	public Component getContent()
	{
		return(mainPanel);
	}
	
	
	private boolean queryCheck(){
		
		userQuestion = question.getText();
		
		if(userQuestion.equals("") ){
			return false;
		}

		return true;
	}
	
	private ActionListener submitAction() 
	{
		//Create and define an action listener for button1
        ActionListener action = new ActionListener() {
            public void actionPerformed(ActionEvent e) 
            {
            	if( queryCheck() ){
            		
            		//submit the query to the input file and run the python script
        			MysticFileInput submitQuestion = new MysticFileInput(userQuestion);
        			try {
						submitQuestion.queryHandler();
						System.out.println("submit query worked");

					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
   
        			//get the comment from the file
        			MysticFileOutput read = new MysticFileOutput();
        			try {
						answer = read.responseHandler();
						System.out.println("read answer worked");
						System.out.println(answer);

					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
        			response.setText("Zelda's Response: \n" + answer);

            		
            	}


            }
        };
        return action;
    }
	
}