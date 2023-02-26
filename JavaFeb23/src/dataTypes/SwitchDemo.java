package dataTypes;

public class SwitchDemo {

	public static void main(String[] args) {
		
		/* Switch Statement Syntax:
		 * 
		 * Switch ( expression ) {
		 * case value1:
		 * // code to be executed
		 * break;
		 * Case Value2:
		 * // code to be executed
		 * break;
		 * case Value:
		 *  // code to be executed
		 *  break;
		 *  
		 *  default:
		 *   // code to be executed
		 *   }
		 * 
		 * 
		 */
		
		int dayNumber = 17;
		
		switch ( dayNumber) {
		
		case 1: {
			System.out.println(" It is monday today");
		}
		break;
		case 2: {
			System.out.println(" It is Tuesday today");
		}
		break;
		case 3: {
			System.out.println(" It is Wdnesday today");
		}
		break;
		case 4: {
			System.out.println(" It is Thuesday today");
		}
		break;
		case 5: {
			System.out.println(" It is Friday today");
		}
		break;
		case 6: {
			System.out.println(" It is Saturday today");
		}
		break;
		case 7: {
			System.out.println(" It is Sunday today");
		}
		break;
		
		default: System.out.println( " Sorry !! it is not a day ");
		
		}

	}

}
