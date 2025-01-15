package sub2;

import java.io.StreamCorruptedException;

/*
 * 날짜 : 2025/01/13
 * 이름 : 이은선
 * 내용 : JAVA Throw 사용자 정의 예외처리 실습하기
 */

//사용자 정의 예외 클래스
class MinusException extends Exception {
	public MinusException(String message) {
		super(message);

	}
}

class OverException extends Exception {
	public OverException(String message) {
		super(message);
	}
}

class Score {
	public void check(int score) throws MinusException, OverException {
		if (score < 0) {
			// 예외 던지기
			throw new MinusException("점수는 음수가 될 수 없습니다."); 
		} else if (score > 100) {
			// 예외 던지기
			throw new OverException("점수는 100점을 넘을 수 없습니다.");
		} else {
			System.out.println("점수 이상 없습니다.");
		}
	}
}

public class ThrowTest {

	public static void main(String[] args) {
		Score score = new Score();
		
		try {
			score.check(-10);
		} catch (MinusException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (OverException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			score.check(120);
		} catch (MinusException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (OverException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			score.check(86);
		} catch (MinusException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (OverException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("프로그램 정상 종료...");

	}
}
