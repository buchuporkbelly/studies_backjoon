import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		int[] cards = new int[N];
		
		for (int i=0; i<N; i++) {
			cards[i] = sc.nextInt();
		}
		
		int a=0;
		int dif = 0;
		
		while (true) {
			int b=a+1;
			while (true) {
				int c=b+1; // 이거 a+2 말고 b+1. 왜냐면 b로 해야지 b가 증가하는걸 이용할수 있음.
				for (int i=c; i<N; i++) {
					int sum = cards[a]+cards[b]+cards[i]; // c가 아니라 i
					if ((sum<M || sum==M) && sum>dif) {
						dif = sum;
					}
				}
				if (b==N-2) {
					break;
				}
				b++; // 이게 if 밑에 있어야지 최종 경우도 수행한다. 
					 // 그리고 c++이 아니라 b. 왜냐면 c에 대한 증가는 위의 for 문에서 해결해주고 있음.
			}
			if (a==N-3) {
				break;
			}
			a++; // 이게 if 밑에 있어야지 최종 경우도 수행한다.
		}

		System.out.println(dif);
		
		sc.close();
		
	}
}