package ifelse;
import java.util.*;
public class Ifelse1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc =  new Scanner (System.in);
int n;
System.out.print("enter any number");
n= sc.nextInt();
sc.close();
if (n < 0)
{
System.out.print("given number is negative ");
}
else {
System.out.println ("gven number is positive");	
}
	}

}
