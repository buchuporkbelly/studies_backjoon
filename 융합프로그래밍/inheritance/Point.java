package practice_w12;

class Point {
	private int x,y;
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	/*
	public void set(int x, int y) {
		this.x = x;
		this.y = y;
	}
	*/
	public void showpoint() {
		System.out.println("("+x+","+y+")");
	}
}
