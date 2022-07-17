package sWitch;
import java.util.*;
public class Switch1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n1, n2,res , ch;
		System.out.println("\\t 1. Addition");
		System.out.println("\\t 2. Substraction");
		System.out.println("\\t 3. Multiplication");
		System.out.println("\\t 4. Division");
		System.out.println("\\t 5. Exit");
		
		 System.out.println("plz select your choice");
		 ch = sc.nextInt();	 
		 System.out.println("plz enter two numbers");
		 n1 = sc.nextInt();
		 n2 = sc.nextInt();
		 sc.close();
		 
		 switch (ch)
		 {
		case 1 : 
			 res = n1 + n2;
			 System.out.println("Addition is " + res);
			 break;
			 
		case 2 : 
			res = n1 - n2;
			System.out.println("Substraction is "+ res);
			break;
			
		case 3 :	
			res = n1 * n2;
			System.out.println("Multiplication is " +res );
			break;
			
		case 4 :
			res = n1 / n2;
			System.out.println("Division is" + res);
			break;
		case 5 :
			System.exit(0);
			
		default :
		        System.out.println("invalid Choice");
		 }
		 
		 
	}

}
