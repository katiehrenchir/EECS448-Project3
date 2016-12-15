import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.sound.sampled.*;
import java.io.*;

public class End 
{
	static private Clip clip;
	static private String message;
	static private String fileName;
	static private boolean hold = true;
	static private JPanel eContent;
	static private CardLayout eCards;
	
	public End(JPanel content, CardLayout cards)
	{
		eContent = content;
		eCards = cards;
	}
	
	public void run(boolean win) throws UnsupportedAudioFileException, IOException, LineUnavailableException
	{
		JPanel enContent = new JPanel();
		selector(win);
		if (win)
		{
			enContent.setBackground(Color.GREEN);
		}
		else
		{
			enContent.setBackground(Color.RED);
		}
		
		JButton restart = new JButton("New Game+");
		restart.setAlignmentX(Component.CENTER_ALIGNMENT);
		JButton quit = new JButton("Flee");
		quit.setAlignmentX(Component.CENTER_ALIGNMENT);
		JLabel title = new JLabel(message);
		title.setAlignmentX(Component.CENTER_ALIGNMENT);
		
		enContent.add(title);
		enContent.add(restart);
		enContent.add(quit);
		
		enContent.setLayout(new BoxLayout(enContent, BoxLayout.Y_AXIS));
		
		eContent.add(enContent, "end");
		eCards.show(eContent, "end");
		
		File soundFile = new File(fileName);
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
				hold = false;
				System.out.println("End class repeat exit");
				return;
			}
		});
		
		quit.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
				System.exit(0);
			}
		});
	}
	
	public void selector(boolean win)
	{
		if (win)
		{
			message = "A winnar is you!";
			fileName = "WIN.wav";
		}
		else
		{
			message = "You have lost.";
			fileName = "LOSE.wav";
		}
	}
	
	public boolean holdState()
	{
		return hold;
	}
	
	public String messageOut()
	{
		return message;
	}
	
	public String fileNameOut()
	{
		return fileName;
	}
}
