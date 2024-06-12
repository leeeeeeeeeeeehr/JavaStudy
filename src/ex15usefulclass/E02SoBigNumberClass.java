package ex15usefulclass;

import java.math.BigDecimal;
import java.math.BigInteger;

public class E02SoBigNumberClass {
	
	public static void main(String[] args) {

		System.out.println("Long형의 최대값:"+ Long.MAX_VALUE);
		System.out.println("Long형의 최소값:"+ Long.MIN_VALUE);
		
		/* BigInteger 클래스
		: int형이나 long형으로 표현할 수 없는 범위의 큰 수를 연산할 때 사용한다.
		인자로 전달할 때 반드시 문자열 형태로 기술해야 한다. */
		
		// long lngNum = 100000000000000000000;		//코드작성불가		
		BigInteger bigValue1 = new BigInteger("100000000000000000000");
		BigInteger bigValue2 = new BigInteger("-99999999999999999999");
		
		// 사칙연산은 아래 메소드를 통해 수행한다.
		BigInteger addResult = bigValue1.add(bigValue2);
		BigInteger subResult = bigValue1.subtract(bigValue2);
		BigInteger mulResult = bigValue1.multiply(bigValue2);
		BigInteger divResult = bigValue1.divide(bigValue2);
		BigInteger remResult = bigValue1.remainder(bigValue2);

		System.out.println("큰 수의 덧셈 결과: " + addResult);
		System.out.println("큰 수의 뺄셈 결과: " + subResult);
		System.out.println("큰 수의 곱셈 결과: " + mulResult);
		System.out.println("큰 수의 나눗셈 결과: " + divResult);
		System.out.println("큰 수의 나머지 결과: " + remResult);

		//////////////////////////////////////////////////////////////////////
		
		/* BigDecimal 클래스
		: 실수의 오차 없는 표현이나 연산을 위해 사용한다. */
		double dbl1 = 1.6;
		double dbl2 = 0.1;
	
		System.out.println("두 실수의 덧셈 결과 (오차 있음): " + (dbl1 + dbl2));
		System.out.println("두 실수의 곱셈 결과 (오차 있음): " + (dbl1 * dbl2));
		
		BigDecimal bigDec1 = new BigDecimal("1.6");
		BigDecimal bigDec2 = new BigDecimal("0.1");
		
	 
		System.out.println("두 실수의 덧셈 결과: " + bigDec1.add(bigDec2));
		System.out.println("두 실수의 뻴셈 결과: " + bigDec1.subtract(bigDec2));
		System.out.println("두 실수의 곱셈 결과: " + bigDec1.multiply(bigDec2));
		System.out.println("두 실수의 나눗셈 결과: " + bigDec1.divide(bigDec2));
		System.out.println("두 실수의 나머지 결과: " + bigDec1.remainder(bigDec2));
		
	}
	
}

