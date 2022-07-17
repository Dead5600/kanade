package methods;
import java.util.Scanner;
public class MethodOverloading2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int a, b;
		double m, n;
		System.out.println("plz Enter three int values");
		a = sc.nextInt();
		b = sc.nextInt();
		
		System.out.println("Plz enter two Double values");
		m = sc.nextDouble();
		n = sc.nextDouble();
		
		sub(a,b);
		sub(m,n);
		sub(m,a);
		sub(b,n);
		sc.close();
	}
	public static void sub(int x, int y)
	{
		int z = x - y;
		System.out.println("Substraction of two inr is ="+z);
	}
	public static void sub(double x, double y)
	{
		double z = x - y;
		System.out.println("Sub of two double is ="+z);
	}
	public static void sub(double x, int y)
	{
		double z = x-y;
	System.out.println("Substrction of one double and one int is= "+z);
	}
	public static void sub(int x, double y)
	{
		double z = x - y;
		System.out.println("Substraction of one int and one double is ="+z);
	}
	

}
