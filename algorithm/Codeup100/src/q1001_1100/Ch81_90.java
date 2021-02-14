package q1001_1100;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;
import java.util.StringTokenizer;

import javax.annotation.processing.RoundEnvironment;

public class Ch81_90 {
	public static void main(String[] args) throws IOException {
		// 81
//		Scanner sc = new Scanner(System.in);
//		int a = sc.nextInt(), b=sc.nextInt();
//		for(int i=1; i<=a; i++) {
//			for(int j=1; j<=b; j++) {
//				System.out.println(i+" "+j);
//			}
//		}

		// 82
//		Scanner sc = new Scanner(System.in);
//		int a = sc.nextInt(16);
//		for(int i=1; i<16; i++) {
//			System.out.printf("%X*%X=%X\n",a,i,a*i);
//		}

		// 83
//		Scanner sc = new Scanner(System.in);
//		int a = sc.nextInt();
//		for(int i=1; i<=a; i++) {
//			if(i%3==0) {
//				System.out.print("X ");
//			} else {
//				System.out.print(i+" ");
//			}
//		}

		// ★84
//		Scanner sc = new Scanner(System.in);
//		int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
//		sc.close();
//		
//		//속도를 위해 BufferedWriter 사용
//		BufferedWriter bf = new BufferedWriter(new OutputStreamWriter(System.out));
//		for (int i = 0; i < a; i++) {
//			for (int j = 0; j < b; j++) {
//				for (int l = 0; l<c; l++) {
//					String st = i+" "+j+" "+l;
//					bf.write(st+"\n");
//				}
//			}
//		}
//		//System.out.println(a*b*c);
//		bf.write(Integer.toString(a*b*c));
//		bf.close();

		// 85
//		Scanner sc = new Scanner(System.in);
//		int h = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt(), s = sc.nextInt();
//		sc.close();
//		double cal = Math.pow(2, 23);
//		double total = h*b*c*s;
//		double result = total / cal;
//		System.out.printf("%.1f MB",result);

		// 86
		// 1024 768 24
//		Scanner sc = new Scanner(System.in);
//		int w = sc.nextInt(), h = sc.nextInt(), b = sc.nextInt();
//		sc.close();
//		if (w <= 1024 && h <= 1024 && b % 4 == 0 && b <= 40) {
//			int total = w * h *b;
//			double calc = Math.pow(2, 23);
//			System.out.printf("%.2f MB",total/calc);
//		}
		
		
		//87
//		Scanner sc = new Scanner(System.in);
//		int num = sc.nextInt();
//		int i = 1;
//		int sum = 0;
//		while(true) {
//			sum += i;
//			i++;
//			if(num<=sum) {
//				break;
//			}
//		}
//		System.out.println(sum);
		
		// 88
//		Scanner sc = new Scanner(System.in);
//		int num = sc.nextInt();
//		sc.close();
//		for(int i=1; i<=num; i++) {
//			if(i%3==0)
//				continue;
//			System.out.print(i+" ");
//		}
		
		// 89
//		Scanner sc = new Scanner(System.in);
//		int a = sc.nextInt(), d = sc.nextInt(), n = sc.nextInt();
//		sc.close();
//		int result = a+(d*(n-1));
//		System.out.println(result);
		
		// 90
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt(), r = sc.nextInt(), n = sc.nextInt();
		sc.close();
		int i = 1;
		while(i<n) {
			a *= r;
			i++;
		}
		System.out.println(a);
	}
}
