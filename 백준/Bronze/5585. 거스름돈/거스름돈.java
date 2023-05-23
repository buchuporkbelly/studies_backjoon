import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		Scanner sc = new Scanner(System.in);
		
		int money = 1000-sc.nextInt();
		int N = money/500 + money%500/100 + money%100/50 + money%50/10 + money%10/5 + money%5/1;
		System.out.println(N);
		
		sc.close();
		}
}