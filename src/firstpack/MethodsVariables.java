package firstpack;

public class MethodsVariables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		
		methodOne();// normal method calling statement.	
		methodThree(30,25,45);//parameterised method calling statements with arguments.
		methodThree(20,25,27);//we call same method multiple times.the reusablety of the method.

	}
	
	// normal static method
	//methods are used to write the logics and we store the variable in the methods.
	public static void methodOne() {
		System.out.println("Inside methodOne");
		//we can call the another method inside the method
		methodTwo();
		System.out.println("********************");
	}
	
	public static void methodTwo() {
		int a=10,b=20;
		System.out.println("Inside methodTwo");
		System.out.println(a+b);
		
	}
	//we have methods with parameter types.
	//by using the method parameter we can pass the arguments in method calling statemens.
	public static void methodThree(int a,int b, int c) {
		System.out.println("Substraction of a+b+c = "+(a+b+c));
	}

}
