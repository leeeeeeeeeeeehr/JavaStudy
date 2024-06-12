package quiz;

/* 아래와 같은 출력 결과를 보이는 업그레이드 구구단 프로그램을 작성하시오.

2 x 1 = 2
2 X 2 = 4
2 X 2 X 2 = 8
2 X 2 X 2 X 2 = 16
2 X 2 X 2 X 2 X 2 = 32
2 X 2 X 2 X 2 X 2 X 2 = 64
2 X 2 X 2 X 2 X 2 X 2 X 2 = 128
2 X 2 X 2 X 2 X 2 X 2 X 2 X 2 = 256
2 X 2 X 2 X 2 X 2 X 2 X 2 X 2 X 2 = 512
3 X 1 = 3
3 X 3 = 9
3 X 3 X 3= 27
………중간 생략………
9 X 9 X 9 X 9 X 9 X 9 X 9 X 9 = 43046721
9 X 9 X 9 X 9 X 9 X 9 X 9 X 9 X 9 = 3874204892 */

public class QuUpgradeGuGu {
	
	public static void main(String[] args) {
		
		int result;

		for (int base = 2; base <= 9; base++) {
			
			result = base;
			
			for (int i = 1; i <= 9; i++) {
				
				System.out.print(base);
				
				if (i == 1) {
					System.out.print(" X 1");
				}
				else {
					for (int exp = 1; exp < i; exp++) {
						System.out.print(" X " + base);
					}
					result *= i;
				}
				
				System.out.println(" = " + result);
			}
			
		}
		
	}
	
}
