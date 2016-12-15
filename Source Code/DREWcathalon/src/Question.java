import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.sound.sampled.*;
import java.io.*;

public class Question 
{
	static private Clip qClip;
	static private String qClipFile;
	static private String qText;
	static private AudioInputStream aAudioIn;
	static private Clip aClip;
	static private String a1ClipFile;
	static private String answer1;
	static private String a2ClipFile;
	static private String answer2;
	static private String a3ClipFile;
	static private String answer3;
	static private String a4ClipFile;
	static private String answer4;
	static private String expClipFile;
	static private AudioInputStream expAudioIn;
	static private Clip expClip;
	static private int correct;
	static private boolean hold;
	static private boolean right;
	static private JPanel qContent;
	static private CardLayout qCards;
	
	public Question(JPanel content, CardLayout cards)
	{
		qContent = content;
		qCards = cards;
		hold = true;
	}
	
	public void run(int round, int queston) throws UnsupportedAudioFileException, IOException, LineUnavailableException
	{
		hold = true;
		
		selector(round, queston);
		
		JButton ans1 = new JButton(answer1);
		ans1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		ans1.setAlignmentX(Component.CENTER_ALIGNMENT);
		JButton ans2 = new JButton(answer2);
		ans2.setFont(new Font("Times New Roman", Font.BOLD, 20));
		ans2.setAlignmentX(Component.CENTER_ALIGNMENT);
		JButton ans3 = new JButton(answer3);
		ans3.setFont(new Font("Times New Roman", Font.BOLD, 20));
		ans3.setAlignmentX(Component.CENTER_ALIGNMENT);
		JButton ans4 = new JButton(answer4);
		ans4.setFont(new Font("Times New Roman", Font.BOLD, 20));
		ans4.setAlignmentX(Component.CENTER_ALIGNMENT);
		JLabel questionText = new JLabel(qText);
		questionText.setFont(new Font("Times New Roman", Font.BOLD, 18));
		questionText.setAlignmentX(Component.CENTER_ALIGNMENT);
		JPanel quContent = new JPanel();
		quContent.setLayout(new BoxLayout(quContent, BoxLayout.Y_AXIS));
		quContent.add(questionText);
		quContent.add(ans1);
		quContent.add(ans2);
		quContent.add(ans3);
		quContent.add(ans4);
		quContent.setBackground(Color.YELLOW);
		
		qContent.add(quContent, "quest");
		qCards.show(qContent, "quest");

		File qSoundFile = new File(qClipFile);
		AudioInputStream qAudioIn = AudioSystem.getAudioInputStream(qSoundFile);
		qClip = AudioSystem.getClip();
		qClip.open(qAudioIn);
		qClip.start();
		
		ans1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
				//Stop qClip if playing
				if (qClip.getMicrosecondPosition() < qClip.getMicrosecondLength()) 
				{
					qClip.stop();
				}
				//Disable all buttons
				ans1.setEnabled(false);
				ans2.setEnabled(false);
				ans3.setEnabled(false);
				ans4.setEnabled(false);
				//Play ansClip
				File aSoundFile = new File(a1ClipFile);
				try {
					aAudioIn = AudioSystem.getAudioInputStream(aSoundFile);
				} catch (UnsupportedAudioFileException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				try {
					aClip = AudioSystem.getClip();
				} catch (LineUnavailableException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				try {
					aClip.open(aAudioIn);
				} catch (LineUnavailableException | IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				aClip.start();
				if (correct == 1)
				{
					//Set flag to change state to next round/WIN
					right = true;
				}
				else
				{
					//Set flag to change state to LOSS
					right = false;
				}
				//Wait while ansClip plays
				while (aClip.getMicrosecondPosition() < aClip.getMicrosecondLength()) {};
				//Play explQClip
				File expSoundFile = new File(expClipFile);
				try {
					expAudioIn = AudioSystem.getAudioInputStream(expSoundFile);
				} catch (UnsupportedAudioFileException | IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				try {
					expClip = AudioSystem.getClip();
				} catch (LineUnavailableException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				try {
					expClip.open(expAudioIn);
				} catch (LineUnavailableException | IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				expClip.start();
				//Wait while explQClip plays
				while (expClip.getMicrosecondPosition() < expClip.getMicrosecondLength()) {};
				//Set hold variable to FALSE
				hold = false;
			}
		});
		
		ans2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
				//Stop qClip if playing
				if (qClip.getMicrosecondPosition() < qClip.getMicrosecondLength()) 
				{
					qClip.stop();
				}
				//Disable all buttons
				ans1.setEnabled(false);
				ans2.setEnabled(false);
				ans3.setEnabled(false);
				ans4.setEnabled(false);
				//Play ansClip
				File aSoundFile = new File(a2ClipFile);
				try {
					aAudioIn = AudioSystem.getAudioInputStream(aSoundFile);
				} catch (UnsupportedAudioFileException | IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				try {
					aClip = AudioSystem.getClip();
				} catch (LineUnavailableException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				try {
					aClip.open(aAudioIn);
				} catch (LineUnavailableException | IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				aClip.start();
				if (correct == 2)
				{
					//Set flag to change state to next round/WIN
					right = true;
				}
				else
				{
					//Set flag to change state to LOSS
					right = false;
				}
				//Wait while ansClip plays
				while (aClip.getMicrosecondPosition() < aClip.getMicrosecondLength()) {};
				//Play explQClip
				File expSoundFile = new File(expClipFile);
				try {
					expAudioIn = AudioSystem.getAudioInputStream(expSoundFile);
				} catch (UnsupportedAudioFileException | IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				try {
					expClip = AudioSystem.getClip();
				} catch (LineUnavailableException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				try {
					expClip.open(expAudioIn);
				} catch (LineUnavailableException | IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				expClip.start();
				//Wait while explQClip plays
				while (expClip.getMicrosecondPosition() < expClip.getMicrosecondLength()) {};
				//Set hold variable to FALSE
				hold = false;
			}
		});
		
		ans3.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
				//Stop qClip if playing
				if (qClip.getMicrosecondPosition() < qClip.getMicrosecondLength()) 
				{
					qClip.stop();
				}
				//Disable all buttons
				ans1.setEnabled(false);
				ans2.setEnabled(false);
				ans3.setEnabled(false);
				ans4.setEnabled(false);
				//Play ansClip
				File aSoundFile = new File(a3ClipFile);
				try {
					aAudioIn = AudioSystem.getAudioInputStream(aSoundFile);
				} catch (UnsupportedAudioFileException | IOException e2) {
					// TODO Auto-generated catch block
					e2.printStackTrace();
				}
				try {
					aClip = AudioSystem.getClip();
				} catch (LineUnavailableException e2) {
					// TODO Auto-generated catch block
					e2.printStackTrace();
				}
				try {
					aClip.open(aAudioIn);
				} catch (LineUnavailableException | IOException e2) {
					// TODO Auto-generated catch block
					e2.printStackTrace();
				}
				aClip.start();
				if (correct == 3)
				{
					//Set flag to change state to next round/WIN
					right = true;
				}
				else
				{
					//Set flag to change state to LOSS
					right = false;
				}
				//Wait while ansClip plays
				while (aClip.getMicrosecondPosition() < aClip.getMicrosecondLength()) {};
				//Play explQClip
				File expSoundFile = new File(expClipFile);
				try {
					expAudioIn = AudioSystem.getAudioInputStream(expSoundFile);
				} catch (UnsupportedAudioFileException | IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				try {
					expClip = AudioSystem.getClip();
				} catch (LineUnavailableException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				try {
					expClip.open(expAudioIn);
				} catch (LineUnavailableException | IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				expClip.start();
				//Wait while explQClip plays
				while (expClip.getMicrosecondPosition() < expClip.getMicrosecondLength()) {};
				//Set hold variable to FALSE
				hold = false;
			}
		});
		
		ans4.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
				//Stop qClip if playing
				if (qClip.getMicrosecondPosition() < qClip.getMicrosecondLength()) 
				{
					qClip.stop();
				}
				//Disable all buttons
				ans1.setEnabled(false);
				ans2.setEnabled(false);
				ans3.setEnabled(false);
				ans4.setEnabled(false);
				//Play ansClip
				File aSoundFile = new File(a4ClipFile);
				try {
					aAudioIn = AudioSystem.getAudioInputStream(aSoundFile);
				} catch (UnsupportedAudioFileException | IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				try {
					aClip = AudioSystem.getClip();
				} catch (LineUnavailableException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				try {
					aClip.open(aAudioIn);
				} catch (LineUnavailableException | IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				aClip.start();
				if (correct == 4)
				{
					//Set flag to change state to next round/WIN
					right = true;
				}
				else
				{
					//Set flag to change state to LOSS
					right = false;
				}
				//Wait while ansClip plays
				while (aClip.getMicrosecondPosition() < aClip.getMicrosecondLength()) {};
				//Play explQClip
				File expSoundFile = new File(expClipFile);
				try {
					expAudioIn = AudioSystem.getAudioInputStream(expSoundFile);
				} catch (UnsupportedAudioFileException | IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				try {
					expClip = AudioSystem.getClip();
				} catch (LineUnavailableException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				try {
					expClip.open(expAudioIn);
				} catch (LineUnavailableException | IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				expClip.start();
				//Wait while explQClip plays
				while (expClip.getMicrosecondPosition() < expClip.getMicrosecondLength()) {};
				//Set hold variable to FALSE
				hold = false;
			}
		});
	}
	
	public void selector(int round, int queston)
	{
		switch (round)
		{
		case 1:
			switch (queston)
			{
			case 1:
				qText = "Captains Kirk, Picard, and Janeway are from what sci-fi franchise?";
				qClipFile = "quest1A.wav";
				correct = 3;
				answer1 = "Star Wars";
				a1ClipFile = "ans1A1.wav";
				answer2 = "Firefly/Serenity";
				a2ClipFile = "ans1A2.wav";
				answer3 = "Star Trek";
				a3ClipFile = "ans1A3.wav";
				answer4 = "Lord of the Rings";
				a4ClipFile = "ans1A4.wav";
				expClipFile = "exp1A.wav";
				break;
			case 2:
				qText = "What species is Chewbacca?";
				qClipFile = "quest1B.wav";
				correct = 1;
				answer1 = "Wookiee";
				a1ClipFile = "ans1B1.wav";
				answer2 = "Wooky";
				a2ClipFile = "ans1B2.wav";
				answer3 = "Time Lord";
				a3ClipFile = "ans1B3.wav";
				answer4 = "Wookii";
				a4ClipFile = "ans1B4.wav";
				expClipFile = "exp1B.wav";
				break;
			case 3:
				qText = "The premiere video game streaming website is...";
				qClipFile = "quest1C.wav";
				correct = 4;
				answer1 = "Grand Mal Seizure";
				a1ClipFile = "ans1C1.wav";
				answer2 = "Spasm";
				a2ClipFile = "ans1C2.wav";
				answer3 = "Tic";
				a3ClipFile = "ans1C3.wav";
				answer4 = "Twitch";
				a4ClipFile = "ans1C4.wav";
				expClipFile = "exp1C.wav";
				break;
			case 4:
				qText = "The premiere comic convention in America is held in what city?";
				qClipFile = "quest1D.wav";
				correct = 1;
				answer1 = "San Diego";
				a1ClipFile = "ans1D1.wav";
				answer2 = "Anaheim";
				a2ClipFile = "ans1D2.wav";
				answer3 = "New York City";
				a3ClipFile = "ans1D3.wav";
				answer4 = "Black Rock City";
				a4ClipFile = "ans1D4.wav";
				expClipFile = "exp1D.wav";
				break;
			case 5:
				qText = "Why don't Captain America and Superman appear in media together that often?";
				qClipFile = "quest1E.wav";
				correct = 3;
				answer1 = "They're actually the same person";
				a1ClipFile = "ans1E1.wav";
				answer2 = "The media they would both appear in would be too powerful";
				a2ClipFile = "ans1E2.wav";
				answer3 = "They are owned by competing companies";
				a3ClipFile = "ans1E3.wav";
				answer4 = "They actually do all the time in Ecuador";
				a4ClipFile = "ans1E4.wav";
				expClipFile = "exp1E.wav";
				break;
			default:
				qText = "";
				qClipFile = "";
				correct = 0;
				answer1 = "";
				a1ClipFile = "";
				answer2 = "";
				a2ClipFile = "";
				answer3 = "";
				a3ClipFile = "";
				answer4 = "";
				a4ClipFile = "";
				expClipFile = "";
				break;
			}
			break;
		case 2:
			switch (queston)
			{
			case 1:
				qText = "What was the title character's genin team number in Naruto?";
				qClipFile = "quest2A.wav";
				correct = 2;
				answer1 = "4";
				a1ClipFile = "ans2A1.wav";
				answer2 = "7";
				a2ClipFile = "ans2A2.wav";
				answer3 = "9";
				a3ClipFile = "ans2A3.wav";
				answer4 = "It was never canonically given";
				a4ClipFile = "ans2A4.wav";
				expClipFile = "exp2A.wav";
				break;
			case 2:
				qText = "In the anime Mobile Suit Gundam, in what year was the One Year War?";
				qClipFile = "quest2B.wav";
				correct = 4;
				answer1 = "2307 A.D.";
				a1ClipFile = "ans2B1.wav";
				answer2 = "CE 70";
				a2ClipFile = "ans2B2.wav";
				answer3 = "AC 175";
				a3ClipFile = "ans2B3.wav";
				answer4 = "UC 0079";
				a4ClipFile = "ans2B4.wav";
				expClipFile = "exp2B.wav";
				break;
			case 3:
				qText = "In the anime/manga Bleach, how many court guard squads are there in the Seireitei?";
				qClipFile = "quest2C.wav";
				correct = 4;
				answer1 = "8";
				a1ClipFile = "ans2C1.wav";
				answer2 = "48";
				a2ClipFile = "ans2C2.wav";
				answer3 = "15";
				a3ClipFile = "ans2C3.wav";
				answer4 = "13";
				a4ClipFile = "ans2C4.wav";
				expClipFile = "exp2C.wav";
				break;
			case 4:
				qText = "The first name of the protagonist of the One Piece franchise is...";
				qClipFile = "quest2D.wav";
				correct = 3;
				answer1 = "Tiger";
				a1ClipFile = "ans2D1.wav";
				answer2 = "Chopper";
				a2ClipFile = "ans2D2.wav";
				answer3 = "Monkey";
				a3ClipFile = "ans2D3.wav";
				answer4 = "Dave";
				a4ClipFile = "ans1B3.wav";
				expClipFile = "exp2D.wav";
				break;
			case 5:
				qText = "Anime and manga aimed at young girls is known as what in Japanese?";
				qClipFile = "quest2E.wav";
				correct = 1;
				answer1 = "Shojo";
				a1ClipFile = "ans2E1.wav";
				answer2 = "Shonen";
				a2ClipFile = "ans2E2.wav";
				answer3 = "Yaoi";
				a3ClipFile = "ans2E3.wav";
				answer4 = "Otome";
				a4ClipFile = "ans2E4.wav";
				expClipFile = "exp2E.wav";
				break;
			default:
				qText = "";
				qClipFile = "";
				correct = 0;
				answer1 = "";
				a1ClipFile = "";
				answer2 = "";
				a2ClipFile = "";
				answer3 = "";
				a3ClipFile = "";
				answer4 = "";
				a4ClipFile = "";
				expClipFile = "";
				break;
			}
			break;
		case 3:
			switch (queston)
			{
			case 1:
				qText = "By tradition, how is the Olympic torch lit?";
				qClipFile = "quest3A.wav";
				correct = 3;
				answer1 = "From an eternal flame";
				a1ClipFile = "ans3A1.wav";
				answer2 = "A flaming arrow";
				a2ClipFile = "ans3A2.wav";
				answer3 = "By solar reflection";
				a3ClipFile = "ans3A3.wav";
				answer4 = "Whatever is available";
				a4ClipFile = "ans3A4.wav";
				expClipFile = "exp3A.wav";
				break;
			case 2:
				qText = "Which is not a model produced by Lamborghini?";
				qClipFile = "quest3B.wav";
				correct = 1;
				answer1 = "Enzo";
				a1ClipFile = "ans3B1.wav";
				answer2 = "Aventador";
				a2ClipFile = "ans3B2.wav";
				answer3 = "Countash";
				a3ClipFile = "ans3B3.wav";
				answer4 = "Gallardo";
				a4ClipFile = "ans3B4.wav";
				expClipFile = "exp3B.wav";
				break;
			case 3:
				qText = "What was the first music video played on MTV?";
				qClipFile = "quest3C.wav";
				correct = 3;
				answer1 = "Girls on Film - Duran Duran";
				a1ClipFile = "ans3C1.wav";
				answer2 = "Money for Nothing - Dire Straits";
				a2ClipFile = "ans3C2.wav";
				answer3 = "Video Killed the Radio Star - The Buggles";
				a3ClipFile = "ans2C4.wav";
				answer4 = "Thriller - Michael Jackson";
				a4ClipFile = "ans3C4.wav";
				expClipFile = "exp3C.wav";
				break;
			case 4:
				qText = "Acetaminophen is known as what on the street?";
				qClipFile = "quest3D.wav";
				correct = 4;
				answer1 = "Molly";
				a1ClipFile = "ans3D1.wav";
				answer2 = "Aleve";
				a2ClipFile = "ans3D2.wav";
				answer3 = "Adderall";
				a3ClipFile = "ans3D3.wav";
				answer4 = "Tylenol";
				a4ClipFile = "ans3D4.wav";
				expClipFile = "exp3D.wav";
				break;
			case 5:
				qText = "Plumbum : Lead :: Wolfram : _______";
				qClipFile = "quest3E.wav";
				correct = 1;
				answer1 = "Tungsten";
				a1ClipFile = "ans3E1.wav";
				answer2 = "Steel";
				a2ClipFile = "ans3E2.wav";
				answer3 = "Hydrogen";
				a3ClipFile = "ans3E3.wav";
				answer4 = "Cesium";
				a4ClipFile = "ans3E4.wav";
				expClipFile = "exp3E.wav";
				break;
			default:
				qText = "";
				qClipFile = "";
				correct = 0;
				answer1 = "";
				a1ClipFile = "";
				answer2 = "";
				a2ClipFile = "";
				answer3 = "";
				a3ClipFile = "";
				answer4 = "";
				a4ClipFile = "";
				expClipFile = "";
				break;
			}
			break;
		case 4:
			switch (queston)
			{
			case 1:
				qText = "Garry's Mod was originally a mod for what game?";
				qClipFile = "quest4A.wav";
				correct = 3;
				answer1 = "Portal 2";
				a1ClipFile = "ans4A1.wav";
				answer2 = "Team Fortress 2";
				a2ClipFile = "ans4A2.wav";
				answer3 = "Half-Life 2";
				a3ClipFile = "ans4A3.wav";
				answer4 = "Halo 2";
				a4ClipFile = "ans4A4.wav";
				expClipFile = "exp4A.wav";
				break;
			case 2:
				qText = "Apart from its catalog of Star Wars games, Lucasarts was known for making games in what genre?";
				qClipFile = "quest4B.wav";
				correct = 3;
				answer1 = "Fighting";
				a1ClipFile = "ans4B1.wav";
				answer2 = "RPG";
				a2ClipFile = "ans4B2.wav";
				answer3 = "Adventure";
				a3ClipFile = "ans4B3.wav";
				answer4 = "Bishoujo";
				a4ClipFile = "ans4B4.wav";
				expClipFile = "exp4B.wav";
				break;
			case 3:
				qText = "Nostalrius is a controversial server for what game?";
				qClipFile = "quest4C.wav";
				correct = 4;
				answer1 = "Starcraft";
				a1ClipFile = "ans4C1.wav";
				answer2 = "Counter-Strike";
				a2ClipFile = "ans4C2.wav";
				answer3 = "Team Fortress 2";
				a3ClipFile = "ans4C3.wav";
				answer4 = "World of Warcraft";
				a4ClipFile = "ans4C4.wav";
				expClipFile = "exp4C.wav";
				break;
			case 4:
				qText = "Overwatch was born from the ashes of what project from Blizzard Entertainment?";
				qClipFile = "quest4D.wav";
				correct = 3;
				answer1 = "Atlas";
				a1ClipFile = "ans4D1.wav";
				answer2 = "Mecha";
				a2ClipFile = "ans4D2.wav";
				answer3 = "Titan";
				a3ClipFile = "ans4D3.wav";
				answer4 = "Iron Duck";
				a4ClipFile = "ans4D4.wav";
				expClipFile = "exp4D.wav";
				break;
			case 5:
				qText = "Duke Nukem Forever was in development hell for how long?";
				qClipFile = "quest4E.wav";
				correct = 2;
				answer1 = "10 years";
				a1ClipFile = "ans4E1.wav";
				answer2 = "15 years";
				a2ClipFile = "ans4E2.wav";
				answer3 = "25 years";
				a3ClipFile = "ans4E3.wav";
				answer4 = "30 years";
				a4ClipFile = "ans4E4.wav";
				expClipFile = "exp4E.wav";
				break;
			default:
				qText = "";
				qClipFile = "";
				correct = 0;
				answer1 = "";
				a1ClipFile = "";
				answer2 = "";
				a2ClipFile = "";
				answer3 = "";
				a3ClipFile = "";
				answer4 = "";
				a4ClipFile = "";
				expClipFile = "";
				break;
			}
			break;
		case 5:
			switch (queston)
			{
			case 1:
				qText = "Who is Star Lord's father?";
				qClipFile = "quest5A.wav";
				correct = 4;
				answer1 = "Ronan the Accuser";
				a1ClipFile = "ans5A1.wav";
				answer2 = "Ego the Living Planet";
				a2ClipFile = "ans5A2.wav";
				answer3 = "Richard Rider";
				a3ClipFile = "ans5A3.wav";
				answer4 = "J'Son of Spartax";
				a4ClipFile = "ans5A4.wav";
				expClipFile = "exp5A.wav";
				break;
			case 2:
				qText = "What event set off the first Marvel Civil War?";
				qClipFile = "quest5B.wav";
				correct = 1;
				answer1 = "Nitro self-destructed in a populated area";
				a1ClipFile = "ans5B1.wav";
				answer2 = "She-Hulk killed a man on national television";
				a2ClipFile = "ans5B2.wav";
				answer3 = "Fin Fang Foom ate the city of Boston";
				a3ClipFile = "ans5B3.wav";
				answer4 = "The Skrull infiltrated the ranks of the Marvel superheroes";
				a4ClipFile = "ans5B4.wav";
				expClipFile = "exp5B.wav";
				break;
			case 3:
				qText = "The 12-issue maxi-series Watchmen was published in what year?";
				qClipFile = "quest5C.wav";
				correct = 2;
				answer1 = "1974";
				a1ClipFile = "ans5C1.wav";
				answer2 = "1986";
				a2ClipFile = "ans5C2.wav";
				answer3 = "1992";
				a3ClipFile = "ans5C3.wav";
				answer4 = "2009";
				a4ClipFile = "ans5C4.wav";
				expClipFile = "exp5C.wav";
				break;
			case 4:
				qText = "Who didn't die in the Crisis on Infinte Earths?";
				qClipFile = "quest5D.wav";
				correct = 3;
				answer1 = "Supergirl of Earth-1";
				a1ClipFile = "ans5D1.wav";
				answer2 = "Barry Allen";
				a2ClipFile = "ans5D2.wav";
				answer3 = "Batman of Earth-2";
				a3ClipFile = "ans5D3.wav";
				answer4 = "The DC Multiverse";
				a4ClipFile = "ans5D4.wav";
				expClipFile = "exp5D.wav";
				break;
			case 5:
				qText = "Which if these is not a current independent comics publisher?";
				qClipFile = "quest5E.wav";
				correct = 4;
				answer1 = "Image Comics";
				a1ClipFile = "ans5E1.wav";
				answer2 = "Dark Horse Comics";
				a2ClipFile = "ans5E2.wav";
				answer3 = "Oni Press";
				a3ClipFile = "ans5E3.wav";
				answer4 = "Timely Comics";
				a4ClipFile = "ans5E4.wav";
				expClipFile = "exp5E.wav";
				break;
			default:
				qText = "";
				qClipFile = "";
				correct = 0;
				answer1 = "";
				a1ClipFile = "";
				answer2 = "";
				a2ClipFile = "";
				answer3 = "";
				a3ClipFile = "";
				answer4 = "";
				a4ClipFile = "";
				expClipFile = "";
				break;
			}
			break;
		case 6:
			switch (queston)
			{
			case 1:
				qText = "Who is Varian Wrynn's grandfather?";
				qClipFile = "quest6A.wav";
				correct = 2;
				answer1 = "Anduin";
				a1ClipFile = "ans6A1.wav";
				answer2 = "Barathen";
				a2ClipFile = "ans6A2.wav";
				answer3 = "Tiffin";
				a3ClipFile = "ans6A3.wav";
				answer4 = "Llane";
				a4ClipFile = "ans6A4.wav";
				expClipFile = "exp6A.wav";
				break;
			case 2:
				qText = "Who was Jaina Proudmoore's mentor in the Kirin Tor?";
				qClipFile = "quest6B.wav";
				correct = 1;
				answer1 = "Archmage Antonidas";
				a1ClipFile = "quest6B1.wav";
				answer2 = "Archmage Khadgar";
				a2ClipFile = "quest6B2.wav";
				answer3 = "Archmage Modera";
				a3ClipFile = "quest6B3.wav";
				answer4 = "Archmage Kel'Thuzad";
				a4ClipFile = "quest6B4.wav";
				expClipFile = "exp6B.wav";
				break;
			case 3:
				qText = "Which Orc was responsible for opening numerous portals on Draenor and shattering the Orc homeworld?";
				qClipFile = "quest6C.wav";
				correct = 1;
				answer1 = "Ner'zul";
				a1ClipFile = "ans6C1.wav";
				answer2 = "Gul'dan";
				a2ClipFile = "ans6C2.wav";
				answer3 = "Skartax";
				a3ClipFile = "ans6C3.wav";
				answer4 = "Grieve";
				a4ClipFile = "ans6C3.wav";
				expClipFile = "exp6C.wav";
				break;
			case 4:
				qText = "The Night Elves and the dragonflights stood against the armies of the Qiraji in what war?";
				qClipFile = "quest6D.wav";
				correct = 3;
				answer1 = "War of the Ancients";
				a1ClipFile = "ans6D1.wav";
				answer2 = "War of the Satyr";
				a2ClipFile = "ans6D2.wav";
				answer3 = "War of the Shifting Sands";
				a3ClipFile = "ans6D3.wav";
				answer4 = "War of the Spider";
				a4ClipFile = "ans6D4.wav";
				expClipFile = "exp6D.wav";
				break;
			case 5:
				qText = "Who became the Lich King after Arthas was defeated?";
				qClipFile = "quest6E.wav";
				correct = 2;
				answer1 = "Tirion Fordring";
				a1ClipFile = "ans6E1.wav";
				answer2 = "Bolvar Fordragon";
				a2ClipFile = "ans6E2.wav";
				answer3 = "Darion Mograine";
				a3ClipFile = "ans6E3.wav";
				answer4 = "Teneras Menethil II";
				a4ClipFile = "ans6E4.wav";
				expClipFile = "exp6E.wav";
				break;
			default:
				qText = "";
				qClipFile = "";
				correct = 0;
				answer1 = "";
				a1ClipFile = "";
				answer2 = "";
				a2ClipFile = "";
				answer3 = "";
				a3ClipFile = "";
				answer4 = "";
				a4ClipFile = "";
				expClipFile = "";
				break;
			}
			break;
		case 7:
			switch (queston)
			{
			case 1:
				qText = "Who was Luke Skywalker's wife?";
				qClipFile = "quest7A.wav";
				correct = 4;
				answer1 = "Satele Shan";
				a1ClipFile = "ans7A1.wav";
				answer2 = "Leia Organa";
				a2ClipFile = "ans7A2.wav";
				answer3 = "Breha Antilles";
				a3ClipFile = "ans7A3.wav";
				answer4 = "Mara Jade";
				a4ClipFile = "ans7A4.wav";
				expClipFile = "exp7A.wav";
				break;
			case 2:
				qText = "According to legend, on what planet did the Jedi Order begin?";
				qClipFile = "quest7B.wav";
				correct = 4;
				answer1 = "Jakku";
				a1ClipFile = "ans7B1.wav";
				answer2 = "Coruscant";
				a2ClipFile = "ans7B2.wav";
				answer3 = "Dantooine";
				a3ClipFile = "ans7B3.wav";
				answer4 = "Tython";
				a4ClipFile = "ans7B4.wav";
				expClipFile = "exp7B.wav";
				break;
			case 3:
				qText = "Jaina Solo was named after whom?";
				qClipFile = "quest7C.wav";
				correct = 2;
				answer1 = "Her maternal grandfather";
				a1ClipFile = "ans7C1.wav";
				answer2 = "Her paternal grandmother";
				a2ClipFile = "ans7C2.wav";
				answer3 = "A legendary Jedi";
				a3ClipFile = "ans7C3.wav";
				answer4 = "The place she was conceived";
				a4ClipFile = "ans7C4.wav";
				expClipFile = "exp7C.wav";
				break;
			case 4:
				qText = "What name did Jacen Solo take after he fell to the dark side?";
				qClipFile = "quest7D.wav";
				correct = 2;
				answer1 = "Darth Plagueis";
				a1ClipFile = "ans7D1.wav";
				answer2 = "Darth Caedus";
				a2ClipFile = "ans7D2.wav";
				answer3 = "Darth Sidious";
				a3ClipFile = "ans7D3.wav";
				answer4 = "Darth Baras";
				a4ClipFile = "ans7D4.wav";
				expClipFile = "exp7D.wav";
				break;
			case 5:
				qText = "Who was the youngest child of Han Solo and Princess Leia?";
				qClipFile = "quest7E.wav";
				correct = 4;
				answer1 = "Jaina";
				a1ClipFile = "ans7E1.wav";
				answer2 = "Jacen";
				a2ClipFile = "ans7E2.wav";
				answer3 = "Ben";
				a3ClipFile = "ans7E3.wav";
				answer4 = "Anakin";
				a4ClipFile = "ans7E4.wav";
				expClipFile = "exp7E.wav";
				break;
			default:
				qText = "";
				qClipFile = "";
				correct = 0;
				answer1 = "";
				a1ClipFile = "";
				answer2 = "";
				a2ClipFile = "";
				answer3 = "";
				a3ClipFile = "";
				answer4 = "";
				a4ClipFile = "";
				expClipFile = "";
				break;
			}
			break;
		case 8:
			switch (queston)
			{
			case 1:
				qText = "What animation studio os known for pushing the moé aesthetic?";
				qClipFile = "quest8A.wav";
				correct = 4;
				answer1 = "Production I.G.";
				a1ClipFile = "ans8A1.wav";
				answer2 = "Ghibli";
				a2ClipFile = "ans8A2.wav";
				answer3 = "Gainax";
				a3ClipFile = "ans8A3.wav";
				answer4 = "Kyoto Animation";
				a4ClipFile = "ans8A4.wav";
				expClipFile = "exp8A.wav";
				break;
			case 2:
				qText = "After the emotional wringer that was Neon Genesis Evangelion, Gainax made this shojo series, which became somewhat darker than the source manga.";
				qClipFile = "quest8B.wav";
				correct = 2;
				answer1 = "Revolutionary Girl Utena";
				a1ClipFile = "ans8B1.wav";
				answer2 = "Kare Kano";
				a2ClipFile = "ans8B2.wav";
				answer3 = "Fruits Basket";
				a3ClipFile = "ans8B3.wav";
				answer4 = "Cardcaptor Sakura";
				a4ClipFile = "ans8B4.wav";
				expClipFile = "exp8B.wav";
				break;
			case 3:
				qText = "After leaving Gainax, Hideaki Anno started what animaton studio?";
				qClipFile = "quest8C.wav";
				correct = 2;
				answer1 = "Trigger";
				a1ClipFile = "ans8C1.wav";
				answer2 = "Khara";
				a2ClipFile = "ans8C2.wav";
				answer3 = "Ghibli";
				a3ClipFile = "ans8C3.wav";
				answer4 = "Shaft";
				a4ClipFile = "ans8C4.wav";
				expClipFile = "exp8C.wav";
				break;
			case 4:
				qText = "Which of the following series is not usually seen as a genre deconstruction anime?";
				qClipFile = "quest8D.wav";
				correct = 1;
				answer1 = "Ghost in the Shell: Stand Alone Complex";
				a1ClipFile = "ans8D1.wav";
				answer2 = "Puella Magi Madoka Magica";
				a2ClipFile = "ans8D2.wav";
				answer3 = "Neon Genesis Evangelion";
				a3ClipFile = "ans8D3.wav";
				answer4 = "Mobile Suit Gundam";
				a4ClipFile = "ans8D4.wav";
				expClipFile = "exp8D.wav";
				break;
			case 5:
				qText = "What anime series had to fave four consecutive recap episodes due to the 2004 Asian SARS outbreak?";
				qClipFile = "quest8E.wav";
				correct = 1;
				answer1 = "Wolf's Rain";
				a1ClipFile = "ans8E1.wav";
				answer2 = "Naruto";
				a2ClipFile = "ans8E2.wav";
				answer3 = "Fist of the North Star";
				a3ClipFile = "ans8E3.wav";
				answer4 = "Mobile Suit Gundam SEED Destiny";
				a4ClipFile = "ans8E4.wav";
				expClipFile = "exp8E.wav";
				break;
			default:
				qText = "";
				qClipFile = "";
				correct = 0;
				answer1 = "";
				a1ClipFile = "";
				answer2 = "";
				a2ClipFile = "";
				answer3 = "";
				a3ClipFile = "";
				answer4 = "";
				a4ClipFile = "";
				expClipFile = "";
				break;
			}
			break;
		case 9:
			switch (queston)
			{
			case 1:
				qText = "What British comedy series gave the world Numberwang?";
				qClipFile = "quest9A.wav";
				correct = 3;
				answer1 = "Peep Show";
				a1ClipFile = "ans9A1.wav";
				answer2 = "Monty Python's Flying Circus";
				a2ClipFile = "ans9A2.wav";
				answer3 = "That Mitchell and Webb Look";
				a3ClipFile = "ans9A3.wav";
				answer4 = "Noel Fielding's Luxury Comedy";
				a4ClipFile = "ans9A4.wav";
				expClipFile = "exp9A.wav";
				break;
			case 2:
				qText = "What British comedy series had its first series set in a zoo, the second in an apartment, and the third in a shop?";
				qClipFile = "quest9B.wav";
				correct = 3;
				answer1 = "Peep Show";
				a1ClipFile = "ans9B1.wav";
				answer2 = "Black Books";
				a2ClipFile = "ans9B2.wav";
				answer3 = "The Mighty Boosh";
				a3ClipFile = "ans9B3.wav";
				answer4 = "Red Dwarf";
				a4ClipFile = "ans9B4.wav";
				expClipFile = "exp9B.wav";
				break;
			case 3:
				qText = "What Australian series parodied 60's adventure series in its first series and 80's action series in its second?";
				qClipFile = "quest9C.wav";
				correct = 3;
				answer1 = "F Troop";
				a1ClipFile = "ans9C1.wav";
				answer2 = "McHale's Navy";
				a2ClipFile = "ans9C1.wav";
				answer3 = "Danger 5";
				a3ClipFile = "ans9C3.wav";
				answer4 = "Dad's Army";
				a4ClipFile = "ans9C4.wav";
				expClipFile = "exp9C.wav";
				break;
			case 4:
				qText = "What BBC comedy series was broadcast to fill a hole left after protests cancelled Popetown before it ever aired?";
				qClipFile = "quest9D.wav";
				correct = 4;
				answer1 = "Monty Python's Flying Circus";
				a1ClipFile = "ans9D1.wav";
				answer2 = "Red Dwarf";
				a2ClipFile = "ans9D2.wav";
				answer3 = "The Mighty Boosh";
				a3ClipFile = "ans9D3.wav";
				answer4 = "Snuff Box";
				a4ClipFile = "ans9D4.wav";
				expClipFile = "exp9D.wav";
				break;
			case 5:
				qText = "Peter Serafinowicz wrote and starred in what parody of educational series?";
				qClipFile = "quest9E.wav";
				correct = 3;
				answer1 = "Wonder Showzen";
				a1ClipFile = "ans9E1.wav";
				answer2 = "Tomorrow's World";
				a2ClipFile = "ans9E2.wav";
				answer3 = "Look Around You";
				a3ClipFile = "ans9E3.wav";
				answer4 = "Blue Peter";
				a4ClipFile = "ans9E4.wav";
				expClipFile = "exp9E.wav";
				break;
			default:
				qText = "";
				qClipFile = "";
				correct = 0;
				answer1 = "";
				a1ClipFile = "";
				answer2 = "";
				a2ClipFile = "";
				answer3 = "";
				a3ClipFile = "";
				answer4 = "";
				a4ClipFile = "";
				expClipFile = "";
				break;
			}
			break;
		case 10:
			switch (queston)
			{
			case 1:
				qText = "What is the safest (and usually best) order at a Chinese restaurant?";
				qClipFile = "quest10A.wav";
				correct = 2;
				answer1 = "Beef with Broccoli";
				a1ClipFile = "ans10A1.wav";
				answer2 = "General Tso's Chicken";
				a2ClipFile = "ans10A2.wav";
				answer3 = "Triple Delight";
				a3ClipFile = "ans10A3.wav";
				answer4 = "Orange Chicken";
				a4ClipFile = "ans10A4.wav";
				expClipFile = "exp10A.wav";
				break;
			case 2:
				qText = "What should be the best thing on an Indian restaurant's menu?";
				qClipFile = "quest10B.wav";
				correct = 2;
				answer1 = "Garlic Naan";
				a1ClipFile = "ans10B1.wav";
				answer2 = "Chicken Vindaloo";
				a2ClipFile = "ans10B2.wav";
				answer3 = "Vegetable Curry";
				a3ClipFile = "ans10B3.wav";
				answer4 = "Chicken Tikka Masala";
				a4ClipFile = "ans10B4.wav";
				expClipFile = "exp10B.wav";
				break;
			case 3:
				qText = "What, as of writing, is the best hybrid hypercar?";
				qClipFile = "quest10C.wav";
				correct = 2;
				answer1 = "MacLaren P1";
				a1ClipFile = "ans10C1.wav";
				answer2 = "Ferrari LaFerrari";
				a2ClipFile = "ans10C2.wav";
				answer3 = "Porsche 918 Spyder";
				a3ClipFile = "ans10C3.wav";
				answer4 = "Pontiac Aztek";
				a4ClipFile = "ans10C4.wav";
				expClipFile = "exp10C.wav";
				break;
			case 4:
				qText = "What is the only acceptable Tom Cruise movie?";
				qClipFile = "quest10D.wav";
				correct = 4;
				answer1 = "Edge of Tomorrow";
				a1ClipFile = "ans10D1.wav";
				answer2 = "Mission: Impossible";
				a2ClipFile = "ans10D2.wav";
				answer3 = "Minority Report";
				a3ClipFile = "ans10D3.wav";
				answer4 = "There is no acceptable Tom Cruise movie";
				a4ClipFile = "ans10D4.wav";
				expClipFile = "exp10D.wav";
				break;
			case 5:
				qText = "What is the best breakfast cereal?";
				qClipFile = "quest10E.wav";
				correct = 3;
				answer1 = "Lucky Charms";
				a1ClipFile = "ans10E1.wav";
				answer2 = "Crunch Berries";
				a2ClipFile = "ans10E2.wav";
				answer3 = "Reese's Puffs";
				a3ClipFile = "ans10E3.wav";
				answer4 = "Froot Loops";
				a4ClipFile = "ans10E4.wav";
				expClipFile = "exp10E.wav";
				break;
			default:
				qText = "";
				qClipFile = "";
				correct = 0;
				answer1 = "";
				a1ClipFile = "";
				answer2 = "";
				a2ClipFile = "";
				answer3 = "";
				a3ClipFile = "";
				answer4 = "";
				a4ClipFile = "";
				expClipFile = "";
				break;
			}
			break;
		default:
			qText = "";
			qClipFile = "";
			correct = 0;
			answer1 = "";
			a1ClipFile = "";
			answer2 = "";
			a2ClipFile = "";
			answer3 = "";
			a3ClipFile = "";
			answer4 = "";
			a4ClipFile = "";
			expClipFile = "";
			break;
		}
	}
	
	public boolean holdState()
	{
		return hold;
	}
	
	public boolean rightState()
	{
		return right;
	}
	
	public String qTextOut()
	{
		return qText;
	}
	
	public String qClipFileOut()
	{
		return qClipFile;
	}
	
	public int correctOut()
	{
		return correct;
	}
	
	public String answer1Out()
	{
		return answer1;
	}
	
	public String a1ClipFileOut()
	{
		return a1ClipFile;
	}
	
	public String answer2Out()
	{
		return answer2;
	}
	
	public String a2ClipFileOut()
	{
		return a2ClipFile;
	}
	
	public String answer3Out()
	{
		return answer3;
	}
	
	public String a3ClipFileOut()
	{
		return a3ClipFile;
	}
	
	public String answer4Out()
	{
		return answer4;
	}
	
	public String a4ClipFileOut()
	{
		return a4ClipFile;
	}
	
	public String expClipFileOut()
	{
		return expClipFile;
	}
}
