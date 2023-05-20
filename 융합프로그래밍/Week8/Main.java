package practice_w8;

class ex {
	boolean odd(int a) {
		if (a%2 != 0) 
			return true;
		else 
			return false;
	}
	int min(int[] data) {
		int ans = -1;
		for (int i=0; i<data.length; i++)
			if (ans<data[i])
				ans = data[i];
		return ans;
	}
}

public class Main {
	
	static char next(char c) {
		return (char)(c+1); // (char)c+1 하면 앞의 c만 char이 된다. 그래서 (c+1)로 같이 묶어줘야함
	}
	
	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		
		ex ex = new ex();
		
		// 1번
		int a = 5;
		System.out.print("1번문제= ");
		if (ex.odd(a))
			System.out.println("홀수");
		else
			System.out.println("짝수");
		
		// 2번
		char c = 's';
		c = next(c);
		System.out.println("2번문제= "+ c );
		
		// 3번
		int[] data = {10,5,8,20,7,3,30,25,15};
		System.out.println("3번문제= "+ ex.min(data) );
		
	}

}
// 1번문제= 홀수
// 2번문제= t
// 3번문제= 3