import java.util.HashMap;
public class SampleHashMapforeach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap hm=new HashMap();	
		hm.put(18, "VIRAT KOHLI");
		hm.put(10, "SACHIN");
		hm.put(7, "MSD");
		hm.put(45, "ROHIT");
		hm.put(1, "KL RAHUL");
		hm.put(77, "SHUBMAN GILL");		//System.out.println(ht);
		for(Object obj:hm.keySet())
		{
			System.out.println(obj);
		}	
		System.out.println("-------------------");
		for(Object obj:hm.values())
		{
			System.out.println(obj);
		}	
		System.out.println("-------------------");

		for(Object obj:hm.entrySet())
		{
			System.out.println(obj);
		}	
	}

}
