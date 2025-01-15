package sub2;

import java.util.List;

/*
 * 날짜 : 2025/01/15
 * 이름 : 이은선
 * 내용 : JAVA 컬렉션 List 실습하기
 */
public class ListTest {
	public static void main(String[] args) {

		// List(ArrayList)생성 - < >는 리스트 안에 있는 정보를 범용성있게 받기 위해.
		// ArrayList는 list를 구현. list는 인터페이스, ArrayList는 클래스 이러면 다형성 적용 가능.
		// 그래서 이거말고 아래처럼 가능 ArrayList<Integer> list = new ArrayList<>();
		List <Integer> list = new ArrayList<>();

		// 데이터 저장
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		System.out.println(list);

		// 데이터 삽입
		list.add(1, 6);
		System.out.println(list);

		// 데이터 제거
		list.remove(1); // (인덱스 번호)
		System.out.println(list);

		// 데이터 참조
		System.out.println("list 1번째 원소 : " + list.get(0));
		System.out.println("list 1번째 원소 : " + list.get(1));
		System.out.println("list 1번째 원소 : " + list.get(3));

		// 리스트 크기
		System.out.println("list 크기 : " + list.size());

		// 리스트 반복문
		for (int num : list) {
			System.out.print(num + ", ");
		}

		System.out.println();
		
		//문자열 리스트
		List<String> persons = new ArrayList<>();
		persons.add("김유신");
		persons.add("김춘추");
		persons.add("장보고");
		persons.add("강감찬");
		persons.add("이순신");
		System.out.println(persons);
		
		persons.add("정약용");
		
		//강감찬, 이순신 사이에 '이성계' 추가
		persons.add(4, "이성계");
		
		//김유신, 김춘추 사이에 '선덕여왕' 추가
		persons.add(persons.indexOf("김춘추"), "선덕여왕"); //김춘추 인덱스 번호를 찾아서 그 앞에 선덕여왕 추가
		
		//장보고 제거 후 '왕건' 추가
		persons.remove(1); 
		persons.add(3, "왕건");
		System.out.println(persons);
		
		//객체 리스트
		//Apple 다른 패키지에 있기 때문 import 해야함.
		/*ist<String, integer> Apple = new ArrayList<>(); 틀린답
		List는 하나의 타입만을 받는 자료구조이기 때문에, List<String, Integer>와 같이 두 개의 타입을 지정할 수 없다.
		여러 타입을 저장하려면 Map<String, Integer>와 같이 키-값 쌍을 표현하는 자료구조를 사용해야 합니다.
		List<Apple> apples = new ArrayList<>();:

		이 구문은 올바른 문법입니다.
		List<Apple>은 Apple 클래스의 객체들을 저장하는 리스트를 의미합니다. 즉, Apple 클래스의 인스턴스들만 저장할 수 있는 리스트가 됩니다.
		Apple은 사용자 정의 클래스이고, 이 리스트는 Apple 타입의 객체를 저장할 수 있습니다
		*/
		List<Apple> apples = new ArrayList<>();
		
		Apple a1 = new Apple("한국", 3000);
		Apple a2 = new Apple("미국", 2000);
		Apple a3 = new Apple("일본", 1000);
		
		apples.add(a1);
		apples.add(a2);
		apples.add(a3);
		
		//LinkedList 싨급
		List<String> cities = new LinkedList<>();
		cities.add("서울");
		cities.add("대전");
		cities.add("대구");
		cities.add("부산");
		cities.add("광주");
		System.out.println(cities);
		
		cities.add(1, "수원");
		cities.addFirst("")
		
		 /** 
         *  공통점:
         *  
         *  1. `ArrayList`와 `LinkedList`는 모두 `List` 인터페이스를 구현합니다.
         *     - `List` 인터페이스에서 정의된 메서드 (예: `add()`, `remove()`, `get()`, `size()` 등)를 모두 제공합니다.
         *  2. 순차적으로 저장된 데이터를 처리하는 자료구조입니다.
         *  3. 중복된 데이터를 저장할 수 있습니다.
         *  4. 크기가 동적으로 변하며, 요소를 추가하거나 삭제할 수 있습니다.
         */
        
        /** 
         *  차이점:
         *  
         *  1. 내부 구조:
         *     - `ArrayList`: 동적 배열 기반. 요소들이 연속적인 메모리 공간에 저장됩니다.
         *     - `LinkedList`: 이중 연결 리스트 기반. 각 노드는 이전 노드와 다음 노드를 참조합니다.
         *  
         *  2. 검색 성능 (인덱스를 통한 접근):
         *     - `ArrayList`: O(1) - 인덱스를 통해 빠르게 접근할 수 있습니다.
         *     - `LinkedList`: O(n) - 순차적으로 노드를 탐색해야 하므로 느립니다.
         *  
         *  3. 삽입 및 삭제 성능:
         *     - `ArrayList`: O(n) - 중간에 삽입/삭제 시 배열을 이동해야 하므로 성능이 떨어집니다.
         *     - `LinkedList`: O(1) - 앞이나 뒤에서 삽입/삭제가 빠릅니다. 중간에서 삽입/삭제는 O(n)입니다.
         *  
         *  4. 메모리 사용:
         *     - `ArrayList`: 동적 배열이므로 배열 크기가 변경되면 복사 비용이 발생할 수 있습니다.
         *     - `LinkedList`: 각 노드가 `prev`와 `next` 포인터를 가지고 있어 더 많은 메모리를 사용합니다.
         *  
         *  5. 캐시 효율성:
         *     - `ArrayList`: 배열은 연속된 메모리 공간에 저장되므로 캐시 효율성이 좋습니다.
         *     - `LinkedList`: 노드들이 분산되어 메모리 상에 저장되므로 캐시 효율성이 떨어질 수 있습니다.
         */
		
		
		

}
