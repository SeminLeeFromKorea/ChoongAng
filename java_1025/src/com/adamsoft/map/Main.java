package com.adamsoft.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		//HashMap 인스턴스 생성
		Map<String, Object> map = new HashMap<>();
		
		//Map 에 데이터 저장 - put
		map.put("num", 1);
		map.put("name", "아담");
		map.put("job", "Singer");
		//동일한 Key에 데이터를 저장하면 이전 데이터가 삭제되고 수정됨
		map.put("job", "Cyber Singer");
		
		//전체 데이터 확인
		System.out.println(map);
		
		//Map 에서 데이터 가져오기
		System.out.println(map.get("name"));
		//존재하지 않는 key를 사용하면 자바는 null을 리턴
		System.out.println(map.get("age"));
		
		//Map을 이용하면 key의 이름을 몰라도 모든 데이터를 접근하는 것이 가능
		
		//모든 key에 접근할 수 있는 Set을 가져오기
		Set<String> keys = map.keySet();
		//Set을 순회
		for(String key : keys) {
			//key를 순회하면서 key에 저장된 value를 확인
			System.out.println(key + ":" + map.get(key));
		}
		

	}

}



