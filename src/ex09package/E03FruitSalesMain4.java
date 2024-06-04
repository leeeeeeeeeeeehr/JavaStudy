package ex09package;

// 각 클래스는 반드시 public으로 선언해야 import 할 수 있다.
import ex09package.study.seller.FruitSeller4;
import ex09package.study.buyer.FruitBuyer4;

/* 연습 문제 */
/* 해당 프로그램을 아래의 지시에 따라 패키지로 구분하여 정상 실행되도록 변경하시오

- FruitSeller4 클래스 -> ex09package.study.seller 패키지에 묶는다.
- FruitBuyer4 클래스 -> ex09package.study.buyer 패키지에 묶는다.

두 클래스를 적절히 import하여 정상 동작할 수 있도록 E03FruitSalesMain4 클래스를 구성하시오. */

public class E03FruitSalesMain4 {

	public static void main(String[] args) {

		FruitSeller4 seller1 = new FruitSeller4(0, 100, 1000);
		FruitSeller4 seller2 = new FruitSeller4(0, 80, 500);
		FruitBuyer4 buyer = new FruitBuyer4(10000, 0);
		
		System.out.println("구매 행위가 일어나기 전의 상태");
		System.out.println("======================");
		seller1.showSaleResult();
		seller2.showSaleResult();
		buyer.showBuyResult();
		
		buyer.buyApple(seller1, 5000);
		buyer.buyApple(seller2, 5000);
		
		System.out.println("구매 행위가 일어난 후의 상태");
		System.out.println("======================");
		seller1.showSaleResult();
		seller2.showSaleResult();
		buyer.showBuyResult();
		
	}

}
