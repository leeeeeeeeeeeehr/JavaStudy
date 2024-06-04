package ex10accessmodifier.sub;

/* E01AccessModifier1 클래스와 선언된 패키지만 다르고 
모든 내용이 동일하게 작성된 클래스이다. */

class DefaultClass2 {
	
	void myFunc() {
		System.out.println("DefaultClass 클래스의 myFunc() 메서드 호출");
	}
	
}

public class E01AccessModifier2 {
	
	// 3가지의 접근지정자를 통해 선언된 멤버변수
	private int privateVar;
	int defaultVar;
	public int publicVar;
	
	// 3가지의 접근지정자를 통해 정의된 멤버메서드
	private void privateMethod() {
		privateVar = 400;
		System.out.println("privateMethod() 메서드 호출");
	}
	void defaultMethod() {
		privateVar = 500;
		System.out.println("defaultMethod() 메서드 호출");
	}
	public void publicMethod() {
		privateVar = 600;
		System.out.println("publicMethod() 메서드 호출");
		privateMethod();
	}

}
