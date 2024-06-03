package ex04controlstatement;

public class QuPyramid02 {
	
	/* 문제 1-3 */
	/* 다음과 같은 모양을 출력하는 프로그램을 do ~ while문으로 작성하시오. */

	public static void main(String[] args) {
		
		int a = 1;
		
		do {
			int b = 5;
			
			do {
				// b가 a와 같아질 떄까지 출력
				if (b >= a) {
					System.out.print("* ");
				}
				b--;
			} while (b >= 1);
			// b가 a랑 같아지면 줄 바꿈
			System.out.println();
			a++;
		} while (a <= 5);
	}
}
