import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int jimin = sc.nextInt();
		int hansu = sc.nextInt();
		
		int meet = 0;
		
		while (jimin != hansu) {
			jimin = jimin/2 + jimin%2;
			hansu = hansu/2 + hansu%2;
			meet++;
		}
		
		System.out.println(meet);
		
		sc.close();
		
		}
	
}