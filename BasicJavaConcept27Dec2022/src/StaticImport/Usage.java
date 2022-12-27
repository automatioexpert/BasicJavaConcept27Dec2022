package StaticImport;

public class Usage {

	public void someMethod(Father father) {
		System.out.println("someMethod called");
	}
	public static void main(String[] args) {
		Usage usage =new Usage();
		usage.someMethod(new Father());
		usage.someMethod(new Son());
		
		Son s=new Son();
		Father  f= new Son(); 
		GrandFather gf=new Son();
		
	}
}
