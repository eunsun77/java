package sub3;

//싱글톤 객체
public class Calc {
	
	private static Calc instance = new Calc();
	public static Calc getInstance() {
		return instance;
	}
	//외부에서 new calc 못하게 막아햐함 그래서 private
	private Calc() {}
	
	
	public int plus(int x, int y) {
		return x + y;
	}
	
	public int minus(int x, int y) {
		return x - y;
	}
	
	public int multi(int x, int y) {
		return x * y;
	}
	
	public int div(int x, int y) {
		return x / y;
	}

}
