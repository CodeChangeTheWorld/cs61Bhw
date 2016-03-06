import java.io.*;

public class Nuke2{
public static void main(String[] args) {
	try{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String newLine;

		System.out.print("Please input a String:");
		System.out.flush();
		newLine = reader.readLine();
		System.out.println("After remove the second char, your String become "+ newLine.replace(newLine.substring(1,2),""));
	}
	catch(IOException e){
		e.printStackTrace();
	}
	}
}