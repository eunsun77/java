package sub4;

public class Truck extends Car {
	
	private int capacity;
	
	public Truck(String name, String color, int speed, int capacity) {
		
	super(name, color, speed);
	this.capacity = capacity;
	}
	
	public void load(int capacity) {
		this.capacity += capacity;
	}
	
	public void show() {
		
		super.show(); //부모클래스 호출
		System.err.println("적재용량 : " + this.capacity);
		
	}
}
