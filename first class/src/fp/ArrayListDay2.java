package fp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListDay2 {
	public static void main(String [] args) {
	List<Integer>list =new ArrayList<>();
	list.add(7);
	
	List<Integer>list1=new ArrayList<Integer>(Arrays.asList(1,4,5,6,7));
	 System.out.println(list1);
	 
	 String [] array = {"A","B"};
	 // Convert from Array to ArrayList
	 
	 List<String> arraylist = new ArrayList<String>(Arrays.asList(array));
	 arraylist.add("S");
	 
	 System.out.println(arraylist);
	 

	 
	}

	}

