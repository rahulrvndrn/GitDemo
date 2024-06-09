package javabasics;

public class JavaBasics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//basic data types
		int num =5;
		String site = "DBD WIKI";
		char l = 'R';
		double d = 5.7;
		boolean check =  true;
		System.out.println("number stored is: "+num);
		System.out.println("string stored is: "+site);
		System.out.println("character stored is: "+l);
		System.out.println("double value stored is: "+d);
		System.out.println("boolean stored is: "+check);
		System.out.println("Rahul Raveendran");
		
		//arrays - indexing from 0
		
		//int[] a = new int[5];
		//int[] a = {1,2,3};
		
		int a[] = {1,2,3};
		System.out.println(a[1]);//second element
		
		//for loop - to iterate arrays
		
		for(int i=0; i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		
		String name[]= {"Rahul","Raveendran","DBD"};
		for(int i=0; i<name.length;i++)
		{
			System.out.println(name[i]);
		}
		
		//enhanced for loop
		for(String s:name)
		{
			System.out.println(s);
		}

	}

}
