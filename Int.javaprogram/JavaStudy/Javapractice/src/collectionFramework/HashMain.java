package collectionFramework;

import java.util.HashMap;
import java.util.Map;

public class HashMain {
	public static void main(String[] args) {

		Map<String, String> sampleHashMap = new HashMap<String, String>();
		sampleHashMap.put("apple","りんご");
		sampleHashMap.put("orange","みかん");
		sampleHashMap.put("peach","もも");

		sampleHashMap = new HashMap<String, String>() {
			{
				put("apple","りんご");
			    put("orange","みかん");
			    put("peach","もも");
			    put("mango",null);
			}
		};
		System.out.println(sampleHashMap.get("apple"));
		System.out.println(sampleHashMap.get("orange"));
		System.out.println(sampleHashMap.get("peach"));
		System.out.println(sampleHashMap.get("mango"));
	}
}
