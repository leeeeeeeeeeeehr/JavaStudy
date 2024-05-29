package ex04controlstatement;

public class E01If03 {

	public static void main(String[] args) {
	
		/* 시나리오 */
		/* 국, 영, 수 점수의 평균값을 구하여 학점을 출력하는 프로그램을 작성하시오.
		90점 이상은 A 학점, 80점 이상은 B 학점 ... 60점 미만은 F 학점을 출력하면 된다. */
		
		// 점수는 정수형으로 할당
		int kor = 99, eng = 70, math = 64;
		
		/* 평균값은 소수점이 나올 수 있으므로 실수형으로 선언하는 것이 좋다.
		실수형으로 선언했기 때문에 double의 결과를 얻기 위해선 3이 아닌 3.0으로 나눠줘야 한다. */
		double avg = (kor + eng + math) / 3.0;
		System.out.println("평균 점수는(그대로): "+ avg);
		System.out.printf("평균 점수는(소수 2자리): %.2f\n", avg);
		
		if (avg >= 90) {
			System.out.println("A 학점");
		}
		else if (avg >= 80) {
			System.out.println("B 학점");
		}
		else if (avg >= 70) {
			System.out.println("C 학점");
		}
		else if (avg >= 60) {
			System.out.println("D 학점");
		}
		// else문에는 조건식이 들어가면 에러가 발생하므로 주의해야 한다.
		else {
			System.out.println("F 학점, 학사 경고");
		}
		
		///////////////////////////////////////////////////////////////////////
		
		/* 앞에서 작성한 if문에서 조건의 순서만 변경되었지만
		60점 이상이라는 조건에 만족하기 때문에 높은 점수라도 모두 D학점이 출력된다.
		문법적인 오류는 없으니 논리적 오류가 발생되었으므로 주의해야 한다. */
		
		System.out.println("\n잘못된 조건식의 if문:");
		
		if (avg >= 60) {
			System.out.println("D 학점");
		}
		else if (avg >= 70) {
			System.out.println("C 학점");
		}
		else if (avg >= 80) {
			System.out.println("B 학점");
		}
		else if (avg >= 90) {
			System.out.println("A 학점");
		}
		else {
			System.out.println("F 학점, 학사 경고");
		}
	}

}
