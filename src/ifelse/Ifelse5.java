package ifelse;
import java.util.*;

public class Ifelse5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Sc = new Scanner (System.in);
		int y ;
		System.out.print("enter year");
		y = Sc.nextInt();
		Sc.close();
		if( y % 4 == 0)
		{
			System.out.print("given year is leaf year");
			
		}
		else
		{
			System.out.print("given yeat is not leaf year ");
		}
	}

}
