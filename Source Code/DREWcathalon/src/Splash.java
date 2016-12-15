import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.sound.sampled.*;
import java.io.*;

public class Splash
{
	static private Clip clip;
	static private boolean hold = true;
	static private JPanel sContent;
	static private CardLayout sCards;
	static private Test testr;
	public Splash(JPanel content, CardLayout cards)
	{
		sContent = content;
		sCards = cards;
	}
	
	public void run() throws UnsupportedAudioFileException, IOException, LineUnavailableException
	{
		hold = true;
		
		JButton start = new JButton("Start Game");
		start.setFont(new Font("Times New Roman", Font.BOLD, 36));
		start.setAlignmentX(Component.CENTER_ALIGNMENT);
		JButton test = new JButton("Test Suite");
		test.setFont(new Font("Times New Roman", Font.BOLD, 36));
		test.setAlignmentX(Component.CENTER_ALIGNMENT);
		JLabel title = new JLabel("DREWcathalon");
		title.setFont(new Font("Times New Roman", Font.BOLD, 72));
		title.setAlignmentX(Component.CENTER_ALIGNMENT);
		JPanel splash = new JPanel();
		splash.setLayout(new BoxLayout(splash, BoxLayout.Y_AXIS));
		
		splash.add(title);
		splash.add(start);
		splash.add(test);
		splash.setBackground(Color.BLUE);
		
		sContent.add(splash, "splash");
		sCards.show(sContent, "splash");
		
		File soundFile = new File("Splash.wav");
		AudioInputStream audioIn = AudioSystem.getAudioInputStream(soundFile);
		clip = AudioSystem.getClip();
		clip.open(audioIn);

		clip.start();
		clip.loop(Clip.LOOP_CONTINUOUSLY);
		
		start.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
				clip.stop();
				hold = false;
			}
		});
		
		test.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
				testr = new Test();
				testr.battery();
			}
		});
	}
	
	public boolean holdState()
	{
		return hold;
	}
}
