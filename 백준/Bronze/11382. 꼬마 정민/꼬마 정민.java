import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		Scanner sc = new Scanner(System.in);
		
		long sum = 0;
		for (int i=0; i<3; i++) {
			long num = sc.nextLong();
			sum += num;
		}
		
		System.out.println(sum);
		
		sc.close();
	}
}