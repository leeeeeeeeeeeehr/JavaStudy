package ex06array;

public class QuNumberCounter {

	/* 문제 3-1 */
	/* 다음에 주어진 answer 배열에는 1 ~ 4까지의 정수가 여러 개 저장되어 있다.
	 배열 전체의 데이터를 읽어서 각 정수가 몇 개씩 있는지 카운트하여 counter 배열에 순서대로 저장하시오. */
	
	/////////////////////////////////////////////////////////////////////////////////
	
	public static void main(String[] args) {
		
		int[] answer = {1, 4, 4, 3, 1, 4, 4, 2, 1, 3, 2};
		
		// 크기가 4인 배열 생성
		int[] counter = new int[4];
		
		for (int i = 0; i < answer.length; i++) {
			/* answer 배열의 해당 인덱스의 내용에서 1을 뺀 것 = counter 배열의 인덱스 위치
			ex) answer[3] = 3, answer[3] - 1 = 2이다.
			conter[2] => '3의 갯수'  */ 
			counter[answer[i] - 1]++;
		}
		
		for (int i = 0; i < counter.length; i++) {
			System.out.println("counter[" + i + "] => "  + counter[i]);
		}
		
	}

}
