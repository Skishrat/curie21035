package practical2;

public class numberswapping {
	
	public static void main(String[]args) {
		
		float first = 2.50f, second = 4.50f;
		
		System.out.println("---beforeswap---");
		System.out.println("first number= "+first);
		System.out.println("second number = "+second);
		
		float temporary = first;
		
		first = second;
		
		second = temporary;
		
		System.out.println("----afterswap---");
		System.out.println("the first number= "+first);
		System.out.println("the second number= "+second);
	}

}
