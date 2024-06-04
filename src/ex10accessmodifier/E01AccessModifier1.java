package ex10accessmodifier;

/* class를 정의할 때는 반드시 public이나 default(생략형)만 사용할 수 있다.
private는 class 정의에는 사용할 수 없다. */

//private class PrivateClass1 {
//	
//	void myFunc() {
//		System.out.println("Private 클래스는?");
//	}
//}

/* 해당 클래스는 접근지정자를 생략했으므로 default 클래스로 정의된다.
이 경우, 동일 패키지 내에서만 접근을 허용한다. */
class DefaultClass1 {
	
	void myFunc() {
		System.out.println("DefaultClass 클래스의 myFunc() 메서드 호출");
	}
}

/* public 클래스는 해당 Java 파일을 대표하는 클래스로 파일명과 동일해야 한다.
또한, public 클래스는 자바 파일 하나 당 하나만 정의할 수 있다.
public으로 지정하는 경우, 다른 패키지에서도 접근을 허용하므로 보통 하나의 Java 파일에 하나의 class만 정의하는 것을 권장한다. */
public class E01AccessModifier1 {
	
	// 3가지의 접근지정자를 통해 멤버변수 선언
	private int privateVar;
	int defaultVar;
	public int publicVar;
//	protected => 상속 관계에 있을 때 접근을 허용하는 지정자	
	
	
	// 3가지의 접근지정자를 통해 멤버메서드 정의
	private void privateMethod() {
		/* 동일 클래스 내에서는 private 멤버라 할지라도 접근을 허용한다.
		(= 동일 클래스 내에서는 접근지정자의 영향을 받지 않는다.) */
		privateVar = 100;										// 사용 가능
		System.out.println("privateMethod() 메서드 호출");
	}
	void defaultMethod() {
		privateVar = 200;										// 사용 가능
		System.out.println("defaultMethod() 메서드 호출");
	}
	public void publicMethod() {
		privateVar = 300;										// 사용 가능
		System.out.println("publicMethod() 메서드 호출");
		/* private으로 선언된 메서드도 클래스 내부에서는 호출할 수 있다.
		멤버변수와 동일한 접근 범위를 가진다. */
		privateMethod();
		
	}

}
