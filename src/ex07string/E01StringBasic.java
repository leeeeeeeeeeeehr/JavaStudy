package ex07string;

public class E01StringBasic {

	public static void main(String[] args) {
		
		/* 기본 자료형의 경우, 비교연산자 ==을 통해 값을 비교할 수 있다.
		변수에 값이 할당되어 있으므로 즉시 비교가 가능하다. */
		int num1 = 10, num2 = 20;
		String numResult = (num1 == num2) ? "데이터가 같다." : "데이터가 다르다.";
		System.out.println("비교 결과: " + numResult);
		
		/* String 인스턴스 생성 방법
		1) new를 이용한다.
			- 이 방법으로 인스턴스를 생성하면 동일한 문자열이라도 항상 새로운 메모리를 할당한다. */
		String str1 = new String("Hello JAVA");
		String str2 = new String("Hello JAVA");
		
		/* str1, str2는 String 인스턴스의 참조값이 할당되어 있으므로 아래의 비교는 참조값(주소)에 대한 비교가 된다.
		각각 새로운 메모리에 할당되므로 참조값이 다르다는 결과가 출력된다. */
		if (str1 == str2) {
			System.out.println("str1과 str2는 참조 주소가 같다.");
		}
		else {
			System.out.println("str1과 str2는 참조 주소가 다르다.");
		}
		
		/* equals()
		: Object 클래스로부터 상속받은 메서드로 실제 저장된 문자열의 내용을 비교하도록 정의되어 있다.
		즉, 아래의 코드는 인스턴스에 저장된 실제 문자열에 대한 비교가 이루어지기 때문에 내용이 같다는 결과가 출력된다. */
		if (str1.equals(str2)) {
			System.out.println("두 문자열은 동일하다.");
		}
		else {
			System.out.println("두 문자열은 다르다.");
		}
		
		///////////////////////////////////////////////////////////////////////////////////
		
		/* String 인스턴스 생성 방법
		2) 더블 쿼테이션을 사용한다.
			- 이 경우 내용이 동일하다면 같은 주소를 할당하기 때문에 새로운 메모리를 할당하지 않는다.
			- String 인스턴스는 이 방법을 주로 사용한다. */
		String str3 = "자바 개발자";
		String str4 = "자바 개발자";
		
		// 내용이 동일하므로 true가 출력된다.
		System.out.println("equals() 메서드로 문자열 비교: " + str3.equals(str4));
		
		// 하나의 메모리를 공유하므로 같다는 결과가 출력된다.
		if (str3 == str4) {
			System.out.println("주소가 같다.");
		}
		else {
			System.out.println("주소가 다르다.");
		}
		
		System.out.println("The end!");
	}

}
