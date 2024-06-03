package ex05method;

import java.util.Scanner;

public class QuSimpleOperation {
	
	/* 문제 2-1 */
	/* 두 개의 정수를 입력 받아서 사칙연산의 결과를 출력하는 메서드와 main 메서드를 작성해보자.
	단, 나눗셈은 몫과 나머지를 각각 출력해야 한다.
	인수(파라메타)로 전달되는 두 숫자는 모두 0 이상의 양의 정수이다.
	
	- 메서드명 : arithmetic() */
	
	/////////////////////////////////////////////////////////////////////
	
	static void arithmetic() {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("첫 번쨰 정수: ");
		int first = scanner.nextInt();
		System.out.println("두 번째 정수: ");
		int second = scanner.nextInt();
		
		int sum = first + second;
		System.out.println("덧셈 결과 -> " + sum);

		int diff = first - second;
		System.out.println("뺼셈 결과 -> " + diff);

		int pro = first * second;
		System.out.println("곱셈 결과 -> " + pro);

		int quo = first / second;
		System.out.println("나눗셈 몫 -> " + quo);

		int rem = first % second;
		System.out.println("나눗셈 나머지 -> " + rem);

	}

	public static void main(String[] args) {
		
		arithmetic();
		
	}

}
