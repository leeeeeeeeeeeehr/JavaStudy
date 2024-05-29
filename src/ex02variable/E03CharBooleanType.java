package ex02variable;

public class E03CharBooleanType {

	public static void main(String[] args) {

		/*
		char형
		: 하나의 문자를 저장할 수 있는 자료형으로 값을 저장할 때 ' ' (= Single Quotation)으로 감싸서 표현한다.
		만약, " " (= Double Quotation)으로 감싸면 문자열로 인식하므로 String으로 선언해야 한다.
		 */

		char ch1 = '가';

		// 문자열이므로 char로 선언할 수 없다.
//		char chStr = '가나다라';		// 에러 발생

		// 따라서 STring으로 선언해야 한다.
		String chStr = "가나다라";
		System.out.println("ch1 = " + ch1);
		System.out.println("chStr = " + chStr);

		/*
		아스키코드
		: 1byte로 표현할 수 있는 문자로 영무느 숫자를 십진수로 정의한 것을 말한다.
		Ex) A => 65, a => 97로 표현된다.
		
		유니코드
		: 1byte로 표현할 수 없는 문자로 영문과 숫자를 제외한 모든 문자(한글, 한자 등)를 2byte로 표현한다.
		보통 숫자가 크기 때문에 16진수로 표현한다.
		 */

		// 메모리에 65로 저장된다.
		char ch2 = 'A';
		// 정수형 변수를 선언 및 초기화한다.
		int num1 = 2;
		// 문자 + 정수 => 아스키코드로 저장되므로 연산이 가능하다.
		int num2 = ch2 + num1;
		// 정수로 출력하면 67이 된다.
		System.out.println("num2 = " + num2);
		// 문자로 출력하면 C가 된다.
		System.out.println("(char)num2 = " + (char) num2);

		// (char)(char+int => int) => char형으로 강제 형 변환
		char ch3 = (char) (ch2 + num1);
		System.out.println("ch3(문자 출력) => " + ch3);
		System.out.println("ch3(아스키코드 출력) => " + (int) ch3);

		// ''으로 감쌌기 때문에 문자 1(= 아스키코드: 49)이 할당된다.
		char ch4 = '1';
		// 연산 결과는 50이므로 이에 해당하는 문자는 '2'가 된다.
		char ch4_1 = '1' + 1;
		// 문자 '2'와 정수 50이 출력된다.
		System.out.println("ch4 = " + ch4 + ", ch4_1 = " + ch4_1 + ", ch4_1 = " + (int) ch4_1);

		/*
		boolean형
		: true 혹은 false 두 가지의 값만 가질 수 있는 자료형으로
		산술연산(+, -), 비교연산(<, >=)에서는 사용할 수 없고 논리연산에서만 사용할 수 있다.
		 */

		boolean bn1 = true;
		boolean bn2 = false;
		System.out.println("bn1 = " + bn1 + ", bn2 = " + bn2);

		/*
		&& (논리 AND)
		: 엠퍼센트를 사용하고 양 쪽 모두 참일 때만 참을 반환한다.
		그 외에는 모두 거짓을 반환한다.
		
		|| (논리 OR)
		: 파이프를 사용하고 둘 중 하나만 참이어도 참을 반환한다.
		둘 다 거짓일 때만 거짓을 반환한다.
		 */

		// T && F => False를 반환한다.
		boolean bn3 = bn1 && bn2;
		System.out.println("bn3(And) = " + bn3);
		// T || F => True를 반환한다.
		bn3 = bn1 || bn2;
		System.out.println("bn3(Or) = " + bn3);

		// 문자 '가'는 유니코드 44032로 표현되므로 true를 반환한다.
		bn3 = '가' > 30000;
		System.out.println("bn3 = " + bn3);
	}

}
