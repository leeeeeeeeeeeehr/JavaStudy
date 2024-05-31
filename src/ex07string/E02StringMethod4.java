package ex07string;

public class E02StringMethod4 {

	public static void main(String[] args) {
		
		/* 시나리오 1 */
		/* 주민등록번호를 이용하여 성별을 판단하는 프로그램을 charAt()을 이용해서 작성하시오. */
		System.out.println("### 시나리오 1 ###");
		
		String juminNum1 = "190419-3000";
		System.out.println("7번째 문자 추출 = " + juminNum1.charAt(7));
		
		// 추출한 문자를 변수에 저장
		char gender1 = juminNum1.charAt(7);

		if (gender1 == '1' || gender1 == '3') {
			System.out.println("남자입니다.");
		}
		else if (gender1 == '2' || gender1 == '4') {
			System.out.println("여자입니다.");
		}
		else if (gender1 == '5' || gender1 == '6') {
			System.out.println("외국인입니다.");
		}
		else {
			System.out.println("주민번호를 잘못 입력하셨습니다.");
		}
		System.out.println();
		
		////////////////////////////////////////////////////////////////////////////
		
		/* 시나리오 2 */
		/* 해당 문자열이 이메일 형식인지 검사하는 프로그램을 contains()를 이용해서 작성하시오.
		hong@daum.net => 이메일 형식임		not@naver => 이메일 형식이 아님 */
		System.out.println("### 시나리오 2 ###");
		
		/* 강사님 코드 */
		String email = "hong@daum.net";
		System.out.println("포한된 문자 확인하기 = " + email.contains("@"));
		
		if (email.contains("@") && email.contains(".")) {
			System.out.println("이메일 형식이 맞습니다.");
		}
		else {
			System.out.println("이메일 형식이 아닙니다.");
		}
		System.out.println();
		
		/* 내가 한 잘못된 코드 */
//		String email = "leehr@naver.com";
//		
//		Boolean isEmail = email.contains(".com");
//		
//		if (isEmail) {
//			System.out.println("이메일 형식이 맞습니다.");
//		}
//		else {
//			System.out.println("이메일 형식이 아닙니다.");
//		}
//		System.out.println();

		////////////////////////////////////////////////////////////////////////////
		
		/* 시나리오 3 */
		/* 주민등록번호로 성별을 구분하는 프로그램을 indexOf()와 charAt()을 이용해서 작성하시오.
		indexOf()로 하이픈의 위치를 먼저 찾은 후 charAt()으로 성별에 해당하는 문자를 추출한다. */	
		System.out.println("### 시나리오 3 ###");
		
		/* 강사님 코드 */
		String jumin = "190419-3000";
		System.out.println("하이픈 위치 찾기 = " + jumin.indexOf("-"));
		
		int genderIdx = jumin.indexOf("-") + 1;
		if (jumin.charAt(genderIdx) == '1' || jumin.charAt(genderIdx) == '3') {
			System.out.println("남자입니다.");
		}
		else if (jumin.charAt(genderIdx) == '2' || jumin.charAt(genderIdx) == '4') {
			System.out.println("여자입니다.");
		}
		else if (jumin.charAt(genderIdx) == '5' || jumin.charAt(genderIdx) == '6') {
			System.out.println("외국인입니다.");
		}
		else {
			System.out.println("주민번호를 잘못 입력하셨습니다.");
		}
		System.out.println();
		
		/* 내가 한 코드 */
//		String juminNum2 = "190419-4000";
//		System.out.println("-의 인덱스 번호: " + juminNum2.indexOf("-")); 
		
//		int gender2 = juminNum2.indexOf("-");
//		System.out.println("-의 인덱스 번호: " + juminNum2.charAt(gender2 + 1));
		
//		int isGender = juminNum2.charAt(gender2 + 1);
		
//		if (isGender == '1' || isGender == '3') {
//			System.out.println("남자입니다.");
//		}
//		else if (isGender == '2' || isGender == '4') {
//			System.out.println("여자입니다.");
//		}
//		else if (isGender == '5' || isGender == '6') {
//			System.out.println("외국인입니다.");
//		}
//		else {
//			System.out.println("주민번호를 잘못 입력하셨습니다.");
//		}
//		System.out.println();
		
		////////////////////////////////////////////////////////////////////////////

		/* 시나리오 4 */
		/* 다음 파일명에서 확장자를 잘라내는 프로그램을 작성하시오.
		
		파일명 : my.file.images.jpg */
		System.out.println("### 시나리오 4 ###");
		
		/* 강사님 코드 */
		String filename = "my.file.images.jpg";
		
		// 파일명에서 마지막 .의 위치를 검색
		int dotPoIdx = filename.lastIndexOf(".");
		// .의 위치 다음의 문자열부터 잘라내므로 +1 해준다.
		String fileExt = filename.substring(dotPoIdx + 1);
		System.out.println("파일 확장자 = " + fileExt);
		
		

		/* 내가 한 코드 */
//		String fileName = "my.file.images.jpg";
//		System.out.println("확장자명의 위치는 = " + fileName.lastIndexOf("."));
//		
//		int fileType = fileName.lastIndexOf(".") + 1;
//		System.out.println("확장자명 = " + fileName.substring(fileType));		
	}

}
