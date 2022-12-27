package BuilderPattern;

public class TestScripts {
	
	public static void main(String[] args) {
		/*
		LoginPage login =new LoginPage();
		login.enterUsername("Steve");
		login.enterPassword("Steve@!22323");
		login.clickOnSubmit();
		login.verifyLoginSuccess();*/
		
		
		//Builder Pattern
		LoginPage login =new LoginPage();
		login.enterUsername("user3744")
		.enterPassword("Od384849")
		.clickOnSubmit()
		.verifyLoginSuccess();
		
	}

}
