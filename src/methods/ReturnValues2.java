package methods;
import java.util.Scanner;
public class ReturnValues2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner (System.in);
		int a, b,c;
		a = sc.nextInt();
		b = sc.nextInt();
		c = substraction (a,b);
		System.out.println("Substraction is "+c);
		sc.close();
	}
	public static int substraction(int x, int y)
	{
		int z = x- y;
		return z;
	}

}
