package ex05method;

import java.util.Scanner;

public class QuFibonacci {
	
	/* 문제 2-5 */
	/* 피보나치 수열은 첫 항이 0, 두 번째 항이 1로 구성되어 이전 2개의 항을 더해서 다음 항을 만들어낸다.
	입력한 정수의 갯수만큼 항목을 출력하도록 프로그램을 작성하시오. */
	
	//////////////////////////////////////////////////////////////////////////////
	
	public static int fibonacciProgression(int num) {
		
		if (num == 0) {
			return 0;
		}
		else if (num == 1) {
			return 1;
		}
		// 재귀 메서드
		else {
			return fibonacciProgression(num - 2) + fibonacciProgression(num - 1);
		}
		
	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요: ");
		int number = scanner.nextInt();
		
		for (int i = 0; i <= number; i++) {
			// 마지막 숫자 뒤에는 , 없음
			if (i == number) {
				System.out.print(fibonacciProgression(i));				
			}
			else {
				System.out.print(fibonacciProgression(i) + ", ");
			}
		}
		
		
	}

}
