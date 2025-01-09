package sub5;

public class Truck extends Car {
	
	private int capacity;
	
	public Truck(String name, String color, int speed, int capacity) {
		
	super(name, color, speed);
	this.capacity = capacity;
	}
	
	@Override //부모 speedUp을 커스터마이징
	public void speedUp(int speed) {
		this.speed += (speed - capacity);
	}
	
	public void load(int capacity) {
		this.capacity += capacity;
	}
	
	public void show() {
		
		super.show(); //부모클래스 호출
		System.err.println("적재용량 : " + this.capacity);
		
	}
}
