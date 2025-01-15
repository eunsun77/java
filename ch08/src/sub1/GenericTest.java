package sub1;
/*
 * 날짜 : 2025/01/15
 * 이름 : 이은선
 * 내용 : JAVA 제네릭 클래스 실습하기
 */

import java.security.PublicKey;

public class GenericTest {
	public static void main(String[] args) {
	
		Apple apple = new Apple("한국", 2000);
		Banana banana = new Banana("일본", 3000);
		
		//제네릭 클래스 생성할 때 
		FruiBox <Apple> box1 = new FruitBox<Apple>();
		box1.setFruit(apple);
		System.out.println(box1.getFruit());
		
		FruiBox <banana> box2 = new FruitBox<banana>();
		box2.setFruit(banana); 
		//바나나를 취급 못함. FruiBox 클래스 속성에 apple만 있어서 사과만 취급 가능. 범용성이 없는 FruiBox 클래스.
		//범용성있는 클래스를 만들기 위해서 Generic을 써주는 것.
		System.out.println(box2.getFruit());
		
		/*
		FruiBox box1 = new FruitBox();
		box1.setFruit(apple);
		System.out.println(box1.getFruit());
		
		FruiBox box2 = new FruitBox();
		box2.setFruit(banana); 
		//바나나를 취급 못함. FruiBox 클래스 속성에 apple만 있어서 사과만 취급 가능. 범용성이 없는 FruiBox 클래스.
		//범용성있는 클래스를 만들기 위해서 Generic을 써주는 것.
		System.out.println(box2.getFruit());
		*/
	}
}
