import java.io.IOException;

public class Mystic
{

	private String userQuestion = "";
	private String topic;
	private String answer = "";
	
	public Mystic(String quest, String top) 
	{		
		userQuestion = quest;
		topic = top;
		
		handler();
	}
	
	public void handler(){
		
		MysticFileInput submitQuestion = new MysticFileInput(userQuestion, topic);
		try {
			System.out.println("query:" + userQuestion);
			System.out.println("subreddit:" + topic);

			submitQuestion.queryHandler();

		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		//get the comment from the file
		MysticFileOutput read = new MysticFileOutput();
		try {
			
			answer = read.responseHandler();


		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
	
	public String sendResponse(){
		
		return (answer);
		
	}

	
}