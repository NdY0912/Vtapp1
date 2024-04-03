package AbstractNonAccessModifier;

public class ClassC {
	
	
	
	public static void main(String args[]) {
		//ClassA a = new ClassA(); Object can't be created for abstract class
		ClassB b = new ClassB();
		b.methodA();
		b.methodC();
		
		
	}

}
