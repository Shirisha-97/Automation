package oopsinterface;

public interface Interface {
	int a=78;//final and static variable
	abstract void m();//abstract method
	static void m1()//static method is allowed in interface
	{
		System.out.println("hello");
	}
	default void m2() {
		System.out.println("demo");
	}
	
	
	
		
	}


