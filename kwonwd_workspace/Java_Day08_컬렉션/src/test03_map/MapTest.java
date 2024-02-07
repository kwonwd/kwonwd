package test03_map;

import java.util.HashMap;
import java.util.Map;

public class MapTest {
    public static void main(String[] args) {
        // Map
    	// - 사전과 같은 자료구조
    	// - 키&값의 쌍으로 저장
    	// - 키로 구별(중복X), 값(중복 가능)
    	// - 키가 마치 set처럼.. 순서가 보장되지는 않는다
    	
    	Map<String, String> map = new HashMap<String, String>();
    	
    	
    	map.put("서울5반", "현경찬");
    	map.put("서울6반", "옥진석");
    	map.put("서울7반", "육예진");
    	map.put("서울8반", "서경덕");
    	map.put("대전3반", "허지영");
    	map.put("대전4반", "김범규");
    	
    	System.out.println(map);
    	
    	System.out.println(map.get("대전3반"));
    	
    	map.put("서울6반", "송예진");
    	
    	System.out.println(map);
    	
    	//똑같은 키에다가 새로운 값을 넣으면 대체가 됩니다.
    	
    	System.out.println(map.containsKey("대전4반"));
    	System.out.println(map.containsValue("현경찬"));
    	
    	
    	// 맵의 순회
    	// 1. keyset()
    	for(String key:map.keySet()) {
    		System.out.printf("%s : %S \n",key,map.get(key));
    	}
    	
    	// 2. entryset()
    	for(Map.Entry<String, String> entry: map.entrySet()) {
    		System.out.println(entry.getKey()+" : "+entry.getValue());
    	}
        
        
        
        
    }
}
