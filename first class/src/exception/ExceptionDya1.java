package exception;

public class ExceptionDya1 {
	public static void main(String[] args) {
		try {
			division (4,0);
			
		} catch (Exception e) {
			System.out.println("Can not divide by zero");
		}
		
	}
public static void division (int d1,int d2) {
	System.out.println(d1/d2);
}
}
