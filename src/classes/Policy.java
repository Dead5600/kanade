package classes;
import java.util.Scanner;
class Insurance {
	int id;
	String name;
	int age;
	String Policy;
	int amt;
	int year;
	Scanner sc = new Scanner(System.in);
	
	void accept() {
		System.out.println("\n Enter id, name, age, policy, amount, year ");
		id = sc.nextInt();
		name = sc.next();
		age = sc.nextInt();
		Policy = sc.next();
		amt = sc.nextInt();
		year = sc.nextInt();
		}
	void show() {
		System.out.println("Policy id = "+id);
		System.out.println("person name = "+name);
		System.out.println("age = "+age);
		System.out.println("Policy name = "+Policy);
		System.out.println("Policy amount = "+amt);
		System.out.println("ending year = "+year);
	}
}
public class Policy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Insurance I1 = new Insurance();
		 I1.accept();
		 I1.show();
		Insurance I2 = new Insurance();
		I2.accept();
		I2.show();
	}

}
