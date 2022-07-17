package classes;
import java.util.Scanner;

class Medical {
	String medicine;
	String company;
	int price;
	String exp;
	Scanner sc = new Scanner(System.in);
	
	void accept() {
		System.out.println("\n Enter medicine name, company, price, expiry ");
		medicine = sc.next();
		company = sc.next();
		price = sc.nextInt();
		exp = sc.next();
		}
	void display() {
		System.out.println("medicine name is : "+medicine);
		System.out.println("company of the medicine : "+company);
		System.out.println("price : "+price +"Rs");
		System.out.println("Expiry date : "+exp);
	}
}
public class Pharmacy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Medical M1 = new Medical();
		M1.accept();
		M1.display();
		
		Medical M2 = new Medical();
		M2.accept();
		M2.display();
		
	}

}
