package ex04controlstatement;

public class QuPyramid01 {
	
	/* 문제 1-2 */
	/* 다음과 같은 모양을 출력하는 프로그램을 while문으로 작성하시오. */

	public static void main(String[] args) {

		int a = 1;
		while (a <= 5) {
			
			int b = 1;
			// b가 a랑 같아질 때까지
			while (b <= a) {
				System.out.print("* ");
				b++;
			}
			// b가 a랑 같으면 줄 바꿈
			System.out.println();
			a++;
		}
	}
}
