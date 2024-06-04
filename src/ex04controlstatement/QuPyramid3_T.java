package ex04controlstatement;

public class QuPyramid3_T {
	
	public static void main(String[] args) {
		
		// 행의 갯수 지정
		int num = 5;
		
		for (int i = 0; i < num; i++) {
			
			// 공백 출력하기
			for (int j = 1; j <= (num - i); j++) {
				// i가 증가함에 따라 j의 반복은 감소한다.
				System.out.print(" ");
			}

			// * 출력하기, 조건의 일반식에 의해 1, 3, 5, 7...이 생성된다.
			for (int k = 0; k < (2 * i + 1); k++) {
				System.out.print("*");
			}
			// 한 행 출력 후 줄바꿈
			System.out.println();
		
		}
		
	}
}