import javax.swing.*;

import javax.sound.sampled.*;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.io.*;

public class Prequestion 
{
	private static String preQFile;
	private static Clip preQClip;
	private static boolean hold = true;
	private static String roundName;
	private static JPanel pContent;
	private static CardLayout pCards;
	
	public Prequestion(JPanel content, CardLayout cards)
	{
		pContent = content;
		pCards = cards;
	}
	
	public void run(int round) throws UnsupportedAudioFileException, IOException, LineUnavailableException
	{
		hold = true;
		selector(round);
		JLabel preLabel = new JLabel(roundName);
		preLabel.setFont(new Font("Times New Roman", Font.BOLD, 72));
		preLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
		JPanel preContent = new JPanel();
		preContent.setLayout(new BoxLayout(preContent, BoxLayout.Y_AXIS));
		
		preContent.add(preLabel);
		preContent.setBackground(Color.WHITE);
		
		pContent.add(preContent, "preQ");
		pCards.show(pContent, "preQ");
		
		File soundFile = new File(preQFile);
		AudioInputStream audioIn = AudioSystem.getAudioInputStream(soundFile);
		preQClip = AudioSystem.getClip();
		preQClip.open(audioIn);

		preQClip.start();
		while (preQClip.getMicrosecondPosition() < preQClip.getMicrosecondLength()) {};
		hold = false;
	}
	
	public void selector(int round)
	{
		switch(round)
		{
		case 1:
			roundName = "Event 1: Stupid Easy";
			preQFile = "round1.wav";
			break;
		case 2:
			roundName = "Event 2: Beginner Anime";
			preQFile = "round2.wav";
			break;
		case 3:
			roundName = "Event 3: Obscure Trivia";
			preQFile = "round3.wav";
			break;
		case 4:
			roundName = "Event 4: PC Gaming";
			preQFile = "round4.wav";
			break;
		case 5:
			roundName = "Event 5: Comics";
			preQFile = "round5.wav";
			break;
		case 6:
			roundName = "Event 6: World of Warcraft";
			preQFile = "round6.wav";
			break;
		case 7:
			roundName = "Event 7: Star Wars";
			preQFile = "round7.wav";
			break;
		case 8:
			roundName = "Event 8: Advanced Anime";
			preQFile = "round8.wav";
			break;
		case 9:
			roundName = "Event 9: Obscure International Television";
			preQFile = "round9.wav";
			break;
		case 10:
			roundName = "Event 10: Subjective";
			preQFile = "round10.wav";
			break;
		default:
			roundName = "The Phantom Round";
			preQFile = "TEST.WAV";
			break;
		}
	}
	
	public boolean holdState()
	{
		return hold;
	}
	
	public String roundNameOut()
	{
		return roundName;
	}
	
	public String preQFileOut()
	{
		return preQFile;
	}
}
