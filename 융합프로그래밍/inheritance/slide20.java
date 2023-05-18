package practice_w12;

class A {
	public A() {
		System.out.println("생성자A");
	}
	public A(int x) {
		System.out.println("매개변수생성자A"+x);
	}
}

class B extends A {
	public B() {
		System.out.println("생성자B");
	}
	public B(int x) {
		super(x); // 이거 주석 처리하고도 해봐
		System.out.println("매개변수생성자B"+x);
	}
}


public class slide20 {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		B b = new B();
		B bb = new B(5);
	}

}
// super 있고 없고의 출력차이 비교.
