package sub2;

//Car 클래스 정의(설계)
public class Car {

	//속성

	private String name;
	private String color;
	private int speed;
	//기능(멤버 메서드)
	
	//생성자 - 캡슐화된 속성을 초기화하기 위한, 클래스 이름과 동일한 반환타입이 없는 메서드.(void, int 등x) 
	//위에 private 선언해서 나옴.
	public Car(String name, String color, int speed) {
		this.name = name;
		this.color = color;
		this.speed = speed;
					
	}
	public void speedUp(int speed) {
		//속성 speed에 매개변수값 대입	
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
	
	//Getter, Setter 정의(옵션으로, 이 둘은 한세트.) - 캡슐화된 속성을 수정하기 위한 메서드
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	} 
	
}

