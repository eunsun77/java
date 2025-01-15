package sub3;

import java.util.Set;

/*
 * 날짜 : 2025/01/15
 * 이름 : 이은선
 * 내용 : JAVA 컬렉션 set 실습하기
 */
public class SetTest {
	public static void main(String[] args) {

		// set 생성
		Set<Integer> set = new HashSet<>();
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(4);
		set.add(5);
		set.add(1);
		set.add(2);
		set.add(3);

		System.out.println(set);

		// 데이터 출력 - 인덱스 번호 없느 데이터 꺼내기. 손에 잡히는 대로 꺼내는 느낌이라 반복자를 이용 or for문 이용.
		
		// 반복자(Inerator) 데이터 출력 - 잘 안씀
		Interator<Integer> it = set.iterator();

		while (it.hasNext()) {
			// 다음 데이터 존재할 때까지 반복실행
			System.out.println(it.next());

		}
		
		//반복문으로 데이터 출력
		for(int num : set) {
			System.out.println(num);
		}

	}

}
