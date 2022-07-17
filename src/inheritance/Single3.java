package inheritance;
import java.util.Scanner;

class Product {
	String P1, P2,P3;
	Scanner sc = new Scanner(System.in);
	
	void in() {
		System.out.println("\n Enter name of the product");
		P1 = sc.next();
		P2 = sc.next();
		P3 = sc.next();
	}
	void out() {
		System.out.println("Product 1 name = "+P1);
		System.out.println("Product 2 name = "+P2);
		System.out.println("Product 3 name = "+P3);
	}
}
class Sale extends Product {
	int quantity, rate,price;
	Scanner sc = new Scanner(System.in);
	
	void get() {
		System.out.println("\n Enter quantity and rate of the product");
		quantity = sc.nextInt();
		rate = sc.nextInt();
		price = quantity * rate;
	}
	void show() {
		System.out.println("Quantity = "+quantity);
		System.out.println("price o product is = "+price);
	}
	
}
public class Single3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sale s = new Sale ();
		s.in();
		s.out();
		s.get();
		s.show();
	}

}
