package BuilderPattern;

public class LoginPage {
	
//This keyword will return the current class reference
//
	public LoginPage enterUsername(String username) {
		System.out.println("Username entered");
		return this; //
	}

	public LoginPage enterPassword(String password) {
		System.out.println("Password entered");
		return this;
	}
	
	public LoginPage clickOnSubmit() {
		System.out.println("Click on submit button");
		return this;
	}
	
	public LoginPage verifyLoginSuccess() {
		System.out.println("Login is successful");
		return this;
	}
}
