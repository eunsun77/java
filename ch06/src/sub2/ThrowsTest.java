package sub2;

/*
 * 날짜 : 2025/01/13
 * 이름 : 이은선
 * 내용 : JAVA 예외처리 실습하기
 */
import java.util.Scanner;

public class ThrowsTest {

	public static void main(String[] args) {
		// method1, method2에서 thorws 한 예외를 최종적으로 main에서 처리(try/catch)
		// 꼭 메인에서 처리는 아님.
		try {
			method1(10);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("정상종료");
	}

	public static void method1(int n1) throws Exception { 
			method2(n1);	
	}

	public static void method2(int n1) throws InputMismatchException, ArithmㄷticException {	
		//throws Exception로 모든 예외를 한번에 던질수도 있음
		Scanner scan = new Scanner(System.in);
		System.out.print("n2 입력: ");

		int n2 = scan.nextInt(); //InputMismatchException 발생
		int result = n1 / n2; //ArithmㄷticException 발생 그래서 여기를 try catch로 감싸서 Exceptiond예외처리하면 됨. 하지면 위로 throws함

		System.out.println("result : " + result);
	}
}	
	



