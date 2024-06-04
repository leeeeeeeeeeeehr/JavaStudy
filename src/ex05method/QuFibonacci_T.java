package ex05method;

import java.util.Scanner;

public class QuFibonacci_T {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("숫자를 입력하세요: ");
		int n = scanner.nextInt();
		
		fibonacciProgression1(n);
		fibonacciProgression2(n);
		
	}
	
	// 배열로 구현
	public static void fibonacciProgression1(int n) {
		if (n <= 2) {
			System.out.println("피보나치 수열은 0, 1로 시작하므로 3부터 입력해주세요.");
			return;
		}
		
		// 출력 항목의 크기로 배열 선언
		int[] fibo = new int[n];
		
		// 피보나치 수열은 0, 1로 시작하므로 아래와 같이 초기화
		fibo[0] = 0;
		fibo[1] = 1;
		
		// 나머지 수를 계산 (fibo[0], fibo[1]은 이미 들어가있으니 fibo[2]부터 시작)
		for (int i = 2; i < n; i++) {
			fibo[i] = fibo[i-2] + fibo[i-1];
		}
		
		// 피보나치 수열 출력
		for (int i = 0; i < n; i++) {
			System.out.printf("%d ", fibo[i]);
		}
		System.out.println();
		
	}
	
	// 일반 변수로 구현
	public static void fibonacciProgression2(int n) {
		if (n <= 2) {
			System.out.println("피보나치 수열은 0, 1로 시작하므로 3부터 입력해주세요.");
			return;
		}
		
		int f1 = 0, f2 = 1, f3;
		System.out.printf("%d %d ", f1, f2);
		
		/* 앞에서 이미 0, 1을 출력했으므로 n-2만큼 반복한다.
		-> 조건식을 (int i = 3; i < n; i++)로 해도 된다. */
		for (int i = 1; i <= n-2; i++) {
			// 첫 번째 수와 두 번째수를 더한 후 즉시 출력
			f3 = f1 + f2;
			System.out.printf("%d ", f3);
			
			// 각 변수에 새로운 값(다음 항목)을 할당
			f1 = f2;
			f2 = f3;
		}
	}

}
