package java_1025;

public class NoRecursionFibonacci {
	//n번째 피보나치 수열의 값을 리턴해주는 메서드
	public static int fibonacci(int n) {
		//이전 항의 값과 이전의 이전 항의 값을 저장할 변수
		int f1 = 1;
		int f2 = 1;
		
		//피보나치 값을 저장할 변수
		int fibo = 1;
		
		//첫번째 와 두번째는 처리할 필요가 없어서 반복문을 세번째 부터 적용
		for(int i=3; i<=n; i++) {
			fibo = f1 + f2;
			f2 = f1;
			f1 = fibo;
		}
		return fibo;
	}
	public static void main(String[] args) {
		System.out.println(fibonacci(100));

	}

}
