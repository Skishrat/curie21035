package curie;

import java.util.Scanner;

public class whileloop {
	public static void main(String[]args){
int number , sum = 0;
Scanner scan = new Scanner(System.in);
System.out.println(" please enter any integer value below 10: ");
number = scan.nextInt();
 while(number<=10) {
	 sum = sum+number;
	 number++;
 }
 System.out.println("sum of the number from the while loop is: " +sum);
 
 
 }

}
