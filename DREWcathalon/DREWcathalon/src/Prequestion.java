import javax.swing.*;

import javax.sound.sampled.*;
import java.io.*;

public class Prequestion 
{
	private static int roundNo;
	private static String preQFile;
	private static Clip preQClip;
	private static JFrame preFrame;
	private static boolean hold = true;
	
	public Prequestion(int round) throws UnsupportedAudioFileException, IOException, LineUnavailableException
	{
		roundNo = round;
		String roundName;
		switch(roundNo)
		{
		case 1:
			roundName = "Event 1: Stupid Easy";
			preQFile = "TEST.WAV";
			break;
		case 2:
			roundName = "Event 2: Beginner Anime";
			preQFile = "TEST.WAV";
			break;
		default:
			roundName = "The Phantom Round";
			preQFile = "TEST.WAV";
			break;
		}
		
		preFrame = new JFrame("DREWcathalon");
		JLabel preLabel = new JLabel(roundName);
		JPanel preContent = new JPanel();
		
		preContent.add(preLabel);
		
		preFrame.getContentPane().add(preContent);
		preFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		preFrame.setSize(1000, 750);
		preFrame.setVisible(true);
		
		File soundFile = new File(preQFile);
		AudioInputStream audioIn = AudioSystem.getAudioInputStream(soundFile);
		preQClip = AudioSystem.getClip();
		preQClip.open(audioIn);

		preQClip.start();
		while (preQClip.getMicrosecondPosition() < preQClip.getMicrosecondLength()) {};
		preFrame.dispose();
		preFrame = null;
		hold = false;
	}
	
	public boolean holdState()
	{
		return hold;
	}
}