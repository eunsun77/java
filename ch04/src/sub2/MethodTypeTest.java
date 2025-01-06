package sub2;

public class MethodTypeTest {
	public static void main(String[] args) {
		
		// 메서드 호출
		double y1 =	type1(1.2); // 인자값 : 메서드를 호출할때 전달하는 값
		double y2 = type1(2.7);
		
		System.out.println("y1 : " + y1);
		System.out.println("y2 : " + y2);
		
		type2(true); // 반환값 없어서 ~ = type2 안됨.메서드 앞에 대입연산자 없음.
		type2(false);
		
		boolean result = type3(); // 매개변수가 없기 때문에 인자값 없음.
		System.out.println("result: " + result);
		
		type4();
		
		
	}


	//타입 1 : 매개변수 0, 반환 값 0
                                   //매개변수
	public static double type1(double r) {
	
		double y =(r * r) + 3.14;
		return y;
	}

	//타입 1 : 매개변수 0, 반환 값 x

		public static void type2(boolean status) {
			
			if(status) {
				System.out.println("참 입니다.");
			}else {
				System.out.println("거짓 입니다.");
			}
		}
	
	//타입 1 : 매개변수 x, 반 값 0

		public static boolean type3() { 
		
			int num1 = 1;
			int num2 = 2;
			
			if(num1 > num2) {
				return true;
			}else {
				return false; //반환 값이 boolean
			}
		}
		
	//타입 1 : 매개변수 x, 반환 값 x

	public static void type4() {
		
		double result = type1(2.3);
		System.out.println("반지름 2.3인 원의 넓이 : " + result);
	}	
	
}