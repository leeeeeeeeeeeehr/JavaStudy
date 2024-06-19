package ex17collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/* HashMap<K, V>
: Map<T> 인터페이스를 구현한 컬렉션

- Key, Value의 쌍으로 인스턴스를 저장한다.
- Key 값은 중복될 수 없다.
  만약 중복되면 기존의 데이터를 덮어쓰기 한다.
- Key 값으로 검색되므로 다른 컬렉션에 비해 속도가 빠르다.
- 저장 순서는 유지되지 않는다.  */

public class Ex06HashMapMain {

	public static void main(String[] args) {
		// Map 컬렉션 생성, Key와 Value를 모두 String으로 선언했다.
		HashMap<String, String> map = new HashMap<String, String>();
		
		/* 인스턴스 저장
		: 저장 시 기존에 저장된 동일한 Key 값이 존재하면 저장된 인스턴스가 반환된다.
		만약 처음 입력이라면 null을 반환한다. */
		System.out.println("name이라는 키 값으로 저장된 이전의 값: " + map.put("name", "홍길동"));		// 처음 저장이므로 null이 반환된다.
		
		int number = 20;
		// int(Integer)는 String으로 형 변환을 할 수 없으므로 타입 에러가 발생한다.
//		map.put("age", number);
		// 정수는 아래와 같이 문자열로 변경한 후 저장할 수 있다.
		map.put("age", String.valueOf(number));
		map.put("gender", "남자");
		map.put("address", "가산디지털단지");
		// 현재까지 4개의 데이터가 저장된다.
		System.out.println("저장된 객체 수: " + map.size());
		System.out.println("----------------------------------");

		/* 중복 저장
		: 기존에 입력된 Key 값 name이 이미 있으므로 '홍길동'이 반환된다.
		그리고 기존의 값은 '최길동'으로 수정된다. */
		System.out.println("name이라는 키 값으로 저장된 이전의 값: " + map.put("name", "최길동"));		// 덮어쓰기
		// 중복 저장되므로 4개가 출력된다.
		System.out.println("키 값으로 중복 저장 후 객체 수: " + map.size());
		
		/* 출력하기 1 ) 키 값을 알고있을 때
		: get(key 값)으로 출력한다. */
		System.out.println("\n[키 값으로 출력]");
		System.out.println(map.get("name"));
		
		/* 출력하기 2 ) 키 값을 모를 때 (혹은 너무 많아서 하나씩 명시하기 힘들 때)
		: keySet() 메서드를 통해 전체 Key를 Set 컬렉션으로 얻어온다.
		해당 반환값을 확장 for문으로 반복하고, 이를 통해 Value를 인출할 수 있다. */
		Set<String> keys = map.keySet();
		
		System.out.println("\n[확장 for문 적용]");
		for (String key : keys) {
			// get(key 값)을 통해 value를 출력한다.
			String value = map.get(key);
			System.out.println(String.format("%s: %s", key, value));
		}
		
		/* 출력하기 3 ) Iterator를 통한 출력
		: Iterator를 통해 출력할 때도 keySet()을 통해 key를 먼저 얻어온 후 반복 출력한다. */
		System.out.println("\n[Iterator 사용하기]");
		// Map의 전체 key를 얻어온 후
		Set<String> keys2 = map.keySet();
		
		// 얻어온 key를 통해 Iterator 인스턴스를 생성한다.
		Iterator<String> it = keys2.iterator();
		
		// key가 있는지 확인한 후
		while (it.hasNext()) {
			// 존재하면 key를 인출한다.
			String key = it.next();			// Key 값 얻기
			// key를 통해 value를 인출한다.
			String value = map.get(key);	// Value 값 없기
			System.out.println(String.format("%s: %s", key, value));
		}
		
		/* value만 얻어와야 할 때 */
		System.out.println("\n[value 값들만 출력하기]");
		/* value만 얻어올 때는 values() 메서드를 통해 값을 인출할 수 있다.
		확장 for문을 통해 출력한다. */
		Collection<String> values = map.values();
		
		for (String value : values) {
			System.out.println(value);
		}
		
		/* 객체의 존재 유무 확인
		: Map 컬렉션은 Key와 Value가 있으므로 메서드도 2개로 나눠져있다. */
		System.out.println("\n[객체의 존재 유무]");
		System.out.println(map.containsKey("name") ? "name이라는 key가 있다." : "name이라는 key가 없다.");
		System.out.println(map.containsKey("account") ? "account라는 key가 있다." : "account라는 key가 없다.");
		System.out.println(map.containsValue("남자") ? "남자라는 value가 있다." : "남자라는 value가 없다.");
		System.out.println(map.containsValue("여자") ? "여자라는 value가 있다." : "여자라는 value가 없다.");
		
		/* 인스턴스 삭제
		: key를 통해 삭제하고, 삭제에 성공하면 해당 value가 반환된다. */
		System.out.println("\n[객체 삭제하기]");
		System.out.println("삭제된 객체: " + map.remove("age"));		// 20 출력됨
		System.out.println("---------------------");
		System.out.println("[남은 객체] ");
		for (String key : keys) {
			System.out.println(String.format("%s: %s", key, map.get(key)));
		}
		
		/* 전체 삭제
		: removeAll()은 없고, clear()만 사용할 수 있다. */
		System.out.println("\n[전체 삭제하기]");
		map.clear();
		System.out.println("전체 삭제 후 객체 수: " + map.size());
	}

}
