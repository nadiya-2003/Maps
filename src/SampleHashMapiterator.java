import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
public class SampleHashMapiterator
{
	public static void main(String[] args)
	{
		HashMap hm=new HashMap();	
		hm.put(18, "VIRAT KOHLI");
		hm.put(10, "SACHIN");
		hm.put(7, "MSD");
		hm.put(45, "ROHIT");
		hm.put(1, "KL RAHUL");
		hm.put(77, "SHUBMAN GILL");
		Collection c=hm.values();
		Iterator itr=c.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		Set s=hm.keySet();
		Iterator itr1=s.iterator();
		while(itr1.hasNext())
		{
			System.out.println(itr1.next());
		}
		Set s1=hm.entrySet();
		Iterator itr2=s1.iterator();
		while(itr2.hasNext())
		{
			System.out.println(itr2.next());
		}
	}
}