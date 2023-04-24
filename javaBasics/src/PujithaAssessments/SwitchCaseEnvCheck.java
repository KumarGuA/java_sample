package PujithaAssessments;

public class SwitchCaseEnvCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String TestURL="http://test.com", DevURL="http://Dev.com", UatURL="http://uat.com", environment= "uat";
		
		switch (environment) {
		case "test": {
			System.out.println(TestURL);
			break;
		}
		case "dev": {
			System.out.println(DevURL);
			break;
		}
		case "uat": {
			System.out.println(UatURL);
			break;
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + environment);
		}
	}
}
