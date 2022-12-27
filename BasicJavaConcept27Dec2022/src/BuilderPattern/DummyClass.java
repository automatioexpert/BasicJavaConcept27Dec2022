package BuilderPattern;

public class DummyClass {

	int num = 1;
static int numStatic=100;
	public void incrementnum() {
		System.out.println(num);
	}

	public static void main(String[] args) {
		DummyClass dummy = new DummyClass();
		System.out.println(dummy.num);

		DummyClass dummy2 = new DummyClass();
		System.out.println(dummy2.num);
		
		System.out.println(dummy.numStatic);
		System.out.println(dummy2.numStatic);

	}

}
