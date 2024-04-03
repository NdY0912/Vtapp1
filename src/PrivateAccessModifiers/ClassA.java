package PrivateAccessModifiers;
/*
 * 
 * Private Access modifier  We will be able to access  Variable, Method, Constructor but can't use with class
 * They can't be accessed outside the class in which they are created
 * They can only be accessed in the class where they got created



 */


public class ClassA {
	private int a;
	private void methodA() {
		
		System.out.println("Value of a is"+a);
		
		
	}
	private ClassA() { 
		
		methodA();
	}
	
	

}
