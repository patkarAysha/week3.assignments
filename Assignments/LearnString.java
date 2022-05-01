package week3.day1.Assignments;

public class LearnString {

	public static void main(String[] args) {
		  String str2="Welcome";
		  String str=new String("Welcome");
		  if(str==(str2)) {
			  System.out.println("The String is Same"); 
		  }
		  else {
		      System.out.println("The String is Different"); 
		  }
		String str3="Welcome";
		String str1="TestLeafLocatedInChennaiIntheYear2009";
		
		char charAt = str2.charAt(3);//ctrl+2+l
		char charAt2 = str1.charAt(4);
		
		System.out.println(charAt);
		System.out.println(charAt2);
		
		boolean equals = str1.equals(str2);
		System.out.println(equals);
		System.out.println(str1.equals(str2));
		System.out.println(str1.equalsIgnoreCase(str2));
		
		int length = str1.length();
		System.out.println(length);
		
	    char[] charArray = str1.toCharArray();
	    System.out.println(charArray);
	    for (int i =0 ; i < charArray.length; i++) {
 	    }
	     int[] num=new int [4];
		 char[]ch =new char[4];
		 ch[0]='W';
		 ch[1]='E';
		
		 int indexOf = str1.indexOf('c');
		 System.out.println(indexOf);
		 
		 String substring = str1.substring(indexOf);
		 System.out.println(substring);
		
		 System.out.println(str1.substring(3,6));
		 String name="TESTLEAF";
		
		 System.out.println(name);
		 String trim = name.trim();
		 System.out.println(trim);
		
		 String[] split = name.split("");
		 System.out.println(split[1]);
		 
		 System.out.println(str1.toUpperCase());
		 
		 System.out.println(str1.toLowerCase());
		 
		 String name1="       TestLeafLocatedInChennaiIntheYear2009"      ;
		 
		 String replace = name1.replace("e", "@");
		 System.out.println(replace);
		 
		 String replaceAll = name1.replaceAll("\\D", " ");
		 System.out.println(replaceAll);
		
		String s1="TEST";
		String s2="LEAF";
		String concat = s1.concat(s2);
		System.out.println(concat);
		System.out.println(s1+s2);
		System.out.println(124241+s1);
	 }		
}