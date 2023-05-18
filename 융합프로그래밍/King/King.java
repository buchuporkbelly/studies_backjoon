package practice_w11;

class King {
	private String name; int order;
	King (String name, int order){
		this.name = name;
		this.order = order;
	}

	void show() {
		System.out.println("조선"+order+"대왕 "+name);
	}
}
