package classes;
import java.util.Scanner;

class Employee {
	int E_id;
	int salary;
	String name;
	String dept;
	Scanner sc = new Scanner(System.in);
	
	void input() {
		System.out.println("\n Enter Employye id, salary, name, dept");
		E_id = sc.nextInt();
		salary = sc.nextInt();
		name = sc.next();
		dept = sc.next();
	}
		void output() {
		System.out.println("Employee id is = "+E_id);
		System.out.println("Salary is = "+salary);
		System.out.println("name of the employee is = "+name);
		System.out.println("Department of the employee is = "+dept);
		}
	}

public class Industry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee E1 = new Employee();
		E1.input();
		E1.output();
		
		Employee E2 = new Employee();
		E2.input();
		E2.output();
	}

}
