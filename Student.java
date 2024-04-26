
public class Student extends Person {
	private String grade;
	
	public Student(String name, int ID,String grade) {
		super(name, ID);
		this.grade = grade;
	}
	
	public String getGrade()
	{
		return this.grade;
	}

	@Override
	public String toString() {
	    return "Student [name=" + getName() + ", ID=" + getId() + ", grade=" + grade + "]";
	}

	
}
