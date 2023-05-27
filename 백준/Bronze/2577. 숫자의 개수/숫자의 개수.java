import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		
		int d = A*B*C;
		String D = Integer.toString(d);
		
		int[] arr = new int[10];
		
		for (int i=0; i<D.length(); i++) {
			int k = Integer.parseInt(String.valueOf(D.charAt(i)));
			arr[k]++;
		}
		
		for (int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		sc.close();
		
		}
	
}