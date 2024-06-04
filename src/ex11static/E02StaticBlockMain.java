package ex11static;

/* static 블럭
: 동일 클래스 내 main() 메서드보다 먼저 실행되는 블럭으로
main 메서드의 실행 코드가 없어도 먼저 실행된다.
또한, 생성자보다도 먼저 실행된다.
따라서 프로그램에서 전처리를 해야 하는 경우에 사용할 수 있다. */

public class E02StaticBlockMain {
 
	// 인스턴스형 멤버 (변수, 메서드)
	int instanceVar;
	void instanceMethod() {}
 
	// 정적 멤버 (변수, 메서드)
	static int staticVar;
	static void staticMethod() {
		int localVar;
		System.out.println("정적 메서드");
	}
 
	// static 블럭 정의
	static {
 
		// 블럭 내에서 정적 멤버변수에 접근할 수 있다.
		staticVar = 1000;		
 
		/* 블럭 내에서만 사용할 수 있는 변수로,
		블럭 내에서는 일반 변수를 생성한 후 사용할 수 있다. */
		int localVar;
		localVar = 1000;
		System.out.println("localVar = " + localVar); 
		
		// static 블럭 내에서는 인스턴스형 멤버를 사용할 수 없다.
//		System.out.println("instanceVar = " + instanceVar);  
//		instanceMethod();
 
		// 정적 멤버는 사용할 수 있다.
		System.out.println("staticVar = " + staticVar);
		staticMethod();
		
		System.out.println("=== static block 끝 ===");
	}
 
	/* 생성자 메서드
	: 생성자에서는 정적 멤버에 접근할 수 있다. 일반적인 멤버 변수와 동일하다. */
	public E02StaticBlockMain() {
 
		staticVar = -1;
		System.out.println("=== StaticBlock의 생성자 ===");
	}
	public static void main(String[] args) {
		
		System.out.println("=== 메인 메소드 ===");		
	 
		/* static 블럭 내에서 선언된 변수는 지역 변수이므로
		main 메서드에서는 사용할 수 없다. 해당 지역에서만 사용할 수 있다. */
//		System.out.println("localVar = " + localVar);
		 
		// new 키워드를 통해 해당 클래스의 인스턴스를 생성한다.
		new E02StaticBlockMain();
	}
}