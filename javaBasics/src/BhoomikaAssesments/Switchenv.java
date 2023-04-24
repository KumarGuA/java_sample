package BhoomikaAssesments;

public class Switchenv {

	public static void main(String[] args) {
      
		String TestURL = "http://test.com";
		String DevURL = "http://Dev.com";
		String UatURL = "http://uat.com";

		String environment = "DevURL";
		switch (environment) {

		case "TestURL":
			System.out.println(TestURL);
			break;

		case "DevURL":
			System.out.println(DevURL);
			break;
		case "UatURL":

			System.out.println(UatURL);
			break;
		default:
			System.out.println("Invalid environment");
		}
	}
}
