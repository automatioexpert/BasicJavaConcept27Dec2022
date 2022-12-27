package BuilderPattern;

public class DemoClass {

	public DemoClass methodA() {
		System.out.println("It is Method A");
		return this;
	}

	public DemoClass methodB() {
		System.out.println("It is Method B");
		return this;
	}

	public static void main(String[] args) {
		DemoClass demoA = new DemoClass();
	/*	demoA.methodA();
		demoA.methodB(); */
		
		demoA.methodA().methodB();

	}

}
