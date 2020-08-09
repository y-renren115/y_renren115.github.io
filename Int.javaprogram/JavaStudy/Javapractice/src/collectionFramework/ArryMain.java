package collectionFramework;

import java.util.ArrayList;
import java.util.List;

public class ArryMain {
	public static void main(String[] args) {
		List<String> sampleList = new ArrayList<String>();
		sampleList.add("abc");
		sampleList.add("def");
		sampleList.add("ghi");

//		sampleList = new ArrayList<String>() {
//			{
//			add("xyz"); add("qwe");
//			}
//		};
		for(int i = 0; i < sampleList.size(); i++) {
			System.out.println(sampleList.get(i));
		}
	}
}
