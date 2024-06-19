package ex17collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

import common.Student;

/* 문제 1 */
/* 실행 순서는 아래와 같다.
1. 사용자로부터 이름을 입력 받는다.
2. 입력 받은 이름으로 검색해서 인덱스 위치(indexOf 사용)를 알아낸다.
3. 해당 인덱스로 그 객체를 삭제한다.
4. 삭제된 객체의 정보(이름, 나이, 학번)를 출력한다. */

public class QuArrayList_T {

	public static void main(String[] args) {
		LinkedList<Student> list = new LinkedList<Student>();
		
		// 저장할 객체 생성
		Student st1 = new Student("가길동", 10, "2018");
		Student st2 = new Student("나길동", 20, "2017");
		Student st3 = new Student("다길동", 30, "2016");
		Student st4 = new Student("마길동", 40, "2015");
		
		// 객체 추가(컬렉션에 저장)
		list.add(st1);
		list.add(st2);
		list.add(st3);
		list.add(st4);
			
		// 1. 검색할 이름을 입력 받는다.
		Scanner scanner = new Scanner(System.in);
		System.out.println("검색할 이름을 입력하세요: ");
		String str = scanner.next();
		
		// 2. 확장 for문으로 컬렉션 전체를 접근한다.
		// List의 인덱스는 0부터 시작이므로 초기값은 -1로 설정한다.
		int index = -1;
		
		// 리스트에 저장된 갯수만큼 반복한다.
		for (Student stu : list) {
			// 검색할 이름과 일치하는 인스턴스를 검색한다.
			if (stu.getName().equals(str)) {
				// 참조값을 통해 index를 얻어온다.
				index = list.indexOf(stu);
				System.out.println("찾은 인덱스: " + index);
			}
		}	

		// 3. 검색된 데이터의 유/무에 따라 제어한다.
		// index가 그대로 -1이면 해당하는 index가 없다는 의미이다.
		if (index == -1) {
			// 검색 결과가 없으면 검색 결과가 없다고 출력한다.
			System.out.println("검색 결과가 없습니다.");
		}
		else {
			// 검색 결과가 있으면 검색된 데이터를 삭제한다.
			Student s = list.remove(index);
			System.out.println("다음 정보가 삭제되었습니다: " + s);
		}

		// 4. 전체 정보 출력
		System.out.println("삭제 후 전체 정보 출력");
		
		Iterator<Student> itr = list.iterator();

		while (itr.hasNext()) {
			Student st = itr.next();
			// toString()을 통해 정보를 출력한다.
			System.out.println(st);
		}
		
	}

}
