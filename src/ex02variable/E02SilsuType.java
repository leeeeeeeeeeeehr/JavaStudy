package ex02variable;

public class E02SilsuType {

	public static void main(String[] args) {

		/*
		실수 자료형
		- 정수형보다는 실수형이 더 큰 자료형이다. 0과 1 사이에 무한히 많은 실수가 존재하기 때문이다.
		- 따라서 long(정수형)과 float(실수형)을 연산하면 float의 결과가 나오게 된다.
		 */

		long long1 = 100;
		float float1 = 200;
		// 실수형으로 자동 형 변환된다.
		float result1 = long1 + float1;
		// 따라서 300(정수형)이 아닌 300.0(실수형)의 결과가 출력된다.
		System.out.println("long1 + float1 = " + result1);

		/*
		float(실수형)과 long(정수형)의 연산 결과를 long으로 받고싶다면
		- 방법 1: float을 long으로 강제 형 변환 후 연산한다.
		- 방법 2: 계산 결과 전체를 long으로 강제 형 변환한다.
		 */

		long result2 = long1 + (long) float1;
		System.out.println("형 변환 후 연산 = " + result2);
		long result3 = (long) (long1 + float1);
		System.out.println("계산 후 형 변환 = " + result3);

		/*
		- 실수형의 기본은 double이다.
		- 컴파일러는 소수점이 있는 데이터를 무조건 double로 인식한다.
		- 단, 소수점이 없는 데이터는 float에 대입할 수 있다.
		- 소수점이 있는 데이터를 float에 대입하려면 접미사 F 혹은 f를 붙여야 한다.
		- 형 변환 후 대입이 가능하지만 권장하지 않는다.
		 */

		float f3 = 100;

		// 3.14를 double로 인식하므로 에러가 발생한다.
//		float f4 = 3.14;		// 에러 발생

		// 강제 형 변환 후 대입할 수 있다.
		float f4 = (float) 3.14;
		System.out.println("f4 = " + f4);

		// 접미사를 통해 float형 자료임을 명시한다. (권장사항)
		float f5 = 3.14F;
		System.out.println("f5 = " + f5);

		// float형끼리의 연산은 기본 규칙을 따르므로 float이 반환된다.
		float f6 = f3 + f4;
		System.out.println("f6 = " + f6);

		// float과 double의 연산은 큰 자료형인 double로 반환된다.
		double d1 = 3.14;
		double d2 = f6 + d1;
		System.out.println("d2 = " + d2);

		/*
		CPU는 실수의 계산에 기본적인 오차를 가지고 있다.
		이는 Java의 문제가 아닌 컴퓨터의 태생적인 문제이므로 정확한 계산을 위해서는 약간의 보정이 필요하다.
		 */
	}

}
