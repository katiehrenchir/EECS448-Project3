import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import java.io.IOException;
import java.util.Random;

public class Main 
{
	public enum State {SPLASH, PREQUESTION, QUESTION, WIN, LOSS};
	public static int event;
	public static boolean repeat = true;
	public static Random rn = new Random();
	public static Splash splash;
	public static Prequestion eventStart;
	public static Question question;
	public static Win win;
	public static Loss loss;
	
	public static void main(String[] args) throws LineUnavailableException, UnsupportedAudioFileException, IOException
	{
		State gameState = State.SPLASH;
		while (repeat)
		{
			switch(gameState)
			{
			case SPLASH:
				event = 0;
				splash = new Splash();
				splash.splashSound();
				while (splash.holdState()){};
				gameState = State.PREQUESTION;
				splash = null;
				break;
			case PREQUESTION:
				event++;
				eventStart = new Prequestion(event);
				while (eventStart.holdState()){};
				gameState = State.QUESTION;
				eventStart = null;
				break;
			case QUESTION:
				question = new Question(event, rn.nextInt(5)+1);
				while (question.holdState()){};
				if (question.rightState() && event > 1)
				{
					gameState = State.WIN;
				}
				else if (question.rightState())
				{
					gameState = State.PREQUESTION;
				}
				else
				{
					gameState = State.LOSS;
				}
				question = null;
				break;
			case WIN:
				win = new Win();
				while(win.holdState()){};
				gameState = State.SPLASH;
				win = null;
				break;
			case LOSS:
				loss = new Loss();
				while(loss.holdState()){};
				gameState = State.SPLASH;
				loss = null;
				break;
			}
		}
	}
}
