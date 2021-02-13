package q1001_1100;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Ch61_70 {
	public static void main(String[] args) {
		// 61
//		Scanner sc = new Scanner(System.in);
//		int a = sc.nextInt(), b=sc.nextInt();
//		sc.close();
//		System.out.println(a|b);
		// 62
//		System.out.println(a^b);
		// 63
//		System.out.println(a>b?a:b);

		// 64
//		Scanner sc = new Scanner(System.in);
//		int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
//		sc.close();
//		System.out.println(a < (b < c ? b : c) ? a : (b < c ? b : c));
		
		//65
//		if(a%2==0) 
//			System.out.println(a);
//		if(b%2==0) 
//			System.out.println(b);
//		if(c%2==0)
//			System.out.println(c);
		
		//66
//		if(a%2==0)
//			System.out.println("even");
//		else
//			System.out.println("odd");
//		if(b%2==0)
//			System.out.println("even");
//		else
//			System.out.println("odd");
//		if(c%2==0)
//			System.out.println("even");
//		else
//			System.out.println("odd");
		
		//67
//		Scanner sc = new Scanner(System.in);
//		int a = sc.nextInt();
//		sc.close();
//		if(a%2==0) {
//			System.out.println("even");
//			if(a>0)
//				System.out.println("plus");
//			else
//				System.out.println("minus");
//		} else {
//			System.out.println("odd");
//			if(a>0)
//				System.out.println("plus");
//			else
//				System.out.println("minus");
//		}
		
		//68
//		if(a>=90)
//			System.out.println("A");
//		else if(a>=70)
//			System.out.println("B");
//		else if(a>=40)
//			System.out.println("C");
//		else
//			System.out.println("D");
		
//		switch(a / 10) {
//		case 10:
//		case 9:
//			System.out.println("A");
//			break;
//		case 8:
//		case 7:
//			System.out.println("B");
//			break;
//		case 6:
//		case 5:
//		case 4:
//			System.out.println("C");
//			break;
//		default:
//			System.out.println("D");
//		}
		
		//69
//		Scanner sc = new Scanner(System.in);
//		char a = sc.nextLine().charAt(0);
//		sc.close();
//		
//		switch(a) {
//		case 'A' :
//			System.out.println("best!!!");
//			break;
//		case 'B' : 
//			System.out.println("good!!");
//			break;
//		case 'C' :
//			System.out.println("run!");
//			break;
//		case 'D' : 
//			System.out.println("slowly~");
//			break;
//		default :
//			System.out.println("what?");
//		}
		
		//70
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		sc.close();
		if(a>12) {
		System.out.println("1~12까지 입력 가능합니다");
		return;
		}
		switch(a) {
		case 3:
		case 4:
		case 5:
			System.out.println("spring");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println("summer");
			break;
		case 9:
		case 10:
		case 11:
			System.out.println("fall");
			break;
		default:
			System.out.println("winter");
		}
	}
}
