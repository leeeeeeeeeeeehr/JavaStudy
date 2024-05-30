package ex06array;

public class E03CallByValue {
	
	/*
	Call by value (값에 의한 호출)
	: 메서드 호출과 관련된 개념으로 매개변수를 통해 값을 전달할 때 메모리의 '복사'를 통해 값이 전달된다.
	그래서 다른 지역의 메서드에서 값의 변경이 있더라도 호출한 메서드의 값에는 전혀 영향을 미치지 않는다.
	메모리적 관점에서 보면 스택 영역만 사용하는 케이스로
	main과 호출된 메서드는 서로 다른 지역이므로 서로에게 젼혀 영향을 미치지 않는 것이 특징이다.
	 */

	public static void main(String[] args) {

		// main 지역에서 최초로 변수를 생성한다.
		int first = 100, second = 200;
		
		// 출력 1: 100, 200
		System.out.println("[main 메서드 안 - 호출 전] "+"first = "+ first +", second = "+ second);
		
		// 메서드 호출 시 인수로 값을 전달한다.
		callByValue(first, second);
		
		// 출력 2: 매개변수로 전달된 값은 복사되어 다른 지역의 메서드 내에서만 변경되므로 main에서는 초기값이 그대로 유지된다.
		System.out.println("[main 메서드 안 - 호출 후] "+"first = "+ first +", second = "+ second);
	}
	
	/* 매개변수로 전달된 값은 복사되어 해당 지역의 메서드에서 사용할 수 있게 된다.
	즉, 매개변수의 전달은 메모리의 복사에 의해 이뤄진다. */
	public static void callByValue(int fNum, int sNum) {
		
		/*
		Swap (교환)
		: 두 개의 변수가 할당받은 값을 서로 교환하는 알고리즘을 말한다.
		교환 시에는 임시 변수(temp)가 필요하다.
		 */
		
		///////////////////////////////////////////////////////////////////////////////
		
		// 임시 변수
		int temp;
		
		// 교환 과정
		temp = fNum;
		fNum = sNum;
		sNum = temp;
		
		// 해당 메서드 내에서는 값의 교환이 완료되었으므로 출력 결과는 200, 100이 되었다.
		System.out.println("[callByValue 메서드 안] "+"first = "+ fNum +", second = "+ sNum);
	}
}
