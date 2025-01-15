package sub1;

import java.io.ObjectInputStream.GetField;
//바나나를 취급 못함. FruiBox 클래스 속성에 apple만 있어서 사과만 취급 가능. 범용성이 없는 FruiBox 클래스.
//범용성있는 클래스를 만들기 위해서 Generic을 써주는 것.<T>로
//쓸 일은 잘 없지만 알아두는 게 좋음. 뒤에 컬렉션에서 제네릭 나옴.
public class FruitBox<T> {
	
	private T fruit;
	
	public T getFruit() {
		return fruit;
	}
	
	public void setFruit(T fruit) {
		this.fruit = fruit;
	}
	
}
