package practice_w11;

import java.util.Scanner;

public class Main_King {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		Scanner sc = new Scanner(System.in);
		
//		String name = null;
//		int order = 0;
		int i = 0;
		
//		King King = new King(name, order); 
		// 여기서 이미 King 객체가 생겨버림. King 은 (null, 0)이 고정임.
		// 자. 코딩은 위에서 아래로 실행되는 놈임. while을 했다고 지금 새로운 King 객체가 생기는게 아님.
		// 그냥 name과 order에 새로운 값이 할당만 되고 끝인거임. 새로운 King 객체를 만드는게 아니라 이미 반복문 실행전에 null,0의 객체를 만들고 그 코드는 '끝'난거임.
		// 그래서 자꾸 인풋 1 하고 이름과 순서 할당해주고 인풋 2 했을때 자꾸 조선0대왕 null이 나온거임
		// case 1 코드에서 king[i] = King 코드 때문임. 이미 만들어진 King (null, 0) 객체가 그냥 계속 반복적으로
		// 객체 배열에 할당되고 있었던 거임.
		// 따라서 새로운 객체 생성을 스위치문 안에 넣어서 반복문 반복될때마다
		// 새로운 King 객체를 만들어야하고, 그 객체를 배열에 할당해야됨. - case1안에 new King 코드를 넣어야함.
		// 그리고 get set는 항상 필요한게 아님. private 값을 밖에서 사용하고 싶을때 사용하는거임.
		
		King king[] = new King[30];
		
		System.out.println("[ menu ]");
		System.out.println("0 : exit");
		System.out.println("1 : input (King Info.)");
		System.out.println("2 : show (King List)");
		System.out.println("3 : menu");
		
		while (true) {
			System.out.println();
			System.out.print("> ");
			int input = sc.nextInt();
			switch (input) {
				case 1:
					System.out.print("왕의 이름 > ");
					String name = sc.next();
					System.out.print("왕의 순서 > ");
					int order = sc.nextInt();
					king[i] = new King(name, order);
					i++;
					break;
				case 2:
					for (int k=0; k<i; k++) {
						king[k].show(); // 진짜 이거 그냥 아무 생각없이 i 넣지 마라. k임 k k k k  k kkkkkkk
					}
					break;
				case 3:
					System.out.println("[ menu ]");
					System.out.println("0 : exit");
					System.out.println("1 : input (King Info.)");
					System.out.println("2 : show (King List)");
					System.out.println("3 : menu");
					break;
			}
			if (input==0) {
				System.out.println("exit");
				break;
			}
		}
		
		sc.close();
	}

}
