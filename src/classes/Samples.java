package classes;
import java.util.Scanner;

class Product{
	int P_num;
	String name;
	int cost;
	int quantity;
	Scanner sc = new Scanner(System.in);
	
	void in() {
		System.out.println("\n Enter the product number, name, cost, quantity");
		P_num = sc.nextInt();
		name = sc.next();
		cost = sc.nextInt();
		quantity = sc.nextInt();	
	}
	void out (){
		System.out.println("product number is = "+P_num);
		System.out.println("name of the product = "+name);
		System.out.println("cost of the product is = "+cost);
		System.out.println("quantity of the product is = "+quantity);
	}
}
public class Samples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product P1 = new Product();
		P1.in();
		P1.out();
		
		Product P2 = new Product();
		P2.in();
		P2.out();
	}

}
