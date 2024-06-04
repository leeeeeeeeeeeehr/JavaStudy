package ex10accessmodifier;

class FruitSeller5 {
	
	int numOfApple;
	int myMoney;
	final int APPLE_PRICE;

	public FruitSeller5(int money, int appleNum, int price) {
		myMoney = money;
		numOfApple = appleNum;
		APPLE_PRICE = price;
	}
	
	public int saleApple(int money) {
		
		int num = money;
		numOfApple -= num;
		myMoney += money;
		return num;
	}
	
	public void showSaleResult() {
		System.out.println("[판매자] 남은 사과 갯수: " + numOfApple);
		System.out.println("[판매자] 판매 수익: " + myMoney);
		System.out.println("======================");
	}
}

class FruitBuyer5 {
	
	int myMoney;
	int numOfApple;
	
	public FruitBuyer5(int _myMoney, int _numOfApple) {
		myMoney = _myMoney;
		numOfApple = _numOfApple;
	}
	
	public void buyApple(FruitSeller5 seller, int money) {
		numOfApple += seller.saleApple(money);
		myMoney -= money;
	}
	
	public void showBuyResult() {
		System.out.println("[구매자] 현재 잔액: " + myMoney);
		System.out.println("[구매자] 사과 갯수: " + numOfApple);
		System.out.println();
	}
}

public class E02FruitSalesMain5 {

	public static void main(String[] args) {

		FruitSeller5 seller1 = new FruitSeller5(0, 100, 1000);
		FruitSeller5 seller2 = new FruitSeller5(0, 80, 500);
		FruitBuyer5 buyer = new FruitBuyer5(10000, 0);
		
		System.out.println("구매 행위가 일어나기 전의 상태");
		System.out.println("======================");
		seller1.showSaleResult();
		seller2.showSaleResult();
		buyer.showBuyResult();
		
//		buyer.buyApple(seller1, 5000);
//		buyer.buyApple(seller2, 5000);
		
		//////////////////////////////////////////////////////////////////
		
		/* 아래 코드는 문법적으로는 오류가 없으나 지불 금액과 구매한 사과의 관계가 전혀 맞지 않는 논리적 오류가 발생된다.
		즉, 코드(메서드)로 구현한 규칙이 완전히 무너지게 된다.
		객체지향 프로그래밍에서는 이런 오류를 막기 위해 멤버변수에 대한 '정보은닉'을 권장하고 있다.
		멤버변수의 외부 접근을 원천적으로 차단하고, 멤버메서드를 통해서만 접근하게 하여 논리적 오류를 차단하는 것이 목적이다. */
		
		seller1.myMoney += 1000;			// 판매자1에게 1000원 지불
		buyer.myMoney -= 1000;				// 구매자의 금액 1000원 차감
		
		seller1.numOfApple -= 50;			// 판매자1의 보유 사과 갯수가 50개가 줄어듦
		buyer.numOfApple += 50;				// 구매자의 보유 사과 갯수가 50개 늘어남
		
		// 즉, 1000원을 지불하고 사과 50개를 구매한 꼴이 된다.
		
		//////////////////////////////////////////////////////////////////
		
		System.out.println("구매 행위가 일어난 후의 상태");
		System.out.println("======================");
		seller1.showSaleResult();			// 5개를 판매한다.
		seller2.showSaleResult();			// 10개를 판매한다.
		buyer.showBuyResult();
		
	}

}
