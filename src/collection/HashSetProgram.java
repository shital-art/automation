package collection;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetProgram
{
	public static void main(String[] args)
	{//duplicate element not allowed
		HashSet h=new HashSet();
		h.add(70);
		h.add(30);
		h.add(70);
		h.add("trisha");
		h.add(59.76);
		System.out.println(h);
		h.size();
		System.out.println(		h.size());
		
		Iterator i= h.iterator();
		System.out.println(i.next());
		System.out.println(i.next());

		System.out.println(i.next());

		System.out.println(i.next());
for(int j=1;j<=h.size();j++ )
{
	System.out.println(i.next());
}
		
	}
	

}
