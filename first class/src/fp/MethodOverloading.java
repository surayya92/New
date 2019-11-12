package fp;

public class MethodOverloading {
	public static void main(String[] args) {
		MethodOverloading m = new MethodOverloading();
//		m.addTwoNums(7, 9);
//		m.addTwoNums(2, 3.0);
//		String str ="hello";
//		System.out.println(str.indexOf("o",0));
//		
		
		byte b=7;
		byte c=8;
		short bs=7;
		short cs =8;
		System.out.println(Byte.MAX_VALUE);
		int sum = b+c;
		float f =9.0f;
	}
	public  void addTwoNums(int i,int j) {
		System.out.println("Sum of two number is: " + (i + j));
	}
	public void addTwoNums(double i,double j) {
		System.out.println("sum of : "+ (i+j));
	}
	}


