package q1001_1100;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Ch21_30 {
	public static void main(String[] args) {
		//21 자바는 스트링 있으니까 char data[51] 이따위짓 안해도 되는것 아닙니까?ㅠ 50자이하일 필요도 없..잖아?
//		Scanner sc = new Scanner(System.in);
//		String a = sc.nextLine();
//		System.out.println(a);
//		sc.close();
		
		//22 자바라서 넘나 간단
		//방법1
//		Scanner sc = new Scanner(System.in);
//		String word = sc.nextLine();
		//방법2
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		String word;
//		try {
//			word = br.readLine();
//			System.out.println(word);
//			//BufferedReader가 Scanner보다 빠르다~ 대신 문자열만 입력 가능하대
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
		//sc.close();
		
		//23
//		Scanner sc = new Scanner(System.in);
//		String data = sc.nextLine();
		//방법1
//		int data1 = (int)data;
//		double data2 = data - data1;
//		System.out.println(data1+"\n"+data2);
		//방법2
//		StringTokenizer st = new StringTokenizer(data,".");
//		String[] arr = new String[2];
//		int i=0;
//		while(st.hasMoreTokens()) {
//			arr[i] = st.nextToken();
//			i++;
//		}
//		System.out.println(arr[0]+" "+arr[1]);
		
		//24
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		try {
//			String a = br.readLine();
//			//내가 푼 방법
////			for(int i=0; i<a.length(); i++) {
////				String b = a.substring(i,i+1);
////				System.out.println(b);
////			}
//			//방법2
//			for(int i=0; i<a.length(); i++)
//				System.out.println(a.charAt(i));
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
		
		//25
//		Scanner sc = new Scanner(System.in);
//		String num = sc.nextLine();
		//다섯자리수란걸 망각하고 입력받는 자릿수인줄 알고 풀었던 내 풀이1
//		int[] num1 = new int[num.length()];
//		for(int i=0; i<num.length(); i++) {
//			num1[i] = num.charAt(i)-48;
//			int a = (int) Math.pow(10,(num.length()-(i+1)));
//			System.out.println(num1[i]);
//			System.out.println(num1[i]*a);
//		}
//		System.out.println();
		//sc.close();
		//방법2
//		int data = sc.nextInt();
//		System.out.println("["+(data/10000%10)*10000+"]\n"+(data/1000%10)*1000+"\n"+(data/100%10)*100+"\n"+(data/10%10)*10+"\n"+(data%10));

		//26
//		Scanner sc = new Scanner(System.in);
//		String a = sc.nextLine();
//		String[] b = a.split(":");
//		System.out.println(b[1]);
//		sc.close();
		
		//27
//		Scanner sc = new Scanner(System.in);
//		String str = sc.nextLine();
//		StringTokenizer st = new StringTokenizer(str,".");
//		int i = 0;
//		int[] time = new int[3];
//		while(st.hasMoreTokens()) {
//			time[i] = Integer.parseInt(st.nextToken());
//			i++;
//		}
//		System.out.printf("%02d-%02d-%04d",time[2],time[1],time[0]);
//		sc.close();
		
		//28
//		Scanner sc = new Scanner(System.in);
//		long a = sc.nextLong();
//		System.out.println(a);
//		sc.close();
		
		//29
//		Scanner sc = new Scanner(System.in);
//		double a = sc.nextDouble();
//		System.out.println(String.format("%.11f", a));
//		sc.close();
		
		//30
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		sc.close();
		System.out.println(a);
	}
}
