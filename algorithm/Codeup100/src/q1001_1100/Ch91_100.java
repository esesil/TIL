package q1001_1100;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

import javax.annotation.processing.RoundEnvironment;

public class Ch91_100 {
	public static void main(String[] args) throws IOException {
		// 91
//		Scanner sc = new Scanner(System.in);
//		int a = sc.nextInt(), m = sc.nextInt(), d = sc.nextInt(), n = sc.nextInt();
//		int result = 0;
//		sc.close();
//		for(int i=1; i<n; i++) {
//			a = a*m+d;
//		}
//		System.out.println(a);
		// 1 -2 1 8

		// 92
//		Scanner sc = new Scanner(System.in);
//		int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
//		int day = 1;
//		while(day%a!=0||day%b!=0||day%c!=0) {
//			day++;
//		}
//		System.out.println(day);

		// 93
////	10
////	1 3 2 2 5 6 7 4 5 9
//		Scanner sc = new Scanner(System.in);
//		int[] a = new int[sc.nextInt()];
//		int[] b = new int[23];
//		for(int i=0; i<a.length; i++) {
//			a[i] = sc.nextInt();
//			int c = a[i]-1;
//			b[c]++;
//		}
//		sc.close();
//		for(int i=0; i<23; i++) {
//			System.out.print(b[i]+" ");
//		}
//		//93 다른풀이
//		int[] nums = new int[24];
//      for (int i = 0; i < nums.length; i++) {
//          nums[i] = 0;
//      }
//      int n = sc.nextInt();
//      for (int i = 1; i <= n; i++) {
//          int j = sc.nextInt();
//          nums[j] += 1;
//      }
//      for (int i = 1; i < nums.length; i++) {
//          System.out.print(nums[i] + " ");
//      } // 1093

		// 94
//		Scanner sc = new Scanner(System.in);
//		int a = sc.nextInt();
//		int[] b = new int[a];
//		for(int i=0; i<a; i++) {
//			b[i] = sc.nextInt();
//		}
//		for(int i=(a-1); i>=0; i--) {
//			System.out.print(b[i]+" ");
//		}

		// 95
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
		// 방법1
//		List<Integer> list = new ArrayList<Integer>();
//		for(int i=0; i<a; i++) {
//			list.add(sc.nextInt());
//		}
//		sc.close();
//		Collections.sort(list);
//		System.out.println(list.get(0));
		// 방법2 불리는 숫자를 1로 바꾸고 역순으로 출력해서 cnt에 가장 작은 수를 남기는 방법
//		int[] nums = new int[23];
//		int cnt = 0;
//		for(int i=1; i<=n; i++) {
//			int j = sc.nextInt();
//			nums[j]=1;
//		}
//		for(int i=nums.length-1; i>0; i--) {
//			if(nums[i]==1) {
//				cnt = i;
//			}
//		}
//		System.out.println(cnt);

		// 96
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		int[][] baduk = new int[19][19];
//		for(int i=0; i<n; i++) {
//			baduk[sc.nextInt()-1][sc.nextInt()-1] = 1;
//		}
//		for(int i=0; i<baduk.length; i++) {
//			for(int j=0; j<baduk.length; j++)
//			System.out.print(baduk[i][j]);
//		System.out.println("");
//		}
//		sc.close();

		// 97
//		Scanner sc = new Scanner(System.in);
//		int[][] arr = new int[19][19];
//		//바둑판 초기상태 입력받기
//		for(int i=0; i<19; i++) {
//			for(int j=0; j<19; j++)
//				arr[i][j] = sc.nextInt();
//		}
//		//좌표 받기
//		int a = sc.nextInt();
//		for(int i=0; i<a; i++) {
//			int x = sc.nextInt()-1;
//			int y = sc.nextInt()-1;
//			for(int j=0; j<arr.length; j++) {
//				if(arr[x][j]==0) {
//					arr[x][j]=1;
//				} else {
//					arr[x][j]=0;
//				}
//				if(arr[j][y]==0) {
//					arr[j][y]=1;
//				} else {
//					arr[j][y]=0;
//				}
//			}
//		}
//		
//		//출력
//		for(int i=0; i<19; i++) {
//			for(int j=0; j<19; j++)
//				System.out.print(arr[i][j]);
//		System.out.println("");
//		}

		// 98 영일이가 싫다
//		Scanner sc = new Scanner(System.in);
//		int h = sc.nextInt(), w = sc.nextInt();
//		int[][] arr = new int[w][h];
//		int n = sc.nextInt();
//		for (int i = 0; i < n; i++) {
//			int l = sc.nextInt(), d = sc.nextInt(), x = sc.nextInt(), y = sc.nextInt();
//			if(d==0) {
//				for(int j=0; j<l; j++)
//					arr[x-1][y++-1]=1;
//			} else {
//				for(int j=0; j<l; j++)
//					arr[x++-1][y-1]=1;
//			}
//		}
//		
//		//출력
//		for(int i=0; i<arr.length; i++) {
//			for(int j=0; j<arr.length; j++)
//				System.out.print(arr[i][j]);
//		System.out.println("");
//		}
		
		// 99 성실한 개미
		Scanner sc = new Scanner(System.in);
		int[][] arr = new int[10][10];
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr.length; j++)
				arr[i][j] = sc.nextInt();
		}
		sc.close();
		
		int x = 1;
		int y = 1;
		// 1,1에서 스타트, 오른쪽 이동 y축+1
		while(true) {
			arr[1][1]=9;
			if(arr[x][y+1]==2){
				arr[x][y+1]=9;
				break;
			} else if(arr[x+1][y]==2) {
				arr[x+1][y]=9;
				break;
			} else if(arr[x][y+1]==0) {
				arr[x][y+1]=9;
				y++;
			} else {
				arr[x+1][y]=9;
				x++;
			}
		}
		
		//더 깔끔한 풀이
//      int ant = 9, end = 0;
//      int x = 1, y = 1;
//      for (int i = 0; i < arr.length; i++) {
//          for (int j = 0; j < arr.length; j++) {
//              arr[i][j] = sc.nextInt();
//          }
//      }
//      while (end == 0) {
//          if (arr[x][y] == 2) { // 먹이 발견
//              arr[x][y] = ant;
//              end = 1;
//          }
//          else {
//              arr[x][y] = ant;
//              if (arr[x][y + 1] == 0) // 오른쪽 뚫림
//                  y++;
//              else if (arr[x][y + 1] == 1) { // 오른쪽 막힘
//                  if (arr[x + 1][y] == 1) // 아래도 막힘
//                      end = 1;
//                  else
//                      x++;
//              }
//          }
//      }
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr.length; j++)
				System.out.print(arr[i][j]);
		System.out.println("");
		}
		
	}
}
