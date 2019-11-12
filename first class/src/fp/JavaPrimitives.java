package fp;

public class JavaPrimitives {
	//1.Create Java Project in Eclipse.Name it IntroToJava.in scr folder create package javabasics
	//2. Create class JavaPrimitivies. Create main metod
	// 3.Declare and initialize int, long, short,byte, char, double ,float, and boolean variables
	
	public static void main(String[] args ) {
		int int1 =8;
		int1=17;
		//System.out.println(int1);
		int1=19;
		//System.out.println(int1);
		byte byte1=9;
		short short1= 10;
		long long1=11;
		double d =12.6;
		d= (double)int1;//up cating
		//System.out.println(d);
		System.out.println(14.0/5);
		float f= 13.0f;
		boolean b = true;
		char ch = 'A';
		short1 =(short)long1; // down casting
		byte1= (byte) d;
		System.out.println(byte1);
		// + -/*  %    
		// ++  -- += -=  *= /=
		int num1 =9;
		int num2 = 3;
		
		num1 +=num2;
		System.out.println(num1);
		num1*=num2;
		System.out.println(num1);
		num2 -= num1;
		System.out.println(num2);
		num2/=3;
		System.out.println(num2);
		System.out.println(++num1);
		
		
		int n = (int) 3.9;
		System.out.println("n == " + n);
		
		
	
		

}
	
}