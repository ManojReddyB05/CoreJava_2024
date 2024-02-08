package firstpack;

public class MethodsReturntype {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int rollNum = sub(110,300)+110;
	
		System.out.println(rollNum);

	}
	
	// method with return type.
	public static int sub(int a, int b) {
		int c=a+b;
		System.out.println(c);
		return c; // retur statement will transfer the c value to the method calling statement.
	}

}
