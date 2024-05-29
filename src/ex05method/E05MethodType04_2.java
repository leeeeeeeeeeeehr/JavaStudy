package ex05method;

import java.util.Scanner;

public class E05MethodType04_2 {
	
	/* 시나리오 */
	/* 여러 개의 숫자를 입력받은 후 최댓값을 구하는 메서드를 정의하시오.
	단, 숫자의 갯수는 매개변수로 전달받고 숫자의 갯수만큼 Scanner 클래스를 통해 입력받는다.
	입력받은 숫자 중 최댓값을 찾아서 반환하도록 정의한다.
	 */

	public static void main(String[] args) {

		int maxValue1 = returnMaxNumber(4);
		System.out.println("최댓값1: "+ maxValue1);
		
		int maxValue2 = returnMaxNumber(6);
		System.out.println("최댓값2: "+ maxValue2);
	}
	
	// main에서 전달한 인수의 크기만큼 반복해서 정수를 입력받은 후 최댓값을 찾아 반환한다.
	static int returnMaxNumber(int numberCnt) {
		
		Scanner scanner = new Scanner(System.in);
		// 최댓값을 저장할 변수
		int maxVal = 0;
		// 매개변수로 전달된 인수의 크기만큼 반복한다.
		for (int i = 1; i <= numberCnt; i++) {
			System.out.print("정수를 입력하세요: ");
			int inputNum = scanner.nextInt();
			
			if (i == 1) {
				/* 입력받은 정수 중에서 최댓값을 찾아야하므로 첫 번째 입력값을 비교를 위한 기준값으로 설정한다.
				즉, 비교의 대상이 없으므로 무조건 최댓값이 된다. */
				maxVal = inputNum;
			}
			else {
				// 두 번째 입력값부터는 기존의 최댓값과 비교해서 더 큰 값이 발견되면 교체한다.
				if (maxVal < inputNum) {
					maxVal = inputNum;
				}
			}
		}
		// 즉, 새로운 입력값이 기존보다 크다면 지속적으로 교체하여 가장 큰 값을 호출한 지점으로 반환한다.
		return maxVal;
	}
}
