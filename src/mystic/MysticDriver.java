package mystic;
import java.io.IOException;

import javax.swing.JFrame;


public class MysticDriver 
{
	private static void createAndDisplayGUI()  
	{
		JFrame frame = new JFrame("Zelda the Wise");
		Mystic demo = new Mystic();
		
		frame.getContentPane().add(demo.getContent());
		frame.pack();
		frame.setSize(800, 1000);
		frame.setVisible(true);
	}
	
	public static void main(String[] args)  
	{
		createAndDisplayGUI();
	}
	
}