import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

import java.awt.CardLayout;
import java.awt.Color;
import java.io.IOException;
import java.util.Random;
import javax.swing.*;

public class Main 
{
	public enum State {SPLASH, PREQUESTION, QUESTION, END};
	public static JFrame frame;
	public static JPanel content;
	public static JPanel neutral;
	public static int event;
	public static Random rn = new Random();
	public static boolean win;
	public static Splash splash;
	public static Prequestion eventStart;
	public static Question question;
	public static End end;
	
	public static void main(String[] args) throws LineUnavailableException, UnsupportedAudioFileException, IOException
	{
		frame = new JFrame("DREWcathalon");
		
		content = new JPanel();
		neutral = new JPanel();
		
		CardLayout cards = new CardLayout();
		content.setLayout(cards);
		neutral.setBackground(Color.WHITE);
		content.add(neutral, "neutral");
		
		frame.add(content);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(1250, 500);
		frame.setVisible(true);
		cards.show(content, "neutral");
		State gameState = State.SPLASH;
		splash = new Splash(content, cards);
		eventStart = new Prequestion(content, cards);
		question = new Question(content, cards);
		end = new End(content, cards);
		while (true)
		{
			switch(gameState)
			{
			case SPLASH:
				event = 0;
				splash.run();
				while (splash.holdState()){};
				cards.show(content, "neutral");
				gameState = State.PREQUESTION;
				break;
			case PREQUESTION:
				event++;
				eventStart.run(event);
				while (eventStart.holdState()){};
				cards.show(content, "neutral");
				gameState = State.QUESTION;
				break;
			case QUESTION:
				question.run(event, rn.nextInt(5)+1);
				while (question.holdState()){System.out.println("pfargtl");};
				System.out.println("Out of hold state");
				cards.show(content, "neutral");
				if (question.rightState() && event > 9)
				{
					win = true;
					gameState = State.END;
				}
				else if (question.rightState())
				{
					gameState = State.PREQUESTION;
				}
				else
				{
					win = false;
					gameState = State.END;
				}
				break;
			case END:
				end.run(win);
				while(end.holdState()){};
				System.out.println("End hold out");
				cards.show(content, "neutral");
				gameState = State.SPLASH;
				break;
			default:
				cards.show(content, "neutral");
				gameState = State.SPLASH;
			}
		}
	}
}
