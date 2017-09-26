import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ScoreTrakker {
	private ArrayList <Student> students;
	public void loadDataFromFile (String name) throws FileNotFoundException{
		FileReader reader = new FileReader(name);
		Scanner in = new Scanner(reader);
		String temp = in.nextLine();
		

	}

	public void printInOrder(){
		Collections.sort(students);		
		for (Student s: students){
			System.out.println(s);
		}

	}
}
