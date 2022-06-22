package oop11.api;

import java.util.HashMap;
import java.util.Map;

public class ApiTest03 {
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();
		
		map.put("박보검", "010-1111-1111");
		map.put("정해인", "010-1111-2222");
		map.put("박서준", "010-1111-3333");
		map.put("안효섭", "010-1111-4444");
		
		System.out.println(map.get("박서준"));
		
//		Iterator<String> iter = map.keySet().iterator();
//		while(iter.hasNext()) {
//			System.out.println(iter.next());			
//		}
		for(String key : map.keySet()) {
			System.out.println(key + ":" + map.get(key));
		}
	}
}
