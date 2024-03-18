
public class PasswordResetService {
	public static boolean resetPasword(String email) {

		User user=new User("user@accolite.com", "12345678");
		if(email.equals("user@accolite.com")) {
			sendPasswordResetEmail(email);
			return true;
		}
		else if(email.length()==0) {
			System.out.println("Email is Manadatory for Password change");
			return false;
		}
		else {
			System.out.println("Invalid Email");
			return false;
		}
	}

	public static boolean sendPasswordResetEmail(String email) {
		// TODO Auto-generated method stub
		System.out.println("Email Sent");
		return true;
		
	}
}
