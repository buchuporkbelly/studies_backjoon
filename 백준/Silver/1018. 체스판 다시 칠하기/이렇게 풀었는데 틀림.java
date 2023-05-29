import java.util.Scanner;

public class Backjun_draft {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		Scanner sc = new Scanner(System.in);
		
		int M = sc.nextInt();
		int N = sc.nextInt();
		
		char[] w = {'W','B','W','B','W','B','W','B'};
		char[] b = {'B','W','B','W','B','W','B','W'};
		
		char[][] input = new char[M][N];
		
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
		int[] arr = new int[(M-7)*(N-7)*2];
		
		char[][] chess = new char[8][8];
		char[][] chess_reverse = new char[8][8];
		
		
		while (true) {
			int a=0;

			while (true) {
				int chg = 0;
				int chg_r = 0;
				
				for (int i=a; i<a+8; i++) {
					for (int j=k; j<k+8; j++) {
						chess[i-a][j-k] = input[i][j];
					}
				}
				
				if (chess[0][0]=='W') {
					for (int l=0; l<8; l++) {
						if (l%2==0) {
							for (int z=0; z<8; z++) {
								if (chess[l][z] != w[z])
									chg++;
							}
						}
						else {
							for (int z=0; z<8; z++) {
								if (chess[l][z] != b[z])
									chg++;
							}
						}
					}
				}
				
				else {
					for (int l=0; l<8; l++) {
						if (l%2==0) {
							for (int z=0; z<8; z++) {
								if (chess[l][z] != b[z])
									chg++;
							}
						}
						else {
							for (int z=0; z<8; z++) {
								if (chess[l][z] != w[z])
									chg++;
							}
						}
					}
				}
				
				/*
				for (int l=0; l<8; l++) {
					if (chess[l][0]=='W') {
						for (int z=0; z<8; z++) {
							if (chess[l][z] != w[z])
								chg++;
						}
					}
					else {
						for (int z=0; z<8; z++) {
							if (chess[l][z] != b[z])
								chg++;
						}
					}
				}
				*/
				
				arr[seq] = chg;
				seq++;
				
				for (int i=0; i<8; i++) {
					for (int j=0; j<8; j++) {
						chess_reverse[i][j] = chess[7-i][7-j];
					}
				}
				
				if (chess_reverse[0][0]=='W') {
					for (int l=0; l<8; l++) {
						if (l%2==0) {
							for (int z=0; z<8; z++) {
								if (chess_reverse[l][z] != w[z])
									chg_r++;
							}
						}
						else {
							for (int z=0; z<8; z++) {
								if (chess_reverse[l][z] != b[z])
									chg_r++;
							}
						}
					}
				}
				
				else {
					for (int l=0; l<8; l++) {
						if (l%2==0) {
							for (int z=0; z<8; z++) {
								if (chess_reverse[l][z] != b[z])
									chg_r++;
							}
						}
						else {
							for (int z=0; z<8; z++) {
								if (chess_reverse[l][z] != w[z])
									chg_r++;
							}
						}
					}
				}
				arr[seq] = chg_r;
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
		
		/*
		for (int i=0; i<M-7; i++) {
			for (int j=0; j<N-7; j++) {
				chess = input[i][j];
			}
		}
		*/
		
		
		sc.close();
		
		}
	
}
