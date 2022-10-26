package java_1025;

//어떤 종류의 데이터든지 생성자에서 개수에 상관없이 받아서 처리하는 제너릭스
class Generics <T>{
	private T [] data;
	
	//... 은 variable args 로 개수에 상관없이 매개변수를 받고자 할 때 사용
	//받은 매개변수들은 배열로 만들어 집니다.
	public Generics(T ... n) {
		this.data = n;
	}
	
	//배열의 데이터를 순차적으로 접근해서 출력하는 메서드
	public void display() {
		for(T temp : data) {
			System.out.println(temp);
		}
	}
}

public class TemplateProgramming {

	public static void main(String[] args) {
		//제너릭이 적용된 클래스의 인스턴스 만들기
		Generics <String> g1 = new Generics<String>("Karina", "Suzi", "IU");
		g1.display();
		Generics <Integer> g2 = new Generics<>(100, 300, 200, 400);
		g2.display();
	}
}
