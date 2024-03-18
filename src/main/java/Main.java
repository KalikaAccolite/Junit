
public class Main {
	public static void main(String[] args) {
		User user =new User("user@example.com", "password");
		UserDatabase.addUser(user);
		
		PasswordResetService.resetPasword("user@example.com");
		
		LoginService.login("user@example.com", "password");
		
		LoginService.login("user@example.com", "wrongpassword");

		LoginService.login("wrong@example.com", "password");

	}
}
