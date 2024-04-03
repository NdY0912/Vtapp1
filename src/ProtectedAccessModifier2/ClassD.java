package ProtectedAccessModifier2;
import ProtectedAccessModifier.ClassA;
//Protected is similar to default but in protected Child Classes outside the package can access the protected variable and methods

public class ClassD extends ClassA {
		public void methodD() {
			System.out.println("Value of a is"+a);
			methodA();
			
			
		}
	
	
	
}
