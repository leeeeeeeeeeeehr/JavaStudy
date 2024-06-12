package ex12inheritance;

/* 문제 5 */
/* 햄버거를 추상화한 클래스와 기본 가격, 세트 가격을 추상화한 클래스를 정의하여
햄버거 주문 시 기본 가격 혹은 세트 가격으로 출력할 수 있도록 프로그램을 구현하시오.

조건은 다음과 같다. 
1. 햄버거
	- 멤버변수: 버거명, 가격, 패티, 소스, 야채
	- 인자 생성자 
	- 멤버메소드: 가격 반환(getter), 햄버거 정보 출력
2. 햄버거 기본 가격: 햄버거 + 음료 + 프렌치프라이의 합계
	- 멤버변수: 햄버거 종류(객체), 음료 가격(1000원으로 고정), 프렌치프라이 가격(1500원으로 고정)
	- 인자 생성자
	- 멤버메소드: 기본 가격 계산, 결제 금액 출력
3. 세트 가격: 기본 가격 클래스를 상속받음, 기본 가격에서 500원 할인된 금액으로 계산
	- 멤버변수: 없음
	- 인자 생성자
	- 멤버메소드: 세트 가격 계산(Overriding), 결제 금액 출력(Overriding) */

class Burger {
	/* 멤버변수
	: 버거명, 가격, 패티, 소스, 야채를 표현 */
	private String name;
	private int price;
	private String meat;
	private String sauce;
	private String vegetable;
	
	// 인자 생성자
	public Burger(String n, int p, String m, String s, String v) {
		this.name = n;
		this.price = p;
		this.meat = m;
		this.sauce = s;
		this.vegetable = v;
	}
	
	// getter: price만 필요
	public int getPrice() {
		return price;
	}
	/* 햄버거 정보 출력
	: 버거명, 가격, 식재료 출력*/
	public void showBurgerInfo() {
		System.out.println("버거명: " + name);
		System.out.println("가격: " + price);
		System.out.println("식재료: " + meat + ", " + sauce + ", " + vegetable);
	}
}

// 햄버거의 기본 가격 추상화 
class HamburgerPrice {
	/* 멤버변수
	: 햄버거 종류, 음료, 프렌치프라이 */
	Burger burger;
	final int COKE = 1000;
	final int POTATO = 1500;

	// 인자 생성자
	public HamburgerPrice(Burger bg) {
		this.burger = bg;
	}

	// 기본 가격 계산
	public int price() {
		int total = burger.getPrice() + COKE + POTATO;
		return total;
	}
	
	// 햄버거와 결제 금액 출력
	public void showPrice() {
		burger.showBurgerInfo();
		System.out.println("============================");
		System.out.println("결제 금액: " + price() + "원");
	}
}

// 세트 가격을 추상화(기본 가격을 상속)
class SetPrice extends HamburgerPrice {	
	// 인자 생성자
	public SetPrice(Burger bg) {
		super(bg);
	}

	// 세트 가격 계산(오버라이딩)
	@Override
	public int price() {
		return super.price() - 500;
	}
	
	// 햄버거와 세트 결제 금액 출력(오버라이딩)	
	@Override
	public void showPrice() {
		burger.showBurgerInfo();
		System.out.println("============================");
		System.out.println("세트 결제 금액: " + price() + "원");
	}
}

public class QuBuyHamburger {

	public static void main(String[] args) {
		
		// 치즈버거 객체 생성
		Burger burger1 = new Burger("치즈버거", 2000, "쇠고기 패티", "케챱", "피클");
		// 치킨버거 객체 생성
		Burger burger2 = new Burger("치킨버거", 3000, "닭고 기패티", "마요네즈", "양상추");
		
		// 치즈버거를 기본 가격으로 구매
		HamburgerPrice price1 = new HamburgerPrice(burger1); 
		price1.showPrice();		// 4500원	
		
		System.out.println();
		
		// 치킨버거를 세트 가격으로 구매
		HamburgerPrice price2 = new SetPrice(burger2); 
		price2.showPrice();		// 5000원
	}
}
