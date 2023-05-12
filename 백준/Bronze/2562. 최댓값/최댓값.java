import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		Scanner sc = new Scanner(System.in);
		
		int num = 0;
		int seq = 0;
		
		for (int i=0; i<9;i++) {
			int t = sc.nextInt();
			if (num < t) {
				num = t;
				seq = i+1;
			}
		}
		
		System.out.println(num);
		System.out.println(seq);
		
		sc.close();
	}

}
