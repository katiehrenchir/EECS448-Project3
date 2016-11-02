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
		frame.setSize(800, 800);
		frame.setVisible(true);
	}
	
	private static void accessReddit(){
		
		
		
	}
	
	public static void main(String[] args)  
	{
		accessReddit();
		createAndDisplayGUI();
	}
	
}