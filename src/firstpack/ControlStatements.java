package firstpack;

public class ControlStatements {
	static int balance = 100000;
	
	public static void main(String[] args) {
		
		//selection statements
		
		int A=10,B=15,C=26,D=25;
		//if syntax
		if (A<B) {
			System.out.println("B is bigger than A");
		}
		System.out.println("___________________________________");
		
		//if else syntax
		if (A>B) {
			System.out.println("A is bigger than B");
		}
		else {
			System.out.println("A is not bigger than B ");
		}
		System.out.println("___________________________________");
		
		//if - else if syntax
		if(A>B) {
			System.out.println("if block : A is bigger than B");
		}
		else if(B>C){
			System.out.println("else if Block1 : B is bigger than C");
		}
		else if(C>D) {
			System.out.println("else if block2 : C is bigger than D");
		}
		else {
			System.out.println("else block : None of the above conditions are true");
		}
		System.out.println("___________________________________");	
		
		//switch syntax
		String name = "Raju";
		 switch(name) {
		 case "Raju":
			 System.out.println("My name is Raju");
			 break;
		 case "Suryaram": 
			 System.out.println("My name is Suryaram");
			 break;
		 case "Rithvik":
			 System.out.println("My name is Rithvik");
			 break;
		 case "Manoj":
			 System.out.println("My name is Manoj");
			 break;
		 default:
		     System.out.println("No name is maching");
		 }
		
		
		 
		 
		 
	}

}
























