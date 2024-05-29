package ex02variable;

public class E01JunsuType {

	public static void main(String[] args) {

		/*
		정수 자료형
		- byte, short, int, long 타입(형)이 있다.
		- 각 자료형의 표현 범위는 교안을 참조한다.
		- 일반적으로 CPU(중앙처리장치)는 정수형 연산을 할 때 int형을 가장 빠르게 처리한다.
		- 즉, 정수형 변수를 사용할 때는 거의 대부분 int형을 사용하면 된다.
		 */

		// int형 변수를 선언한 후 초기값을 할당한다.
		int int1 = 100;
		int int2 = 200;
		// 300의 결과 값이 변수에 할당된다.
		int result1 = int1 + int2;
		// int형끼리의 연산은 int형의 결과가 반환된다.
		System.out.println("int1 + int2 = " + result1);

		/* 100 / 200의 결과는 0이 나오게 된다. Java에서는 정수와 정수의 연산결과로 정수가 반환된다.
		만약, 실수의 결과를 반환받고 싶다면 형 변환(Type Casting)을 해야 한다. */
		result1 = int1 / int2;
		System.out.println("int1 / int2 = " + result1);

		/*
		- 동일한 타입의 변수를 2개 이상 선언할 때는 컴마(,)를 사용할 수 있다.
		- int형보다 작은 자료형을 연산하면 CPU는 int형으로 변환하여 계산한다.
		- CPU는 정수의 연산인 경우 int형에 최적화되어있기 때문이다.
		- byte, short형은 게임 캐릭터의 움직임이나 음원 파일 등을 표현할 때 주로 사용된다.
		 */

		byte byte1 = 50, byte2 = 55;
		int result2 = byte1 + byte2;
		System.out.println("byte1 + byte2 = " + result2);

		short short1 = 60, short2 = 70;
		int result3 = short1 + short2;
		System.out.println("short1 + short2 = " + result3);

		/*
		- 동일 자료형끼리의 연산은 동일 자료형이 되는 것이 기본 원칙이다.
		- 하지만 큰 자료형과 작은 자료형을 연산하면 큰 자료형으로 자동 형 변환된다.
		  이유는 데이터의 손실(오차)이 있을 수 있기 때문이다.
		 */

		long long1 = 1000, long2 = 2000;
		long result4 = int1 + long1;
		System.out.println("int1 + long1 = " + result4);

		result4 = long1 + long2;
		System.out.println("long1 + long2 = " + result4);

		/*
		자바 컴파일러는 정수형 상수를 기본적으로 int형으로 간주하기 때문에 아래 정수를 메모리에 로드하는 순간 에러가 발생한다.
		이 때, 접미사(L 혹은 l)을 붙여서 int형 자료가 아닌 long형의 자료임을 컴파일러에게 알려줘야 한다.
		이와 같이 할당을 위해 입력되는 숫자도 자료형을 기반으로 메모리에 로드되는데, 이를 가르켜 리터럴(literal)이라고 한다.
		 */

//		long long3 = 2200000000;		// 에러 발생

		long long4 = 2200000000L;
		long long5 = 2000000000l;

		System.out.println("long4 = " + long4);
	}

}
