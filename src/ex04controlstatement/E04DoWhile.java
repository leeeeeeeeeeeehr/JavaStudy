package ex04controlstatement;

import java.io.IOException;
import java.util.Scanner;

public class E04DoWhile {

	public static void main(String[] args) throws IOException{

		/*
		do ~ while문
		: 반드시 한 번은 실행해야 할 경우 사용하는 반복문으로 조건 검사 없이 한 번은 무조건 실행된다.
		
		형식:
			반복을 위한 변수;
			do {
				실행문;
				증감식;
			} while (조건식);		<= 문장의 끝에 세미콜론이 들어간다.
		 */
		
		///////////////////////////////////////////////////////////////////////////////////////
		
		/* 시나리오 1 */
		/* E03 예제의 1 ~ 10까지 더하는 수열 문제를 do ~ while문으로 변경하여 구현하시오. */
		
		// 누적 합과 반복을 위한 변수 생성한다.
		int sum = 0;
		int i = 1;
		// 조건 검사 없이 무조건 진입해서 실행한다.
		do {
			// 증가하는 변수 i를 누적된 sum에 더해준다.
			sum += i;
			i++;
		// 탈출의 조건을 위해 증가시킨 후 확인한다.
		} while (i <= 10);
		System.out.println("1 ~ 10까지의 누적 합: "+ sum);
		
		///////////////////////////////////////////////////////////////////////////////////////
		
		/* 시나리오 2 */
		/* 1부터 1000까지의 정수 중 4의 배수이거나 7의 배수인 수의 합을 구하여 출력하는 프로그램을 작성하시오.
		단, do ~ while문으로 구현하시오. */
		
		int total = 0;
		int j = 1;
		do {
			// 4 혹은 7의 배수인지 확인한다.
			if (j % 4 == 0 || j % 7 == 0) {
				// 증가하는 j를 누적된 total에 더해준다.
				total += j;
			}
			j++;
		// 앞의 문장을 먼저 실행한 후 탈출 조건을 확인한다.
		} while (j <= 1000);
		System.out.println("1 ~ 1000 사이 4 또는 7의 배수들의 합: "+ total);
		
		///////////////////////////////////////////////////////////////////////////////////////
		
		/* 시나리오 3 */
		/* 국어, 영어, 수학 점수를 사용자로부터 입력 받은 후
		평균을 구해 A ~ F 학점을 판단하여 출력하는 프로그램을 작성하시오.
		단, 사용자가 X, x (대소문자 구분 없음)을 입력하면 프로그램이 종료되어야 하며
		do ~ while문으로 구현해야 한다. */
		
		// 사용자로부터 점수를 입력받기 위한 인스턴스를 생성한다.
		Scanner scanner = new Scanner(System.in);
		// 점수와 탈출 문자 입력을 위한 변수를 선언한다.
		int kor, eng, math, avg;
		// 아스키코드로 받아오기 위해 int형으로 선언한다.
		int exitCode;
		
		// 조건 확인 없이 진입하여 점수를 입력 받는다.
		do {
			System.out.print("국어 점수: ");
			kor = scanner.nextInt();
			System.out.print("영어 점수: ");
			eng = scanner.nextInt();
			System.out.print("수학 점수: ");
			math = scanner.nextInt();
			
			/* 평균 점수의 구간을 설정하기 위해 10으로 나누는 연산을 추가한다.
			switch문은 조건식은 사용할 수 없고, 산술식만 사용할 수 있으므로 이와 같이 처리해야 한다. */
			avg = (kor + eng + math) / (3 * 10);
			switch (avg) {
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
			System.out.println("종료하려면 X를 입력하세요.");
			System.out.println("계속하려면 아무 키나 입력하세요.");
			exitCode = System.in.read();
			
		/*
		X를 입력한 경우
			!(true || false) => !(true) => false
			
			=> 따라서 while문을 탈출한다.
		
	
	 	A를 입력한 경우
	 		!(false || false) => !(false) => true
	 		
	 		=> 따라서 반복문의 처음으로 돌아간다.
		 */
			
		} while (!(exitCode == 'x' || exitCode == 'X'));
	}
}
