package ex05method;

public class E02MethodType01 {
	
	/*
	Method(메서드, 함수)
	: 객체 지향 프로그래밍에서 행동 혹은 동작을 의미한다.
	즉, 어떤 하나의 업무를 처리하기 위한 모듈(부속품)이라 정의할 수 있다.
	
	- 메서드는 반드시 class 내부에 정의해야 한다.
	- 메서드 내부에 또 다른 메서드를 정의할 수 없다. (에러 발생)
	- 반환값이 없다면 void를 반드시 명시해야 한다.
	- 메서드명은 변수명과 동일한 규칙으로 작성한다.
	 */
	
	///////////////////////////////////////////////////////////////////
	
	/*
	Java에서의 Naming Rule(이름 지을 때의 규칙)
	
	- 클래스명			|	GoodMorning		=> 대문자로 시작하는 카멜케이스로 작성한다.
	
	- 메서드 혹은 변수명	|	goodMorning		=> 소문자로 시작하는 카멜케이스로 작성한다. 메서드와 변수는 ()의 유무로 구분한다.

	- 상수명			|	GOOD_MORNING	=> 전체를 대문자로 작성한다. 가독성이 떨어지기 때문에 연결되는 부분은 _로 구분한다.
		
	- 패키지명			|	good.morning	=> 전체를 소문자로 작성한다. 가독성이 떨어지기 때문에 연결되는 부분은 .으로 구분한다.
	 */
	
	///////////////////////////////////////////////////////////////////
	
	/* 메서드 형태 1 ) 매개변수도 없고, 반환값도 없는 메서드 */
	/* 둘 다 없는 형태의 메서드로 주로 메뉴를 출력하는 단순 출력 기능 정도로 사용한다. */
	static void menuPrint() {
		System.out.println("===== 메뉴를 선택하세요 =====");
		System.out.println("1. 열기, 2. 계속하기, 3. 종료");
		System.out.println("========================");
	}
	
	static void returnError() {
		int returnValue = 9;
		System.out.println("[Return문 이전]");
		
		/* 메서드 중간에 return을 기술하면 즉시 종료되므로 그 아래에 있는 코드는 실행되지 않는 쓰레기 코드가 된다.
		따라서 return은 반드시 조건문과 함께 기술되어야 한다.
		단, 메서드의 마지막 라인에 기술한다면 조건문이 없어도 상관 없다. */
//		return;
		
		// return문이 중간에 있으려면 조건부로 기술해야 한다.
		if (returnValue % 2 == 0) {
			System.out.println(returnValue +"는 짝수");
			// 메서드에서 return은 종료를 의미한다.
			return;
		}
		System.out.println(returnValue +"는 홀수");
		System.out.println("[return문 이후]");
	}

	public static void main(String[] args) {
		menuPrint();
		returnError();
	}
}
