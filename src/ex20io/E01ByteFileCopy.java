package ex20io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* 스트림 (Stream)
: IO 모델의 핵심 개념이라 할 수 있는 스트림은
'데이터의 흐름' 혹은 '데이터의 흐름을 생성해주는 통로'정도로 정의할 수 있다.
즉, Java와 파일(혹은 장치) 사이에서 통로 역할을 해준다.
스트림에는 입력(input)과 출력(output) 스트림이 있다. */

public class E01ByteFileCopy {

	public static void main(String[] args) {
		
		InputStream in = null;
		OutputStream out = null;
		int copyByte = 0;
		
		/* IO 관련 작업에서는 많은 부분에서 예외 처리가 필요하다.
		이때 예외를 throws 하는 것보다 try ~ catch로 예외 처리해주는 것을 권장한다.
		예외를 무시하면 문제가 생겼을 때 적절한 조치를 취하기 힘들기 때문이다. */
		try {
			// 원본 파일을 읽어오기 위한 입력 스트림 생성
			in = new FileInputStream("src/ex20io/movie.gif");
			// 복사본을 만들기 위한 출력 스트림 생성
			out = new FileOutputStream("src/ex20io/movie_copy.gif");
			// 원본 파일에서 1byte를 읽어 저장하기 위한 변수
			int bData;
			
			// 파일의 내용 전체를 읽기 위해 무한루프를 구성한다.
			while (true) {
				// 원본 파일에서 1byte를 읽어온다.
				bData = in.read();
				// 파일의 끝까지 읽으면 -1을 반환하면서 이때 반복문을 탈출한다.
				if (bData == -1) {
					break;
				}
				// 읽은 데이터를 복사본으로 출력한다.
				out.write(bData);
				// 1byte씩 복사하면서 변수의 값을 증가시킨다.
				copyByte++;
			}
		}
		catch (FileNotFoundException e) {
			System.out.println("파일이 존재하지 않습니다.");
		}
		catch (IOException e) {
			System.out.println("파일 스트림 생성 시 오류가 발생했습니다.");
		}
		finally {
			try {
				/* try문으로 진입하여 스트림을 생성했다면 finally 구문에서는 스트림을 닫아준다.
				try 구문으로 진입했을 때 무조건 실행되는 구문이 finally절이다. */
				in.close();
				out.close();
				
				System.out.println("복사된 KByte 크기: " + (copyByte / 1024));
			}
			catch (IOException e) {
				System.out.println("파일 스트림 닫기 오류가 발생했습니다.");
			}
			
		}
	}

}
