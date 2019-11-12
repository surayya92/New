package fp;

import java.util.Scanner;

public class MuliplayInputs {
	public static void main (String[] args ) {
	//	5. Write aJava program that takes two
	//	numbers as input and display the product of two numbers.
	//	Go to the editor 
	//	Test Data:
	//	Input first number: 25
	//	Input second number: 5
	//	Expected Output :
	//		25* 5 = 125
	Scanner keyboard = new Scanner(System. in);
	//	System.out.println("Input first number");
	 //   Double num1 =	keyboard.nextDouble();
	//	System.out.println("Input second number");
	//    int num2 =	keyboard.nextInt();
	  //  int prod = num1*num2;
	  //  System.out.println("The product of your inputs is:"+ prod);
	//    System.out.println("The product of your inputs is:" + (num1*num2));
		System.out.println ("Input first number");
		double d = keyboard.nextDouble();
		System.out.println ("Input second  number");
		double d1 = keyboard.nextDouble();
	    double prod = d*d1;
	   System.out.println("The product of your inputs is:"+ prod);		
	 
	    		
}
}