package classes;
import java.util.*;

class Students{
	int Roll;
	String name;
	int marks;
	String City;
	Scanner sc = new Scanner(System.in);
	
	void accept () {
		System.out.println("\n  Enter City, name, roll num, marks of the students")	;
				
		City = sc.next();
		name = sc.next();
		Roll = sc.nextInt();
		marks = sc.nextInt();
	
	}
	void display() {
		System.out.println("City of the student is ="+City);
		System.out.println("name of the student is ="+name);
		System.out.println("roll num of the students is ="+Roll);
		System.out.println("marks of the student is ="+marks);
		}
	
}
public class Cls {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Students a = new Students ();
	Students b = new Students();
	Students c = new Students();
	
	a.accept();
	a.display();
	b.accept();
	b.display();
	c.accept();
	c.display();
	}

}
