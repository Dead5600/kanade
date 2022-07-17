package classes;
import java.util.Scanner;

class Movies {
	String name;
	int films;
	int awards;
	String city;
	Scanner sc = new Scanner(System.in);
	
	void get() {
		System.out.println("\n Enter name, total films, awards, city");
		name = sc.next();
		films = sc.nextInt();
		awards = sc.nextInt();
		city = sc.next();
	}
	void show() {
		System.out.println("name of actor/actress - "+name);
		System.out.println("total films - "+films);
		System.out.println("total awards - "+awards);
		System.out.println("city - "+city);
		
	}
}
public class Films {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Movies M1 = new Movies();
			M1.get();
			M1.show();
		Movies M2 = new Movies();
			M2.get();
			M2.show();
	}

}
