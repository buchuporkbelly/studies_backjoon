import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		Scanner sc = new Scanner(System.in);
		
		int M = sc.nextInt();
		int N = sc.nextInt();
		
		char[][] input = new char[M][N];
		char[][] chess = new char[8][8];
		
		char[][] W = new char[8][8];
		char[][] B = new char[8][8];
		
		char[] w = {'W','B','W','B','W','B','W','B'};
		char[] b = {'B','W','B','W','B','W','B','W'};
		
		for (int i=0; i<8; i++) {
			if (i%2==0) {
				W[i] = w;
				B[i] = b;
			}
			else {
				W[i] = b;
				B[i] = w;
			}
		}
		
		for (int i=0; i<M; i++) {
			String str = sc.next();
			char[] line = new char[N];
			for (int k=0; k<N; k++) {
				line[k] = str.charAt(k);
			}
			input[i] = line;
		}
		
		int k=0;
		int seq =0;
		int[] arr = new int[(M-7)*(N-7)];

		
		while (true) {
			int a=0;

			while (true) {
				int chg = 0;
				int chg_r = 0;
				int w_apd = 0;
				
				for (int i=a; i<a+8; i++) {
					for (int j=k; j<k+8; j++) {
						chess[i-a][j-k] = input[i][j];
					}
				}
				
				for (int l=0; l<8; l++) {
					for (int z=0; z<8; z++) {
						if (chess[l][z] != W[l][z]) {
							chg++;
						}
					}
				}
				for (int l=0; l<8; l++) {
					for (int z=0; z<8; z++) {
						if (chess[l][z] != B[l][z]) {
							chg_r++;
						}
					}
				}
				
				if (chg > chg_r) {
					w_apd = chg_r;
				}
				else if (chg < chg_r) {
					w_apd = chg;
				}
				else {
					w_apd = chg;
				}
				
				arr[seq] = w_apd;
				seq++;

				a++;
				
				if (a==(M-7)) {
					break;
				}
			}
			k++;
			if (k==(N-7)) {
				break;
			}
		}
		
		int full=64;
		
		for (int i=0; i<arr.length; i++) {
			if (full>arr[i]) {
				full = arr[i];
			}
		}
		
		System.out.println(full);
		
		sc.close();
		
	}
}