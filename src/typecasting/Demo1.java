package typecasting;

public class Demo1 {
	//upcasting-->smaller to larger value conversion(larger)[widening]
	//downcasting---->larger to smaller value conversion(smaller)[narrowing]
	//upcasting is automating process and compiler will do
	//downcasting means we have to do explicitly
	public static void main(String[] args) {
		int smallvalue=100;
		long largervalue=smallvalue;
		//here we have assign literal
		float a=10.5f;
		//downcasting
		long value=20000;
		int a1=(int)value;
		//another example
		/*double doublevalue=1234.44;
		float floatvalue=(float)doublevalue;
		int i=99;
		double d=i;
		System.out.println(d);
		*/
		//in downcasting we have problem that while data will be lost 
		
		
		
	}

}
