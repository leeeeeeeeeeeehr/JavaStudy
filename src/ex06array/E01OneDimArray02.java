package ex06array;

import java.util.Random;

public class E01OneDimArray02 {

	public static void main(String[] args) {

		/*
		난수 생성 방법 1
		: Math 클래스의 random() 메서드는 0 ~ 1 사이의 실수를 랜덤하게 반환해준다.
		정수 형태의 난수가 필요하다면 10이나 100과 같은 정수를 곱한 후 필요한 데이터를 만들어준다.
		 */
		
		double rndNumber = Math.random();
		System.out.println("생성된 난수 [실수]: "+ rndNumber);
		// 정수와 실수를 연산하면 실수가 반환되므로 int로 강제 형 변환한다.
		int intNumber = (int)(Math.random() * 100);
		System.out.println("생성된 난수 [정수]: "+ intNumber);
		System.out.println("============================");
		
		///////////////////////////////////////////////////////////////////////
		
		/*
		난수 생성 방법 2
		: Random 클래스를 사용한다.
		사용법은 Scanner와 동일하게 정수형 난수를 생성하고 싶다면 nextInt를 사용한다.
		 */
		
		Random random = new Random();
		System.out.println("생성된 난수: "+ random.nextInt());
		System.out.println("============================");
		
		///////////////////////////////////////////////////////////////////////
		
		/*
		로또 번호처럼 1 ~ 45 사이의 난수를 생성하는 방법
		
		1) 0.xx... 형태의 난수를 생성한 후 정수로 변경하기 위해 100을 곱한다.
		2) 45로 % 연산하여 나머지를 구한다. 정수를 45로 나누면 나머지는 0 ~ 44 사이가 나온다.
		3) 0은 구간에 포함되지 않으므로 결과에 1을 더해준다.
		4) 정수의 결과가 필요하므로 int로 강제 형 변환한다.
		 */
		
		System.out.println("1 ~ 45 사이의 난수 생성: "+ ((int)((Math.random() * 100) % 45) + 1));
		System.out.println("============================");
		
		///////////////////////////////////////////////////////////////////////
		
		/* 
		크기가 6인 배열을 생성해서 난수를 저장한 후 출력한다.
		중복된 난수가 생성될 수 있고 정렬도 되지 않는다. <= 이 부분은 컬렉션에서 다룰 예정이다.
		*/
		
		System.out.println("크기가 6인 배열에 난수 입력");
		
		// 크기가 6인 배열을 생성한다.
		int[] lottoNum = new int[6];
		
		// 난수 생성 후 배열에 순서대로 입력한다.
		for (int i = 0; i < lottoNum.length; i++) {
			lottoNum[i] = (int)((Math.random() * 100) % 45) + 1;
		}
		
		// 순서대로 출력된다.
		for (int i = 0; i < lottoNum.length; i++) {
			System.out.printf("%d ", lottoNum[i]);
		}
	}

}
