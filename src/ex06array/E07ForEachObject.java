package ex06array;

public class E07ForEachObject {

	public static void main(String[] args) {
		
		// 크기가 3인 인스턴스형 배열 생성
		String[] strArr = new String[] {
				"자바는 재미있다.",
				"자바는 유용하다.",
				"자바는 어렵다."
		};
		
		// 크기만큼 알아서 반복해서 출력
		for (String e : strArr) {
			System.out.println(e);
		}
		
	}

}
