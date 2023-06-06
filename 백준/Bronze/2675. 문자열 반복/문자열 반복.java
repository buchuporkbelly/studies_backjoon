import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		String[] arr = new String[T];
		
		for (int i=0; i<T; i++) {
			arr[i] = "";
			int R = sc.nextInt();
			String S = sc.next();
			String[] SS = S.split("");
			for (int k=0; k<SS.length; k++) {
				for (int a=0; a<R; a++) {
					arr[i] = arr[i].concat(SS[k]);
				}
			}
		}
		
		for (int i=0; i<T; i++) {
			System.out.println(arr[i]);
		}
		
		sc.close();
		
	}

}
