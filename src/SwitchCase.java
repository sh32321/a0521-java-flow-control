
public class SwitchCase {

	public static void main(String[] args) {
		String x = "EdiTor";
		
//		if(x == 1) {
//			System.out.println("The value of x is 1");
//		}else if(x == 2) {
//			System.out.println("The value of x is 2");
//		}else if(x == 3) {
//			System.out.println("The value of x is 3");
//		}else{
//			System.out.println("The value of x is other than 1,2,3");
//		}

		switch(x.toLowerCase()) {
			case "author":
				System.out.println("Eric");
				break;
			case "team":
				System.out.println("Team E");
				break;
			case "editor":
				System.out.println("Will & Barry");
				break;
			default:
				System.out.println("Invalid Entry");
		}

	}

}
