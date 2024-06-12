package ex13interface;

/* 추상 클래스를 인터페이스로 변경하기

abstract class => interface */
interface IPersonalNumberStorage {
	/* 멤버메서드인 경우 public abstract를,
	멤버변수인 경우 public static final을 제거한다. */
	void addPersonalInfo(String juminNum, String name);
	String searchPersonalInfo(String juminNum);
}

/* VO (Value Object)
: 값만 저장할 수 있는 객체라는 뜻으로 데이터 저장용 클래스를 만들 때 사용한다.
DTO와 비슷한 의미로 사용된다. */
class PersonalInfoVO {
	private String name;
	private String juminNum;
	
	public PersonalInfoVO(String name, String juminNUm) {
		super();
		this.name = name;
		this.juminNum = juminNUm;
	}
	
	public String getName() {
		return name;
	}
	public String getJuminNum() {
		return juminNum;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public void setJuminNum(String juminNum) {
		this.juminNum = juminNum;
	}
}

/*
클래스가 클래스를 상속할 때 => extends
클래스가 인터페이스를 상속할 때 => implements
인터페이스가 인터페이스를 상속할 때 => extends

인터페이스가 인터페이스를 상속하는 경우는 매우 드문 경우이다.
extends는 '상속'이라 표현하고, implements는 '구현'이라 표현한다.
 */
class PersonalNumberStorageImpl implements IPersonalNumberStorage {
	
	PersonalInfoVO[] personalArr;
	int numOfPerInfo;
	
	public PersonalNumberStorageImpl(int arrSize) {
		personalArr = new PersonalInfoVO[arrSize];
		numOfPerInfo = 0;
	}
	
	@Override
	public void addPersonalInfo(String juminNum, String name) {
		personalArr[numOfPerInfo] = new PersonalInfoVO(name, juminNum);
		numOfPerInfo++;
	}
	@Override
	public String searchPersonalInfo(String juminNum) {
		for (int i = 0; i < numOfPerInfo; i++) {
			if (juminNum.compareTo(personalArr[i].getJuminNum()) == 0) {
				return personalArr[i].getName();
			}
		}
		return null;
	}
}

public class E02AbstractToInterface2 {

	public static void main(String[] args) {
		PersonalNumberStorageImpl storage = new PersonalNumberStorageImpl(10);
		
		storage.addPersonalInfo("901234-222222", "김태희");
		storage.addPersonalInfo("901234-111111", "정지훈");
		
		System.out.println(storage.searchPersonalInfo("901234-222222"));
		System.out.println(storage.searchPersonalInfo("901234-111111"));
		System.out.println(storage.searchPersonalInfo("001024-1090333"));
	}

}
