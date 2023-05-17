import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		Scanner sc = new Scanner(System.in);
		
		int hour = sc.nextInt();
		int min = sc.nextInt();
		int time = sc.nextInt();
		
		int total = hour*60+min+time;
		
		int ph = (total / 60) % 24;
		int pm = total % 60;
		
		System.out.print(ph+" "+pm);
		
		sc.close();
	}

}