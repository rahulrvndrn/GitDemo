package javabasics;

public class ConditionalsAndMore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {1,2,3,4,5,6,7,8,9,10};
	
		//if else conditionals
		for(int i:a) {
			
			if(i%2!=0) {
				
				System.out.println("odd: "+i);
			}
			else
			{
				System.out.println("even: "+i);
			}
		}
		//break - to exit loop after condition is met - to check if an array has an even number 
		
		//create an array, print first and last element, print all elements in reverse order, print sum of elements
		int numbers[]={1,2,3,4,5};
	    int sum=0;
	    System.out.println(numbers[0]);
	    System.out.println(numbers[numbers.length-1]);
	    
	    for(int i=numbers.length-1;i>=0;i--)
	    {
	       System.out.println(numbers[i]); 
	       sum+=numbers[i];
	    }
	    System.out.println("Sum: "+sum);
	

	}

}
