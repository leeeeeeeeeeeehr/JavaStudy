package ex04controlstatement;

public class E06BreakContinue {

	public static void main(String[] args) {
		
		/*
		break
		: 반복문이나 switch문에서 주로 사용되며 블럭 내에서 탈출할 때 사용한다.
		만약 중첩된 반복문이라면 가장 가까운 블럭 하나만 탈출한다.
		
		continue
		: 반복문의 처음으로 돌아간다. while문의 경우 조건을 확인하고 for문의 경우 증감식이 실행된다.
		따라서 continue 아래에 있는 문장을 실행되지 않는다.
		
		- 반복문 내에서 break, continue를 사용할 때는 반드시 조건문과 같이 사용해야 한다.
		  그렇지 않으면 해당 문장 하위는 실행되지 않는 쓰레기 코드가 되기 때문이다.
		 */

		int i = 0;
		// 무한루프 조건으로 while문 작성
		while (true) {
			
			i++;
			System.out.printf("[i가 %d일 때]\n", i);
			
			System.out.println("continue 이전 출력문");
			// i가 짝수인 경우 반복문의 처음으로 돌아간다.
			if (i % 2 == 0) continue;
			System.out.println("contunue 이후 출력문");
			
			System.out.println("break 이전 출력문");
			// i가 3일 때 반복문을 탈출한다.
			if (i == 3) break;
			System.out.println("break 이후 출력문");
		}
		
		System.out.print("\n==========================\n\n");
		
		/*
		중첩된 반복문 안에서 break를 만나면 가장 가까운 반복문 하나만 탈출한다.
		반복문 전체를 탈출하는 것이 아니므로 주의해야 한다.
		 */
		
		for (int x = 1; x <= 5; x++) {
			// x는 5까지 전체 출력된다.
			System.out.println("x = "+ x);
			for (int y = 1; y < 5; y++) {
				// y는 3까지만 출력된다.
				System.out.println("y = "+ y);
				if (y == 3) break;
			}
		}
	}

}
