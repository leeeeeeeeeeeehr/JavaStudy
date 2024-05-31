package ex07string;

public class E02StringMethod3 {

	public static void main(String[] args) {

		System.out.println("String 클래스의 주요 메서드 3");
		System.out.println();
		
		String str1 = "Welcome to java";
		String str2 = "자바야 놀자";
		
		// 11] lastIndexOf()
		// : 사용법은 indexOf()와 동일하지만 문자열의 뒤에서부터 찾는 것이 특징이다.
		// 파일의 확장자를 찾아야 하는 업무에서는 뒤에서부터 찾아야 하는 경우가 발생하게 된다.
		System.out.println("### 11 ###");
		System.out.println(str1.lastIndexOf("ava"));
		System.out.println(str1.lastIndexOf("J"));
		System.out.println("indexOf: " + str1.indexOf("a"));
		System.out.println("lastIndexOf: " + str1.lastIndexOf("a"));
		System.out.println();
		
		// 12] replace
		// : 특정 문자열을 찾아서 지정된 문자열로 변경한다. 찾는 문자열이 없다고 하더라도 에러가 발생하진 않는다.
		System.out.println("### 12 ###");
		System.out.println("j를 J로 변경하기");
		System.out.println(str1.replace("j", "J"));
		System.out.println("java를 Korea로 변경하기");
		System.out.println(str1.replace("java", "Korea"));
		System.out.println();
		
		// 13] split()
		// : 문자열을 구분자를 통해 분리해서 String형의 배열로 반환한다. 해당 구분자가 없는 경우에는 크기가 1인 배열로 반환한다.
		System.out.println("### 13 ###");
		
		String phoneNumber = "010-1234-5678";
		// 전화번호를 -(=하이픈)으로 분리하여 크기가 3인 배열로 반환한다.
		String[] phoneArr = phoneNumber.split("-");
		
		// 배열의 크기만큼 반복하여 분리된 문자열을 출력한다.
		for (int i=0; i<phoneArr.length; i++) {
			System.out.printf("phoneArr[%d] = %s\n", i, phoneArr[i]);
		}
		System.out.println("===========================");

		// 구분자로 사용한 문자열이 없는 경우 문자열 전체가 통쨰로 반한되어 크기가 1인 배열이 된다.
		phoneArr = phoneNumber.split("%");
		
		for (int i=0; i<phoneArr.length; i++) {
			System.out.printf("phoneArr[%d] = %s\n", i, phoneArr[i]);
		}
		System.out.println();
		
		// 14] substring()
		// : 시작 인덱스와 마지막 인덱스 사이의 문자열을 잘라서 반환한다.
		System.out.println("### 14 ###");
		
		/* 방법 1: 1개의 인덱스를 사용한다.
		 	- 사용한 인덱스부터 끝까지를 잘라낸다. */
		System.out.println(str1.substring(3));
		
		/* 방법2: 2개의 인덱스를 사용한다.
		 	- 시작, 종료 인덱스가 되므로 해당 구간의 문자열을 잘라낸다. */
		System.out.println(str1.substring(3, 7));
	}
}
