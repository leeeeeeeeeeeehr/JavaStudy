package ex18lambda;

import java.util.Random;

/* 매개변수는 있으나 반환값이 없는 추상 메서드
: 두 개의 문자열을 전달 받아 연결해서 출력한다. */
@FunctionalInterface
interface StringConcat {
	public void makeString(String s1, String s2);
}
/* 매개변수는 없으나 반환값은 있는 추상 메서드
: 0 ~ 99 사이의 난수를 생성한 후 반환한다. */
@FunctionalInterface
interface RandomNumber {
	public int randomNum();
}
/* 매개변수와 반환값 둘 다 있는 추상 메서드
: 매개변수로 전달된 두 정수만큼의 구구단을 2차원 배열로 반환한다. */
@FunctionalInterface
interface GugudanRange {
	public String[][] guguString(int n1, int n2);
}
/* 매개변수와 반환값 둘 다 없는 추상 메서드
: 단순히 문자열 하나만 출력한다. */
@FunctionalInterface
interface MenuPrint {
	public void onlyPrint();
}

public class Ex05ParamNReturn {

	public static void main(String[] args) {

		System.out.println("### 람다식 1 ###");
		String s1 = "안녕하세요?";
		String s2 = "람다식입니다.";
		/* 2개의 매개변수는 String으로 추상 메서드를 통해 유추할 수 있으므로 람다식에서는 생략할 수 있다.
		메서드명을 제거한 후 괄호 사이에 화살표를 삽입하여 람다식을 정의한다.
		호출 시에는 인터페이스에 정의된 추상 메서드를 이용하면 된다. */
		StringConcat sc = (a, b) -> {
			System.out.println(a + " " + b);
		};
		sc.makeString(s1, s2);
		
		//////////////////////////////////////////////////////////////////////////
		
		/* 매개변수가 없는 람다식을 정의해야 하므로 빈 소괄호를 사용한다.
		난수를 생성해서 반환하는 기능을 정의하였다. */
		System.out.println("\n### 람다식 2 ###");
		RandomNumber randomNumber = () -> {
			Random random = new Random();
			return random.nextInt(100);
		};
		// 반환값이 있는 람다식이므로 좌측 항의 변수로 반환값이 할당된다.
		int rNumber = randomNumber.randomNum();
		System.out.println("생성된 난수: " + rNumber);
		
		//////////////////////////////////////////////////////////////////////////
		
		System.out.println("\n### 람다식 3 ###");
		GugudanRange gugudanRange = (num1, num2) -> {
			// 2차원 배열을 선언한 후 구구단을 각 인덱스에 삽입한다.
			String[][] gugudan = new String[9][9];
			// num1 단에서 num2 단까지 반복한다.
			for (int i = num1; i <= num2; i++) {
				for (int j = 1; j <= 9; j++) {
					gugudan[i-1][j-1] = i + " * " + j + " = " + (i * j) + " ";
				}
			}
			return gugudan;
		};
		// 람다식 호출 시 두 정수를 인수로 전달한 후 이차원 배열을 반환 받는다.
		String[][] returnStr = gugudanRange.guguString(4, 6);
		// 반환된 결과값을 통해 4단에서 6단까지 출력한다.
		for (int i = 4; i <= 6; i++) {
			for (int j = 1; j <= 9; j++) {
				System.out.print(returnStr[i-1][j-1] + " ");
			}
			System.out.println();
		}
		
		//////////////////////////////////////////////////////////////////////////
		
		// 단순히 문자열만 출력하는 람다식을 정의한다.
		System.out.println("\n### 람다식 4 ###");
		MenuPrint menuPrint = () -> {
			System.out.println("메뉴를 출력합니다.");
		};
		menuPrint.onlyPrint();
		
	}

}
