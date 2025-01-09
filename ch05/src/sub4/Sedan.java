package sub4;

public class Sedan extends Car {
	
	private int cc;

	public Sedan(String name, String color, int speed, int cc) {
		super(name, color, speed);
		this.cc = cc;
	}
	
	public void turbuo() {
		speed += 20;
		
		/*this.speed += 20;
		 * 
		 * 부모 상속 받아서 부모 speed 쓸 수 있을 것 같지만 x
		 *speed는 private로 선언했기 때문에 자식 클래스도 외부로 취급. 
		 *이때 부모 크래스에서 private말고 speed 접근권한을 protected로 변경
		*/
	}
	
	public void show() {
		System.out.println("차량명 : " + this.name);
		System.out.println("차량색 : " + this.color);
		System.out.println("배기량 : " + this.cc);
		System.out.println("현재속도 : " + this.speed);
	}

}
