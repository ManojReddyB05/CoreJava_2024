package firstpack;

public class Arrays {
public static void main(String[] args) {
	
	//By using the Arrays we can store multiple values in to the single variable.
	//Arrays are two types 1.Single Dimensional Arrays, 2.Multidimensional Arrays(2-D & 3-D Arrays).
	//For selenium purpose we need to learn about the Single Dimensional & 2-D Arrays.
	
	//Single Dimensional Arrays.
	
	/*int[] a= {100,200,3,40,50,70};// creating, initialization & Assigning values in single line.
	
	int Arraya[]=new int[5]; //creating and initialization of an Array. 
	
	Arraya[0]=1;   // Assigning values into an Array using indexes.
	Arraya[1]=10;
	Arraya[2]=100;
	Arraya[3]=1000;
	Arraya[4]=10000; // the Arraya last index value = Arraya.length-1

	
	System.out.println(Arraya.length);// will print length of Array.
	System.out.println("The Arraya last index value = "+(Arraya.length-1));
	
	System.out.println(Arraya[0]); // will print the index value.
	System.out.println(Arraya[1]);
	System.out.println(Arraya[2]);
	System.out.println(Arraya[3]);
	System.out.println(Arraya[4]);
	
	// To print all the Array values, and to simplify code we use for loop & Enhanced for loop.
	//for loop
	for(int i=0;i<Arraya.length;i++) {
		System.out.println("The value of index-"+i+"="+Arraya[i]);
	}
	//Enhanced for loop.
	for(int b:Arraya) {
		System.out.println(b);	
	}*/
	
	//Multidimensional Arrays.
	
	//int c[][]= {{1,2,3},{10,20,30}}; // creating, initialization & Assigning values in single line
	
	// Here the row count of Array is 2, the column count of Array is 3. 
	
	int array[][] = new int[2][3]; //creating and initialization of an Array.
	
	array[0][0]=1; // Assigning values into an Array using indexes.
	array[0][1]=2;
	array[0][2]=3;
	
	array[1][0]=10;
	array[1][1]=20;
	array[1][2]=30;
	
	System.out.println("row count of the array : "+array.length);// will print the row count of the array.
	
	System.out.println("column count of the array : "+array[0].length);// will print the column count of the array.
	                                    //array[1].length also will	print the column count of the array.
	
//	System.out.println(array[0][0]); // will print the index value with the help of specific row and column.
//	System.out.println(array[0][1]); 
//	System.out.println(array[0][2]); 
//	System.out.println(array[1][0]); 
//	System.out.println(array[1][1]); 
//	System.out.println(array[1][2]); 
//	
	for(int row=0;row<array.length;row++) {
		for(int col=0;col<array[0].length;col++) {
			System.out.println(array[row][col]);
		}
	}
	System.out.println("**************************");
	//Disadvantages of Arrays are.
	//1.Arrays are fixed in size.
	//2.We can't store multiple data type values in to a single Array.
	//To overcome this disadvantages we have the ArrayList.
	
	//And we have pre defined class "Object". It is Praent class for all the classes.
	//Object Array we can store multiple Datatypes of value into single Array.
	
	Object[] m = {10,1.23,'M',"Advitha",true,false};
	
	for(Object Exm:m) {
		System.out.println(Exm);
	}
	
	
	
  }
}
