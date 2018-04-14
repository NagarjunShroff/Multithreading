package test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapLearning {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<String, String> map = new HashMap<String,String>();
		map.put("Key1", "Value1");
		map.put("Key2", "Value2");
		map.put("Key3", "Value3");
		//both keys and values
		Set<Entry<String,String>> values = map.entrySet();
		for(Entry<String,String> i : values) {
			System.out.println(i.getKey()+ " : "+i.getValue());
		}
		
		//or
		for(Entry<String,String> i : map.entrySet()){
			System.out.println(i.getKey()+"--->"+i.getValue());
		}
		//only keys
		Set<String> keys = map.keySet();
		for(String i : keys) {
			System.out.println(i);
		}
       
		//both keys and values
		Iterator it = values.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
	}

}
