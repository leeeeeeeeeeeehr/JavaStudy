package ex05method;

public class E04MethodType03_2 {
	
	/* 문제 */
	/* 사용자로부터 2 ~ 9 사이의 숫자 중 2개를 입력받아 이에 해당하는 구구단을 출력하는 메서드를 작성하시오.
	무조건 첫 번째 입력받는 수가 작아야 한다. */
	
	/* 입력 예 */
	/*	첫 번째 숫자 : 3 */
	/*	두 번째 숫자 : 12 */
	/*	3 * 1 = 3 3 * 2 = 6 ....... */
	/*	........................... */
	/* 	.............. 12 * 9 = 108 */
	
	/* 메서드명 : inputGugudan(int sNum, int eNum) */
	
	/////////////////////////////////////////////////////////////////////////////////

	/* while문 사용 */
	static void inputGugudanWhile(int sNum, int eNum) {
		int dan = sNum;
		while (dan <= eNum) {
			int su = 1;
			while (su <= 9) {
				System.out.printf("%-2d * %-2d = %-2d", dan, su, dan * su);
				System.out.print(" ");
				su++;
			}
			System.out.println();
			dan++;
		}
	}
	
	/////////////////////////////////////////////////////////////////////////////////
	
	/* for문 사용 */
	static void inputGugudanFor(int sNum, int eNum) {
		for (int dan = sNum; dan <= eNum; dan++) {
			for (int su = 1; su <= 9; su++) {
				System.out.print(dan +"*"+ su +"="+ dan * su +" ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		inputGugudanWhile(3, 6);
		System.out.println("\n=================================================================================\n");
		inputGugudanFor(2, 8);
	}
}
