import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		Scanner sc = new Scanner(System.in);
		
		int test = sc.nextInt();
		int arr[] = new int[test];
		
		for (int i=0; i<test; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			arr[i] = a+b;
		}
		
		for (int i=0; i<test; i++) {
			System.out.println("Case #"+(i+1)+": "+arr[i]);
		} 
		
		sc.close();
	}

}