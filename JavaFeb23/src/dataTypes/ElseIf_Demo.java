package dataTypes;

public class ElseIf_Demo {

	public static void main(String[] args) {
		/* Else if Syntax:
		 * if ( condition )
		 * { Code to be executed
		 * } else if ( condition )
		 * {
		 * Code to be executed 
		 * } else 
		 * { 
		 * Code to be Executed
		 * } else
		 * {
		 * code to be executed
		 * }
		 * 
		 * 
		 */
		//Test this comment
		int age = 16;
		if ( age >= 18 && age <= 80 ) {
			System.out.println(" It is high time to get married ");
			
		} else if ( age > 80 && age >= 129)
		{ System.out.println( " Pray to god that you are in good health");
		
		}else {System.out.println( " You are too young !!  Wait for a while ");}
		

	}
		

}
