package dataTypes;

public class AssignmentOperatorDemo {

	public static void main(String[] args) {
		/** Assignment Operator are ( =, +=, *=, /=, and %=)
		 *  a = 7 meaning a = 7
		 *  a += 7 meaning a = a + 7
		 *  a -= 7 meaning a = a - 7
		 *  a * 7 means a = a * 7
		 *  a /= 7 means a = a / 7
		 *  a %= 7 means a = a % 7
		 *  Examples:
		 * 
		 */
		
		int a = 87; 
		int result = a - 7;
		int result1 = a / 7;
		System.out.println(a += 7); // 94 
		// System.out.println ( result );
		System.out.println (result); // 80 
		System.out.println( a *= 7);
		System.out.println(result1);
		System.out.println (a %= 7);

	}

}
