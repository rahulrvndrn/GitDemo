package javabasics;

public class ObjectsAndMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//methods - repeatable code block - reusable, easy
		//must be declared outside main block
		
		ObjectsAndMethods o = new ObjectsAndMethods();
		
		o.getData();
		getData(); // static keyword use-case
		
		StringsLesson s = new StringsLesson();//create object of another class to use that class's methods
	
		s.methodOfMadness();

	}
	
	public static void getData() {
		
		System.out.println("Rahul DBD DND BHVR");
		
		//return - returns a data of some type - change the method return type if needed
		
		//static - no need to create object to call method - tied to class, not object
		
		//access modifiers make a difference to access of methods
	}

}
