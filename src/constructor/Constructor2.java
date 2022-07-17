package constructor;
class Maths{
	int n1 ,n2, tot;
	Maths(){
		n1 = 12;
		n2 = 6;
	}
	Maths(int x, int y){
		n1 = x;
		n2 = y;
	}
	void display() {
		System.out.println("number 1 is ="+n1);
		System.out.println("number 2 is = "+n2);
	}
	void addition() {
		tot = n1 +n2;
		System.out.println("addition is ="+tot);
	}
	void substraction () {
		tot = n1 -n2;
		System.out.println("substtraction is = "+tot);
	}
}
public class Constructor2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Maths M1 = new Maths();
		Maths M2 = new Maths(30,20);
		
		M1.display();
		M1.addition();
		M1.substraction();
		
		M2.display();
		M2.addition();
		M2.substraction();
	}

}
