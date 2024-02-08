package firstpack;

public class ControlStatements1 {
	
	public static void main(String[] args) {
		
		//Iterative Statements
		
		//infinite while loop
//		int a=1,b=5;		
//		while(a<b) {
//			System.out.println("Inside while loop is printed"); //condition is satisfying every time.
//		}
		
		//While loop
		
//		int a=1;
//		while(a<=9) {
//			System.out.println("Inside while loopis printed - value of a is: "+a);
//			a++;
//		}
		
		//do - while loop
		
//		int a=(4);
//		do {
//			System.out.println("Hello World Welcome - "+a);
//			
//		}while(a<=9);
		
		
		//for loop or normal loop
//		
//		for(int i=1;i<=15;i++) {
//			System.out.println("Inside for loop - "+i);
//		}
		
		//for each loop or Enhanced loop
		
		int a[] = new int[4];
		a[0]=10;
		a[1]=20;
		a[2]=30;
		a[3]=40;
		
		System.out.println(a);
		System.out.println(a.length);
		//System.out.println(a[2]);
		 
		for(int i=0;i<a.length;i++) {
			System.out.println("for loop statements - "+a[i]);
		}
		
		for(int a1:a) {
			System.out.println("for each staments - "+a1);
			
		}
		
		int b[]= {1,2,3,4,5};
		for(int a2:b) {
			System.out.println("for each staments - "+a2);
			
		}
		
		
		
	}

}
