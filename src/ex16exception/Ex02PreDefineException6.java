package ex16exception;

public class Ex02PreDefineException6 {
	 
	public static void main(String[] args)  {	
		
		/* Object 클래스를 단독적으로 생성한 경우
		다른 클래스와의 상속 관계가 전혀 없는 상태이므로
		이 상태에서는 형 변환을 할 수 없어 예외가 발생한다. */
		Object object = new Object();
		try {
			// 순수한 Obejct 인스턴스이므로 자식 타입으로 형 변환할 수 없다.
			String strObject = (String)object;
		}
		catch (ClassCastException e) {
			System.out.println("형 변환할 수 없습니다.");
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		System.out.println("=== ClassCastException 발생 후 ===");
			
		System.out.println("=== 끝 ===");
		
		String str = "형 변환이 되나요?";
		boolean castFlag = myClassCasting(str);
		if (castFlag == true)
			System.out.println("됩니다.");
		else
			System.out.println("안됩니다.");
				 
	}
	
	/* String 인스턴스가 인수로 전달되면서
	매개변수를 통해 Object로 자동 형 변환되므로 여기에서 상속 관계가 확인된다.
	매개변수 o는 원래 String 타입이었으므로 instanceof를 통해 String임을 확인할 수 있고
	이 경우에는 다운캐스팅이 가능하게 된다. */
	public static boolean myClassCasting(Object o) {
		if (o instanceof String) {
			return true;
		}
		else {
			return false;
		}
	}
}