/* Authors: Stephen Agee and Easton Bornemeier
 * C10 File IO
 */

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ScoreTrakker {
	//arraylist of students
	private ArrayList <Student> students;
	private String files [] = {"scores.txt", "badscores.txt", "noscores.txt"};

	public void loadDataFromFile (String fName) throws FileNotFoundException{
		//make a new file reader
		FileReader reader = new FileReader(fName);
		//pass the file reader to a scanner
		Scanner in = new Scanner(reader);
		//allocate students here to ensure that the students reset with a new file.
		students = new ArrayList <Student> ();
		
		//read data from the file while it's not the end of the file, and store the information in student. 
		//note: this will only work with a properly formatted file
		while (in.hasNextLine()){
			String name;
			String score;
			Student s = new Student();
			//get the name from the file
			name = in.nextLine();
			s.setName(name);
			//get the score as next line
			score = in.nextLine();
			//try to parse the score to an int, if there is a number format exception, print the error and continue to the next line
			try{
				s.setScore(Integer.parseInt(score));
			}
			catch (NumberFormatException e){
				System.out.println("Incorrect format for " + name + " not a valid score: " + score);
				continue;
			}

			students.add(s);
		}
	}

	public void printInOrder(){
		//sort the students then print them out
		Collections.sort(students);		
		for (Student s: students){
			System.out.println(s);
		}
		System.out.println();

	}

	public void processFiles() throws FileNotFoundException{
		for (String f : files){
			try{
				loadDataFromFile(f);
				printInOrder();
			}
			catch (FileNotFoundException e){
				System.out.println("Can't open file " + f);
				continue;
			}
		}
	}

	public static void main (String [] args) throws FileNotFoundException{
		ScoreTrakker st = new ScoreTrakker();
		st.processFiles();

	}
}
