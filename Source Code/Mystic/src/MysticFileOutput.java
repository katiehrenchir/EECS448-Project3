import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
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
		
		fw = new FileWriter(filename);
		bw = new BufferedWriter(fw);
				
		bw.flush();
		bw.close();
		
		
	}

		
    public String responseHandler() throws IOException {

    	getResponse();
    	System.out.println("Output class answer:");
    	System.out.println(response);
    	return response;
    }
}