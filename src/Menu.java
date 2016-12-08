import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import mystic.Mystic;

public class Menu
{
	private JButton MacsGame;
	private JButton AndrewsGame;
	private JButton YehansGame;
	private JButton KatiesGame;

	private JPanel content;
	private JLabel label;
	
	public Menu()
	{
		MacsGame = new JButton("Mac's Game");
		AndrewsGame = new JButton("Andrew's Game");
		YehansGame = new JButton("Yehan's Game");
		KatiesGame = new JButton("Katie's Game");


		label = new JLabel("Please select a game!");
		
		//Add the listeners to their respective buttons
		MacsGame.addActionListener( MacsGameAction() );
		AndrewsGame.addActionListener( AndrewsGameAction() );
		YehansGame.addActionListener( YehansGameAction() );
		KatiesGame.addActionListener( KatiesGameAction() );

						
		content = new JPanel();
		content.add(MacsGame);
		content.add(AndrewsGame);
		content.add(YehansGame);
		content.add(KatiesGame);
		content.add(label);		
	}
	
	public Component getContent()
	{
		return(content);
	}
	
	private ActionListener MacsGameAction() 
	{
		//Create and define an action listener for button2
        ActionListener action = new ActionListener() {
            public void actionPerformed(ActionEvent e) 
            {
                label.setText("Mac's Game Selected");
            }
        };
        return action;
    }
	
	private ActionListener AndrewsGameAction() 
	{
		//Create and define an action listener for button2
        ActionListener action = new ActionListener() {
            public void actionPerformed(ActionEvent e) 
            {
                label.setText("Andrews's Game Selected");
            }
        };
        return action;
    }
	
	private ActionListener YehansGameAction() 
	{
		//Create and define an action listener for button2
        ActionListener action = new ActionListener() {
            public void actionPerformed(ActionEvent e) 
            {
                label.setText("Yehan's Game Selected");
            }
        };
        return action;
    }
	
	private ActionListener KatiesGameAction() 
	{
		//Create and define an action listener for button1
        ActionListener action = new ActionListener() {
            public void actionPerformed(ActionEvent e) 
            {
                label.setText("Katie's Game Selected");
                
        		JFrame frame = new JFrame("Zelda the Wise");
        		Mystic demo = new Mystic();
        		
        		frame.getContentPane().add(demo.getContent());
        		frame.pack();
        		frame.setSize(800, 1000);
        		frame.setVisible(true);           
        		
            }
        };
        return action;
    }
	

}

