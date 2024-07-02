package common;

import java.util.Objects;

public class Teacher extends Person {
	private String subject;
	
	public Teacher(String name, int age, String subject) {
		super(name, age);
		this.subject = subject;
	}
	
	@Override
	public String toString() {
		return super.toString()	 + ", 과목: " + subject;
	}
	
	/* 시나리오 */
	/* 나이와 과목이 같으면 동일한 객체로 처리하도록 hashCode()와 equals() 메서드를 적절히 오버라이딩한다. */
	
	/* hashCode()
	: 인스턴스가 가진 고유한 주소값을 정수형으로 반환해준다.
	따라서 서로 다른 인스턴스라면 다른 해시값을 가지게 된다.
	정수형 멤버변수는 그냥 사용하면 되고
	인스턴스형 멤버변수는 hashCode()를 통해 정수값으로 반환되는 해시값을 사용하면 된다. */
	@Override
	public int hashCode() {
		/* 방법 1
		: 정수형 변수와 인스턴스의 해시값을 합산한 후 그대로 반환한다. */
		int returnCode1 = super.getAge() + this.subject.hashCode();
//		System.out.println("returnCode1 = " + returnCode1);
		
		/* 방법 2
		: 방법 1이 번거롭다면 Objects 클래스의 정적 메서드인 hash()를 사용해도 된다.
		맴버변수의 갯수만큼 인수로 전달하면 위와 동일하게 고유한 주소값을 정수형으로 반환해준다. */
		int returnCode2 = Objects.hash(super.getAge(), this.subject);
		System.out.println("returnCode2 = " + returnCode2);
		
		// 방법 1, 방법 2 둘 다 사용할 수 있다.
//		return returnCode1;
		return returnCode2;
	}
	
	/* equals()
	: 인스턴스가 가진 멤버변수의 값을 비교한다.
	값이 같을 때는 true, 다를 때는 false를 반환하도록 오버라이딩하면 된다. */
	@Override
	public boolean equals(Object obj) {
		// 매개변수로 전달 받은 인스턴스를 다운캐스팅 한다.
		Teacher teacher = (Teacher)obj;
		System.out.println("----------------------");
		
		/* age는 int형이므로 비교연산자를 통해 비교한다.
		subject는 String이므로 equals() 메서드를 통해 비교해야 한다. */
		if (teacher.getAge() == super.getAge() && teacher.subject.equals(this.subject)) {
			// 모든 내용이 일치하면 true를 반환한다. 그러면 set에는 추가되지 않는다.
			return true;
		}
		else {
			// 내용이 다르면 정상적으로 추가된다.
			return false;
		}
	}
	
}
