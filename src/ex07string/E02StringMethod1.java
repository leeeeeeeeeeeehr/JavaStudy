package ex07string;

public class E02StringMethod1 {

	public static void main(String[] args) {

		System.out.println("String 클래스의 주요 메서드 1");
		System.out.println();
		
		String str1 = "Welcome to java";
		String str2 = "자바야 놀자";
		
		// 1] length()
		// : 문자열의 길이를 반환한다.
		System.out.println("### 1 ###");
		System.out.println("str1의 길이: " + str1.length());
		System.out.println("str2의 길이: " + str2.length());
		System.out.println();
		
		// 2] charAt(인덱스)
		// : 문자열의 특정 인덱스에서 해당하는 문자 하나를 반환한다. 인덱스는 배열과 같이 0부터 시작한다.
		System.out.println("### 2 ###");
		System.out.println("str1의 두 번째 문자: " + str1.charAt(1));
		System.out.println("str2의 두 번째 문자: " + str2.charAt(2));
		System.out.println();
		
		// 3] compareTo()
		// : 2개의 문자열의 첫 번째 문자부터 순차적으로 비교하면서 앞 문자의 아스키코드가 크면 양수를 반환하고,
		// 뒷 문자의 아스키코드가 크면 음수를 반환한다. 두 문자열이 같을 땐 0을 반환한다.
		System.out.println("### 3 ###");
		String str3 = "A";
		String str4 = "B";
		System.out.println(str3.compareTo(str4));		// -1
		System.out.println(str4.compareTo(str3)); 		// 1
		System.out.println("ABC".compareTo("ABC") == 0 ? "문자열이 같다." : "문자열이 다르다.");
		System.out.println();
		
		// 4] concat()
		// : 두 개의 문자열을 연결한다. print()문에서 '+'와 동일한 역할이다.
		System.out.println("### 4 ###");
		System.out.println("JAVA".concat(" WORLD").concat(" Go"));
		System.out.println("JAVA" + " WORLD" + " GO");
		System.out.println();
		
		// 5] contains()
		// : 문자열에 특정 문자열이 포함되었는지 판단하여 포함되었다면 true를 반환한다.
		System.out.println("### 5 ###");
		System.out.println(str1.contains("To"));
		System.out.println(str2.contains("to"));
	}
}
