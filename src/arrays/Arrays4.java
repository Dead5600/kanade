package arrays;
import java.util.Scanner;
import java.util.Arrays;

public class Arrays4 {
static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = new int[5];
		int[] b = new int[a.length];
		int i ;
		
		System.out.println("Please enter the different 5 values");
		for (i =0;i<a.length;i++) {
			a[i]= sc.nextInt();
		}
		System.out.println("Normal Arrays is = "+Arrays.toString(a));
		System.out.println("\n naormal Array"  + "\t Square array" );
		for(i = 0; i <a.length;i++) {
			
			b[i] = a[i]*a[i];
			System.out.println("\n  " +a[i] + "\t\t\t"+b[i] );
		}
		System.out.println("Square Arrays is = "+Arrays.toString(b));
	
	}

}
