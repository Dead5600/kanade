package classes;
import java.util.Scanner;

class Loan{
	int LoanId;
	String name;
	int amt;
	float IntRate;
	Scanner sc = new Scanner(System.in);
	
	void get() {
		System.out.println("\n Enter the loan id, name, amount, interest rate");
		LoanId = sc.nextInt();
		name = sc.next();
		amt = sc.nextInt();
		IntRate = sc.nextFloat();
		}
	void show() {
		System.out.println("Loan id is = "+LoanId);
		System.out.println("name is = "+name);
		System.out.println("amount of loan is = "+amt);
		System.out.println("Interest Rate is = "+IntRate +"%");
	}
}
public class Finance {
public static void main(String[] args) {
	Loan l1 = new Loan();
	l1.get();
	l1.show();
	
	Loan l2 = new Loan();
	l2.get();
	l2.show();
	}
}
