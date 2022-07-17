package constructor;
class Bill{
	int quantity, rate, amt;
	Bill(){
		quantity = 10;
		rate =20;
	}
	Bill (int x, int y){
		quantity = x;
		rate = y;
	}
	void display () {
		System.out.println("Quantity of the product = "+quantity);
		System.out.println("Rate of the product = "+rate);
	}
	void amount() {
		amt = quantity * rate;
		System.out.println("Total amount = "+amt);
	}
}
public class Constructor3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bill B1 = new Bill();
		Bill B2 = new Bill(30, 20);
		
		B1.display();
		B1.amount();
		
		B2.display();
		B2.amount();
	}

}
 