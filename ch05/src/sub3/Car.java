package sub3;

//Car 클래스 정의(설계)
public class Car {

	//속성

	private String name;
	private String color;
	private int speed;

	//위의 객체는 객체참조를 해야 사용가능한데 static은 메모리에 고정해줘서 직접 참조 가능.
	//스테틱은 클래스 이름으로 참조. 
	//클래스 변수(정적변수)
	public static int count;
	
	//생성자- 캡슐화
	public Car(String name, String color, int speed) {
		this.name = name;
		this.color = color;
		this.speed = speed;
		count++;
					
	}
	
	//기능(멤버 메서드) - 클래스 기능은 무조건 public 선언
	// - 객체 생성없이(인스턴스 생성없이 클래스 이름으로 직접 호출) 
	public static int getCount(){
		return count;
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

