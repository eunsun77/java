package ch04.sec02;

public class if_switch_for_while_Test {

    public static void main(String[] args) {

        // 1. if 문을 사용한 학점 출력 예제
        {
            int score = (int) (Math.random() * 20) + 81;
            System.out.println("점수 : " + score);

            String grade = "";

            if (score >= 90) {
                if (score >= 95) {
                    grade = "A+";
                } else {
                    grade = "A";
                }
            } else if (score >= 80) {
                if (score >= 85) {
                    grade = "B+";
                } else {
                    grade = "B";
                }
            } else {
                grade = "C";
            }

            System.out.println("학점: " + grade);
        }
        

        // 2. switch 문을 사용한 랜덤 번호 출력 예제
        {
            int num = (int) (Math.random() * 6) + 1;

            switch (num) {
                case 1:
                    System.out.println("1번이 나왔습니다.");
                    break;
                case 2:
                    System.out.println("2번이 나왔습니다.");
                    break;
                case 3:
                    System.out.println("3번이 나왔습니다.");
                    break;
                case 4:
                    System.out.println("4번이 나왔습니다.");
                    break;
                case 5:
                    System.out.println("5번이 나왔습니다.");
                    break;
                case 6:
                    System.out.println("6번이 나왔습니다.");
                    break;
                default:
                    System.out.println("예상치 못한 번호가 나왔습니다.");
            }
        }
        
        

        // 3. switch (Java 12 이상) 문을 사용한 회원 등급 출력 예제
        {
            char grade = 'B';

            switch (grade) {
                case 'A', 'a' -> {
                    System.out.println("우수 회원입니다.");
                }
                case 'B', 'b' -> {
                    System.out.println("일반 회원입니다.");
                }
                default -> {
                    System.out.println("기타 회원입니다.");
                }
            }
        }
        
        {//중괄호 안에 실행문이 하나만 있을 경우에는 중괄호를 생략할 수 있다.
            char grade = 'A';

            switch (grade) {
                case 'A', 'a' ->  System.out.println("우수 회원입니다.");
                case 'B', 'b' ->  System.out.println("일반 회원입니다.");
                default ->  System.out.println("기타 회원입니다.");
            }        	
        	
        }
        
        
        //for 기본
        {
        	for(int i=1; i<=10; i++) {
        		System.out.print(i + " ");
        	}
        	
        }
        
        //부동 소수점을 쓰는 float는 0.1을 정확히 표현 안돼서 for문에 쓰면 안됨.
        
        //중첩 for문 기본 구구단
        {
        	for (int m=2; m<=9; m++) {
        		System.out.println("***" + m + "단 ***");
        		for (int n=1; n<=9; n++) {
        			System.out.println(m + "X" + n + "=" + (m*n));
        		}
        	}
        }
        
        /*for문은 정해진 횟수만큼. while문은 flase가 되면 멈춤.
        for : 반복 횟수가 정해져 있을 때 효율좋고 직관적
        ㄴ1부터 100까지 합을 구할때
        while : 반복 조건이 명확하지 않거나 동적으로 변화할때. 특정 조건이 만족될 때까지 반복할 경우.
        ㄴ용자가 입력한 숫자가 0일때까지 계속해서 숫자를 입력받고 그 숫자들의 합을 구하는 프로그램
        */
    }
}
