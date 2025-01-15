package sub4;

import java.util.Map;

/*
 * 날짜 : 2025/01/15
 * 이름 : 이은선
 * 내용 : JAVA 컬렉션 Map 실습하기
 */

public class MapTest {
	public static void main(String[] args) {
		//Map 생성
		Map<Character, String> map = new HashMap<>();
		
		//데이터 입력
		map.put('A', "Apple"); //'Key', "Value"
		map.put('B', "Banana");
		map.put('C', "Cherry");
		
		System.out.println(map);
		
		//Map 크기
		System.out.println("map 크기 : " + map.size());

        /**
         * 1. `map.size()` 메서드:
         *    - `size()`는 맵에 저장된 **키-값 쌍**의 개수를 반환합니다.
         *    - 이 메서드는 맵에 있는 항목의 총 개수를 알려줍니다.
         *    예를 들어, map에 2개의 키-값 쌍이 있다면 `map.size()`는 `2`를 반환합니다.
         */
		
		//데이터 출력
		System.out.println("map key-A : " + map.get('A'));
		System.out.println("map key-B : " + map.get('B'));
		System.out.println("map key-C : " + map.get('C'));
		 /**
         * 2. `map.get(Object key)` 메서드:
         *    - `get()`은 **특정 키**에 해당하는 **값**을 반환합니다.
         *    - 예를 들어, `map.get('A')`는 맵에서 `'A'`라는 키에 대응하는 값 `"Apple"`을 반환합니다.
         *    - 만약 해당 키가 존재하지 않으면 `null`을 반환합니다.
         */
		
		//반복문 출력
		for(char key : map.keySet()) {
			//map의 키값을 Set으로 반복처리
			System.out.println(key + " - " + map.get(key));
			// 키 값을 참조해서 " - " + 값 꺼내기
		}
		
		// List와 Map을 이용한 자료구조
		//Apple a1 = new Apple("한국", 3000);을 아래에서 중첩 시킨 거
		
		List<Map<Integer, Apple>> mapList<> mapList = new ArrayList<>(); 
		
		Map<Integer, Apple> m1 = new HashMap<>();
		m1.put(101, new Apple("한국", 3000));
		m1.put(102, new Apple("미국", 3000));
		m1.put(103, new Apple("일본", 3000));
		
		Map<Integer, Apple> m1 = new HashMap<>();
		m1.put(201, new Apple("중국", 3000));
		m1.put(202, new Apple("호주", 3000));
		m1.put(203, new Apple("영국", 3000));
		
		Map<Integer, Apple> m1 = new HashMap<>();
		m1.put(301, new Apple("대만", 3000));
		m1.put(302, new Apple("태국", 3000));
		m1.put(303, new Apple("인도", 3000));
		
		mapList.add(m1);
		mapList.add(m2);
		mapList.add(m3);
       //리스트 0번 인덱스에 map인 m1, 1번 인덱스에 m2...가 들어있는 구조
		/* 0번 인덱스            1번 인덱스
		[ map            [ map
		  101 | apple       201 | apple
		  102 | apple 		102 | apple 
		  103 | apple ]	    103 | apple ]		*/
		
		//이 구조에서 한국 사과 꺼내기
		Map<Integer, Apple> map1 = mapList.get(0);
		//0번 인덱스 안에 든 거 꺼내기 -> map. 여기서 key 값으로 101번 꺼내기.
		Apple apple = map1.get(101);
		apple.show();
		
		//미국 사과 - 위 과정을 중첩시켜서 한줄로 꺼내기
		mapList.get(0).get(102).show(); //메서드 체이닝
	
		//호주 사과
		mapList.get(1).get(202).show();

		//대만 사과
		mapList.get(2).get(301).show();
		
		//인도 사과
		mapList.get(2).get(303).show();
	}
}
