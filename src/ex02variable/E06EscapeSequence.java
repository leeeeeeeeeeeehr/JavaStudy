package ex02variable;

public class E06EscapeSequence {

	public static void main(String[] args) {

		// \t: tab(탭) 기능으로 스페이스 4칸이 띄워진다.
		System.out.println("4월엔 벚꽃~~!");
		System.out.println("4월엔\t벚꽃~~!");

		// \n: new line(줄 바끔) 기능
		System.out.print("Java World에 오신 걸 환영합니다.\n");
		System.out.print("열심히\n해봅시다.\n");

		// \": 문자열 사이에 ""을 표현하고 싶을 때 사용한다.
//		System.out.println("나는"개발자"가 되고싶어요");
		System.out.println("나는 \"개발자\"가 되고싶어요");

		int kor = 81, eng = 97, math = 79;
		// printf(): 문자열을 서식에 맞춰 출력할 때 사용한다.
		// 정수는 %d, 줄바꿈은 %n으로 표현한다.
		System.out.printf("국어:%d, 영어:%d, 수학:%d%n", kor, eng, math);
		// 같은 출력 문장이지만 println()을 사용하면 아래와 같이 문자열과 변수를 분리하여 작성해야 하므로 조검 더 복잡하다.
		System.out.println("\n국어: " + kor + ", 영어: " + eng + ", 수학: " + math);

		// 실수는 %f를 사용한다. 또한 정수와 실수의 연산이므로 결과는 실수가 반환되어 double형 변수에 대입해야 한다.
		double avg = (kor + eng + math) / 3.0;
		System.out.printf("평균 점수:%f%n", avg);

		/*
		자릿수 지정하기
		- %4d: 정수 출력 시 4칸을 확보한 후 표현한다.
		- %6.2f: 실수 출력 시 전체 자릿수는 6자리 소수점 이하 자릿수는 2자리로 표현한다.
		- 또한, 양수는 우측 정렬, 음수는 좌측 정렬된다.
		*/

		System.out.printf("국어:%d, 영어:%d, 수학:%d" + "평균:%f%n", kor, eng, math, avg);
		System.out.printf("국어:%6d, 영어:%6d, 수학:%6d" + "평균:%7.4f%n", kor, eng, math, avg);
		System.out.printf("국어:%-6d, 영어:%-6d, 수학:%-6d" + "평균:%-7.2f%n", kor, eng, math, avg);

	}

}
