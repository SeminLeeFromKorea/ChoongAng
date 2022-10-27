package naver.leesemeen.serializable;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Date;

public class SerializableMain {

	public static void main(String[] args) {
		try (// 인스턴스 단위로 파일에 기록할 수 있는 객체 생성
				ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("multiobject.txt"));) {
			
			
			// 기록할 인스턴스 생성
			StudentDTO dto1 = new StudentDTO(1, "아담", new Date());
			StudentDTO dto2 = new StudentDTO(2, "강진축구", new Date());
			// 2개를 생성하면 순서의 문제가 발생 - 데이터는 하나로 만들어야 함

			// 기록할 인스턴스가 여러 개이므로 하나의 List로 묶어줌
			ArrayList<StudentDTO> list = new ArrayList<>();
			list.add(dto1);
			list.add(dto2);
			
			
			// 기록
			oos.writeObject(list);
			// 그냥 파일을 열어보면 깨져보임
			
			
//			oos.close();
			
			
		} catch (Exception e) {
			System.out.println(e.getLocalizedMessage());
		}
		
		try (// 인스턴스 단위로 파일에 읽어낼 수 있는 객체 생성
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream("multiobject.txt"));){
			
			
			// 기록을 할 때 List를 사용했으므로 읽어올 때 List로 읽어와야 함
			ArrayList list = (ArrayList) ois.readObject(); // 형변환을 해야 볼 수 있음
			
			for(Object obj : list) {
				System.out.println(obj);
			}
			
//			ois.close();
			
		} catch (Exception e) {
			System.out.println(e.getLocalizedMessage());
		}
		
		
	}

}
