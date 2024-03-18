import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
//import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;


public class LoginServiceTest {
	@Test
	void testValidLogin_Success() {
		LoginService loginService = new LoginService();
		Assertions.assertEquals(true,loginService.login("user@accolite.com", "12345678"));
	}

	@Test
	void testInValidLogin_InvalidEmail() {
		LoginService loginService = new LoginService();
		Assertions.assertEquals(false, loginService.login("user@com", "12345678"));		
	}
	
	@Test
	void testInValidLogin_InvalidPassword() {
		LoginService loginService = new LoginService();
		Assertions.assertEquals(false, loginService.login("user@accolite.com","12345"));
		
	}
	
	@Test
	void testInvalidLogin_EmailEmplty() {
		LoginService loginService=new LoginService();
		Assertions.assertEquals(false, loginService.login("", "12345678"));
	}

	@Test
	void testInvalidLogin_PasswordEmplty() {
		LoginService loginService=new LoginService();
		Assertions.assertEquals(false, loginService.login("user@accolite.com", ""));
	}
	@Test
	void testInvalidLogin_BothEmplty() {
		LoginService loginService=new LoginService();
		Assertions.assertEquals(false, loginService.login("", ""));
	}
	

	@Test
	void testforgotPassword_ValidEmail_Success() {
		PasswordResetService passwordReset=new PasswordResetService ();
		Assertions.assertEquals(true, passwordReset.resetPasword("user@accolite.com"));
		
	}
	
	@Test
	void testforgotPassword_EmailEmpty_failure() {
		PasswordResetService passwordReset=new PasswordResetService ();
		Assertions.assertEquals(false, passwordReset.resetPasword(""));
		
	}

	@Test
	void testforgotPassword_InvalidEmail_Failure() {
		PasswordResetService passwordReset=new PasswordResetService ();
		Assertions.assertEquals(false, passwordReset.resetPasword("user@com"));
	}
}
