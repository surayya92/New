package sc;

public class Mid {
public static void main(String[] args) {
	String st = "azerbaijani";
//	System.out.println(st.charAt(0));
//	System.out.println(st.length());
//   System.out.println(st.charAt(st.length() -1));
//    // we need to pront out from position 1 to position 3
    // st.substring(1,30); 4/2-1, 4/2+1
  System.out.println(st.substring(st.length()/2-1,st.length()/2+1));
    
  //  System.out.println(st.length()%2);
	
	//if(st.length()%2== 0) {
	//	System.out.println(st.substring(st.length()/2-1, st.length()/2+1));
		
	//}
//	else {
//		System.out.println(st.charAt(st.length()/2));
	}

    
}
