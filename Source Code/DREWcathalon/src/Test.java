import java.awt.CardLayout;
import java.util.Objects;
import javax.swing.JPanel;

public class Test 
{
	static private Prequestion preQ;
	static private Question ques;
	static private End end;
	static private int testNum;
	static private String testString1;
	static private String testString2;
	static private String testString3;
	static private String testString4;
	static private String testString5;
	static private String testString6;
	static private String testString7;
	static private String testString8;
	static private String testString9;
	static private String testString10;
	static private String testString11;
	
	public Test()
	{
		preQ = new Prequestion(new JPanel(), new CardLayout());
		ques = new Question(new JPanel(), new CardLayout());
		end = new End(new JPanel(), new CardLayout());
	}
	
	public void battery()
	{
		preQTest();
		quesTest();
		endTest();
	}
	
	private void preQTest()
	{
		for(int i = 1; i < 11; i++)
		{
			preQ.selector(i);
			preQSelector(i);
			if (Objects.equals(testString1, preQ.roundNameOut()))
			{
				System.out.println("Round " + i + " Prequestion Round Name: PASSED");
			}
			else
			{
				System.out.println("Round " + i + " Prequestion Round Name: FAILED");
			}
			
			if (Objects.equals(testString2, preQ.preQFileOut()))
			{
				System.out.println("Round " + i + " Prequestion File Name: PASSED");
			}
			else
			{
				System.out.println("Round " + i + " Prequestion File Name: FAILED");
			}
		}
		
		preQ.selector(0);
		preQSelector(0);
		if (Objects.equals(testString1, preQ.roundNameOut()))
		{
			System.out.println("Invalid Prequestion Round Name: PASSED");
		}
		else
		{
			System.out.println("Invalid Prequestion Round Name: FAILED");
		}
		
		if (Objects.equals(testString2, preQ.preQFileOut()))
		{
			System.out.println("Invalid Prequestion File Name: PASSED");
		}
		else
		{
			System.out.println("Invalid Prequestion File Name: FAILED");
		}
	}
	
	private void preQSelector(int round)
	{
		switch(round)
		{
		case 1:
			testString1 = "Event 1: Stupid Easy";
			testString2 = "round1.wav";
			break;
		case 2:
			testString1 = "Event 2: Beginner Anime";
			testString2 = "round2.wav";
			break;
		case 3:
			testString1 = "Event 3: Obscure Trivia";
			testString2 = "round3.wav";
			break;
		case 4:
			testString1 = "Event 4: PC Gaming";
			testString2 = "round4.wav";
			break;
		case 5:
			testString1 = "Event 5: Comics";
			testString2 = "round5.wav";
			break;
		case 6:
			testString1 = "Event 6: World of Warcraft";
			testString2 = "round6.wav";
			break;
		case 7:
			testString1 = "Event 7: Star Wars";
			testString2 = "round7.wav";
			break;
		case 8:
			testString1 = "Event 8: Advanced Anime";
			testString2 = "round8.wav";
			break;
		case 9:
			testString1 = "Event 9: Obscure International Television";
			testString2 = "round9.wav";
			break;
		case 10:
			testString1 = "Event 10: Subjective";
			testString2 = "round10.wav";
			break;
		default:
			testString1 = "The Phantom Round";
			testString2 = "TEST.WAV";
			break;
		}
	}
	
	private void quesTest()
	{
		for(int i = 1; i < 11; i++)
		{
			for(int j = 1; j < 6; j++)
			{
				quesSelector(i, j);
				ques.selector(i, j);
				if (Objects.equals(testString1, ques.qTextOut()))
				{
					System.out.println("Round " + i + " Question " + j + " Question Text: PASSED");
				}
				else
				{
					System.out.println("Round " + i + " Question " + j + " Question Text: FAILED");
				}
				
				if (Objects.equals(testString2, ques.qClipFileOut()))
				{
					System.out.println("Round " + i + " Question " + j + " Question File Name: PASSED");
				}
				else
				{
					System.out.println("Round " + i + " Question " + j + " Question File Name: FAILED");
				}
				
				if (Objects.equals(testNum, ques.correctOut()))
				{
					System.out.println("Round " + i + " Question " + j + " Correct Answer: PASSED");
				}
				else
				{
					System.out.println("Round " + i + " Question " + j + " Correct Answer: FAILED");
				}
				
				if (Objects.equals(testString3, ques.answer1Out()))
				{
					System.out.println("Round " + i + " Question " + j + " Answer 1 Text: PASSED");
				}
				else
				{
					System.out.println("Round " + i + " Question " + j + " Answer 1 Text: FAILED");
				}
				
				if (Objects.equals(testString4, ques.a1ClipFileOut()))
				{
					System.out.println("Round " + i + " Question " + j + " Answer 1 File Name: PASSED");
				}
				else
				{
					System.out.println("Round " + i + " Question " + j + " Answer 1 File Name: FAILED");
				}
				
				if (Objects.equals(testString5, ques.answer2Out()))
				{
					System.out.println("Round " + i + " Question " + j + " Answer 2 Text: PASSED");
				}
				else
				{
					System.out.println("Round " + i + " Question " + j + " Answer 2 Text: FAILED");
				}
				
				if (Objects.equals(testString6, ques.a2ClipFileOut()))
				{
					System.out.println("Round " + i + " Question " + j + " Answer 2 File Name: PASSED");
				}
				else
				{
					System.out.println("Round " + i + " Question " + j + " Answer 2 File Name: FAILED");
				}
				
				if (Objects.equals(testString7, ques.answer3Out()))
				{
					System.out.println("Round " + i + " Question " + j + " Answer 3 Text: PASSED");
				}
				else
				{
					System.out.println("Round " + i + " Question " + j + " Answer 3 Text: FAILED");
				}
				
				if (Objects.equals(testString8, ques.a3ClipFileOut()))
				{
					System.out.println("Round " + i + " Question " + j + " Answer 3 File Name: PASSED");
				}
				else
				{
					System.out.println("Round " + i + " Question " + j + " Answer 3 File Name: FAILED");
				}
				
				if (Objects.equals(testString9, ques.answer4Out()))
				{
					System.out.println("Round " + i + " Question " + j + " Answer 4 Text: PASSED");
				}
				else
				{
					System.out.println("Round " + i + " Question " + j + " Answer 4 Text: FAILED");
				}
				
				if (Objects.equals(testString10, ques.a4ClipFileOut()))
				{
					System.out.println("Round " + i + " Question " + j + " Answer 4 File Name: PASSED");
				}
				else
				{
					System.out.println("Round " + i + " Question " + j + " Answer 4 File Name: FAILED");
				}
				
				if (Objects.equals(testString11, ques.expClipFileOut()))
				{
					System.out.println("Round " + i + " Question " + j + " Explanation File Name: PASSED");
				}
				else
				{
					System.out.println("Round " + i + " Question " + j + " Explanation File Name: FAILED");
				}
			}
			
			quesSelector(i, 6);
			ques.selector(i, 6);
			if (Objects.equals(testString1, ques.qTextOut()))
			{
				System.out.println("Round " + i + " Invalid Question Question Text: PASSED");
			}
			else
			{
				System.out.println("Round " + i + " Invalid Question Question Text: FAILED");
			}
			
			if (Objects.equals(testString2, ques.qClipFileOut()))
			{
				System.out.println("Round " + i + " Invalid Question Question File Name: PASSED");
			}
			else
			{
				System.out.println("Round " + i + " Invalid Question Question File Name: FAILED");
			}
			
			if (Objects.equals(testNum, ques.correctOut()))
			{
				System.out.println("Round " + i + " Invalid Question Correct Answer: PASSED");
			}
			else
			{
				System.out.println("Round " + i + " Invalid Question Correct Answer: FAILED");
			}
			
			if (Objects.equals(testString3, ques.answer1Out()))
			{
				System.out.println("Round " + i + " Invalid Question Answer 1 Text: PASSED");
			}
			else
			{
				System.out.println("Round " + i + " Invalid Question Answer 1 Text: FAILED");
			}
			
			if (Objects.equals(testString4, ques.a1ClipFileOut()))
			{
				System.out.println("Round " + i + " Invalid Question Answer 1 File Name: PASSED");
			}
			else
			{
				System.out.println("Round " + i + " Invalid Question Answer 1 File Name: FAILED");
			}
			
			if (Objects.equals(testString5, ques.answer2Out()))
			{
				System.out.println("Round " + i + " Invalid Question Answer 2 Text: PASSED");
			}
			else
			{
				System.out.println("Round " + i + " Invalid Question Answer 2 Text: FAILED");
			}
			
			if (Objects.equals(testString6, ques.a2ClipFileOut()))
			{
				System.out.println("Round " + i + " Invalid Question Answer 2 File Name: PASSED");
			}
			else
			{
				System.out.println("Round " + i + " Invalid Question Answer 2 File Name: FAILED");
			}
			
			if (Objects.equals(testString7, ques.answer3Out()))
			{
				System.out.println("Round " + i + " Invalid Question Answer 3 Text: PASSED");
			}
			else
			{
				System.out.println("Round " + i + " Invalid Question Answer 3 Text: FAILED");
			}
			
			if (Objects.equals(testString8, ques.a3ClipFileOut()))
			{
				System.out.println("Round " + i + " Invalid Question Answer 3 File Name: PASSED");
			}
			else
			{
				System.out.println("Round " + i + " Invalid Question Answer 3 File Name: FAILED");
			}
			
			if (Objects.equals(testString9, ques.answer4Out()))
			{
				System.out.println("Round " + i + " Invalid Question Answer 4 Text: PASSED");
			}
			else
			{
				System.out.println("Round " + i + " Invalid Question Answer 4 Text: FAILED");
			}
			
			if (Objects.equals(testString10, ques.a4ClipFileOut()))
			{
				System.out.println("Round " + i + " Invalid Question Answer 4 File Name: PASSED");
			}
			else
			{
				System.out.println("Round " + i + " Invalid Question Answer 4 File Name: FAILED");
			}
			
			if (Objects.equals(testString11, ques.expClipFileOut()))
			{
				System.out.println("Round " + i + " Invalid Question Explanation File Name: PASSED");
			}
			else
			{
				System.out.println("Round " + i + " Invalid Question Explanation File Name: FAILED");
			}
		}
		
		quesSelector(0,0);
		ques.selector(0, 0);
		if (Objects.equals(testString1, ques.qTextOut()))
		{
			System.out.println("Invalid Round Question Text: PASSED");
		}
		else
		{
			System.out.println("Invalid Round Question Text: FAILED");
		}
		
		if (Objects.equals(testString2, ques.qClipFileOut()))
		{
			System.out.println("Invalid Round Question File Name: PASSED");
		}
		else
		{
			System.out.println("Invalid Round Question File Name: FAILED");
		}
		
		if (Objects.equals(testNum, ques.correctOut()))
		{
			System.out.println("Invalid Round Correct Answer: PASSED");
		}
		else
		{
			System.out.println("Invalid Round Correct Answer: FAILED");
		}
		
		if (Objects.equals(testString3, ques.answer1Out()))
		{
			System.out.println("Invalid Round Answer 1 Text: PASSED");
		}
		else
		{
			System.out.println("Invalid Round Answer 1 Text: FAILED");
		}
		
		if (Objects.equals(testString4, ques.a1ClipFileOut()))
		{
			System.out.println("Invalid Round Answer 1 File Name: PASSED");
		}
		else
		{
			System.out.println("Invalid Round Answer 1 File Name: FAILED");
		}
		
		if (Objects.equals(testString5, ques.answer2Out()))
		{
			System.out.println("Invalid Round Answer 2 Text: PASSED");
		}
		else
		{
			System.out.println("Invalid Round Answer 2 Text: FAILED");
		}
		
		if (Objects.equals(testString6, ques.a2ClipFileOut()))
		{
			System.out.println("Invalid Round Answer 2 File Name: PASSED");
		}
		else
		{
			System.out.println("Invalid Round Answer 2 File Name: FAILED");
		}
		
		if (Objects.equals(testString7, ques.answer3Out()))
		{
			System.out.println("Invalid Round Answer 3 Text: PASSED");
		}
		else
		{
			System.out.println("Invalid Round Answer 3 Text: FAILED");
		}
		
		if (Objects.equals(testString8, ques.a3ClipFileOut()))
		{
			System.out.println("Invalid Round Answer 3 File Name: PASSED");
		}
		else
		{
			System.out.println("Invalid Round Answer 3 File Name: FAILED");
		}
		
		if (Objects.equals(testString9, ques.answer4Out()))
		{
			System.out.println("Invalid Round Answer 4 Text: PASSED");
		}
		else
		{
			System.out.println("Invalid Round Answer 4 Text: FAILED");
		}
		
		if (Objects.equals(testString10, ques.a4ClipFileOut()))
		{
			System.out.println("Invalid Round Answer 4 File Name: PASSED");
		}
		else
		{
			System.out.println("Invalid Round Answer 4 File Name: FAILED");
		}
		
		if (Objects.equals(testString11, ques.expClipFileOut()))
		{
			System.out.println("Invalid Round Explanation File Name: PASSED");
		}
		else
		{
			System.out.println("Invalid Round Explanation File Name: FAILED");
		}
	}
	
	private void quesSelector(int round, int queston)
	{
		switch (round)
		{
		case 1:
			switch (queston)
			{
			case 1:
				testString1 = "Captains Kirk, Picard, and Janeway are from what sci-fi franchise?";
				testString2 = "quest1A.wav";
				testNum = 3;
				testString3 = "Star Wars";
				testString4 = "ans1A1.wav";
				testString5 = "Firefly/Serenity";
				testString6 = "ans1A2.wav";
				testString7 = "Star Trek";
				testString8 = "ans1A3.wav";
				testString9 = "Lord of the Rings";
				testString10 = "ans1A4.wav";
				testString11 = "exp1A.wav";
				break;
			case 2:
				testString1 = "What species is Chewbacca?";
				testString2 = "quest1B.wav";
				testNum = 1;
				testString3 = "Wookiee";
				testString4 = "ans1B1.wav";
				testString5 = "Wooky";
				testString6 = "ans1B2.wav";
				testString7 = "Time Lord";
				testString8 = "ans1B3.wav";
				testString9 = "Wookii";
				testString10 = "ans1B4.wav";
				testString11 = "exp1B.wav";
				break;
			case 3:
				testString1 = "The premiere video game streaming website is...";
				testString2 = "quest1C.wav";
				testNum = 4;
				testString3 = "Grand Mal Seizure";
				testString4 = "ans1C1.wav";
				testString5 = "Spasm";
				testString6 = "ans1C2.wav";
				testString7 = "Tic";
				testString8 = "ans1C3.wav";
				testString9 = "Twitch";
				testString10 = "ans1C4.wav";
				testString11 = "exp1C.wav";
				break;
			case 4:
				testString1 = "The premiere comic convention in America is held in what city?";
				testString2 = "quest1D.wav";
				testNum = 1;
				testString3 = "San Diego";
				testString4 = "ans1D1.wav";
				testString5 = "Anaheim";
				testString6 = "ans1D2.wav";
				testString7 = "New York City";
				testString8 = "ans1D3.wav";
				testString9 = "Black Rock City";
				testString10 = "ans1D4.wav";
				testString11 = "exp1D.wav";
				break;
			case 5:
				testString1 = "Why don't Captain America and Superman appear in media together that often?";
				testString2 = "quest1E.wav";
				testNum = 3;
				testString3 = "They're actually the same person";
				testString4 = "ans1E1.wav";
				testString5 = "The media they would both appear in would be too powerful";
				testString6 = "ans1E2.wav";
				testString7 = "They are owned by competing companies";
				testString8 = "ans1E3.wav";
				testString9 = "They actually do all the time in Ecuador";
				testString10 = "ans1E4.wav";
				testString11 = "exp1E.wav";
				break;
			default:
				testString1 = "";
				testString2 = "";
				testNum = 0;
				testString3 = "";
				testString4 = "";
				testString5 = "";
				testString6 = "";
				testString7 = "";
				testString8 = "";
				testString9 = "";
				testString10 = "";
				testString11 = "";
				break;
			}
			break;
		case 2:
			switch (queston)
			{
			case 1:
				testString1 = "What was the title character's genin team number in Naruto?";
				testString2 = "quest2A.wav";
				testNum = 2;
				testString3 = "4";
				testString4 = "ans2A1.wav";
				testString5 = "7";
				testString6 = "ans2A2.wav";
				testString7 = "9";
				testString8 = "ans2A3.wav";
				testString9 = "It was never canonically given";
				testString10 = "ans2A4.wav";
				testString11 = "exp2A.wav";
				break;
			case 2:
				testString1 = "In the anime Mobile Suit Gundam, in what year was the One Year War?";
				testString2 = "quest2B.wav";
				testNum = 4;
				testString3 = "2307 A.D.";
				testString4 = "ans2B1.wav";
				testString5 = "CE 70";
				testString6 = "ans2B2.wav";
				testString7 = "AC 175";
				testString8 = "ans2B3.wav";
				testString9 = "UC 0079";
				testString10 = "ans2B4.wav";
				testString11 = "exp2B.wav";
				break;
			case 3:
				testString1 = "In the anime/manga Bleach, how many court guard squads are there in the Seireitei?";
				testString2 = "quest2C.wav";
				testNum = 4;
				testString3 = "8";
				testString4 = "ans2C1.wav";
				testString5 = "48";
				testString6 = "ans2C2.wav";
				testString7 = "15";
				testString8 = "ans2C3.wav";
				testString9 = "13";
				testString10 = "ans2C4.wav";
				testString11 = "exp2C.wav";
				break;
			case 4:
				testString1 = "The first name of the protagonist of the One Piece franchise is...";
				testString2 = "quest2D.wav";
				testNum = 3;
				testString3 = "Tiger";
				testString4 = "ans2D1.wav";
				testString5 = "Chopper";
				testString6 = "ans2D2.wav";
				testString7 = "Monkey";
				testString8 = "ans2D3.wav";
				testString9 = "Dave";
				testString10 = "ans1B3.wav";
				testString11 = "exp2D.wav";
				break;
			case 5:
				testString1 = "Anime and manga aimed at young girls is known as what in Japanese?";
				testString2 = "quest2E.wav";
				testNum = 1;
				testString3 = "Shojo";
				testString4 = "ans2E1.wav";
				testString5 = "Shonen";
				testString6 = "ans2E2.wav";
				testString7 = "Yaoi";
				testString8 = "ans2E3.wav";
				testString9 = "Otome";
				testString10 = "ans2E4.wav";
				testString11 = "exp2E.wav";
				break;
			default:
				testString1 = "";
				testString2 = "";
				testNum = 0;
				testString3 = "";
				testString4 = "";
				testString5 = "";
				testString6 = "";
				testString7 = "";
				testString8 = "";
				testString9 = "";
				testString10 = "";
				testString11 = "";
				break;
			}
			break;
		case 3:
			switch (queston)
			{
			case 1:
				testString1 = "By tradition, how is the Olympic torch lit?";
				testString2 = "quest3A.wav";
				testNum = 3;
				testString3 = "From an eternal flame";
				testString4 = "ans3A1.wav";
				testString5 = "A flaming arrow";
				testString6 = "ans3A2.wav";
				testString7 = "By solar reflection";
				testString8 = "ans3A3.wav";
				testString9 = "Whatever is available";
				testString10 = "ans3A4.wav";
				testString11 = "exp3A.wav";
				break;
			case 2:
				testString1 = "Which is not a model produced by Lamborghini?";
				testString2 = "quest3B.wav";
				testNum = 1;
				testString3 = "Enzo";
				testString4 = "ans3B1.wav";
				testString5 = "Aventador";
				testString6 = "ans3B2.wav";
				testString7 = "Countash";
				testString8 = "ans3B3.wav";
				testString9 = "Gallardo";
				testString10 = "ans3B4.wav";
				testString11 = "exp3B.wav";
				break;
			case 3:
				testString1 = "What was the first music video played on MTV?";
				testString2 = "quest3C.wav";
				testNum = 3;
				testString3 = "Girls on Film - Duran Duran";
				testString4 = "ans3C1.wav";
				testString5 = "Money for Nothing - Dire Straits";
				testString6 = "ans3C2.wav";
				testString7 = "Video Killed the Radio Star - The Buggles";
				testString8 = "ans2C4.wav";
				testString9 = "Thriller - Michael Jackson";
				testString10 = "ans3C4.wav";
				testString11 = "exp3C.wav";
				break;
			case 4:
				testString1 = "Acetaminophen is known as what on the street?";
				testString2 = "quest3D.wav";
				testNum = 4;
				testString3 = "Molly";
				testString4 = "ans3D1.wav";
				testString5 = "Aleve";
				testString6 = "ans3D2.wav";
				testString7 = "Adderall";
				testString8 = "ans3D3.wav";
				testString9 = "Tylenol";
				testString10 = "ans3D4.wav";
				testString11 = "exp3D.wav";
				break;
			case 5:
				testString1 = "Plumbum : Lead :: Wolfram : _______";
				testString2 = "quest3E.wav";
				testNum = 1;
				testString3 = "Tungsten";
				testString4 = "ans3E1.wav";
				testString5 = "Steel";
				testString6 = "ans3E2.wav";
				testString7 = "Hydrogen";
				testString8 = "ans3E3.wav";
				testString9 = "Cesium";
				testString10 = "ans3E4.wav";
				testString11 = "exp3E.wav";
				break;
			default:
				testString1 = "";
				testString2 = "";
				testNum = 0;
				testString3 = "";
				testString4 = "";
				testString5 = "";
				testString6 = "";
				testString7 = "";
				testString8 = "";
				testString9 = "";
				testString10 = "";
				testString11 = "";
				break;
			}
			break;
		case 4:
			switch (queston)
			{
			case 1:
				testString1 = "Garry's Mod was originally a mod for what game?";
				testString2 = "quest4A.wav";
				testNum = 3;
				testString3 = "Portal 2";
				testString4 = "ans4A1.wav";
				testString5 = "Team Fortress 2";
				testString6 = "ans4A2.wav";
				testString7 = "Half-Life 2";
				testString8 = "ans4A3.wav";
				testString9 = "Halo 2";
				testString10 = "ans4A4.wav";
				testString11 = "exp4A.wav";
				break;
			case 2:
				testString1 = "Apart from its catalog of Star Wars games, Lucasarts was known for making games in what genre?";
				testString2 = "quest4B.wav";
				testNum = 3;
				testString3 = "Fighting";
				testString4 = "ans4B1.wav";
				testString5 = "RPG";
				testString6 = "ans4B2.wav";
				testString7 = "Adventure";
				testString8 = "ans4B3.wav";
				testString9 = "Bishoujo";
				testString10 = "ans4B4.wav";
				testString11 = "exp4B.wav";
				break;
			case 3:
				testString1 = "Nostalrius is a controversial server for what game?";
				testString2 = "quest4C.wav";
				testNum = 4;
				testString3 = "Starcraft";
				testString4 = "ans4C1.wav";
				testString5 = "Counter-Strike";
				testString6 = "ans4C2.wav";
				testString7 = "Team Fortress 2";
				testString8 = "ans4C3.wav";
				testString9 = "World of Warcraft";
				testString10 = "ans4C4.wav";
				testString11 = "exp4C.wav";
				break;
			case 4:
				testString1 = "Overwatch was born from the ashes of what project from Blizzard Entertainment?";
				testString2 = "quest4D.wav";
				testNum = 3;
				testString3 = "Atlas";
				testString4 = "ans4D1.wav";
				testString5 = "Mecha";
				testString6 = "ans4D2.wav";
				testString7 = "Titan";
				testString8 = "ans4D3.wav";
				testString9 = "Iron Duck";
				testString10 = "ans4D4.wav";
				testString11 = "exp4D.wav";
				break;
			case 5:
				testString1 = "Duke Nukem Forever was in development hell for how long?";
				testString2 = "quest4E.wav";
				testNum = 2;
				testString3 = "10 years";
				testString4 = "ans4E1.wav";
				testString5 = "15 years";
				testString6 = "ans4E2.wav";
				testString7 = "25 years";
				testString8 = "ans4E3.wav";
				testString9 = "30 years";
				testString10 = "ans4E4.wav";
				testString11 = "exp4E.wav";
				break;
			default:
				testString1 = "";
				testString2 = "";
				testNum = 0;
				testString3 = "";
				testString4 = "";
				testString5 = "";
				testString6 = "";
				testString7 = "";
				testString8 = "";
				testString9 = "";
				testString10 = "";
				testString11 = "";
				break;
			}
			break;
		case 5:
			switch (queston)
			{
			case 1:
				testString1 = "Who is Star Lord's father?";
				testString2 = "quest5A.wav";
				testNum = 4;
				testString3 = "Ronan the Accuser";
				testString4 = "ans5A1.wav";
				testString5 = "Ego the Living Planet";
				testString6 = "ans5A2.wav";
				testString7 = "Richard Rider";
				testString8 = "ans5A3.wav";
				testString9 = "J'Son of Spartax";
				testString10 = "ans5A4.wav";
				testString11 = "exp5A.wav";
				break;
			case 2:
				testString1 = "What event set off the first Marvel Civil War?";
				testString2 = "quest5B.wav";
				testNum = 1;
				testString3 = "Nitro self-destructed in a populated area";
				testString4 = "ans5B1.wav";
				testString5 = "She-Hulk killed a man on national television";
				testString6 = "ans5B2.wav";
				testString7 = "Fin Fang Foom ate the city of Boston";
				testString8 = "ans5B3.wav";
				testString9 = "The Skrull infiltrated the ranks of the Marvel superheroes";
				testString10 = "ans5B4.wav";
				testString11 = "exp5B.wav";
				break;
			case 3:
				testString1 = "The 12-issue maxi-series Watchmen was published in what year?";
				testString2 = "quest5C.wav";
				testNum = 2;
				testString3 = "1974";
				testString4 = "ans5C1.wav";
				testString5 = "1986";
				testString6 = "ans5C2.wav";
				testString7 = "1992";
				testString8 = "ans5C3.wav";
				testString9 = "2009";
				testString10 = "ans5C4.wav";
				testString11 = "exp5C.wav";
				break;
			case 4:
				testString1 = "Who didn't die in the Crisis on Infinte Earths?";
				testString2 = "quest5D.wav";
				testNum = 3;
				testString3 = "Supergirl of Earth-1";
				testString4 = "ans5D1.wav";
				testString5 = "Barry Allen";
				testString6 = "ans5D2.wav";
				testString7 = "Batman of Earth-2";
				testString8 = "ans5D3.wav";
				testString9 = "The DC Multiverse";
				testString10 = "ans5D4.wav";
				testString11 = "exp5D.wav";
				break;
			case 5:
				testString1 = "Which if these is not a current independent comics publisher?";
				testString2 = "quest5E.wav";
				testNum = 4;
				testString3 = "Image Comics";
				testString4 = "ans5E1.wav";
				testString5 = "Dark Horse Comics";
				testString6 = "ans5E2.wav";
				testString7 = "Oni Press";
				testString8 = "ans5E3.wav";
				testString9 = "Timely Comics";
				testString10 = "ans5E4.wav";
				testString11 = "exp5E.wav";
				break;
			default:
				testString1 = "";
				testString2 = "";
				testNum = 0;
				testString3 = "";
				testString4 = "";
				testString5 = "";
				testString6 = "";
				testString7 = "";
				testString8 = "";
				testString9 = "";
				testString10 = "";
				testString11 = "";
				break;
			}
			break;
		case 6:
			switch (queston)
			{
			case 1:
				testString1 = "Who is Varian Wrynn's grandfather?";
				testString2 = "quest6A.wav";
				testNum = 2;
				testString3 = "Anduin";
				testString4 = "ans6A1.wav";
				testString5 = "Barathen";
				testString6 = "ans6A2.wav";
				testString7 = "Tiffin";
				testString8 = "ans6A3.wav";
				testString9 = "Llane";
				testString10 = "ans6A4.wav";
				testString11 = "exp6A.wav";
				break;
			case 2:
				testString1 = "Who was Jaina Proudmoore's mentor in the Kirin Tor?";
				testString2 = "quest6B.wav";
				testNum = 1;
				testString3 = "Archmage Antonidas";
				testString4 = "quest6B1.wav";
				testString5 = "Archmage Khadgar";
				testString6 = "quest6B2.wav";
				testString7 = "Archmage Modera";
				testString8 = "quest6B3.wav";
				testString9 = "Archmage Kel'Thuzad";
				testString10 = "quest6B4.wav";
				testString11 = "exp6B.wav";
				break;
			case 3:
				testString1 = "Which Orc was responsible for opening numerous portals on Draenor and shattering the Orc homeworld?";
				testString2 = "quest6C.wav";
				testNum = 1;
				testString3 = "Ner'zul";
				testString4 = "ans6C1.wav";
				testString5 = "Gul'dan";
				testString6 = "ans6C2.wav";
				testString7 = "Skartax";
				testString8 = "ans6C3.wav";
				testString9 = "Grieve";
				testString10 = "ans6C3.wav";
				testString11 = "exp6C.wav";
				break;
			case 4:
				testString1 = "The Night Elves and the dragonflights stood against the armies of the Qiraji in what war?";
				testString2 = "quest6D.wav";
				testNum = 3;
				testString3 = "War of the Ancients";
				testString4 = "ans6D1.wav";
				testString5 = "War of the Satyr";
				testString6 = "ans6D2.wav";
				testString7 = "War of the Shifting Sands";
				testString8 = "ans6D3.wav";
				testString9 = "War of the Spider";
				testString10 = "ans6D4.wav";
				testString11 = "exp6D.wav";
				break;
			case 5:
				testString1 = "Who became the Lich King after Arthas was defeated?";
				testString2 = "quest6E.wav";
				testNum = 2;
				testString3 = "Tirion Fordring";
				testString4 = "ans6E1.wav";
				testString5 = "Bolvar Fordragon";
				testString6 = "ans6E2.wav";
				testString7 = "Darion Mograine";
				testString8 = "ans6E3.wav";
				testString9 = "Teneras Menethil II";
				testString10 = "ans6E4.wav";
				testString11 = "exp6E.wav";
				break;
			default:
				testString1 = "";
				testString2 = "";
				testNum = 0;
				testString3 = "";
				testString4 = "";
				testString5 = "";
				testString6 = "";
				testString7 = "";
				testString8 = "";
				testString9 = "";
				testString10 = "";
				testString11 = "";
				break;
			}
			break;
		case 7:
			switch (queston)
			{
			case 1:
				testString1 = "Who was Luke Skywalker's wife?";
				testString2 = "quest7A.wav";
				testNum = 4;
				testString3 = "Satele Shan";
				testString4 = "ans7A1.wav";
				testString5 = "Leia Organa";
				testString6 = "ans7A2.wav";
				testString7 = "Breha Antilles";
				testString8 = "ans7A3.wav";
				testString9 = "Mara Jade";
				testString10 = "ans7A4.wav";
				testString11 = "exp7A.wav";
				break;
			case 2:
				testString1 = "According to legend, on what planet did the Jedi Order begin?";
				testString2 = "quest7B.wav";
				testNum = 4;
				testString3 = "Jakku";
				testString4 = "ans7B1.wav";
				testString5 = "Coruscant";
				testString6 = "ans7B2.wav";
				testString7 = "Dantooine";
				testString8 = "ans7B3.wav";
				testString9 = "Tython";
				testString10 = "ans7B4.wav";
				testString11 = "exp7B.wav";
				break;
			case 3:
				testString1 = "Jaina Solo was named after whom?";
				testString2 = "quest7C.wav";
				testNum = 2;
				testString3 = "Her maternal grandfather";
				testString4 = "ans7C1.wav";
				testString5 = "Her paternal grandmother";
				testString6 = "ans7C2.wav";
				testString7 = "A legendary Jedi";
				testString8 = "ans7C3.wav";
				testString9 = "The place she was conceived";
				testString10 = "ans7C4.wav";
				testString11 = "exp7C.wav";
				break;
			case 4:
				testString1 = "What name did Jacen Solo take after he fell to the dark side?";
				testString2 = "quest7D.wav";
				testNum = 2;
				testString3 = "Darth Plagueis";
				testString4 = "ans7D1.wav";
				testString5 = "Darth Caedus";
				testString6 = "ans7D2.wav";
				testString7 = "Darth Sidious";
				testString8 = "ans7D3.wav";
				testString9 = "Darth Baras";
				testString10 = "ans7D4.wav";
				testString11 = "exp7D.wav";
				break;
			case 5:
				testString1 = "Who was the youngest child of Han Solo and Princess Leia?";
				testString2 = "quest7E.wav";
				testNum = 4;
				testString3 = "Jaina";
				testString4 = "ans7E1.wav";
				testString5 = "Jacen";
				testString6 = "ans7E2.wav";
				testString7 = "Ben";
				testString8 = "ans7E3.wav";
				testString9 = "Anakin";
				testString10 = "ans7E4.wav";
				testString11 = "exp7E.wav";
				break;
			default:
				testString1 = "";
				testString2 = "";
				testNum = 0;
				testString3 = "";
				testString4 = "";
				testString5 = "";
				testString6 = "";
				testString7 = "";
				testString8 = "";
				testString9 = "";
				testString10 = "";
				testString11 = "";
				break;
			}
			break;
		case 8:
			switch (queston)
			{
			case 1:
				testString1 = "What animation studio os known for pushing the moé aesthetic?";
				testString2 = "quest8A.wav";
				testNum = 4;
				testString3 = "Production I.G.";
				testString4 = "ans8A1.wav";
				testString5 = "Ghibli";
				testString6 = "ans8A2.wav";
				testString7 = "Gainax";
				testString8 = "ans8A3.wav";
				testString9 = "Kyoto Animation";
				testString10 = "ans8A4.wav";
				testString11 = "exp8A.wav";
				break;
			case 2:
				testString1 = "After the emotional wringer that was Neon Genesis Evangelion, Gainax made this shojo series, which became somewhat darker than the source manga.";
				testString2 = "quest8B.wav";
				testNum = 2;
				testString3 = "Revolutionary Girl Utena";
				testString4 = "ans8B1.wav";
				testString5 = "Kare Kano";
				testString6 = "ans8B2.wav";
				testString7 = "Fruits Basket";
				testString8 = "ans8B3.wav";
				testString9 = "Cardcaptor Sakura";
				testString10 = "ans8B4.wav";
				testString11 = "exp8B.wav";
				break;
			case 3:
				testString1 = "After leaving Gainax, Hideaki Anno started what animaton studio?";
				testString2 = "quest8C.wav";
				testNum = 2;
				testString3 = "Trigger";
				testString4 = "ans8C1.wav";
				testString5 = "Khara";
				testString6 = "ans8C2.wav";
				testString7 = "Ghibli";
				testString8 = "ans8C3.wav";
				testString9 = "Shaft";
				testString10 = "ans8C4.wav";
				testString11 = "exp8C.wav";
				break;
			case 4:
				testString1 = "Which of the following series is not usually seen as a genre deconstruction anime?";
				testString2 = "quest8D.wav";
				testNum = 1;
				testString3 = "Ghost in the Shell: Stand Alone Complex";
				testString4 = "ans8D1.wav";
				testString5 = "Puella Magi Madoka Magica";
				testString6 = "ans8D2.wav";
				testString7 = "Neon Genesis Evangelion";
				testString8 = "ans8D3.wav";
				testString9 = "Mobile Suit Gundam";
				testString10 = "ans8D4.wav";
				testString11 = "exp8D.wav";
				break;
			case 5:
				testString1 = "What anime series had to fave four consecutive recap episodes due to the 2004 Asian SARS outbreak?";
				testString2 = "quest8E.wav";
				testNum = 1;
				testString3 = "Wolf's Rain";
				testString4 = "ans8E1.wav";
				testString5 = "Naruto";
				testString6 = "ans8E2.wav";
				testString7 = "Fist of the North Star";
				testString8 = "ans8E3.wav";
				testString9 = "Mobile Suit Gundam SEED Destiny";
				testString10 = "ans8E4.wav";
				testString11 = "exp8E.wav";
				break;
			default:
				testString1 = "";
				testString2 = "";
				testNum = 0;
				testString3 = "";
				testString4 = "";
				testString5 = "";
				testString6 = "";
				testString7 = "";
				testString8 = "";
				testString9 = "";
				testString10 = "";
				testString11 = "";
				break;
			}
			break;
		case 9:
			switch (queston)
			{
			case 1:
				testString1 = "What British comedy series gave the world Numberwang?";
				testString2 = "quest9A.wav";
				testNum = 3;
				testString3 = "Peep Show";
				testString4 = "ans9A1.wav";
				testString5 = "Monty Python's Flying Circus";
				testString6 = "ans9A2.wav";
				testString7 = "That Mitchell and Webb Look";
				testString8 = "ans9A3.wav";
				testString9 = "Noel Fielding's Luxury Comedy";
				testString10 = "ans9A4.wav";
				testString11 = "exp9A.wav";
				break;
			case 2:
				testString1 = "What British comedy series had its first series set in a zoo, the second in an apartment, and the third in a shop?";
				testString2 = "quest9B.wav";
				testNum = 3;
				testString3 = "Peep Show";
				testString4 = "ans9B1.wav";
				testString5 = "Black Books";
				testString6 = "ans9B2.wav";
				testString7 = "The Mighty Boosh";
				testString8 = "ans9B3.wav";
				testString9 = "Red Dwarf";
				testString10 = "ans9B4.wav";
				testString11 = "exp9B.wav";
				break;
			case 3:
				testString1 = "What Australian series parodied 60's adventure series in its first series and 80's action series in its second?";
				testString2 = "quest9C.wav";
				testNum = 3;
				testString3 = "F Troop";
				testString4 = "ans9C1.wav";
				testString5 = "McHale's Navy";
				testString6 = "ans9C1.wav";
				testString7 = "Danger 5";
				testString8 = "ans9C3.wav";
				testString9 = "Dad's Army";
				testString10 = "ans9C4.wav";
				testString11 = "exp9C.wav";
				break;
			case 4:
				testString1 = "What BBC comedy series was broadcast to fill a hole left after protests cancelled Popetown before it ever aired?";
				testString2 = "quest9D.wav";
				testNum = 4;
				testString3 = "Monty Python's Flying Circus";
				testString4 = "ans9D1.wav";
				testString5 = "Red Dwarf";
				testString6 = "ans9D2.wav";
				testString7 = "The Mighty Boosh";
				testString8 = "ans9D3.wav";
				testString9 = "Snuff Box";
				testString10 = "ans9D4.wav";
				testString11 = "exp9D.wav";
				break;
			case 5:
				testString1 = "Peter Serafinowicz wrote and starred in what parody of educational series?";
				testString2 = "quest9E.wav";
				testNum = 3;
				testString3 = "Wonder Showzen";
				testString4 = "ans9E1.wav";
				testString5 = "Tomorrow's World";
				testString6 = "ans9E2.wav";
				testString7 = "Look Around You";
				testString8 = "ans9E3.wav";
				testString9 = "Blue Peter";
				testString10 = "ans9E4.wav";
				testString11 = "exp9E.wav";
				break;
			default:
				testString1 = "";
				testString2 = "";
				testNum = 0;
				testString3 = "";
				testString4 = "";
				testString5 = "";
				testString6 = "";
				testString7 = "";
				testString8 = "";
				testString9 = "";
				testString10 = "";
				testString11 = "";
				break;
			}
			break;
		case 10:
			switch (queston)
			{
			case 1:
				testString1 = "What is the safest (and usually best) order at a Chinese restaurant?";
				testString2 = "quest10A.wav";
				testNum = 2;
				testString3 = "Beef with Broccoli";
				testString4 = "ans10A1.wav";
				testString5 = "General Tso's Chicken";
				testString6 = "ans10A2.wav";
				testString7 = "Triple Delight";
				testString8 = "ans10A3.wav";
				testString9 = "Orange Chicken";
				testString10 = "ans10A4.wav";
				testString11 = "exp10A.wav";
				break;
			case 2:
				testString1 = "What should be the best thing on an Indian restaurant's menu?";
				testString2 = "quest10B.wav";
				testNum = 2;
				testString3 = "Garlic Naan";
				testString4 = "ans10B1.wav";
				testString5 = "Chicken Vindaloo";
				testString6 = "ans10B2.wav";
				testString7 = "Vegetable Curry";
				testString8 = "ans10B3.wav";
				testString9 = "Chicken Tikka Masala";
				testString10 = "ans10B4.wav";
				testString11 = "exp10B.wav";
				break;
			case 3:
				testString1 = "What, as of writing, is the best hybrid hypercar?";
				testString2 = "quest10C.wav";
				testNum = 2;
				testString3 = "MacLaren P1";
				testString4 = "ans10C1.wav";
				testString5 = "Ferrari LaFerrari";
				testString6 = "ans10C2.wav";
				testString7 = "Porsche 918 Spyder";
				testString8 = "ans10C3.wav";
				testString9 = "Pontiac Aztek";
				testString10 = "ans10C4.wav";
				testString11 = "exp10C.wav";
				break;
			case 4:
				testString1 = "What is the only acceptable Tom Cruise movie?";
				testString2 = "quest10D.wav";
				testNum = 4;
				testString3 = "Edge of Tomorrow";
				testString4 = "ans10D1.wav";
				testString5 = "Mission: Impossible";
				testString6 = "ans10D2.wav";
				testString7 = "Minority Report";
				testString8 = "ans10D3.wav";
				testString9 = "There is no acceptable Tom Cruise movie";
				testString10 = "ans10D4.wav";
				testString11 = "exp10D.wav";
				break;
			case 5:
				testString1 = "What is the best breakfast cereal?";
				testString2 = "quest10E.wav";
				testNum = 3;
				testString3 = "Lucky Charms";
				testString4 = "ans10E1.wav";
				testString5 = "Crunch Berries";
				testString6 = "ans10E2.wav";
				testString7 = "Reese's Puffs";
				testString8 = "ans10E3.wav";
				testString9 = "Froot Loops";
				testString10 = "ans10E4.wav";
				testString11 = "exp10E.wav";
				break;
			default:
				testString1 = "";
				testString2 = "";
				testNum = 0;
				testString3 = "";
				testString4 = "";
				testString5 = "";
				testString6 = "";
				testString7 = "";
				testString8 = "";
				testString9 = "";
				testString10 = "";
				testString11 = "";
				break;
			}
			break;
		default:
			testString1 = "";
			testString2 = "";
			testNum = 0;
			testString3 = "";
			testString4 = "";
			testString5 = "";
			testString6 = "";
			testString7 = "";
			testString8 = "";
			testString9 = "";
			testString10 = "";
			testString11 = "";
			break;
		}
	}
	
	private void endTest()
	{
		endSelector(true);
		end.selector(true);
		if (Objects.equals(testString1, end.messageOut()))
		{
			System.out.println("Win End Message: PASSED");
		}
		else
		{
			System.out.println("Win End Message: FAILED");
		}
		if (Objects.equals(testString2, end.fileNameOut()))
		{
			System.out.println("Win File Name: PASSED");
		}
		else
		{
			System.out.println("Win File Name: FAILED");
		}
		
		endSelector(false);
		end.selector(false);
		if (Objects.equals(testString1, end.messageOut()))
		{
			System.out.println("Loss End Message: PASSED");
		}
		else
		{
			System.out.println("Loss End Message: FAILED");
		}
		if (Objects.equals(testString2, end.fileNameOut()))
		{
			System.out.println("Loss File Name: PASSED");
		}
		else
		{
			System.out.println("Loss File Name: FAILED");
		}
	}
	
	private void endSelector(boolean win)
	{
		if (win)
		{
			testString1 = "A winnar is you!";
			testString2 = "WIN.wav";
		}
		else
		{
			testString1 = "You have lost.";
			testString2 = "LOSE.wav";
		}
	}
}
