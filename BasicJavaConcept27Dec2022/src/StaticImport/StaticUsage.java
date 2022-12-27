package StaticImport;

import static StaticImport.StaticMemberClass.*;
public class StaticUsage {
	
	public static void main(String[] args) {
		
		A();
		B();
		C();
		
		//StaticMemberClass StaticMemberClass=new StaticMemberClass();
		//StaticMemberClass.C();
//The static method C() from the type StaticMemberClass 
//should be accessed in a static way
		
	}

}
