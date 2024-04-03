package ProtectedAccessModifier;

public class ClassB {
	
	public void methodB() {
		
		ClassA aobj = new ClassA();
		System.out.println("Value of a is"+aobj.a);
		
		aobj.methodA();
	}

}
