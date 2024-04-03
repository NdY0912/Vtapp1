package PublicAccessModifiers;

/*
 * We will be able to access Class, Variable, Method, Constructor
 * outside the class and outside the package
 * 
 */

public class ClassB {
	
	public void methodB() {
		ClassA aobj = new ClassA();
		aobj.a = 5;
		aobj.methodA();
		
		
	}

}
