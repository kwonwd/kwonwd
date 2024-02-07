package test02_set;

import java.util.HashSet;
import java.util.Set;

public class SetTest1 {
    public static void main(String[] args) {
    	// Set
    	// - Interface
    	// 1. 집합
    	// 2. 중복을 허용하지 않음
    	// 3. 순서가 보장되지 않는다
    	
    	
    	
    	// HashSet : Class
    	// - Hashtable, 성능면에서 우수하다고 알려져 있음
        
        Set<String> set = new HashSet<String>();
        
        set.add("정상영");
        set.add("현경찬");
        set.add("양지웅");
        set.add("김도은");
        set.add("김선욱");
        set.add("양지웅");
        
        System.out.println(set);
        System.out.println(set.size());
    	
    }
}  
