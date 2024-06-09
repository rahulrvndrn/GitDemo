package javabasics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListLesson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//array list has handy methods, can help with dynamic addition/deletion
		
		ArrayList<String> a= new ArrayList<String>();//create object
		//create object of class - object.method
		
		a.add("Rahul");
		a.add("Raveendran");
		a.add("DBD");
		a.add("BHVR");
		//a.remove(2);
		a.get(1);
		
		
		for(int i=0;i<a.size();i++) {
			
			System.out.println(a.get(i));
		}
		System.out.println(a.contains("DBD"));//check if array list contains an element
		
		//we can convert array to array list
		int arr[]= {1,2,3,4,5,6,7,8,9,10};
		
		List<int[]> al=Arrays.asList(arr);
		System.out.println(al.contains(17));

	}

}
