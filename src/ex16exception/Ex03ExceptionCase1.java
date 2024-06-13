package ex16exception;

import java.io.IOException;

/* 예외 처리 방법 1
: 예외가 발생된 메서드에서 호출했던 지점으로 예외 인스턴스를 던지고
메인 메서드에서도 예외 인스턴스를 프로그램 외부로 던진다.
즉, 예외를 내부에서 처리하지 않고 무시하겠다는 의미이다.
외부 자원 사용 시 기본적으로 발생되는 예외는 이처럼 무시하는게 가능하다.
이를 '예외 던지기'라고 하고 throws라는 키워드를 사용한다. */

public class Ex03ExceptionCase1 {
	
	static void compileFunc() throws IOException {
		System.out.print("하나의 문자를 입력하세요: ");
		int userChr = System.in.read();
		System.out.println("입력한 문자는 " + (char)userChr);
	}

	public static void main(String[] args) throws IOException {
		compileFunc();
	}
	
}