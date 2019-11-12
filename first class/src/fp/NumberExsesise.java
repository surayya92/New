package fp;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class NumberExsesise {
	public static void main(String[] args) throws FileNotFoundException  {
		File file = new File("C:\\Users\\SULTAN\\Documents\\document.txt");
	    Scanner sc =new Scanner(file);
	    List<Integer>list=new ArrayList<Integer>();
	    
	    while(sc.hasNextInt()) {
	    	list.add(sc.nextInt());
	
	}
		
		System.out.println(list);
		int sumOfNums=0;
		for (int i = 0; i<list.size(); i++) {
			sumOfNums = sumOfNums+list.get(i);
		}
		
		System.out.println(sumOfNums/list.size());
		Collections.sort(list);
		System.out.println("Lowes Number" + list.get(0));
		System.out.println("Highest Number" + list.get(list.size()-1));
		for (int i =0; i<list.size();i++) {
			if(list.get(i)%2==0) {
				System.out.println(list.get(i));
			}
		}
		Collections.shuffle(list);
		System.out.println(list);
		
	}	
		
	

}
