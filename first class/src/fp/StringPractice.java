package fp;

public class StringPractice {
public static void main(String[] args) {
	//int  number  = 10;
	//String  word ="Hello world";
	//System.out.println (word.charAt(1));// output is first character of String
  //String sign = "!";
  //System.out.println(word+sign);
 // word = word + sign;
 // word+=sign;
//System.out.println(word +=sign + number);
//	int num2 = 12;
//	System.out.println("Sum of 2 numbers:" + (6 + 4));
  //  System.out.println("Sum of number and num2 is:" + number + num2);
 //   System.out.println(""+ number +num2);
	
	
//                   012345678910
	String country ="United States";
	System.out.println(country.substring(1));
	System.out.println(country.substring(2, 4));
	System.out.println(country.length());
	System.out.println(country.indexOf("t"));
	System.out.println(country.indexOf("t" , 4));
	System.out.println(country.lastIndexOf("t"));
	System.out.println(country.toLowerCase());
	System.out.println(country.toUpperCase());
	

}
}