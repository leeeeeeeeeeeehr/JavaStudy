package ex05method;

import java.util.Scanner;

public class E01MethodBasic {
	
	/*
	메서드(함수)의 규칙
	- Java에서 main 메서드는 public static void로 선언한다.
	- static으로 선언된 메서드는 static으로 선언된 메서드만 호출할 수 있다.
	- 메서드 호출 후 반환값은 호출한 위치로 반환된다. 이 때 메서드는 메모리에서 소멸된다.
	- 반환값이 없는 void형 메서드도 실행이 완료되면 호출한 위치로 실행의 흐름이 돌아온다.
	 */
	
	//////////////////////////////////////////////////////////////////////////
	
	/* [메서드 1: 반환값 O, 매개변수 O] */
	/* 매개변수로 2개의 정수를 전달받아 합의 결과를 반환한다.
	반환값은 호출한 지점으로 반환된다. */
	public static int simpleFunc(int a, int b) {
		int sum = a + b;
		return sum;
	}
	
	/* [메서드 2: 반환값 X, 매개변수 X] */
	/* 전달받은 값 없이 이름을 입력받은 후 namePrint()를 호출한다.
	이와 같이 반환값이 없는 경우에는 void를 명시해야 한다. */
	public static void menuPrint() {
		System.out.println("당신의 이름은 무엇인가요?");
		Scanner scanner = new Scanner(System.in);
		// nextLine()은 문자열을 입력받을 때 사용하는 메서드이다.
		String name = scanner.nextLine();
		namePrint(name);
	}
	
	/* [메서드 3: 반환값 X, 매개변수 O] */
	/* 문자열을 인수로 전달 받아 단순히 출력만 진행한다.
	반환값이 없는 경우에는 실행이 종료되면 호출했던 지점으로 실행의 흐름이 이동된다. */
	public static void namePrint(String n) {
		System.out.println("제 이름은 "+ n +"입니다.");
	}
	
	/* 메인 메서드는 Java에서 출발점(Entry point)의 역할을 한다.
	즉, 직접 호출하지 않아도 자동으로 호출되어 프로그램이 실행된다. */
	public static void main(String[] args) {
		
		/* 메서드 호출 시 함수의 원형을 그대로 기술한다.
		매개변수의 갯수가 다르거나 타입이 다르면 에러가 발생한다.
		
		int result = simpleFunc(1)		=> 에러 발생
		int result = simpleFunc(1, 2.0) => 에러 발생 */
		
		// 반환값이 있는 메서드는 우측항 혹은 print()의 일부로 사용한다.
		int result = simpleFunc(1, 2);
		System.out.println("1과 2를 전달한 결과: "+ result);
		System.out.println("10과 20을 전달한 결과: "+ simpleFunc(10, 20));
		
		// 반환값이 없는 메서드는 단독으로 사용한다.
		menuPrint();
		
		// main 메서드의 종료는 해당 프로그램의 종료로 이어진다.
	}
}
