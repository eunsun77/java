package sub1;

import java.lang.reflect.Constructor;

import javax.print.attribute.standard.PrinterState;

/*
 * 날짜 : 2025/01/13
 * 이름 : 이은선
 * 내용 : JAVA 예외처리 실습하기
 */

public class ExceptionTest {
	public static void main(String[] args) {
	    
		
		//////////////////////
		//실행예외(런타임)
		/////////////////////
		
		//예외상황 1 - 어떤 수를 0으로 나눌때. 
		
		int num1 = 1;
		int num2 = 0;
		
		int r1 = num1 + num2;
		int r2 = num1 - num2;
		int r3 = num1 * num2;
		int r4 = 0;
		
		try {
			//예외가 발생 가능한 코드 작성	
			r4 = num1 / num2; // (1 / 0)하니까 여기서 예외 발생-> 프로그램이 중단됨. 그래서 try로 예외처리
		
		}catch (Exception e) {/* ArithmeticException사용인데 Exception으로 업캐스팅으로 다형성 적용. 
			
			*/
			//예외가 발생 했을 때 처리 작성	
			e.printStackTrace(); //예외내용 콘솔 출력
		}
		
		System.out.println("r1 : " + r1);
		System.out.println("r2 : " + r2);		
		System.out.println("r3 : " + r3);
		System.out.println("r4 : " + r4); //try{r4} 지역변수인데 여기서 사용하려고 하니까 에러. 그래서 try 밖에다 선언하면 사용가능.
		
		//예외상황2 - 배열의 잘못된 인덱스를 참조할 때.
		
		int[] arr = { 1, 2, 3, 4, 5 };

		try {
			for (int i = 0; i <= 5; i++) {
				System.out.println(arr[i] + "  "); // 인덱스 5일때 예외 발생. 값은 5있지만 인덱스는 0~4임
			}
			System.out.println();
		} catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
		
		//예외상황3 - 객체 생성없이 메서드 호출
		Animal animal = null; //객체 선언

		try {
			animal.move();
		}catch(NullPointerException e) {
			e.printStackTrace();
		}
		
		animal.move();
		
		//예외상황4 - 잘못된 캐스팅
		Animal a1 = new Tiger(); // 업캐스팅(다형성)
		Animal a2 = new Eagle();
		Animal a3 = new Shark();
		
		if(a1 instanceof Tiger) //캐스팅맞는지 확인 먼저 한다. {
		Tiger tiger = (Tiger) a1; //다운캐스팅
	    }
	
		try {
			Shark shark = (Shark) a2;
		    shark.move();
		    shark.hunt();
		    
		}catch (ClassCastException e) {
			e.printStackTrace();
		}	
		
		
		////////////////////
		//일반예외(컴파일 타임) -알려줌, 쉬움.
		///////////////////
	    
		// 동적 객체 생성
		try {
			Class clazz = Class.forName("sub1.Eagle");//sub1 패키지에 Eagle 클래스 정보 불러오기 이클 정보를 가지는 클래스 정보 객체?
			
			Constructor<?> constructor = clazz.getDeclaredConstructor(); // 생성자 선언
		} catch(ClassNotFoundException e){
			e.printStackTrace();
		}catch(NoSuchMethodException e){
			e.printStackTrace();
		} catch(SecurityException e){
			e.printStackTrace();
		}		
		.public ExceptionTest() {
			// TODO Auto-generated constructor stub
		}
		//catch 가 늘어지는게 싫으면 Exception으로 처리.
		finally { 
			//예외처리 발생여부에 상관없이 마지막에 무조건 실행되는 로직
		    System.out.println("finally 실행...");ㅣ
		
		}	
		System.out.println("프로그램 정상 종료...");
		
	} //main end
}
