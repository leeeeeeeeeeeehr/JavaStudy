package ex06array;

public class E07ForEachBasic {

	/*
	for-each문 (개선된 for문)
	: 배열의 일부가 아니라 전체를 참조해야 할 때 주로 사용한다.
	배열의 요소를 참조의 형태로 가져와서 사용하기 때문에 참조의 목적으로만 사용해야 하고,
	값을 변경하는 것은 허용되지 않는다.
	
	형식:
		for (자룡형 참조변수 : 배열명) {
			실행 문장;
			참조변수를 통해 사용 가능;
		}
	 */
	
	public static void main(String[] args) {
		
		/* for문 사용 */
		
		// 1차원 배열을 선언 및 초기화
		int[] arr = {1, 2, 3, 4, 5};
		int sum = 0;
		
		// 일반 for문을 통해 index로 접근 후 요소의 합을 계산
		for (int i=0; i<arr.length; i++) {
			sum += arr[i];
		}
		System.out.println("기본 for문을 이용한 합계: " + sum);
		
		/////////////////////////////////////////////////////////////
		
		/* for-each문 사용 */

		// 배열 arr의 요소를 순서대로 하나씩 참조하여 출력하고, 더이상 참조할 요소가 없을 때 자동으로 종료된다.
		sum = 0;
		for (int e : arr) {
			System.out.print(e + " ");
			sum += e;
		}
		System.out.println("\nfor-each문을 이용한 합계: " + sum);
		
		System.out.println("배열 arr의 요소값 1 증가시키기");
		
		/* 참조 형태로 각 원소를 읽어와서 변수 b에 할당하는 형식이다.
		증가연산자를 통해 증가시킨 값은 실제 배열에 적용되지 않는다.
		for문 내에서만 증가된 갑ㅄ이 출력된다. */
		for (int b : arr) {
			// 배열에서 꺼낸 후 b에 저장된 값이 증가한다.
			b++;
			System.out.print(b + " ");		// 1 증가된 값이 출력됨
		}
		System.out.println();
		
		System.out.println("배열 arr의 요소 재출력하기");
		
		// 1 증가는 기존 배열에 적용되지 않으므로 원본 상태 그대로를 출력한다.
		for (int c : arr) {
			System.out.print(c + " ");
		}
		System.out.println();
		
		System.out.println("2차원 배열을 for-each문으로 출력하기");
		int[][] twoDim = {
				{1, 2, 3, 4},
				{10, 20, 30, 40},
				{100, 200, 300, 400}
		};
		
		// 2차원 배열에서 하나의 행씩 접근해서 1차원 배열을 꺼내온다.
		for (int[] a : twoDim) {
			// 앞에서 꺼낸 배열의 원소에 각각 접근하여 출력한다.
			for (int b : a) {
				System.out.print(b + " ");
			}
			// 한 행을 출력한 후 줄바꿈한다.
			System.out.println();
		}
	}

}
