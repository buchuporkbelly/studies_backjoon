package practice_w8;

import java.util.Scanner;

public class slide_41 {
	
	static void printCharArray(char[] arr) {
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]);
		}
		System.out.println();
	}
	
	static void replaceSpace(char[] arr) {
		for (int i=0; i<arr.length; i++) {
			if (arr[i]==' ') {
				arr[i] = ',';
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		Scanner sc = new Scanner(System.in);
		System.out.print("sentance? > ");
		String sen = sc.nextLine();
		
//		String sen = "This is a pencil";
//		
//
		char arr[] = new char[sen.length()];
		for (int i=0; i<sen.length(); i++) {
			arr[i] = sen.charAt(i);
		}
		
//		char arr[] = {'T','h','i','s',' ' ...} 도 가능
		
		printCharArray(arr);
		replaceSpace(arr);
		printCharArray(arr);
		
		sc.close();
		
	}

}


/*
char[] 배열을 전달받아 출력하는 printCharArray() 메소드와 배열 속의 공백(' ') 문자를 
','로 대치하는 replaceSpace() 메소드를 작성하라.

This is a pencil.
This,is,a,pencil.
*/