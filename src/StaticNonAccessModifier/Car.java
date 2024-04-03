package StaticNonAccessModifier;

//import Variables.Variable1;

public class Car {
	int cost; // instance variable
	int milage; // instance variable
	static int wheels = 4; //Static variable
	//Non static method
	public void methodX() {
		
		System.out.println(cost);
		System.out.println(milage);
		System.out.println(wheels);
	}
	public static void methodZ() {//Static method

		
	} 
	public static void methodY() { //Static method
		//Static method can only access static stuff

		System.out.println(wheels);
		methodZ();
		//There's a way to access nonstatic stuff using object
		Car carone = new Car();
		
		
		System.out.println(carone.cost);
		System.out.println(carone.milage);
		carone.methodX();
	}
	
	
}
