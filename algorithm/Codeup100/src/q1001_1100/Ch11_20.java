package q1001_1100;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Ch11_20 {
	public static void main(String[] args) {
		//11
		//Scanner sc = new Scanner(System.in);
//		char one = sc.next().charAt(0);
//		System.out.printf("%c",one);
		
		//12
		//Scanner sc = new Scanner(System.in);
//		float a = sc.nextFloat();
//		System.out.printf("%f",a);
//		sc.close();
		
		//13
		//Scanner sc = new Scanner(System.in);
//		int a = sc.nextInt();
//		int b = sc.nextInt();
//		System.out.printf(a+" "+b);
//		sc.close();
		
		//14
//		Scanner sc = new Scanner(System.in);
//		char a = sc.next().charAt(0);
//		char b = sc.next().charAt(0);
//		System.out.println(b+" "+a);
//		sc.close();
		
		//15
//		Scanner sc = new Scanner(System.in);
//		float a = sc.nextFloat();
//		System.out.printf("%.2f",a);
//		sc.close();
		
		//17
//		Scanner sc = new Scanner(System.in);
//		int a = sc.nextInt();
//		System.out.println(a+" "+a+" "+a);
//		sc.close();
		
		//18
//		Scanner sc = new Scanner(System.in);
//		String a = sc.nextLine();
//		String[] b = a.split(":");
//		System.out.printf("%s:%s", b[0], b[1]);
//		sc.close();
		//c에서는 한꺼번에 출력이 안되나...? 자바에선 굳이 이럴필요 없을거 같기는 함...
		
		//19
//		Scanner sc = new Scanner(System.in);
//		String a = sc.nextLine();	
//		
//		//방법1
//		String[] b = a.split("\\.");
//		int[] c = new int [b.length];
//		
//		for(int i=0;i<b.length;i++)
//			c[i] = Integer.parseInt(b[i]);
//		System.out.printf("%04d.%02d.%02d",c[0],c[1],c[2]);
//		
//		//방법2
//		StringTokenizer token = new StringTokenizer(a, ".");
//		int [] arr = new int[3];
//		int i = 0;
//		while(token.hasMoreTokens()) {
//			arr[i] = Integer.parseInt(token.nextToken());
//			i+=1;
//		}
//		System.out.printf("%04d.%02d.%02d", arr[0],arr[1],arr[2]);
//		
//		sc.close();
		
		//20
		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();
		System.out.println(a.substring(0,6)+a.substring(7));
		sc.close();
	}
}
