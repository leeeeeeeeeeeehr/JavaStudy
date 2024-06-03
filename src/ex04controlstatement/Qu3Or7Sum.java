package ex04controlstatement;

public class Qu3Or7Sum {

	/* 문제 1-1 */
	/* 1 ~ 100까지의 숫자 중 3의 배수이거나 7의 배수인 숫자의 합을 구하는 프로그램을 while, do ~ while, for문으로 각각 작성하시오.
	단, 3과 7의 공배수인 경우 합에서 제외해야 한다.
	출력의 결과는 누적되는 모든 수를 콘솔에 print한다.
	하나의 파일에 한꺼번에 작성하므로 동일한 결과가 3번 출력됩니다. */
	
	public static void main(String[] args) {

		// while문
		System.out.println("### while문 ###");
		
		int while_sum = 0;
		int while_i = 1;
		
		while (while_i <= 100) {
			if ((while_i % 3 == 0 || while_i % 7 == 0 ) && !(while_i % 3 == 0 && while_i % 7 == 0 )) {
				while_sum += while_i;
				System.out.println("while_i = " + while_i +", while_sum = " + while_sum);
			}
			while_i++;
		}
		
		System.out.println("while_total = " + while_sum);
		System.out.println();
		
		/////////////////////////////////////////////////////////////////////////////////
		
		// do ~ while문
		System.out.println("### do ~ while문 ###");
		
		int do_sum = 0;
		int do_i = 1;
		
		do {
			if ((do_i % 3 == 0 || do_i % 7 == 0 ) && !(do_i % 3 == 0 && do_i % 7 == 0 )) {
				do_sum += do_i;
				System.out.println("do_i = " + do_i +", do_sum = " + do_sum);				
			}
			do_i++;
		} while (do_i <= 100);
		
		System.out.println("do_total = " + do_sum);
		System.out.println();
		
		/////////////////////////////////////////////////////////////////////////////////
		
		// for문
		System.out.println("### for문 ###");
		
		int for_sum = 0;
		
		for (int for_i = 1; for_i <= 100; for_i++) {
			if ((for_i % 3 == 0 || for_i % 7 == 0 ) && !(for_i % 3 == 0 && for_i % 7 == 0 )) {
				for_sum += for_i;
				System.out.println("for_i = " + for_i +", for_sum = " + for_sum);
			}
		}
		
		System.out.println("for_total = " + for_sum);
	}

}
