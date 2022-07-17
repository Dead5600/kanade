package fOr;
import java.util.Scanner;
public class For3 {

	
	public static void main (String[]args) 
	{
		Scanner sc = new Scanner(System.in);
		int i,n, a, rev;
		System.out.print("enter any number");
		n = sc.nextInt();
		rev = 0;
		sc.close();
		for(i = 1; n>=1 ; i++ )
		 {
			 a = n%10;
			 rev = rev*10 + a;
			 n = n/ 10;
			 
			 
		 }
		 System.out.print("the reverse number is"+ rev);
		

		
	}
	
	
	
}
