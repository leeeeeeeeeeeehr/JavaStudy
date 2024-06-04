package ex10accessmodifier;

/* 캡슐화 (Encapsulation)
: 여러가지 업무 로직을 하나로 묶는다는 의미와 업무의 순서까지 고려한 형태로 로직을 구성한다는 의미를 가지고 있다.
즉, 관련있는 로직을 하나로 묶어주는 것을 말한다. */
 
// 아래 4가지 업무를 번호 순서대로 진행해야 한다고 가정한다.
class MemberRegist {
	
	void doMemberRegist() {
		System.out.println("1. 회원가입을 진행합니다.");
	}
	
}
class CongratulationPoint {
	
	void doCongratulationPoint() {
		System.out.println("3. 가입 축하 10포인트를 지급합니다.");
	}		
	
}
class AutoLogin {
	
	void doAutoLogin() {
		System.out.println("2. 자동 로그인");
	}		
	
}
class FirstLoginEvent {
	
	void doFirstLoginEvent() {
		System.out.println("4. 첫 로그인 이벤트 페이지로 이동합니다. ");
	}		
	
}

////////////////////////////////////////////////////////////////ㄴ

/* 업무의 순서를 고려하여 관련된 메서드를 하나의 클래스로 정의한다.
차후에는 별도의 분석 절차 없이 해당 클래스의 doProcess() 메서드만 호출하면
업무는 차질 없이 진행될 것이다. */
class EncapsulLogic {	
	
	// 각 업무를 담당할 클래스를 통해 인스턴스를 생성한다.
	MemberRegist memberRegist = new MemberRegist();
	FirstLoginEvent firstLoginEvent = new FirstLoginEvent();
	AutoLogin autoLogin = new AutoLogin();
	CongratulationPoint congratulationPoint = new CongratulationPoint();
	
	// 업무의 순서를 고려하여 캡슐화된 메서드를 정의한다.
	void doProcess() {
		memberRegist.doMemberRegist();						// 1. 회원가입
		autoLogin.doAutoLogin();							// 2. 자동 로그인
		congratulationPoint.doCongratulationPoint();		// 3. 포인트 지급
		firstLoginEvent.doFirstLoginEvent();				// 4. 이벤트 페이지 이동
	}
	
}

public class E05Encapsulation {
	
	public static void main(String[] args) {
 
		System.out.println("캡슐화 전 코드");
		System.out.println("==============================");
		
		/* 업무의 진행 순서가 중요하다고 가정했을 때, 캡슐화 이전의 코듯에서는
		개발자가 순서를 지키지 않은 상태에서도 실행이 가능한 코드가 된다.
		즉, 업무에 차질이 발생될 수 있다. */
		MemberRegist memberRegist = new MemberRegist();
		FirstLoginEvent firstLoginEvent = new FirstLoginEvent();
		AutoLogin autoLogin = new AutoLogin();
		CongratulationPoint congratulationPoint = new CongratulationPoint();
		
		memberRegist.doMemberRegist();						// 회원가입
		firstLoginEvent.doFirstLoginEvent();				// 이벤트 페이지 이동
		autoLogin.doAutoLogin();							// 자동 로그인
		congratulationPoint.doCongratulationPoint();		// 포인트 지급
		
		System.out.println();
		
		System.out.println("캡슐화 이후 코드");
		System.out.println("==============================");
		
		// 아래 메서드 호출을 통해 업무를 순서에 맞게 진행할 수 있다.
		new EncapsulLogic().doProcess();
	}
}

