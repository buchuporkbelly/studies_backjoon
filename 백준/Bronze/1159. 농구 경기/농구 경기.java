import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int[] arr = new int[26];
		
		for (int i=0; i<N; i++) {
			String name = sc.next();
			char ch = name.charAt(0);
			int alp = ch-97;
			arr[alp]++;
		}
		
		int k = 0;
		for (int i=0; i<26; i++) {
			if (arr[i]>=5) {
				System.out.print((char)(i+97));
				k++;
			}
		}
		
		if (k==0) {
			System.out.println("PREDAJA");
		}
		sc.close();
		
		}

}