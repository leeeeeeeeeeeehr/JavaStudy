package ex04controlstatement;

import java.util.Scanner;

public class E02Switch {

	public static void main(String[] args) {
		
		/*  
		switch문
		: if문처럼 조건에 따라 분기하는 제어문으로,
		정수식의 값과 동일한 부분을 찾아 실행하는 형태를 가진다.
		switch문에서는 조건문을 사용할 수 없고 산술식 혹은 정수식을 사용해야 한다.
		 */
		
		//////////////////////////////////////////////////////////////////////////////////
		
		/* Scanner 클래스
		: 사용자로부터 입력 값을 받기 위한 클래스로 해당 클래스의 메서드가 실행되면 잠깐 실행이 중지되고 입력을 기다린다.
		보통 문자열이나 정수를 입력받기 위해 사용된다. */
		Scanner scanner = new Scanner(System.in);
		System.out.print("숫자를 입력하세요.\n");
		// nextInt()는 정수를 입력받기 위한 메서드이므로 문자를 입력하면 예외(에러가) 발생하면서 프로그램이 중지된다.
		int iNum = scanner.nextInt();
		System.out.println("입력한 숫자는: "+ iNum);
		
		// 정수를 3으로 나누면 나머지는 0, 1, 2만 생성된다.
		int remain = iNum % 3;
		switch (remain) {
		case 0:
			System.out.println("나머지는 0 입니다.");
			break;
		case 1:
			System.out.println("나머지는 1 입니다.");
			break;
		default:
			System.out.println("나머지는 2 입니다.");
			// default 다음에는 실행할 문장이 없으므로 break는 생략한다.
		}
		
		/* 
		switch문 사용 시 주의사항
		- long 타입의 변수는 사용할 수 없다.
		- byte, short, int, char, String만 사용할 수 있다.
		- 또한, 논리식과 조건식도 사용할 수 없다.
		 */
		
//		long ln = 100;
//		switch (ln) {
//		case 100:
//			System.out.println("long 타입 사용할 수 있나요?");
//		default:
//			System.out.println("안됩니다.");
//		}
//		switch (iNum % 3 == 0) {
//			System.out.print("논리식도 안됩니다.");
//		}
		
		// 문자열이나 문자는 사용할 수 있다.
		String title = "자바";
		switch (title) {
		case "자바": System.out.println("자바 좋아");
			break;
		case "JAVA": System.out.println("JAVA GOOD");
			break;
		}
		
		/* 여러 case를 동시에 처리할 때는 break문 없이 case를 나열하면 된다.
		if문 조건식에 || (논리 OR)을 사용한 것과 동일하다. */
		int season = 8;
		switch (season) {
		case 3: case 4: case 5:
			System.out.println("봄입니다.");
			break;
		case 6: case 7: case 8: case 9:
			System.out.println("여름입니다.");
			break;
		case 10:
			System.out.println("가을입니다.");
			break;
		case 11: case 12: case 1: case 2:
			System.out.println("겨울입니다.");
		}
		
		///////////////////////////////////////////////////////////////////////
		
		/* 시나리오 */
		/* 국,영,수 점수의 평균값을 구하여 학점을 출력하는 프로그램을 작성하시오.
		90점이상은 A학점... 60점 미만은 F학점을 출력하면 된다. 단, switch문으로 작성하시오. */
		
		int kor = 99, eng = 70, math = 64;
		int avg = (kor + eng + math) / 3;
		
		/* 정석 답안 */
		/* 평균 점수를 10으로 나눈 몫을 통해 점수의 구간을 특정할 수 있다. */
		switch (avg/10) {
		case 10: case 9:
			System.out.println("A 학점");
			break;
		case 8:
			System.out.println("B 학점");
			break;
		case 7:
			System.out.println("C 학점");
			break;
		case 6:
			System.out.println("D 학점");
			break;
		default:
			System.out.println("F 학점");	
		}
		
		/* 야매 답안 */
		switch (avg) {
		case 100: case 99: case 98: case 97: case 96: case 95: case 94: case 93: case 92: case 91: case 90:
			System.out.println("A");
			break;
		case 89: case 88: case 87: case 86: case 85: case 84: case 83: case 82: case 81: case 80:
			System.out.println("B");
			break;
		case 79: case 78: case 77: case 76: case 75: case 74: case 73: case 72: case 71: case 70:
			System.out.println("C");
			break;
		case 69: case 68: case 67: case 66: case 65: case 64: case 63: case 62: case 61: case 60:
			System.out.println("D");
			break;
		default:
			System.out.println("F");
		}
	}

}
