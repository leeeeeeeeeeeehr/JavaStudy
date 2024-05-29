/*
자바 파일의 구조
1. 패키지 선언부: 현재 작성 중인 자바 파일의 저장 위치를 결정한다.
2. 임포트 선언부: 프로그램에서 사용하는 클래스를 가져와서 사용할 때 기술한다.
3. 클래스 선언부: 프로그램의 주 내용을 입력한다.
 */

package ex01start;

import java.text.SimpleDateFormat;
import java.util.Date;

/* 상단의 패키지 선언부, 임포트 선언부는 우리가 직접 작성하지 않는다.
이클립스의 자동완성(Content Assist) 기능을 통해 자동으로 입력된다.
하단의 클래스 선언부는 우리가 구현할 기능에 대한 코드를 직접 작성한다. */

public class E01JavaStruct {
	public static void main(String[] args) {
		// 시스템에서 현재 시각을 가져온다.
		Date toDayOfDate = new Date();
		System.out.println("오늘 날짜:" + toDayOfDate);

		// 한국에서 주로 사용하는 날짜 형식인 년-월-일 시:분:초로 변경해서 출력한다.
		SimpleDateFormat simple = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String toDayString = simple.format(toDayOfDate);
		System.out.println("변형된 날짜:" + toDayString);
	}
}
