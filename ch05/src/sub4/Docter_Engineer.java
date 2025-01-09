package sub4;


class Docter extends Person_ex{
	
	private String specialty;
			
	public Docter(String name, int age, String specialty) {
		super(name, age);
		this.specialty = specialty;

		
	}
	
	public void work() {
		super.introduce();
		System.out.println("저는 의사이며" + specialty  +"전공 입니다.");

	}
	
}

class Engineer extends Person_ex{
		
	private String field;
				
	public Engineer(String name, int age, String field) {
		super(name, age);
		this.field = field;

		
	}	
	
	public void work() {
		super.introduce();
		System.out.println("저는 " + field  +"엔지니어 입니다.");
		
	}
}

