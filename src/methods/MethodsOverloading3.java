package methods;
import java.util.Scanner;
public class MethodsOverloading3 {

	public static void Area(int x)
	{
		double A =  3.142 * x *x;
		System.out.println("Area of Circle ="+A);
	}
	public static void Area(int x, int y)
	{
		int A = x *y;
		System.out.println("Area of Rectangle = "+A);
	}
	public static void Area(double x, double y)
	{
		double A = x * y *1/2;
		System.out.println("Area of Triangle ="+A);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner (System.in);
		int r, l, w;
		double b,h;
		
		System.out.println("Plz enter the radius of circle");
		r = sc.nextInt();
		System.out.println("Plz enter length and width of rectangle ");
		l = sc.nextInt();
		w= sc.nextInt();
		System.out.println("Plz enter the base and height of the triangle");
		b = sc.nextDouble();
		h = sc.nextDouble();
		
		Area(r);
		Area(l ,w);
		Area(b, h);
		sc.close();
	}

}
