
public class Student implements Comparable <Student>{
	private String name;
	private int score;
	
	@Override
	public int compareTo(Student s) {
		return this.score - s.score;
	}

	@Override
	public String toString() {
		return name + score;
	}
	
	
}
