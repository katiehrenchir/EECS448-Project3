import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;

public class MysticFileInput {
	
		String query;
		String filename = "input.txt";
		
		FileReader fr;
		BufferedReader br;
		FileWriter fw;
		BufferedWriter bw;
		String line;
	
	public MysticFileInput(String userQuery){
		query = userQuery;
		
	}
	
	private void injectInput()  throws IOException {

		fw = new FileWriter(filename);
		bw = new BufferedWriter(fw);
				
		bw.write(query);
		bw.close();
		
	}

		
    public void queryHandler() throws IOException {

    	injectInput();
    	RunPythonScript run = new RunPythonScript();
    	run.runScript();
    }
}