package methods;
import java.util.Scanner;
public class ReturnValues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner (System.in);
	int a ,b ,c;
	System.out.println("enter different values");
	a = sc.nextInt();
	b = sc.nextInt();
	c =addition(a,b);
	System.out.println("addition is "+c);
	sc.close();
	}
public static int addition (int x, int y)
{
	int z;
	z= x+y;
	return z;
}

}
