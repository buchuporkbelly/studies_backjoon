import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		Scanner sc = new Scanner(System.in);
		
		int count = sc.nextInt();
		int y = 0;
		int m = 0;
		
		for (int i=0; i<count; i++) {
			int call_time = sc.nextInt();
			int yy = (call_time/30+1)*10;
			int mm = (call_time/60+1)*15;
			
//			if (call_time%30 != 0) {
//				yy += 10;
//			}
//			if (call_time%60 != 0) {
//				mm += 15;
//			}
			y += yy;
			m += mm;
		}
		
		
		if (y>m) {
			System.out.print("M ");
			System.out.println(m);
		}
		else if (y<m) {
			System.out.print("Y ");
			System.out.println(y);
		}
		else {
			System.out.print("Y M ");
			System.out.println(y);
		}
			
		sc.close();
		
		}

}