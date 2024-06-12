package ex08class;

/* 문제 3 */
/* 구슬치기하는 아이들을 추상화하여 클래스로 정의해보자.
1. 어린이가 보유하고 있는 구슬의 개수 정보를 담는다.
2. 놀이를 통해 구슬을 획득 또는 상실하는 것을 표현한다.
3. 어린이가 현재 보유하고 있는 구슬의 개수를 표현한다.
4. 초기화는 다음과 같이 진행한다.
	- 어린이1의 보유 갯수: 구슬 20개
	- 어린이2의 보유 갯수: 구슬 15개
5. 게임은 다음과 같이 진행한다.
	- 1차 게임: 어린이1은 어린이2의 구슬 5개를 획득한다.
	- 2차 게임: 어린이2는 어린이1의 구슬 9개를 획득한다.
6. 어린이 객체 생성 시 구슬의 보유 갯수는 생성자를 통해 초기화 되어야 한다. */

class ChildProperty {
	int beads;
	
	public ChildProperty(int bead) {
		this.beads = bead;
	}
	void showProperty() {
		System.out.println(this.beads);
	}
	public void obtainBead(ChildProperty ch, int b) {
		this.beads += b;
		ch.beads -= b;
	}
}

public class QuMarbles {

	public static void main(String[] args) {
		ChildProperty child1 = new ChildProperty(20);
		ChildProperty child2 = new ChildProperty(15);

		System.out.println("게임 전 구슬의 보유 개수");
		System.out.println("==================");
		System.out.print("어린이1: ");
		child1.showProperty(); 
		System.out.print("어린이2: ");
		child2.showProperty(); 

		/*1차 게임 : 어린이1은 어린이2의 구슬 5개 획득*/
		child1.obtainBead(child2, 5);

		/*2차 게임 : 어린이2가 어린이1의 구슬 9개 획득*/
		child2.obtainBead(child1, 9);

		System.out.println("\n게임 후 구슬의 보유 개수");
		System.out.println("==================");
		System.out.print("어린이1: ");
		child1.showProperty(); 
		System.out.print("어린이2: ");
		child2.showProperty();

	}

}
