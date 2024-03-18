import java.util.*;
public class UserDatabase {
	
	private static final Map<String , User> users=new HashMap<>();
	
	public static void addUser(User user) {
		users.put(user.getEmail(), user);
	}
	
	public static User getUser(String email) {
		return users.get(email);
	}
	
}
