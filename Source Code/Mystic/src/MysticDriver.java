import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextArea;
import javax.swing.JTextField;


public class MysticDriver 
{
	private static BufferedImage crystalBallPic;
	private static BufferedImage lineBreak;
	private static BufferedImage lineBreak2;

	private static JLabel instructions;
	private static JTextField question;
		
	private static JButton relationships;
	private static JButton parenting;
	private static JButton legal;
	private static JButton it;
	
	private static JButton submit;
	
	private static JTextArea response;
	
	private static String buttonChoice = "relationships";
	private static String userQuestion = "";
	
	private static void createAndDisplayGUI() throws IOException  
	{
					

		//adds backgound
		JFrame frame = new JFrame("Zoltar's Advice Giver");
        BufferedImage img = ImageIO.read(new File("background.png"));
        frame.setContentPane(new JLabel(new ImageIcon(img)));
               
		//Where the GUI is created:
		JMenuBar menuBar; //The entire bar
		JMenu menu, submenu; //A single drop-down menu
		JMenuItem menuItem; //A single item in a menu


		//Create the menu bar.
		menuBar = new JMenuBar();

		//Build the first menu.
		menu = new JMenu("Testing");
		menuBar.add(menu); //Add to menu bar
		menuItem = new JMenuItem("Begin testing"); 
		menu.add(menuItem);
		frame.setJMenuBar(menuBar);
        
        
        frame.setLayout(new FlowLayout());

        //adds crystal ball image
	    crystalBallPic = ImageIO.read(new File("ball4.png"));
		JLabel picLabel = new JLabel(new ImageIcon(crystalBallPic));
        frame.add(picLabel);

        //adds small line break so help with component positioning
	    lineBreak = ImageIO.read(new File("linebreak.png"));
		JLabel linebreakLabel = new JLabel(new ImageIcon(lineBreak));
		frame.add(linebreakLabel);

		//adds the four subreddit choice buttons
		relationships = new JButton("Relationships");
		relationships.addActionListener( relationshipsAction() );
		
		parenting = new JButton("Parenting");
		parenting.addActionListener( parentingAction() );
		
		legal = new JButton("Legal Issues");
		legal.addActionListener( legalAction() );
		
		it = new JButton("Tech Support");
		it.addActionListener( itAction() );
		
		frame.add(relationships);
		frame.add(parenting);
		frame.add(legal);
		frame.add(it);
		
        //adds small line break so help with component positioning
	    lineBreak2 = ImageIO.read(new File("linebreak.png"));
		JLabel linebreak2Label = new JLabel(new ImageIcon(lineBreak2));
		frame.add(linebreak2Label);
        
		//adds the query field and instructions
		instructions = new JLabel("Enter a few keywords related to the question you seek an answer to.\n");
		instructions.setForeground(Color.WHITE);
		question = new JTextField(40);
		frame.add(instructions);
		frame.add(question);
		
		//adds submit button
        submit = new JButton("Seek Advice");
		submit.addActionListener( submitAction() );
		frame.add(submit);
        
		//adds response area
	    response = new JTextArea(20, 60);
		response.setWrapStyleWord(true);
		response.setLineWrap(true);
		response.setEditable(true);
		response.setBackground(new Color(249,214,244));
		frame.add(response);
				
        frame.setLocationRelativeTo(null);
		frame.pack();
		frame.setSize(800, 800);
		frame.setVisible(true);

	}
	
	private static boolean queryCheck(){
		
		//ensures the query is not empty. if it is, returns false and prompts the user
			
		if(userQuestion.equals("") ){
			instructions.setText("Program cannot continue without query. Please enter keywords.");
			return false;
		}

		return true;
	}
	
	
	private static ActionListener submitAction() 
	{
		//Create and define an action listener for submit
        ActionListener action = new ActionListener() {
            public void actionPerformed(ActionEvent e) 
            {
        		userQuestion = question.getText();
        		if (queryCheck() ) {
        			//creates instance of mystic and sets the response to the file output
                    Mystic mystic = new Mystic(userQuestion, buttonChoice);
        			response.setText(mystic.sendResponse() );
     
        		} 
            }
        };
        return action;
    }
	
	private static ActionListener relationshipsAction() 
	{
		//Create and define an action listener for relationships
        ActionListener action = new ActionListener() {
            public void actionPerformed(ActionEvent e) 
            {
            	buttonChoice = "relationships";
            }
        };
        return action;
    }
	
	private static ActionListener parentingAction() 
	{
		//Create and define an action listener for parenting
        ActionListener action = new ActionListener() {
            public void actionPerformed(ActionEvent e) 
            {
            	buttonChoice = "parenting";
            }
        };
        return action;
    }
	
	private static ActionListener legalAction() 
	{
		//Create and define an action listener for legal
        ActionListener action = new ActionListener() {
            public void actionPerformed(ActionEvent e) 
            {
            	buttonChoice = "legaladvice";
            }
        };
        return action;
    }
	
	private static ActionListener itAction() 
	{
		//Create and define an action listener for IT
        ActionListener action = new ActionListener() {
            public void actionPerformed(ActionEvent e) 
            {
            	buttonChoice = "techsupport";
            }
        };
        return action;
    }
	
	
	public static void main(String[] args) throws IOException  
	{
		createAndDisplayGUI();
	}
	
}