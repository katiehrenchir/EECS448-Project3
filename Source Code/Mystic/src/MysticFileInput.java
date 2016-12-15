import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class MysticFileInput {
	
		String query;
		String subreddit;
		String filename = "input.txt";
		
		FileReader fr;
		BufferedReader br;
		FileWriter fw;
		BufferedWriter bw;
		String line;
	
	public MysticFileInput(String userQuery, String requestedSubreddit){
		query = userQuery;
		subreddit = requestedSubreddit;
		
	}
	
	private void injectInput()  throws IOException {

		fw = new FileWriter(filename);
		bw = new BufferedWriter(fw);
				
		bw.write(query + "\n");
		bw.write(subreddit);
		bw.close();
		
	}

		
    public void queryHandler() throws IOException {

    	injectInput();
    	RunPythonScript run = new RunPythonScript();
    	run.runScript();
    }
}