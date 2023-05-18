package practice_w10;

class Dragon {
	private int power;
	public void set_power(int power) {
		this.power = power;
	}
	void show() {
		System.out.println("용의 화력은  "+power);
	}
	void fire(Castle ca) {
		ca.destroy(power);
	}
}
