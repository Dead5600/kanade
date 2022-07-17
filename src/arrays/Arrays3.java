package arrays;
import java.util.Scanner;
import java.util.Arrays;

public class Arrays3 {
static Scanner sc = new Scanner (System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = new int[5];
		
		System.out.println("Please ennter the 5 value");
		int i;
	
		for (i = 0; i<=a.length -1;i++) {
		a[i] = sc.nextInt();
	}
		int[] b = new int[a.length];
			
	for(i=0; i<a.length;i++) {
		b[i]=a[i];
	}
	System.out.println("Second Array = "+Arrays.toString(b));
	
	
	
	/* by second way .............
	int[]b=Arrays.copyOf(a, a.length);
	System.out.println(Arrays.toString(b));*/
	
	}
	
}
