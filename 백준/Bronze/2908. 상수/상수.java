import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		String[] a = Integer.toString(A).split("");
		String[] b = Integer.toString(B).split("");

		for (int i=0; i<a.length/2; i++) { // 나이거 (a.length/2)-1로 했냐??? 왜???
			String s1 = a[i];
			a[i] = a[a.length-1-i]; // 배열 저장공간이라서 되는 거임. charAt()가 안된건 이거는 그냥 값 자체라서 그럼.
			a[a.length-1-i] = s1;	// 변수나 배열처럼 저장공간이 아니라서 그럼.
			
			String s2 = b[i];
			b[i] = b[b.length-1-i];
			b[b.length-1-i] = s2;
		}
		
		String aa = "";
		String bb = "";
		String text = "";
		
		// concat 할때 새로운 변수에다가 concat 하고 그거를 출력해야함.
		
		for (int i=0; i<a.length; i++) {
			aa = aa.concat(a[i]);
			bb = bb.concat(b[i]);
		}

		int AA = Integer.parseInt(aa);
		int BB = Integer.parseInt(bb);
		
		if (AA > BB) {
			System.out.println(AA);
		}
		else {
			System.out.println(BB);
		}
		
		sc.close();
		
	}

}
