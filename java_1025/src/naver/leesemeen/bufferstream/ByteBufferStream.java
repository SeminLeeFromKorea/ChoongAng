package naver.leesemeen.bufferstream;

import java.io.FileOutputStream;
import java.io.PrintStream;

public class ByteBufferStream {

	public static void main(String[] args) {

		try {
			PrintStream ps = new PrintStream(new FileOutputStream("./buffer.txt"));
			ps.print("문자열을 버퍼를 이용해서 출력");
			ps.flush();
			ps.close();
			// 눈에 보이는 건 없음. 내부적으로 동작함
			
		} catch (Exception e) {
			System.out.println(e.getLocalizedMessage());
		}
		
	}

}
