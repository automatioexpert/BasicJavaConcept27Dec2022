package BuilderPattern;

public class TestScriptForFB {

	public void createAccount1() {
		CreateFbAccountData fbData1 = new CreateFbAccountData();
		fbData1.setFirstName("Steve");
		fbData1.setLastName("Smith23");

		System.out.println(fbData1.getFirstName());
		System.out.println(fbData1.getLastName());

		CreateFbAccountData fbData2 = new CreateFbAccountData();
		fbData2.setFirstName("simon");
		fbData2.setLastName("stewart");
	}
	
	public static void main(String[] args) {
		TestScriptForFB fb=new TestScriptForFB();
		fb.createAccount1();
	}
}
