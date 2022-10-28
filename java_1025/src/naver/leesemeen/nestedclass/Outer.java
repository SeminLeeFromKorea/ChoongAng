package naver.leesemeen.nestedclass;

public class Outer { //private은 불가
	// 내포 클래스 - 다른 클래스 안에 만들어진 클래스
	// 다른데에서도 필요하면 내포 클래스를 밖으로 끄집어내야 함
	class Inner { // 여기서는 private 가능
		public int num;
	}
	
	// 내포 클래스 안에 static 멤버가 있으면 인스턴스 생성 없이 사용할 수 있도록 static을 추가
	static class StaticInner{
		public int num;
		public static int share; 
	}
	
	public void method() {
		// 메소드 안에 만들어진 클래스 - Local Inner
		// 메소드 안에서만 사용 가능한 클래스
		class LocalInner {
			public int num;
		}
	}
	
	
}
