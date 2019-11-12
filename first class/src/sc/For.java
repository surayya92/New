package sc;

import java.util.Scanner;

public class For {
	public static void main(String[] args) {
	//	for (int i = 0; 1<=11; i++) {
	//		System.out.println(i);
	//	}
		Scanner sc = new Scanner(System.in);
		System.out.println("input your pwd");
		String pwd =sc.nextLine();
		String pwdInt ="qulitt";
		for(int i = 0; i<2; i++) {
			if(pwd.equals(pwdInt)) {
			System.out.println("Welcome");
			}
			else {
			System.out.println("Wrong password");
			pwd =sc.nextLine();
			}
		
		
		
	}
	System.out.println("Your account is blocked");	
  
	
	}

}
