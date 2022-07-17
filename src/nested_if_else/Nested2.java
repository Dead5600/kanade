package nested_if_else;
import java.util.*;

public class Nested2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner (System.in);
		int a, b, c, d;
		System.out.print("enter 4 different numbers");
		a  = sc.nextInt();
		b =sc.nextInt();
		c = sc.nextInt();
		d = sc.nextInt();
		sc.close();
		if ( a< b && a<c && a<d) 
		{
			System.out.print("smaller number is ...>" +a);
		}
		else 
		{
			if (b < a && b < c && b < d)
			{
				System.out.print(" smaller number is " +b);
			}
			else
			{
				if (c < a && c < b && c < d)
				{
					System.out.print("smaller number is "+c);
				}
				else
				{
					System.out.print("smaller number is"+ d);
				}
			}
		}
	}

}
