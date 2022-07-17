package methods;
import java.util.*;
public class Methods2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Calculation Methods....");
		Scanner sc = new Scanner (System.in);
		int a,b;
		System.out.println("Enter two numbers");
		a = sc.nextInt();
		b= sc.nextInt();
		addition(a,b);
		substraction(a,b);
		multiplication(a,b);
		division(a,b);
		sc.close();
		
	}
    public static void addition(int a, int b) 
   {
    
    	int c= a+b;
    	System.out.println("addition is = "+c);
	}
	public static void substraction(int a, int b) 
	{
		int c = a-b;
		System.out.println("substrction is = "+c);
	}
	public static void multiplication (int a, int b) 
	{
		int c = a*b;
		System.out.println("multipication is ="+c);
	}
	public static void division(int a, int b)
	{
		int c= a / b;
		System.out.println("division is ="+c);
	}
}
