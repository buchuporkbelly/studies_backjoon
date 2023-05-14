import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		Scanner sc = new Scanner(System.in);
		
		String sen = sc.nextLine();
		
		String ssen[] = sen.split(" ");
		
		int count = 0;
		
		for (int i=0; i<ssen.length; i++) {
//			System.out.println(ssen[i]);
			if (ssen[i] != "") { // 왜 " "가 아니지? 'hi   hi'로 해봐
				count++;
			}
		}
		
		System.out.println(count);

	    sc.close();
	}

}
