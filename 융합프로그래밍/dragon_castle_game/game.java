package practice_w10;

public class game {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		Dragon blue = new Dragon();
		blue.set_power(10);
		blue.show();
		
		Castle yodongsung = new Castle(50);
		yodongsung.show();
		System.out.println();
		
		blue.fire(yodongsung);
		blue.fire(yodongsung);
		blue.fire(yodongsung);
		blue.fire(yodongsung);
		blue.fire(yodongsung);
	}

}
