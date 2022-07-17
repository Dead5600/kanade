package ifelse;
import java.util.*;

public class Ifelse4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner SC = new Scanner (System.in );
		int n;
		System.out.print("enter any number");
		n = SC.nextInt();
		SC.close();
		if(n % 2 == 0)
		{
			System.out.print(" \n given number is even");
		}
		else 
		{
			System.out.print("\n given number is odd");
		}
	}

}
