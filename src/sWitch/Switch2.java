package sWitch;
import java.util.*;
public class Switch2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int ch ;
		System.out.println("\\t 1. Kolhapur");
		System.out.println("\\t 2.  Goa");
		System.out.println("\\t 3. Pune");
		System.out.println("\\t 4. Mumbai");
		System.out.println("\\t 5. Banglore");
		System.out.println("\\t 6. Exit");
		
		System.out.println(" Plz select your choice");
		ch = sc.nextInt();
		sc.close();
		
		switch (ch) 
		{ 
		case 1 : 
			System.out.println(" Kolhapur has big tradional history in India");
			break;
		case 2 :
			System.out.println(" Goa is developed for pharmaceutical sector and tourism sector");
			break;
		case 3 :
			System.out.println(" Pune is famous for eductional bakground");
			break;
		case 4 :
			System.out.println(" Mumbai is the capital of Maharashtra State");
			break;
		case 5 : 
			System.out.println("Banglore is famous for IT sector ");
			break;
		case 6 : 
			System.exit(0);
		default :
			System.out.println("You have selected wrong choice");
		
		}
		
	}

}
