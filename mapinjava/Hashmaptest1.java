package mapinjava;

import java.util.Collection;
import java.util.Hashtable;
import java.util.Map.Entry;
import java.util.Set;

public class Hashmaptest1 {

	public static void main(String[] args) {

		Hashtable<Integer,String> hm=new Hashtable<Integer, String>();
		hm.put(1234, "tester");
		hm.put(1235,"developer");
		hm.put(1236, "manager");
		hm.put(1237, "project manager");
		
	//	System.out.println(hm);
		
		Set<Integer> keys=hm.keySet();
		for(Integer key:keys) {
		//	System.out.println(key);
			
			System.out.println(key +"-----"+hm.get(key));
		}
	//for values only
		
		Collection<String> values=	hm.values();
		for(String value:values) {
			System.out.println(value);
		}
		
		//for values and keys
		
		Set<Entry<Integer, String>> entry=	hm.entrySet();
		for(Entry<Integer, String> entrys:entry) {
			System.out.println(entrys);
		}
		
		System.out.println(hm.get(1237));
		
		System.out.println(hm.containsValue("tester"));
		System.out.println(hm.containsKey(1239));
		
		//updation of element
		
		hm.replace(1237, "rakehs");
		System.out.println(hm);
		
		hm.put(1237, "happy");
		System.out.println(hm);
		
		//for delete
		hm.clear();
		System.out.println(hm);
		
	}

}
