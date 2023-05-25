import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		Scanner sc = new Scanner(System.in);
		
		/*
		int N = sc.nextInt();
		int M = sc.nextInt();
		int[] arr = new int[N];
		
		for (int i=0; i<N; i++) {
			arr[i] = sc.nextInt();
		}
		
		int minus = M;
		
		for (int i=0; i<N-2; i++) {
			int sum = arr[i]+arr[i+1]+arr[i+2];
			if (sum<M && sum==M && sum>minus) {
				minus = sum;
			}
		}
		
		System.out.println(minus);
		*/
		
		/*
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		char[] arr = new char[M];
		int a=0;
		
		for (int i=0; i<N; i++) {
			int k=0;
			String Castle = sc.next();
			for (int t=0; t<M; t++) {
				char ch = Castle.charAt(t);
				if (ch == 'X') {
					k++;
				}
			}
			if (k==0) {
				a++;
			}
			
		}
		
		System.out.print(a);
		*/
		
		int N = sc.nextInt();
		int m = sc.nextInt();
		int M = sc.nextInt();
		int T = sc.nextInt();
		int R = sc.nextInt();
		
		int min = 0;
		int mak = m;
		int exr = 0;
		
		if (mak+T>M) {
			System.out.println("-1");
		}
		else {
			while (true) {
				if (mak+T<M || mak+T==M) {
					min++;
					exr++;
					mak = mak+T;
				}
				else if (mak+T>M) {
					min++;
					mak = mak-R;
					if (mak<m) {
						mak = m;
					}
				}
				if (exr==N) {
					System.out.println(min);
					break;
				}
			}
		}
		
		sc.close();
		
		}
	
}