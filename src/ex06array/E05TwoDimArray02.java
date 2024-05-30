package ex06array;

public class E05TwoDimArray02 {

	public static void main(String[] args) {
		
		// 3행 4열 크기의 2차원 배열을 생성한다.
		int[][] arr2Dim = new int[3][4];
		
		// 각 행과 열의 크기만큼 반복하면서 배열을 초기화한다.
		for (int i=0; i<3; i++) {
			for (int j=0; j<4; j++) {
				// i와 j를 합산한 값으로 각 요소를 초기화한다.
				arr2Dim[i][j] = i + j;
			}
		}
		
		/*
		(배열명).length 		=> 배열의 행 크기를 반환한다.
		(배열명)[인덱스].length => 배열의 열 크기를 반환한다.
		 */
		for (int n=0; n<arr2Dim.length; n++) {
			for (int m=0; m<arr2Dim[n].length; m++) {
				// 각 인덱스에 초기화된 값을 출력한다.
				System.out.print(arr2Dim[n][m] + " ");
			}
			System.out.println();
		}
		
		/////////////////////////////////////////////////////////
		
		/* 시나리오 */
		/* 다음 절차에 따라 프로그램을 작성하시오.
		1. 세로가 3, 가로가 4인 2차원 배열을 선언한다.
		2. 난수를 이용하여 배열을 초기화한다. (0~100 사이)
		3. 배열 전체 요소를 매개변수로 전달된 정수만큼 증가시킨다.
		4. 증가되기 전, 후 배열을 출력한다.
		5. 메서드명은 twoDimPlus()로 구현한다.
		 */
		
		// 2행 4열 크기의 2차원 배열을 생성한다.
		int[][] twoArray = new int[2][4];
		
		// length를 통해 행과 열의 크기만큼 반복한다.
		for (int i=0; i<twoArray.length; i++) {
			for (int j=0; j<twoArray[i].length; j++) {
				// 난수를 통해 각 원소를 초기화한다.
				twoArray[i][j] = (int)(Math.random() * 100);
			}
		}
		System.out.println("= 초기화 후 =");
		/* 초기화 전, 후 두 번의 출력을 해야 하므로 코드의 중복을 제거하기 위해
		출력용 메서드를 정의한 후 필요할 때마다 호출해서 사용한다.*/
		showArray(twoArray);
		
		/* 배열의 참조값과 정수를 전달하여 값을 증가시킨다. */
		twoDimPlus(twoArray, 10);
		
		System.out.println("= 메서드 호출 후 =");
		/* 초기화 전, 후 두 번의 출력을 해야 하므로 코드의 중복을 제거하기 위해
		출력용 메서드를 정의한 후 필요할 때마다 호출해서 사용한다.*/
		showArray(twoArray);
	}
	
	/* 2차원 배열의 참조값을 매개변수로 받은 후 전체 요소를 출력한다.
	매개변수에는 배열의 크기를 기술하지 않고 2차원 배열의 형태만 명시하면 된다. */
	static void showArray(int[][] arr2) {
		for (int i=0; i<arr2.length; i++) {
			for (int j=0; j<arr2[i].length; j++) {
				// 4자리를 확보한 후 좌측 정렬해서 값을 출력한다.
				System.out.printf("%-4d", arr2[i][j]);
			}
			System.out.println();
		}
	}
	
	/* 매개변수로 전달된 정수만큼 2차원 배열의 전체 원소를 증가시킨다.
	이를 위해 복합대입연산자를 사용하고 있다. */
	static void twoDimPlus(int[][] arr2, int plusNum) {
		for (int i=0; i<arr2.length; i++) {
			for (int j=0; j<arr2[i].length; j++) {
				// 해당 요소를 plusNum만큼 증가시킨다.
				arr2[i][j] += plusNum;
			}
		}
	}
}
