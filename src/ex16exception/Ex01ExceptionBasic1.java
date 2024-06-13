package ex16exception;

import java.io.IOException;

public class Ex01ExceptionBasic1 {

	public static void main(String[] args)
	
			throws IOException
	
	{
		
		/* Syntax 에러 (구문 에러)
		: 실행 자체가 되지 않는 코드로 오류를 수정해야만 정상적으로 실행된다.
		즉, 코드에 문법적인 오류가 발생되었음을 의미한다. */
//		Int number = 10;	=> int를 Int로 표기했다.
//		if (true); {
//			
//		}
//		else {				=> if문이 세미콜론으로 종료되어 의미 없는 else문이 됐다.
//			
//		}
		
		// 위의 에러가 나는 코드들을 정상적으로 수정한 코드이다.
		int number = 10;
		if (true) {
			System.out.println("참이다.");
		}
		else {
			System.out.println("거짓이다.");
		}
		
		/* 외부 자원(= 키보드, 마우스 등)을 사용할 때 발생되는 예외
		- 처리 방법 1
			: 예외가 발생한 지점을 try ~ catch문으로 직접 감싸서 처리한다.
		- 처리 방법 2
		 	: '예외 던지기'를 수행한다. main 메서드에 throws IOException을 기술하면
		 	  해당 메서드 내에서 발생되는 예외를 프로그램 외부로 던지기 할 수 있다.
		 	  여기서 던지기의 의미는 예외를 처리하지 않고 무시하겠다는 뜻이다. */
		System.out.print("문자 하나를 입력하세요.");
		try {
			int iChar = System.in.read();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}

}
