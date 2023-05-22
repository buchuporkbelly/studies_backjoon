import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		
		if ((B==C)||(B>C)) {
			System.out.println("-1");
		}
		else {
			int cha = C-B;
			int k=0;
			int i=0;
			while (true) {
				k += cha;
				i++;
				if (A<k) {
					System.out.println(i);
					break;
				}
			}
		}
		
		
		sc.close();
		
		}

}