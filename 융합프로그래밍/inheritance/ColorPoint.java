package practice_w12;

class ColorPoint extends Point {
	private String Color;
	
	public ColorPoint(int x, int y, String Color) {
		super(x,y);
		this.Color = Color;
	}
	
	/*
	void setColor(String C) {
		Color = C;
	}
	*/
	void showColorPoint() {
		System.out.print(Color); // Color는 private 인데 왜 사용가능하냐?? 답 : 클래스 외부에서만 접근 안되는거지 내부에선 가능
		showpoint(); // 이거 왜 Point.showpoint(); 아니냐?? 답 : 객체 생성이랑 전혀 관련이 없는 거임.
	}
}
