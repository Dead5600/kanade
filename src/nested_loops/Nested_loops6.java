package nested_loops;

public class Nested_loops6 {

	public static void main(String[] args) {
	
	int i, j, tot;
	tot =0;
	for (i = 1; i<=5; i++)
	{
		System.out.print("\n");
		for (j = 1; j<=i; j++)
		{
			tot= tot +1;
		System.out.print(" "+tot+" ");	
		}
	}
}
}
