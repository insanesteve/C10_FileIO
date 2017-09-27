/* Authors: Stephen Agee and Easton Bornemeier
 * C10 File IO
 */

public class Student implements Comparable <Student>{
	private String name;
	private int score;
	
	@Override
	//compare the students by score, return positive if score passed in is greater
	public int compareTo(Student s) {
		return this.score - s.score;
	}

	@Override
	public String toString() {
		return name + " " + score;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setScore(int score) {
		this.score = score;
	}
	
	
}
