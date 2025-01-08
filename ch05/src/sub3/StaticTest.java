package sub3;

public class StaticTest {

	/*
	 * 날짜 : 25/01/08
	 * 이름 : 이은선
	 * 내용 : Java 클래스 변수, 클래스 메서드 실습
	 * 
	 * 클래스 변수, 클래스 메서드(정적변수, 정적메서드)
	 *  - static 키워드를 선언한 변수, 메서드
	 *  - Method Area 메모리 영역에 생성되는 특징.
	 *  - 객체를 생성하지 않고 직접 클래스 타입으로 사용한다.
	 *  	(변수는 참조하고 메소드는 호출)
	 *  - 객체들 간의 공유 목적으로 사용한다.
	 *  	(객체는 힙에 생성됨)
	 *  
	 *  
	 *  싱글톤 객체
	 *   - static 활용한 싱글톤 객체는 오직 하나의 인스턴스로 메모리(Method Area)에 생성
	 *   - (여러개 객체를 만들 필요가 없는 얘들) 싱글톤 객체를 사용해서  메모리 절약과 성능 향상
	 *   - static 인스턴스 생성, 인스턴스 Getter 정의, private 생성자 정의
	 *   	(이게 싱글톤 정의)
	 *   
	 */
	public static void main(String[] args) {
		
		Car sonata = new Car("소나타", "흰색", 10);
		Car avante = new Car("아반테", "검정", 20);
		Car grande = new Car("그랜져", "은색", 30);
		
		sonata.show();
		avante.show();
		grande.show();
		
		//전체 차량 수 클래스 변수
		System.out.println("전체 차량수 : " + Car.count);
		
		//전체 차량 수 클래스 메서드
		System.out.println("전체 차량수 : " + Car.getCount());
		
		//increment 실습 이거 결과값 이해하면 static 이해 완.
		increment inc1 = new increment();
		increment inc2 = new increment();
		increment inc3 = new increment();	
		
		/*싱글톤 실습. 참조변수는 2개지만 객체는 Calc.getInstance로 1개임.
		new Calc했다면 힙에 Calc가 두개 만들어짐.
		그런데 싱글톤 객체로 만든거라서 메소드 에리어에 칼크 하나 만들어진거임. 
		즉, 스택에 있는 c1, c2가 힙에 있는 calc를 참조한게 아니고 메소드 에리어에 칼크 공통으로 참조한 것.	
		*/
		
		Calc c1 = Calc.getInstance();
		int result1 = c1.plus(1, 2);
		System.out.println("result1 : " + result1);
		
		Calc c2 = Calc.getInstance();
		int result2 = c2.minus(1, 2);
		System.out.println("result2 : " + result2);
		
	}
}
