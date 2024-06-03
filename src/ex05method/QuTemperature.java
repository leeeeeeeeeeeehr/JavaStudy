package ex05method;

import java.util.Scanner;

public class QuTemperature {
	
	/* 문제 2-3 */
	/* 섭씨(Celsius)를 입력 받아서 화씨(Fahrenheit)로 변환하여 리턴하는 함수와
	화씨를 입력받아서 섭씨로 변환하여 리턴하는 함수를 만들어라.

	- 메서드명 : celsiusToFahrenheit(), fahrenheitToCelsius()
	- 화씨 = 1.8 * 섭씨 + 32
	- 섭씨 = (화씨 - 32) / 1.8 */
	
	///////////////////////////////////////////////////////////////
	
	
	public static double celsiusToFahrenheit(double celcius) {
		
		double toFah = (celcius - 32) / 1.8;
		System.out.println("화씨 온도는 " + toFah + "입니다.");
		
		return toFah;
		
	}
	
	public static double fahrenheitToCelsius(double fahrenheit) {
		
		double toCelsi = 1.8 * fahrenheit + 32;
		System.out.println("섭씨 온도는 " + toCelsi + "입니다.");
		
		return toCelsi;
		
	}

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("섭씨 온도를 입력하세요: ");
		double cel = scanner.nextDouble();
		celsiusToFahrenheit(cel);
		
		System.out.println();
		
		System.out.println("화씨 온도를 입력하세요: ");
		double fah = scanner.nextDouble();
		fahrenheitToCelsius(fah);
		
	}
}
