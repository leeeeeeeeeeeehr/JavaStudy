package ex06array;

import java.util.Scanner;

public class QuFillArray {
	
	/* 문제 3-3 */
	/* 길이가 10인 배열을 선언한 후 총 10개의 정수를 입력받아 순서대로 저장한다. (첫 번째 배열)
	그리고 순서대로 저장된 숫자들을 홀수는 배열의 앞에서부터 채워나가고 짝수는 배열의 끝에서부터 채워나간다. (두 번째 배열) */
	
	//////////////////////////////////////////////////////////////////////////////////////////

	public static void main(String[] args) {
		
		int[] arr = new int[10];
		
		Scanner scanner = new Scanner(System.in);
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print((i + 1) + "번째 정수를 입력하세요: ");
			int num = scanner.nextInt();
			arr[i] = num;
		}

		System.out.println("순서대로 입력된 결과");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");			
		}
		System.out.println();
	
		
		int odd = 0;
		int even = arr.length - 1;
		int[] result = new int[arr.length];
		
		System.out.println("홀수 / 짝수 구분 입력 결과");
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				result[even--] = arr[i];
			}
			else {
				result[odd++] = arr[i];		
			}
		}
	}
}
