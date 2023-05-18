package practice_w10;

class Castle {
	private int strength;
	Castle(int st){
		strength = st;
	}
	void show() {
		System.out.println("성의 내구력은 "+strength);
	}
	void destroy(int po) {
		strength -= po;
		show();
		if (strength==0) {
			System.out.println("성 무너진다!");
		}
	}
}
