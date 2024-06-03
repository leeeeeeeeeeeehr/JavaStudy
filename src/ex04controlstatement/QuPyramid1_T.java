package ex04controlstatement;

public class QuPyramid1_T {

	public static void main(String[] args) {

		// for문으로 구현
	
		// i : 행을 반복한다.
		for (int i = 1; i <= 5; i++) {
			// j : 열을 반복한다.
			for (int j = 1; j <= 5; j++) {
				// i(행)의 갯수만큼 j(열)를 출력한다.
				if (j <= i) {
					System.out.print("* ");					
				}
			}
			System.out.println();
		}
		System.out.println();
		
		/////////////////////////////////////////////////
		
		// while문으로 구현
		
		// for문에서 사용한 i는 지역변수이므로 새롭게 선언 가능
		int i = 1;
		while (i <= 5) {
			int j = 1;
//			while (j <= 5) {
//				if (j <= i) {
//					System.out.print("*  ");
//				}
//			}
			// i번만큼 반복해서 출력 => 위의 while + if문을 합칠 수 있음
			while (j <= i) {
				System.out.print("* ");
				j++;
			}
			i++;
			System.out.println();
		}
		System.out.println();
		
	}
}
