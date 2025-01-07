package ch02.sec01;

import java.util.Scanner;

public class VariableInitalization {

	public static void main(String[] args) {
		
		int value = 10;
		
		int result = value + 10;
		
		System.out.println(result);
	
		int hour = 2;
		
		int minute = 5;
		System.out.println(hour + "시간" + minute + "분");
		
		int totalMinute = (hour*6) + minute;
		System.out.println("총" + totalMinute + "분");
		
		//변수 값 교환
		
		int x = 3;
		int y = 3;
		System.out.println(" x : " + x + " y :" + y );
	
		int temp = x;
		x = y;
		y = temp;
		System.out.println(" x : " + x + " y : " + y );
	
		//강제 타입 변환
		
		int var1 = 10;
		byte var2 = (byte) var1;
		System.out.println(var1);
		
		int var5 = 65;
		char var6 = (char)var5;
		System.out.println(var5 + " var6 : " + var6);
		
		//키보드로 입력받기
		/*import java.util.Scanner;

		Scanner scanner = new Scanner(System.in);
		
		System.out.print("x 값 입력 : ");
		String strX = scanner.nextLine();
		int x = Integer.parseInt(strX);

		System.out.print("y 값 입력 : ");
		String strY = scanner.nextLine();
		int y = Integer.parseInt(strY);
		
		int result = x + y;
		System.out.println("x + y : " + result);
		System.out.println();
		
		while(true) {
			System.out.println("문자열 입력: ");
			String data = scanner.nextLine();
			if(data.equals("q")) {
				break;
			}
			System.out.println("출력 문자열: " + data);
			System.out.println();
		}
		System.out.println("종료");*/
	}
}
