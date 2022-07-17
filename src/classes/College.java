package classes;
import java.util.Scanner;

class Professor{
	int id;
	String name;
	String quali;
	String dept;
	int exp;
	Scanner sc = new Scanner(System.in);
	
	void input() {
		System.out.println("\n Enter the id , name, qualification, department, experience of the professor");
		id = sc.nextInt();
		name = sc.next();
		quali = sc.next();
		dept = sc.next();
		exp = sc.nextInt();
	}
	void output() {
		System.out.println("Id of the professor is "+id);
		System.out.println("name of  the professor "+name);
		System.out.println("qualification of hte professor is "+quali);
		System.out.println("department of the professor "+dept);
		System.out.println("experience of the professor is "+ exp +"yrs");
	}
}
public class College {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Professor p1 = new Professor();
		p1.input();
		p1.output();
		
		Professor p2 = new Professor();
		p2.input();
		p2.output();
			
	}

}
