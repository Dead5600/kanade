package ifelse;
import java. util.*;
public class Ifelse3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Sc = new Scanner (System.in);
		int a, b;
		System.out.print("enter 2 different numbers");
		a = Sc.nextInt();
		b = Sc.nextInt();
		Sc.close();
		if (a > b)
		{
			System.out.print("the greater number is...>" +a +  "\t  smaller number is ...>"+b);
		}
		else
		{
			System.out.print("the greater number is ......>"   + b +  "\t smaller number is.....> " + a);
		}
	}

}
