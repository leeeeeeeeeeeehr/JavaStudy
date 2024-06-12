package ex15usefulclass;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class E05Date {
	
	/* Calendar 클래스를 통해 얻은 인스턴스를 초로 변환한 후
	매개변수로 전달된 날짜 서식으로 변경한 String으로 반환한다. */
	public static String myDateFormat(Calendar c, String formatStr) {
		/* getTime()
		: 서버의 표준 시인 1970-01-01부터 현재까지의 시간을 초 단위로 반환해준다.
		이를 '타임 스탬프'라고 한다. */
		Date date = c.getTime();
		return new SimpleDateFormat(formatStr).format(date);
	}

	public static void main(String[] args) {
		
		/* Calendar 클래스는 대표적인 싱글톤 클래스이므로 new로 인스턴스를 생성할 수 없고,
		유틸리티 메서드를 통해 참조값을 얻어와야 한다. */
		Calendar calendar = Calendar.getInstance();
		
		/* 월을 표현하는 Month, 분을 표현하는 Minute의 이니셜이 동일하므로 구분을 위해
		월은 대문자, 분은 소문자를 사용한다. */
		String nowStr1 = myDateFormat(calendar, "yyyy-MM-dd HH:mm:ss");
		System.out.println("현재 1: " + nowStr1);
		
		// 그 외 여러가지 서식 문자가 존재한다.
		String nowStr2 = myDateFormat(calendar, "오늘은 M월의 W번째 주, d번째 날, F번째 E요일");
		System.out.println("현재 2: " + nowStr2);
		System.out.println();
		
		/* 현재 날짜를 기준으로 전/후를 구하기 위해 add() 메서드를 사용한다.
		음수를 사용하면 과거의 날짜를 구할 수 있다. */
		calendar.add(Calendar.DATE, 3);		// 3일 후
		calendar.add(Calendar.MONTH, 2);	// 2개월 후
		calendar.add(Calendar.YEAR, 1);		// 내년 (1년 후)
		
		// 앞에서 add()를 3번 호출했으므로 결과는 아래와 같이 출력된다.
		String nowStr3 = myDateFormat(calendar, "yyyy년 MM월 dd일");
		System.out.println("1년 2개월 3일 후: " + nowStr3);
		System.out.println();
		
		/* 올해 크리스마스까지 남은 날짜를 계산한다.
		여기서는 두 가지 서식의 날짜를 파싱하여 구한 날짜 인스턴스를 통해 계산한다.
		
		오늘 날짜는 0000-00-00 형식으로 나타낸다. */		
		String today = new SimpleDateFormat("yyyy-MM-dd").format(new Date());
		// 크리스마스는 0000/00/00 형식으로 나타낸다.
		String future = "2024/12/25";
		System.out.println(today + " " + future);
		System.out.println();
		
		long result = myDiffDate(today, future);
		System.out.println(today + "에서 " + future + "까지 남은 날짜: " + result);

	}
	
	public static long myDiffDate(String today, String future) {
		long diffDays = 0;
		try {
			/* 매개변수를 통해 전달된 2개의 문자열은 날짜의 서식이 서로 다르다.
			따라서 각 날짜의 서식을 명확히 지정해야지만 날짜를 인식하여 연산할 수 있다.
			아래는 String을 Date로 변환한다. */
			Date formatToday = new SimpleDateFormat("yyyy-MM-dd").parse(today);
			Date formatFuture = new SimpleDateFormat("yyyy/MM/dd").parse(future);
			System.out.println(formatToday + " " + formatFuture);
			System.out.println();
			
			/* getTime()으로 얻어오는 시간은 13자리인 정수값인데
			10자리까지는 순수한 초(sec)이고, 11 ~ 13자리는 밀리초를 의미한다.
			즉, 100으로 나눠서 뒤의 3자리를 제거하면 순수한 '초'가 된다.
			또한, 하루는 86400초이므로 아래와 같이 남은 날짜를 계산할 수 있다. */
			diffDays = (formatFuture.getTime() - formatToday.getTime()) / (24 * 60 * 60 * 1000);
		}
		catch (Exception e) {}
		return diffDays;
	}

}
