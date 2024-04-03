package AbstractNonAccessModifier;

public abstract class ClassA { //Object can't be created for abstract class
	
	
	public void methodA() {
		
		System.out.println("Inside metod A");
	}

	/*  Abstract method shouldn't have method body and class should be abstract
	public abstract void methodB() {
		
		System.out.println("Inside metod A");
	}*/
	
	public abstract void methodC();

}
