package javabasics;

public class StringsLesson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//string literal - s1 is created, s2 points to s1 as same content - no new object created if content is same
		String s1="Rahul";
		String s2="Rahul"; //points to s1
		String s3="DBD DND DBD";
		
		//string object - always creates new object regardless of content
		String s4 = new String("BHVR");
		String s5 = new String("BHVR"); //new object
		StringsLesson s6= new StringsLesson();
		
		//string methods
		
		
		String s[]=s3.split(" ");//split string is in an array
		System.out.println(s3);
		
		for (String i:s) {
			
			System.out.println(i);
		}
		
		s3.trim();//removes left and right spaces
		
		for (int j=0; j<s3.length();j++) {//think of how to do in reverse order
			
			System.out.println(s3.charAt(j));
		}
		
		s6.methodOfMadness();
	}
	public void methodOfMadness() {
		
		System.out.println("I am Vengeance");
	}

}
