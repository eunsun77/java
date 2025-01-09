package sub4;

//Car 클래스 정의(설계)
public class Car {

	//속성
	//protected 접근권한으로 자식클래스에서 참조 가능
	protected String name;
	protected String color;
	protected int speed;

	
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

/*protected는 같은 패키지 내에선 직접 참조 ex) sonata.name = " 아반떼";가 가능함.
  근데 보통 패키지 세분화하기 때문에 패키지 안에서 protected 쓸 일은 거의 없어서 직접 참조 불가능할 듯.
  */
