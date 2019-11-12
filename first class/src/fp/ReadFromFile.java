package fp;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ReadFromFile {
	public static void main(String[] args) throws FileNotFoundException   {
		File file = new File("C:\\Users\\SULTAN\\Documents\\Names.txt");
		Scanner sc = new Scanner (file);
//		String[] names = new String[4];
		List<String>list=new ArrayList<>();
		
		
	
		//while(sc.hasNextLine()) {
	//	 list.add(sc.nextLine());
//		String	name = sc.nextLine();
//			list.add(name);
		//	System.out.println(sc.nextLine());
			
		//System.out.println(name);	
		
	//	}
		
	//	for(int i = list.size()-1; i>=0; i--) {
	//		if(list.get(i).charAt(0)!='B')
	//		System.out.println(list.get(i));
//			
//			if(!list.get(i).starsWith("B"))
//			System.out.println(list.get(i));
//			
//		}
	
		for (int i =0; i<list.size(); i++) {
		String name=list.get(i);
		System.out.println((name+"s").toUpperCase());
		
		System.out.println(list);
		
		}
	}
	

}
