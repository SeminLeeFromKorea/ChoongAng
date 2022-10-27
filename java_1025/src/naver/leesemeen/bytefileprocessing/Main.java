package naver.leesemeen.bytefileprocessing;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {

	public static void main(String[] args) {
		// 바이트 단위로 파일에 기록하기
		try {
			// 파일이름 UUID 등도 사용 가능함
			// 오늘 날짜를 문자열로 만들기
			Date date = new Date();
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy년MM월dd일 오늘의 일지"); // 소문자 m은 분, 대문자 M은 월
			
			// 기록할 파일 만들기
			FileOutputStream fos = new FileOutputStream("C:\\Users\\user\\git\\ChoongAng\\java_1025\\" + sdf.format(date) + ".txt", true); // true 붙이면 이어서 쓰고, 없으면 덮어씀
			// 공부할 때는 상대경로, 실제 일할 때는 절대경로를 자주 쓰게 될 수도 있다. 지금은 상대경로 ./ 를 사용
			// 절대경로를 쓸 때는 마지막에도 \\를 써줘야 한다.
			
			// 기록할 메시지 생성
			String msg = "안녕하세요";
			// 한글을 입력해보고, 글자가 깨지는지 안 깨지는지 확인해볼 필요도 있다. UTF-8과 ms949처럼 인코딩 방식이 다를 수도 있기 때문이다.
			
			// 파일에 기록
			fos.write(msg.getBytes());
			
			// 파일을 닫기
			fos.close();
			
		} catch (Exception e) {
			System.out.println("파일 기록 실패");
		}
		
		// 앞에서 작성한 파일 읽기
		try {
			FileInputStream fis = new FileInputStream("C:\\Users\\user\\git\\ChoongAng\\java_1025\\2022-10-27.txt");
			// 읽어서 저장할 바이트 배열을 생성
			byte [] b = new byte[fis.available()];
			
			// 읽기
			fis.read(b);
			
			// 읽은 내용 확인
			System.out.println(new String(b)); // String으로 바꿔줘야 한글이 나옴
			
			fis.close();
			
			
		} catch (Exception e) {
			System.out.println(e.getLocalizedMessage());
		}
		
		
		
		
		
	}

}
