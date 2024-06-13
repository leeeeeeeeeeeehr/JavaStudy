package ex15usefulclass;

public class E01WrapperClass2 {
	
	public static void main(String[] args) {
		
		/* parseInt(), valueOf(): 숫자 형식의 문자열을 정수로 변경한다.
		parseDouble(), parseFoat(): 실수로 변경한다. */
		
		String strNumber = "1000";
		
		// 10 (정수) + strNumber (문자열) => 101000 (문자열)
		System.out.println("10 + strNumber: "+ (10 + strNumber));
		// 10 (정수) + parseInt(strNumber) (정수) => 1010 (문자열)
		System.out.println("10 + strNumber를 숫자로 변경: " + (10 + Integer.parseInt(strNumber)));
		// 10 (정수) + valueOf(strNumber) (정수) => 1010 (문자열)
		System.out.println("10 + strNumber를 숫자로 변경: " + (10 + Integer.valueOf(strNumber)));
		
		
		/* 문자열을 숫자로 변경할 때는 반드시 숫자 형식만 기술해야 한다.
		"원"은 숫자가 아니므로 예외가 발생한다. */
		String money = "120원";
//		System.out.println("120원: "+ Integer.parseInt(money));	 // 예외 발생
		
		System.out.println();

		/* 실수 형태의 문자열을 숫자로 변경할 때는 pareseInt()를 사용할 수 없다. */
		String floatString = "3.14";
//		System.out.println(Integer.parseInt(floatString)); 		// 예외 발생
		System.out.println("실수형(float)형으로 변경: " + Float.parseFloat(floatString));
		System.out.println("실수형(Double)형으로 변경: " + Double.parseDouble(floatString));
		
		System.out.println("\n=====================================\n");
		
		/* Character 클래스의 주요 메서드 */
		
		/* codePointAt()
		: 문자열에서 특정 index에 해당하는 문자의 아스키코드를 반환한다. */
		System.out.println("'ABCD'에서 3번째 인덱스 D의 아스키코드");
		System.out.println(Character.codePointAt("ABCD", 3));
		
		System.out.println();
		
		/* isDigit()
		: 인자로 전달된 문자가 숫자 형식인지 판단한다. */
		System.out.println("isDigit()을 통한 숫자 판단");
		System.out.println(Character.isDigit('A') ? "숫자임" : "숫자 아님");
		System.out.println(Character.isDigit(50) ? "숫자임" : "숫자 아님");
		System.out.println(Character.isDigit('7') ? "숫자임" : "숫자 아님");
		
		System.out.println();
		
		/* isLetter()
		: 문자인지 여부를 판단하는 메서드로 특수 기호나 숫자형일 때는 false를 반환한다. */
		System.out.println("isLetter()를 통한 문자 판단");
		System.out.println(Character.isLetter('가'));
		System.out.println(Character.isLetter('A'));
		System.out.println(Character.isLetter('#'));
		System.out.println(Character.isLetter('9'));
		
		System.out.println();
		
		/* isWhitespace()
		: 공백 문자인지 판단하는 메서드로 공백 문자일 때 true를 반환한다. */
		System.out.println("isWhitespace()를 통한 공백 문자 판단");
		System.out.println(Character.isWhitespace('A'));
		System.out.println(Character.isWhitespace(' '));
		
		System.out.println();

		/* isLowerCase() / isUpperCase()
		: 소문자 혹은 대문자인지 판단한다.
		만약 영문이 아닌 경우에는 무조건 false를 반환한다. */
		System.out.println("알파벳 대소문자 판단");
		System.out.println(Character.isLowerCase('A'));
		System.out.println(Character.isUpperCase('z'));
		System.out.println(Character.isLowerCase('a'));
		System.out.println(Character.isUpperCase('Z'));
		System.out.println(Character.isLowerCase('가'));
		
		System.out.println("\n=====================================\n");

		/* 시나리오 */
		/* 주어진 문자열 안에 몇 개의 공백 문자(스페이스)가 있는지 판단하는 프로그램을 작성하시오.
		- toCharArray(): 문자열을 char형 배열로 반환해주는 String 클래스에 정의된 메서드 */
		String whiteString = "h e  l   l    o";
		// 문자열을 char형 배열로 변환
		char[] chArr = whiteString.toCharArray();
		int whiteCnt = 0;
		// 문자의 갯수만큼 반복
		for (int i = 0; i < chArr.length; i++) {
			// i번째 문자가 공백이라면 true를 반환한다.
			if (Character.isWhitespace(chArr[i])) {
				whiteCnt++;
			}
		}
		System.out.println("공백 문자의 개수: " + whiteCnt);
		
	}
	
}
