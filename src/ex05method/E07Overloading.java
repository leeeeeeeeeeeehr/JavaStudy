package ex05method;

public class E07Overloading {
	
	/*
	메서드 오버로딩(Method Overloading)
	: 동일한 이름의 메서드를 2개 이상 정의하는 것을 말한다.
	
	- 매개변수의 갯수가 다르거나 자료형이 다를 때 성립한다.
	- 반환 타입만 다른 것은 허용하지 않는다.
	- 컴파일러는 메서드 호출 시 전달되는 인수를 통해 호출할 메서드를 구분한다.
	 */
	
	//////////////////////////////////////////////////////////////

	// 주민번호와 군번을 매개변수로 정의한 메서드 (남성을 표현함)
	static void person(int juminNum, int milNum) {
		System.out.println("군필자이시군요.");
		System.out.println("주민번호: "+ juminNum);
		System.out.println("군번: "+ milNum);
	}
	
	// 주민번호만 있는 메서드 (여성을 표현함)
	static void person(int juminNum) {
		System.out.println("미필자이거나 여성이시군요.");
		System.out.println("주민번호: "+ juminNum);
	}
	/* 해당 메서드는 앞에서 선언한 것과 반환 타입만 다른 경우이므로
	person(10)으로 호출했을 때 어떤 메서드를 호출할지 애매하므로 에러가 발생한다.
	따라서 아래의 메서드는 오버로딩이 성립하지 않는다. */
//	static int person(int juminNum) {
//		System.out.println("미필자이거나 여성이시군요.");
//		System.out.println("주민번호: "+ juminNum);
//		return 1;
//	}
	
	// 인수의 갯수를 통해 호출할 메서드를 구분할 수 있다.
	public static void main(String[] args) {
		// 매개변수가 2개인 메서드 호출 (남성)
		person(123456, 789123);
		System.out.println("====================");
		
		// 매개변수가 1개인 메서드 호출 (여성)
		person(987654);
		System.out.println("====================");

		
		/* 출력을 위해 사용하는 print()가 대표적인 오버로딩으로 정의된 메서드이다.
		정수, 실수, 문자 등 모든 타입에 대해 출력할 수 있도록 미리 정의되어 있다. */
		System.out.println(10);
		System.out.println(3.14);
		System.out.println('a');
		System.out.println("오버로딩");
		System.out.println(true);
	}
}
