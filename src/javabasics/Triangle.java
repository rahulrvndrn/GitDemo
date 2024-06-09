package javabasics;

public class Triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//forward triangle
		for(int i=0;i<=6;i++) {
			
			System.out.println();
			
			for(int j=0;j<i;j++) {
				//System.out.print(" ");
				System.out.print("*");
			}
		}
		
		
		System.out.println();
		
		//reverse triangle
for(int i=6;i>0;i--) {
			
			System.out.println();
			
			for(int j=0;j<i;j++) {
				
				System.out.print("*");
			}
		}


	}

}
