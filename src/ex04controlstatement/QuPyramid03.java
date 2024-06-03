package ex04controlstatement;

public class QuPyramid03 {

	/* 문제 1-4 */
	/* 다음과 같은 모양을 출력하는 프로그램을 for문으로 작성하시오. */
	
	public static void main(String[] args) {
		
		// i는 1, 3, 5, 7, 9
        for (int i = 1; i <= 9; i += 2) {
            
        	// 공백 갯수
        	for (int a = 1; a <= (9 - i) / 2; a++) {
                System.out.print("  ");
            }

        	// 별 갯수
            for (int b = 1; b <= i; b++) {
                System.out.print("* ");
            }

            System.out.println();
        }
	}
}