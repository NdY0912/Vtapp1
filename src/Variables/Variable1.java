package Variables;

public class Variable1 {
	int cost; // instance variable
	static int wheels = 4; //Static variable
	public void methodV() {
		
		int c; // Local variable
		
	}
	public static void main(String argsp[]) {
		
		Variable1 a = new Variable1();
		a.cost = 30000;
		System.out.println(Variable1.wheels);
	}

}
