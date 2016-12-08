import javax.swing.JFrame;

public class MenuDriver 
{
	private static void createAndDisplayGUI()
	{
		JFrame frame = new JFrame("Multi-button Demo!");
		Menu demo = new Menu();
		
		frame.add(demo.getContent());
		frame.pack();
		frame.setSize(800, 50);
		frame.setVisible(true);
	}
	
	public static void main(String[] args)
	{
		createAndDisplayGUI();
	}
}