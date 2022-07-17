package sWitch;
import java.util.*;
public class Switch3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		String ch;
		System.out.println("\\t a. Ahamadnagar");
		System.out.println("\\t b. Badlapur");
		System.out.println("\\t c. Chennai");
		System.out.println("\\t d. Delhi");
		System.out.println("\\t k. Kolhapur");
		System.out.println("\\t m. Mumbai");
		System.out.println("\\t p. Pune");
		System.out.println("\\t e. Exit");
	
		System.out.println(" Plz select your choice");
		ch = sc.next();
		sc.close();
		switch(ch.toLowerCase())
		{
		case "a" : 
			System.out.println("  Ahamadnagar");
			break;
			
		case "b" :
			System.out.println(" Badlapur ");
			break;
		case "c" :
			System.out.println(" Chennai");
			break;
		case "d" :
			System.out.println(" Delhi ");
			break;
		case "k" :
			System.out.println("Kolhapur");
			break;
		case "m" :
			System.out.println(" Mumbai");
			break;
			
		case "p" :	
			System.out.println(" Pune");
			break;
		case "e" : 
			System.exit(0);
		default : 
			System.out.println("plz select valid choice");
			
		}





	}

}
