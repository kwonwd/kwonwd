package test01_list;

import java.util.ArrayList;
import java.util.List;

public class ListTest1 {
    public static void main(String[] args) {
    	// List
    	// 1. 순서가 있다.
    	// 2. 중복이 허용된다.
    	
    	List<String> names = new ArrayList<String>();
    	
    	// 원소 추가
    	names.add("현경찬");
    	names.add("배태용");
    	names.add("송창용");
    	names.add("양지웅");
    	names.add("송창용"); // 중복
    	
    	System.out.println(names);
    	
    	
    	// 비어있는지 체크
    	System.out.println(names.isEmpty());
    	
    	// 삭제
    	// 1.인덱스를 이용한 삭제
    	names.remove(0);
    	System.out.println(names);
    	
    	// 2. 값을 이용한 삭제 
    	names.remove("배태용");
    	System.out.println(names);
    	
    	// 3. 전부 삭제
//    	names.clear();
//    	System.out.println(names);
//    	System.out.println(names.isEmpty());
    	
    	// 4. 중복된 값을 삭제 > 우선된 것이 삭제 
    	names.remove("송창용");
    	System.out.println(names);
    	
    	names.clear();
    	
    	names.add("학생1");
    	names.add("학생1");
    	names.add("학생2");
    	System.out.println(names);
    	// 학생1을 다 삭제하고 싶다.
    	
    	
    	// 삭제시, 리스트 크기도 바뀌고.. 각 원소들의 index도 바뀐다.
//    	for(int i=0; i<names.size();i++) {
//    		if(names.get(i).equals("학생1")) {
//    			names.remove(i);
//    		}
//    	}
//    	System.out.println(names);
    	// 지우면서 인덱스가 바뀐다.
    	
    	for(int i=names.size()-1; i>=0;i--) {
    		if(names.get(i).equals("학생1")) {
    			names.remove(i);
    		}
    	}
    	System.out.println(names);
    	
    	
    }
}
