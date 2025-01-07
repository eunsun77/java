package sub1;

//Car 클래스 정의(설계)
public class Car {

	//속성(멤버 변수) - 배우는 단계에서 속성은 캡슐화를 위해 무조건 private 선언.
		String name;
		String color;
		int speed;
	
	
	//기능(멤버 메서드) - private 선언하면 활용도가 떨어짐. 클래스 기능은 public  
	public void speedUp(int speed) {
		//속성 speed에 매개변수값 대입	
		//this는 클래스를 지칭
		this.speed += speed;
	}
	
	public void speedDown(int speed) {
		this.speed -= speed;
	}
	
	public void show() {
		System.out.println("차량명 : " + this.name);
		System.out.println("차량색 : " + this.color);
		System.out.println("현재속도: " + this.speed);
	}
}

