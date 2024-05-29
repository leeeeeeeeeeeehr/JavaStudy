package ex05method;

import java.util.Scanner;

public class E05MethodType04_1 {
	
	/* 메서드 형식 4 ) 매개변수도 있고 반환값도 있는 경우 */
	/* 4가지 형식 중에 가장 많이 사용된다. */

	public static void main(String[] args) {
		/* 3명의 나이를 입력받은 후 합을 반환받아 출력한다.
		반환값이 있는 메서드는 주로 문장의 우측항이나 출력문의 일부로 사용한다. */
		int sumOfAge = getTotalAge(3);
		System.out.println("입력받은 나이의 합은? "+ sumOfAge);
	}
	
	static int getTotalAge(int personCnt) {
		
		/* 시나리오 */
		/* 인원 수를 매개변수로 전달받아 인원 수만큼
		나이를 입력받아 그 나이의 합을 반환하는 메서드를 작성하시오.*/
		
		Scanner scanner = new Scanner(System.in);
		// 나이의 합을 저장할 변수
		int sumAge = 0;
		
		// main에서 전달한 인수 3개를 매개변수로 받아 for문에 적용한다.
		for (int i = 1; i <= personCnt; i++) {
			System.out.print(i +"번째 사람의 나이: ");
			int age = scanner.nextInt();
			// 입력받은 나이는 변수에 누적해서 더해준다.
			sumAge += age;
		}
		// 나이의 합은 호출한 지점으로 반환된다.
		return sumAge;
	}
}
