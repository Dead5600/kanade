package arrays;
import java.util.Scanner;
import java.util.Arrays;

public class Arrays1 {

static	Scanner Sc = new Scanner (System.in);
static int[] a = new int[5];


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		System.out.println("Enter any value");
		for (i= 0; i<=a.length -1; i++)
		{
			a[i]= Sc.nextInt();
		}
		System.out.println(Arrays.toString(a));
	
		System.out.println("\n arrays values are.....");
		for (i =0; i<=4; i++)
		{
			System.out.println("Display values are "+a[i]);
		}
		
		for(i=0; i<=4;i++) 
		{
			System.out.print("[ "+a[i]+" ]");
		}
		
	}

}
