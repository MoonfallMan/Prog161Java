import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;
import java.util.Stack;
import java.util.Queue;

public class Test {

	public static void main(String[] args) {
	Person student1 = new Student("John", 3, "B");
	Person student2 = new Student("Eric", 2, "A");
	Person student3 = new Student("Tom", 4, "C");
	Person student4 = new Student("Frank", 1, "D");
	Person student5 = new Student("Tommy", 2, "A");
	
	ArrayList<Person> studentList = new ArrayList<>();
	studentList.add(student1);
	studentList.add(student2);
	studentList.add(student3);
	studentList.add(student4);
	studentList.add(student5);
	
	//Create and sort ArrayList by name
	System.out.println(studentList.toString());
	Collections.sort(studentList, new SortPersonName());
	System.out.println(studentList.toString());
	
	// Create HashSet
	Set<Person> studentSet = new HashSet<>(studentList);
	System.out.println(studentSet.toString());

	
	Stack<Person> studentStack = new Stack<>();
	studentStack.add(student2);
	studentStack.add(student4);
	studentStack.add(student1);
	studentStack.add(student5);
	studentStack.add(student3);
	
	System.out.println(studentStack.toString());
	studentStack.pop();
	System.out.println(studentStack.toString());
	studentStack.push(student1);
	System.out.println(studentStack.toString());
	
	
	
	Queue<Person> studentQueue = new LinkedList<>();
	studentQueue.add(student2);
	studentQueue.add(student4);
	studentQueue.add(student1);
	studentQueue.add(student5);
	studentQueue.add(student3);
	
	System.out.println(studentQueue.toString());
	System.out.println(studentQueue.poll());
	System.out.println(studentQueue.poll());
	System.out.println(studentQueue.toString());
	
	
	
	
	
	
	
	
	
	}

}
