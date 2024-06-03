package ex05method;

public class QuSymmetry {
	
	/* 문제 2-6 */
	/* 다음과 같은 회전 대칭 모양의 출력 결과를 보이는 프로그램을 while문과 for문으로 작성하시오.
	단, 메서드로 작성해야 한다.
	
	- 메서드명 : rotationSymmetry() */
	
	//////////////////////////////////////////////////////////////////////
	
	public static void rotationSymmetry_while() {
		
		System.out.println("while문");
		System.out.println("=======");
		
		int a = 1;
		while (a <= 4) {
			int b = 4;
			while (b >= 1) {
				if (b == a) {
					System.out.print("1 ");					
				}
				else {
					System.out.print("0 ");
				}
				b--;
			}
			System.out.println();
			a++;
		}
	}
	
	public static void rotationSymmetry_for() {
		
		System.out.println("for문");
		System.out.println("=======");
		
		for (int a = 1; a <= 4; a++) {
			for (int b = 4; b >= 1; b--) {
				if (b == a) {
					System.out.print("1 ");
				}
				else {
					System.out.print("0 ");
				}
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		
		rotationSymmetry_while();
		
		System.out.println();
		
		rotationSymmetry_for();

	}
}
