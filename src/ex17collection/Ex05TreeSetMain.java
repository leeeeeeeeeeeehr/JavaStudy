package ex17collection;

import java.util.Iterator;
import java.util.TreeSet;

/* TreeSet<T> 컬렉션
: 트리라는 자료 구조를 기반으로 한 set 계열의 컬렉션

- set의 기본적인 특성은 동일하다.
- 따라서 중복은 허용되지 않는다.
- 단, 인스턴스가 정렬되어 저장된다.
  정렬의 기준은 개발자가 직접 정의할 수 있다. */

/* 클래스 생성 시 정렬의 기준을 만들어주기 위해서는
Comparable<T> 인터페이스를 구현해야 한다. */
class MyString implements Comparable<MyString> {
	String str;
	
	public MyString(String str) {
		this.str = str;
	}
	// 멤버메서드: 문자열의 길이를 반환한다.
	public int getLength() {
		return str.length();
	}
	/* TreeSet<T>에 객체를 저장할 때 정렬을 위해 compareTo() 메서드를 오버라이딩 한다.
	정렬의 기준은 단순하게 가나다와 같은 순서가 될 수도 있고
	문자열의 길이에 따른 정렬이 될 수도 있다.
	아래의 코드는 오름차순 정렬일 때 사용한다.
	1과 -1의 위치가 바뀌면 내림차순이 된다. */
	@Override
	public int compareTo(MyString paramStr) {
		// 문자열의 길이를 기준으로 오름차순 정렬한다.
		if (getLength() > paramStr.getLength()) {
			return 1;
		}
		else if (getLength() < paramStr.getLength()) {
			return -1;
		}
		else {
			return 0;
		}
		
		// 문자열의 첫 문자를 기준으로 오름차순 정렬 한다. (A > B > C > ...)
//		if (this.str.charAt(0) > paramStr.str.charAt(0)) {
//			return 1;
//		}
//		else {
//			return -1;
//		}
		
	}
	@Override
	public String toString() {
		return str;
	}
}

public class Ex05TreeSetMain {

	public static void main(String[] args) {
		// Java에서 제공하는 기본 클래스인 경우 별도의 오버라이딩 없이도 정렬되어 저장된다.
		TreeSet<Integer> tree1 = new TreeSet<Integer>();
		tree1.add(1);
		tree1.add(4);
		tree1.add(2);
		tree1.add(3);
		// set 컬렉션이므로 중복 저장은 허용되지 않는다.
		tree1.add(2);

		System.out.println("저장된 데이터 수: " + tree1.size() + "개\n");		// 4개가 출력된다.
		
		System.out.println("=== 저장된 데이터 ===");
		// 오름차순으로 정렬된 상태로 출력된다.
		Iterator<Integer> itr = tree1.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		/////////////////////////////////////////////////////////////////////
		
		TreeSet<MyString> tree2 = new TreeSet<MyString>();
		
		// 문자열의 길이를 기준으로 오름차순 정렬된다.
		tree2.add(new MyString("Orange"));
		tree2.add(new MyString("Apple"));
		tree2.add(new MyString("Moon"));
		tree2.add(new MyString("JavaWeb"));
				
		Iterator<MyString> it = tree2.iterator();
		
		System.out.println("\n=== 저장된 데이터 ===");
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
