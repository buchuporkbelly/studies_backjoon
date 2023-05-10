import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		Scanner sc = new Scanner(System.in);
		
		System.out.print(""); // System.out.print(); 이거는 왜 안되냐??
		int num = sc.nextInt();
		
		String space = " ";
		String star = "*";
		
		
		for (int i=0; i<2*num-1; i++) {
			if (i<num) {
				for (int t=0; t<num-(i+1); t++) {
					System.out.print(space);
				}
				for (int c=0; c<2*i+1; c++) {
					System.out.print(star);
				}
				System.out.println(); //
			}
			else {
				for (int t=0; t<(i+1)-num; t++) {
					System.out.print(space);
				}
				for (int c=0; c<2*((2*num-2)-i)+1; c++){
					System.out.print(star);
				}
				System.out.println();
			}
		}
		
		
		
		
		sc.close();
		
		
		
	}

}