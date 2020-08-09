package collectionFramework;


import java.util.Set;
import java.util.HashSet;
import java.util.TreeSet;
import java.util.LinkedHashSet;

public class SetMain {
	public static void main(String[] args) {

		TreeSet<String> mem1 = new TreeSet<String>();

	    mem1.add("a");
	    mem1.add("abc");
	    mem1.add("cde");
	    mem1.add("qwe");
	    
	    System.out.println("ランダムに表示される");
	    for(String s1 : mem1) {
	    	System.out.println(s1);
	    }
	}
}
