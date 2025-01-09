package sub4;

public class Person_ex {
	
	private String name;
	private int age;
	
	public Person_ex(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	//메서드
	
	public void work() {
		
		System.out.println("Person is working");
		
	}
	public void introduce() {
		
		System.out.println("제 이름은" + name + "이고 제 나이는 " + age);
		
	}

}
