package classes;
import java.util.Scanner;

class Bank {
	int Ac_Num;
	String name;
	String Ac_Type;
	int amt;
	Scanner sc = new Scanner(System.in);
	
	void take() {
		System.out.println("\n Enter the account num, name, account type,amount");
		Ac_Num = sc.nextInt();
		name = sc.next();
		Ac_Type = sc.next();
		amt = sc.nextInt();
	}
	void show () {
		System.out.println("Account number is = "+Ac_Num);
		System.out.println("Name of the = "+name);
		System.out.println("Account Type is = "+Ac_Type);
		System.out.println("Amount is = "+amt);
	}
}
public class BankOfIndia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank b1 = new Bank();
		b1.take();
		b1.show();
		 
		Bank b2 = new Bank();
		b2.take();
		b2.show();
	}

}
