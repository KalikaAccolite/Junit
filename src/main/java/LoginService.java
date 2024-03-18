
public class LoginService {

	
	public static boolean login(String email, String password) {
			User user=new User("user@accolite.com", "12345678");
			if(user.getEmail().equals(email) && user.getPassword().equals(password)) {
				System.out.println("Login Successful");
				return true;
			}
			else if(email.length()==0 && password.length()==0) {
				System.out.println("Email annd Password are Mandatory to login");
				return false;
			}
			else if(email.length()==0) {
				System.out.println("Email is Mandatory to login");
				return false;
			}
			else if(password.length()==0) {
				System.out.println("Password is Mandatory to login");
				return false;
			}
			else {
				System.out.println("Invalid Credentials");
				return false;
			}
	}
	public boolean forgotPassword(String email) {
		return PasswordResetService. sendPasswordResetEmail(email);
	}
}
