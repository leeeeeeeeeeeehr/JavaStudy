package ex12inheritance;

/* 가변 인자 (Variable Argument)
: 메서드 오버로딩을 대체할 수 있는 문법으로 하나의 메서드로 여러가지 호출 형식을 대체할 수 있다.

형식:
	메서드명(자료형 ... 매개변수명) {
		실행 문장;
	}

- 필요에 따라 매개변수를 가변적으로 조정할 수 있는 문법이다.
- 매개변수로 2개 이상의 인수를 받을 수 있어야 하므로 배열로 반환한다.
- 단, 자료형은 모두 동일해야 한다. */

public class E08VariableArgument {
	
	// 앞에서 학습한 메서드 오버로딩을 통핸 메서드 정의 (이 방식으로 여러 개를 만들긴 어렵다.)
//	static int getTotal(int param) {
//		int total = 0;
//		total += param;
//		return total;
//	}
//	static int getTotal(int param1, int param2) {
//		int total = 0;
//		total += (param1 + param2);
//		return total;
//	}
//	static int getTotal(int param1, int param2, int param3) {
//		int total = =;
//		total += (param1 + param2 + param3);
//		return total;
//	}
	
	/* ... 을 통해 매개변서 param이 2개 이상의 인수를 받을 수 있는 것을 명시한다.
	또한, 메서드 내에서는 배열로 반환되어 '매개변수명.length'와 같이 작성할 수 있다. */
	static int getTotal(int ...param) {
		int total = 0;
		// 전달된 인수의 크기만큼 반복하여 누적해서 더한다.
		for (int i = 0; i < param.length; i++) {
			total += param[i];
		}
		return total;
	}

	public static void main(String[] args) {
		
		// 가변 인자를 통해 메서드를 정의하였으므로 아래 모든 호출 문장은 정상적으로 실행된다.
		System.out.println("getTotal(args1)의 호출: " + getTotal(10));
		System.out.println("getTotal(args1, args2)의 호출: " + getTotal(10, 20));
		System.out.println("getTotal(args1, args2, args3)의 호출: " + getTotal(10, 20, 30));
		System.out.println("getTotal(매개변수 6개)의 호출: " + getTotal(10, 20, 30, 40, 50, 60));

		/* 매개변수의 타입이 double이 포함되어 있으므로 호출할 수 없다.
		만약, 아래와 같이 실수를 모두 처리하려면 가변 인자의 타입을 double로 선언하면 된다. */
//		System.out.println("잘못된 호출: " + getTotal(10, 20.3));

	}

}
