package fp;

import java.util.Arrays;
import java.util.Scanner;

public class TestPoint {
	public static void main(String[] args) {
//   String[] daysOfTheWeek = new String[7];
//   daysOfTheWeek[0] = "Monday";
//   daysOfTheWeek[1] = "Tuesday";
//   daysOfTheWeek[2] = "Wednesday";
//   daysOfTheWeek[3] = "Thursday";
//   daysOfTheWeek[4] = "Friday";
//   daysOfTheWeek[5] = "Saturday";
//   daysOfTheWeek[6] = "Sunday";
//   
//  // System.out.println(daysOfTheWeek.length);
//   for (int i = 0; i < daysOfTheWeek.length; i++) {
//	   if (daysOfTheWeek[i].equals("Saturday") ||daysOfTheWeek[i].equals("Sunday")) {
//	//	   System.out.println(i);
//		   System.out.println( daysOfTheWeek[i].charAt(0));
//		   System.out.println("it is weekend");
//		
//	}
	
//}
//		int[] arr = {4,6,1,5,9,4,3};
//	System.out.println(Arrays.toString(arr));
//	Arrays.sort(arr);
//	System.out.println(Arrays.toString(arr));
//	int[] arr1 = Arrays.copyOf(arr, 4);
//	System.out.println(Arrays.toString(arr1));
	

//	int[] arr2 = {5,2,4,7,6,3,2};
//     
//	System.out.println(arr2.length);
//	System.out.println(Arrays.toString(arr2));
//	Arrays.sort(arr2);
//	System.out.println(Arrays.toString(arr2));
//	int[] arr1 = Arrays.copyOf(arr2, 3);
//	System.out.println(Arrays.toString(arr1));
//	System.out.println(Arrays.binarySearch(arr2, 7));
	
//		

		
//		Scanner key = new Scanner (System .in);
//		System.out.println("Enter 5 number");
//		int[] arr = new int[5];
//		for (int i = 0; i < arr.length; i++) {
//			int num = key.nextInt();
//			arr[i] = num;
//			
//		}
//		//System.out.println(Arrays.toString(arr));
//		Arrays.sort(arr);
//		System.out.println( Arrays.toString(arr));
//		System.out.println("the greatset num " + arr[arr.length-1]);
//		
		
		Scanner ke = new Scanner (System.in);
		System.out.println("Enter num");
		int [] arr = new int[5];
		for (int i = 0; i < arr.length; i++) {
			int num = ke.nextInt();
			arr[i]=num;	
		}
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		System.out.println("The number is " + arr[arr.length-1]);
		
		
		
		
		
		
	
	}
}
	
