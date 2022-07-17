package methods;
import java.util.Scanner;
public class MethodOverloaading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
	int a, b,c ;
	double m, n;
	System.out.println("Plz enter three int values and two double values");
	a = sc.nextInt();
	b = sc.nextInt();
	c = sc.nextInt();
	m = sc.nextDouble();
	n = sc.nextDouble();
	
	add(a,b);
	add(a,m);
	add(m,n);
	add(a, b, c);
	sc.close();
	}
		public static void add(int x, int y)
		{
			int z = x +y;
			System.out.println("addition of two int number is =" +z);
		}
		public static void add(int x, double m)
		{
			double z = x + m;
			System.out.println("addition of one int and one double is ="+z);
		}
		public static void add(double x, double y)
		{
			double z = x + y;
			System.out.println("addition of two double is ="+z);
		}
		public static void add(int x, int y, int z)
		{
			int t = x + y + z;
			System.out.println("addition of three integer is"+t);
		}
		
	

}
