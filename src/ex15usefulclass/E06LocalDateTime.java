package ex15usefulclass;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class E06LocalDateTime {

	public static void main(String[] args) {

		// 날짜를 표현
		LocalDate localDate = LocalDate.now();
		System.out.println("오늘 날짜: " + localDate);
		
		// 시간을 표현
		LocalTime localTime = LocalTime.now();
		System.out.println("현재 시간: " + localTime);
		
		// 날짜와 시간을 동시에 표현
		LocalDateTime moment = LocalDateTime.now();
		System.out.println("지금: " + moment);
		
		System.out.println();
		
		// 날짜와 시간의 서식을 지정
		DateTimeFormatter format1 = DateTimeFormatter.ofPattern("yyyy년 MM월 dd일");
		DateTimeFormatter format2 = DateTimeFormatter.ofPattern("HH시 mm분 ss초");
		DateTimeFormatter format3 = DateTimeFormatter.ofPattern("오늘은 M월의 W번째 주, d번째 날, F번째 E요일");
		
		// 앞에서 지정한 서식에 적용해서 날짜를 출력
		System.out.println("서식 1: " + moment.format(format1));
		System.out.println("서식 2: " + moment.format(format2));
		System.out.println("서식 3: " + moment.format(format3));
		
		System.out.println();
		
		// LocalDate.of(년, 월, 일) => 특정한 날짜를 지정하는 메서드
		LocalDate xMas = LocalDate.of(localDate.getYear(), 12, 25);
		// 앞에서 지정했던 날짜 서식을 적용해서 출력
		System.out.println("크리스마스: " + xMas.format(format1));
		System.out.println("=======================");
		
		/* Period 클래스
		- 두 날짜 사이의 간격을 나타낸다.
		- 'n개월 n일 남음'으로 표시할 수 있다. */
		Period period = Period.between(localDate, xMas);
		System.out.println(period.getMonths() + "개월 " + period.getDays() + "일 남음");
		
		/* ChronoUnit 클래스
		- 특정 시간 단위로 날짜의 차이를 계산한다.
		
		ChronoUnit.MONTHS => 남은 개월 수를 표시한다.
		ChronoUnit.DAYS => 남은 전체 일 수를 표시한다. */
		System.out.println(ChronoUnit.MONTHS.between(localDate, xMas) + "개월 남음");
		System.out.println(ChronoUnit.DAYS.between(localDate, xMas) + "일 남음");
		
		System.out.println();

		// 현재를 기준으로 이전/이후의 날짜를 계산할 수 있다.
		System.out.println("5일 전: " + moment.minusDays(5));
		System.out.println("3일 후: " + moment.plusDays(3));
		System.out.println("2개월 후: " + moment.plusMonths(2));
		System.out.println("1년 후: " + moment.plusYears(1));
		// 메서드 체인 형태로 호출할 수 있다.
		System.out.println("1년 2개월 3일 후: " + moment.plusYears(1).plusMonths(2).plusDays(3));
		
	}

}
