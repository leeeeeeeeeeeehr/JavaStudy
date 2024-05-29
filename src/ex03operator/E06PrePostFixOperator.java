package ex03operator;

public class E06PrePostFixOperator {

	public static void main(String[] args) {
		
		/*
		증감연산자
		: 변수를 +1 혹은 -1 한 것과 같은 결과를 반환한다. 주로 반복문에서 사용된다.
		
		Prefix(전위): 연산자가 변수 앞에 있는 경우
			1. 변수의 값이 먼저 변경된다.
			2. 변경된 값이 좌측항으로 혹은 다른 코드에 반영된다.
		
		Postfix(후위): 연산자가 변수 뒤에 있는 경우
			1. 변수의 값이 먼저 다른 코드에 반영된다.
			2. 반영된 이후 변수의 값이 변경된다.
		 */
		
		// 현재 상태: (num1), (num2), (num3)

		int num1 = 7;
		int num2, num3;		// 현재 상태: 7, x, x
		
		// 1. num1의 값이 먼저 1 증가한다. 2. 증가된 num1이 num2에 대입된다.
		num2 = ++num1;		// 현재 상태: 8, 8, x
		
		// 1. num1의 값이 먼저 1 감소한다. 2. 감소된 num1이 num3에 대입된다.
		num3 = --num1;		// 현재 상태: 7, 8, 7
		
		System.out.println("전위 증감 시");
		System.out.printf("num1 = %d, num2 = %d, num3 = %d%n%n", num1, num2, num3);
		
		////////////////////////////////////////////////////////////////////////////
		
		num1 = 7;			// 현재 상태: 7, 8, 7
		
		// 1. num1의 값이 num2에 먼저 대입된다. 2. num1의 값이 증가한다.
		num2 = num1++;		// 현재 상태: 8, 7, 7
		
		// 1. num1의 값이 num3에 먼저 대입된다. 2. num1의 값이 감소한다.
		num3 = num1--;		// 현재 상태: 7, 7, 8
		
		System.out.println("후의 중감 시");
		System.out.printf("num1 = %d, num2 = %d, num3 = %d%n%n", num1, num2, num3);
	}

}
