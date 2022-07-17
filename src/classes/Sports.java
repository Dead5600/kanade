package classes;
import java.util.Scanner;

class Cricket {
	String name;
	int matches;
	int runs;
	int wickets;
	Scanner sc = new Scanner(System.in);
	
	void accept() {
		System.out.println("\n Enter player name, total matches, runs, wickets");
		name = sc.next();
		matches = sc.nextInt();
		runs = sc.nextInt();
		wickets = sc.nextInt();
	}
	void display () {
		System.out.println("player name - "+name);
		System.out.println("total matches played - "+matches);
		System.out.println("runs scored - "+runs);
		System.out.println("wickets taken - "+wickets);
	}
}
public class Sports {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cricket C1 = new Cricket();
			C1.accept();
			C1.display();
		Cricket C2 = new Cricket();
			C2.accept();
			C2.display();
	}

}
