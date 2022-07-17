package arrays;
import java.util.Scanner;
import java.util.Arrays;

public class Arrays2 {
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i ;
int[] a = new int[5];
int[] b = new int[5];
System.out.println("Please enter the 5 numbers");
	for (i =0; i<=a.length-1;i++) {
		a[i] = sc.nextInt();
	}
	System.out.println("Original Array = "+Arrays.toString(a));

	for (i = a.length -1 ; i>= 0;i--) {
		b[a.length- i-1] =a[i];
		}
	System.out.println("reverse Arrays = "+Arrays.toString(b));
	}

}
