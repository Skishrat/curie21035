package curie;

public class nestedswitchcase {
	
	public static void main(String[]args) {
		int tech = 2;
		int course = 2;
		switch(tech) {
		case 1: System.out.println("python");
		break;
		case 2:System.out.println("C++");
			switch(course) {
			case 1 : System.out.println("JEE");
			break;
			case 2 : System.out.println("ADVACE JAVA");
			
			}
	}

	}
}

