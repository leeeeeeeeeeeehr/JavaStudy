package ex06array;

public class E04CallByReference {
	
	/*
	Call by reference (참조에 의한 호출)
	: 메서드를 호출할 때 참조값을 전달함으로써 서로 다른 지역에서도 동일한 메모리(Heap 영역)을 참조할 수 있게 하는 호출 방식이다.
	메서드의 지역이 다르더라도 참조값을 통해 인스턴스를 참조하게 되므로 A 지역에서의 값의 변경이 B 지역에서도 그대로 참조되는 장점이 있다.
	참조값만 전달하므로 프로그램의 퍼포먼스(성능)도 향상되고 메모리도 절약할 수 있다.
	 */

	public static void main(String[] args) {

		// 크기가 2인 정수형 배열을 생성한 후 초기화한다. (new 없이 초기값 세팅 가능)
		int[] arr = {100, 200};
		
		// 출력 1: 100, 200
		System.out.println("[메인 메서드] - Swap 전 출력");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		System.out.println("===================================");
		
		// 배열 인스턴스의 참조값을 인수로 전달한다.
		callByReference(arr);
		
		// 지역은 달라도 참조값을 통해 동일한 메모리를 참조하게 되므로 동일한 출력 결과가 나온다.
		// 출력 3: 200, 100
		System.out.println("[메인 메서드] - Swap 후 출력");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	static void callByReference(int[] ref) {
		
		/* 매개변수를 통해 전달받은 배열 인스턴스의 참조값을 통해 0번 인자와 1번 인자를 서로 교환한다.
		이때 배열에 저장된 값이 서로 바뀌게 된다. */
		int temp;
		temp = ref[0];
		ref[0] = ref[1];
		ref[1] = temp;
		
		// 출력 2: 200, 100
		System.out.println("[callByReference 메서드] - Swap 후 출력");
		for (int i = 0; i < ref.length; i++) {
			System.out.print(ref[i] + " ");
		}
		System.out.println();
		System.out.println("===================================");
	}
}
