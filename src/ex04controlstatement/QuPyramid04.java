package ex04controlstatement;

public class QuPyramid04 {
	
	/* 문제 1-5 */
	/* 다음과 같은 모양을 출력하는 프로그램을 for문으로 작성하시오. */

	public static void main(String[] args) {
		
		// 총 9줄 출력
		for (int a = 1; a <= 9; a++) {
			// 5번째 줄까지 별의 갯수 증가함
			if (a <=5) {
				for (int b = 1; b <= a; b++) {
					System.out.print("* ");
				}
			}
			// 6번째 줄부터 별의 갯수 감소함
			else {
				for (int b = 1; b <= 10 - a; b++) {
					System.out.print("* ");
				}
			}
			System.out.println();
		}
	}
}
