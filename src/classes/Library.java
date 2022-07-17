package classes;
import java.util.Scanner;

class Books{
	int book_num;
	int price;
	String name;
	String author;
	Scanner sc = new Scanner(System.in);
	
	void  accept() {
		System.out.println("\n enter the book num, price, name, author ");
	book_num = sc.nextInt();
	price = sc.nextInt();
	name = sc.next();
	author =sc.next();
	}
	void display() {
		System.out.println("Book number = "+book_num);
		System.out.println("price of the book = "+price);
		System.out.println("name of the book = "+name);
		System.out.println("author of the book = "+author);
	}
	}

public class Library {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Books b1 = new Books();
		b1.accept();
		b1.display();
		
		Books b2 = new Books();
		b2.accept();
		b2.display();
	}

}
