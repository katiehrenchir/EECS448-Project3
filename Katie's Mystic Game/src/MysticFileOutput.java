import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;

public class MysticFileOutput {
	
		String response;
		String filename = "output.txt";
		
		FileReader fr;
		BufferedReader br;
		FileWriter fw;
		BufferedWriter bw;
		String line;
	
	public MysticFileOutput(){
		response = "";
		
	}
	
	private void getResponse()  throws IOException {

		fr = new FileReader(filename);
		br = new BufferedReader(fr);
				
		
		while( ( line = br.readLine() ) != null){
			
			response += line;	
		
		}
		br.close();
		
	}

		
    public String responseHandler() throws IOException {

    	getResponse();
    	System.out.println("THIS IS WHAT THE OUTPUT CLASS THINKS OF THE ANSWER");
    	System.out.println(response);
    	return response;
    }
}