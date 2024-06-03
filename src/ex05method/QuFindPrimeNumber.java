package ex05method;

import java.util.Scanner;

public class QuFindPrimeNumber {

	/* 문제 2-4 */
	/* 전달된 값이 소수인지 아닌지를 판단하여 소수인 경우 true를 아니면 false를 반환하는 메소드를 정의하고,
	이를 이용해서 1부터 100 사이의 소수를 전부 출력하는 main 메서드를 정의하시오.
	
	- 메서드명: isPrimeNumber()
	- 소수 : 특정 정수를 나눌 수 있는 것이 1과 자기 자신밖에 없는 수 */
	
	///////////////////////////////////////////////////////////////////////////////
	
	public static boolean isPrimeNumber(int num) {
		
		if (num < 2) {
			return false;
		}
		else if (num == 2) {
			return true;
		}
		else if (num % 2 == 0) {
			return false;
		}
		else if (num == 3) {
			return true;
		}
		else if (num % 3 == 0) {
			return false;
		}
		else {
			return true;
		}
		
	}
	
	public static void main(String[] args) {
		
		for (int number = 1; number <= 100; number++) {
			if (isPrimeNumber(number)) {
				System.out.println(number + " ");
			}
		}
		
	}
}