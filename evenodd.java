package practical2;

import java.util.Scanner;

public class evenodd{
	public static void main(String[]args){
		
		Scanner reader = new Scanner(System.in);
		
		System.out.println("enter a number");
		
		int num = reader.nextInt();
		
		if(num%2==0)
			
			System.out.println(num+" is an even number");
		else
			System.out.println(num+" is a odd number");
		
	}

}
