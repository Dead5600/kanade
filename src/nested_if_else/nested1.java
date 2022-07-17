package nested_if_else;
import java.util.*;

public class nested1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Sc = new Scanner (System.in);
		int a, b, c;
		System.out.println("enter three different numbers");
		a = Sc.nextInt();
		b = Sc.nextInt();
		c = Sc.nextInt();
		Sc.close();
		
		if(a> b && a >c)
		{
			System.out.print(" the greater number is....>" +a);
		}
		else 
		{ if(b > a && b > c)
		{
		System.out.print(" greater number is " +b);	
		}
			else 
			{
				System.out.print("greater number is" +c);
			}
		}
	}

}
