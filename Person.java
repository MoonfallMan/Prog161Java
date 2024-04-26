import java.util.Objects;

public class Person {
	private String name;
	private int ID;
	
	public Person(String name, int ID)
	{
		this.name = name;
		this.ID = ID;
	}
	
	public String getName()
	{
		return this.name;
	}
	
	public int getId()
	{
		return this.ID;
	}

	@Override
	public int hashCode() {
		return Objects.hash(ID);
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", ID=" + ID + "]";
	}

	// This is how the hashset decides if an object is equal to another.
	
	@Override
	public boolean equals(Object obj) {
	    if (this == obj)
	        return true;
	    if (obj == null || getClass() != obj.getClass())
	        return false;
	    Person other = (Person) obj;
	    return ID == other.ID;  // Compare based on ID only
	}
	
	
	
}
