import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;


public class RunPythonScript {
	

	public static void main (String [] args) throws IOException{
		
		
	}
	
	public void runScript() throws IOException{
		
		String prg = "import sys";
		BufferedWriter out = new BufferedWriter(new FileWriter("cd .."));
		out.write(prg);
		out.close();
		Process p = Runtime.getRuntime().exec("python ./commentgetter.py");
		
	}

}
