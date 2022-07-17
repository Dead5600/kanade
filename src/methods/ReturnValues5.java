package methods;
import java.util.Scanner;
public class ReturnValues5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner (System.in);
		int r, l, w,b ,h,Ar, At;
		double Ac;
		System.out.println("Plz enter radius , length, width, base,height");
		r = sc.nextInt();
		l = sc.nextInt();
		w = sc.nextInt();
		b = sc.nextInt();
		h = sc.nextInt();
		Ac = AreaOfCircle(r);
		System.out.println("Area of Circle is ="+Ac);
		Ar = AreaOfRectangle(l,w);
		System.out.println("Area of Rectangle is = "+Ar);
		At = AreaOfTriangle(b,h);
		System.out.println("Area of Triangle is ="+At);
		sc.close();
	}
	public static double AreaOfCircle(int x)
	{
		double A = 3.142* x;
		return A;
	}
	public static int AreaOfRectangle(int x, int y)
	{
		int A = x*y;
		return A;
	}
	public static int AreaOfTriangle(int x, int y)
	{
		int A = x*y*1/2;
		return A;
	}
	}
	


