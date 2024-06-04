package ex05method;

import java.util.Scanner;

public class QuTemperature_T {
	
	public static void main(String[] args) {
		
		System.out.println("섭씨 28도 = 화씨 " + celsiusToFahrenheit(28));
		// 소수점 2자리까지만 출력하기 위해 printf 사용 
		// 또, printf는 문자열과 변수나 함수를 이을 때 +가 아닌 ,로 이어줘야 함
		System.out.printf("화씨 98도 = 섭씨 %.2f ",  fahrenheitToCelsius(98));
		
	}
	
	// 섭씨를 화씨로
	public static double celsiusToFahrenheit(double cel) {
		// 화씨 = 1.8 * 섭씨 + 32
		return 	1.8 * cel + 32;
		
	}
	
	// 화씨를 섭씨로
	public static double fahrenheitToCelsius(double fah) {
		// 섭씨 = (화씨 - 32) / 1.8
		double cel = (fah - 32) / 1.8;
		return cel;
	}
	
}
