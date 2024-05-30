package ex06array;

public class E02ArrayAndMethod {

	public static void main(String[] args) {

		/* 배열을 선언과 동시에 초기화한다. 초기값의 갯수를 통해 크기가 결정된다.
		생성된 배열 인스턴스의 주솟값을 int형 배열 변수인 arr에 할당하게 된다. */
		int[] arr = {1, 2, 3, 4, 5};
		// 배열 변수만 선언했고 아직은 참조할 인스턴스가 없는 상태이다.
		int[] ref;
		System.out.println("초기화 직후 출력");
		
		// 초기값 그대로인 1 ~ 5까지 출력된다.
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");		// 1 2 3 4 5 출력
		}
		System.out.println();
		/* 배열명을 출력하면 메모리의 주솟값이 문자열 형태로 출력된다.
		즉, 배열명은 배열에 저장된 값 자체가 아닌 Heap 영역에 생성된 메모리의 주솟값을 저장하게 된다. */
		System.out.println("arr 변수: "+ arr);
		
		/* arr은 참조값이고, 7은 기본 자료형인 int이므로 값 자체가 전달된다.
		메서드에서 반환한 참조값이 ref로 할당되므로 결국 같은 배열을 참조하게 된다. */
		ref = addAllArray(arr, 7);
		
		/* main에서 생성했던 배열 객체의 참조값을 매개변수로 넘기고 다시 받았다.
		결국 동일한 배열을 참조하게되어 아래 출력문에서는 동일한 결과가 출력된다. */
		System.out.println("메서드 호출 후 출력");
		for (int i = 0; i < ref.length; i++) {
			System.out.println(ref[i] + " ");		// 8 9 10 11 12 출력
		}
		System.out.println();
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");		// 8 9 10 11 12 출력
		}
	}
	
	/* 매개변수로 전달된 배열의 참조값을 ar로 받게되므로 해당 메서드에서도 동일한 배열을 참조할 수 있게 된다.
	즉, main 메서드에서 생성한 배열과 동일한 배열을 참조하게 된다. */
	static int[] addAllArray(int[] ar, int addVal) {
		for (int i = 0; i < ar.length; i++) {
			ar[i] += addVal;
		}
		return ar;
	}
}
