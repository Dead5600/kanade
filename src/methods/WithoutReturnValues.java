package methods;
import java.util.Scanner;

public class WithoutReturnValues {

	public static void add(int x, int y, int z)
	{
		int t = x+ y +z;
		System.out.println("addition of two number is ="+t);
	}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int a, b, c ;
		System.out.println("Plz enter different numbers");
		a = sc.nextInt();
		b= sc.nextInt();
		c = sc.nextInt();
		 add(a, b, c);
		sc.close();
		

	}
	

}
