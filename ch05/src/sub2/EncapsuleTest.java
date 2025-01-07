package sub2;

import sub1.Account;

/*
 * 날짜 ㅣ 25/01/07
 * 이름 ㅣ 이은선
 * 내용 ㅣ java 클래스 캡슐화 실습하기
 */

public class EncapsuleTest {

	public static void main(String[] args) {
		
		//Car 객체 생성 초기화
		//속성 private하기 전 초기화 Car sonata = new Car();
		
		Car sonata = new Car("소나타", "흰색", 10);
		
		/*외부 객체에서 내부 Car 객체에 있는 소나타 객체를 직접 참조해서 위험한 코드
		내부 객체를 보호해야함.
		방법은 Car class로 가서 private 붙여주기.
		캡슐화된 속성은 외부에서 아래코드처럼 직접 참조할 수 없음.
		sonata.name = "소나타";
		sonata.color = "흰색";
		sonata.speed = 10;
		*/
		
		sonata.speedUp(60);
		sonata.speedDown(20);
		sonata.show();
		
		/*
		 <출력>
		 차량명 : 아반테
		 차량색 : 검은색
		 현재속도 : 20
		 */
		
		Car avante = new Car("아반테", "검은색", 0);
		avante.speedUp(80);
		avante.speedDown(60);
		avante.show();
		
		//초기화가 이미 된 아반테 색깔 바꾸기.
		//Car에 가서 Getter, Setter 정의
		
		avante.setColor("흰색");
		avante.show();
		
		/*
		 Account 객체 생성 초기화(캡슐화 적용)
		 <출력>
		 은행명 : 국민은행
		 계좌번호 : 110-11-1011
		 입금주 : 김유신
		 현재잔액 : 10000
		*/
		Account kb = new Account("국민은행", "110-11-1011", "김유신", 10000);
		kb.deposit(30000);
		kb.withdraw(21000);
		kb.show();
		
		//김유신 -> 김유진 개명
		/*kb.setName("김유진");
		kb.show();
		/*
		 Account 객체 생성 초기화(캡슐화 적용)
		 <출력>
		 은행명 : 우리은행
		 계좌번호 : 110-11-1211
		 입금주 : 김춘추
		 현재잔액 : 15000
		*/
		Account wr = new Account("우리은행", "110-11-1011", "김춘추", 10000);
		wr.deposit(30000);
		wr.withdraw(25000);
		wr.show();
		
		//우리은행 -> 유리은행 상호변경
		/*wr.setBank("유리은행");
		wr.show();
			*/	
	}
}
