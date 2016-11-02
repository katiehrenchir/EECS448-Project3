import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.sound.sampled.*;
import java.io.*;

public class Win 
{
	static private Clip clip;
	static private boolean hold = true;
	static private JFrame frame;
	
	public Win() throws UnsupportedAudioFileException, IOException, LineUnavailableException
	{
		frame = new JFrame("DREWcathalon");
		
		JButton restart = new JButton("New Game+");
		JButton quit = new JButton("Flee");
		JLabel title = new JLabel("A Winnar is You!");
		JPanel content = new JPanel();
		
		content.add(title);
		content.add(restart);
		content.add(quit);

		frame.getContentPane().add(content);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.setSize(1000, 750);
		frame.setVisible(true);
		
		File soundFile = new File("TEST.wav");
		AudioInputStream audioIn = AudioSystem.getAudioInputStream(soundFile);
		clip = AudioSystem.getClip();
		clip.open(audioIn);

		clip.start();
		
		restart.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
				if (clip.getMicrosecondPosition() < clip.getMicrosecondLength()) 
				{
					clip.stop();
				}
				frame.dispose();
				frame = null;
				hold = false;
			}
		});
		
		quit.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
				frame.dispose();
				frame = null;
				System.exit(0);
			}
		});
	}
	
	public boolean holdState()
	{
		return hold;
	}
}
