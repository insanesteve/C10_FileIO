import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ScoreTrakker {
	private ArrayList <Student> students = new ArrayList <Student> ();


	public void loadDataFromFile (String name) throws FileNotFoundException{
		FileReader reader = new FileReader(name);
		Scanner in = new Scanner(reader);
		
		
		
		while (in.hasNextLine()){
			Student s = new Student();
			s.setName(in.nextLine());
			s.setScore(in.nextInt());
			in.nextLine();
			students.add(s);
		}
	}

	public void printInOrder(){
		Collections.sort(students);		
		for (Student s: students){
			System.out.println(s);
		}

	}

	public void processFiles() throws FileNotFoundException{
		loadDataFromFile("scores.txt");
		printInOrder();
	}

	public static void main (String [] args) throws FileNotFoundException{
		ScoreTrakker st = new ScoreTrakker();
		st.processFiles();

	}
}
