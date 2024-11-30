package collections;
import java.util.ArrayList;
public class ListInterface {
	public static void main(String[] args) {
		ArrayList a=new ArrayList();
		a.add(10);
		a.add("hello");
		a.add(true);
		System.out.println(a.get(1));
		System.out.println(a.indexOf("hello"));
		for(int i=0;i<a.size();i++) {
			if(a.get(i).equals(2)) {
				System.out.println(a.remove(0));   //a.remove[i];
				}
			
		
		
//		System.out.println(a.size());
//		System.out.println(a.lastIndexOf(2));
//		System.out.println(a);
		}
	

	}}
