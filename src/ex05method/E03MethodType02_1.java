package ex05method;

public class E03MethodType02_1 {
	
	/* 메서드 형태 2 ) 매개변수는 없지만 반환값은 있는 경우 */
	/* 사용자로부터 입력값을 받은 후 연산을 진행하고, 결과값을 반환하는 형태의 기능이 필요할 때 사용한다.
	 * 즉, 값을 자체적으로 생산한다. */
	
	/////////////////////////////////////////////////////////////////////////////

	/* 현 상태에서는 public은 없어도 상관 없지만
	main이 static으로 선언됐기 때문에 static은 꼭 넣어줘야 한다. */
	 static int sum1To10() {
		// 누적 합을 저장할 변수
		int sum = 0;
		// 1 ~ 10까지 반복
		for (int i = 1; i <= 10; i++) {
			// 반복문 내에서 누적해서 더함
			sum += i;
		}
		// 반환값은 호출한 지점으로 반환
		return sum;
	}

	 public static void main(String[] args) {
		 
		 /* 반환값이 있는 메서드는 주로 print()문의 일부로 사용하거나 변수의 할당을 위해 코드의 우측항에 기술한다. */
		 
		 // print()문의 일부로 사용한 경우
		 System.out.println("1 ~ 10까지의 합: "+ sum1To10());
		 
		 // 변수의 할당해서 사용한 경우
		 int sum10 = sum1To10();
		 System.out.printf("1에서 10까지의 합은 %d입니다.", sum10);
	 }
}
