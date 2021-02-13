package q1001_1100;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Ch71_80 {
	public static void main(String[] args) {
		//71
//		Scanner sc = new Scanner(System.in);
//		int a;
//		while(true) {
//			a = sc.nextInt();
//			if(a!=0) 
//				System.out.println(a);
//			else
//				break;
//		}
//		sc.close();
		
		//72
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		for(int i=0; i<n; i++) {
//			int[] arr = new int[n];
//			arr[i] = sc.nextInt();
//			System.out.println(arr[i]);
//		}
//		sc.close();
		
		//73
//		Scanner sc = new Scanner(System.in);
//		int a;
//		while(true) {
//			a = sc.nextInt();
//			if(a!=0) 
//				System.out.println(a);
//			else
//				break;
//		}
//		sc.close();
		
		//74, 75
//		Scanner sc = new Scanner(System.in);
//		int a = sc.nextInt();
//		while(a>0) {
//			System.out.println(a);
//			a--;
//		}
//		sc.close();
		
		//76
//		Scanner sc = new Scanner(System.in);
//		char a = sc.nextLine().charAt(0);
//		char first = 'a';
//		do {
//			System.out.print(first+" ");
//			first++;
//		} while(a>=first);
//		sc.close();
		
		//77
//		Scanner sc = new Scanner(System.in);
//		int a = sc.nextInt();
//		for(int i=0; i<=a; i++)
//			System.out.println(i);
//		sc.close();
		
		//78
//		Scanner sc = new Scanner(System.in);
//		int a = sc.nextInt();
//		int sum = 0;
//		for(int i=0; i<=a; i++) {
//			if(i%2==0)
//				sum+=i;
//		}
//		System.out.println(sum);
//		sc.close();
		
		//79
//		Scanner sc = new Scanner(System.in);
//		while(true) {
//			String s = sc.nextLine();
//			System.out.print(s);
//			if(s=="q")
//				break;
//		}
//		sc.close();
		
		//80
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		sc.close();
		int sum = 0;
		int i = 1;
		while(true) {
			sum += i;
			if(sum==a)
				break;
			i++;
		}
		System.out.println(i);
	}
}
