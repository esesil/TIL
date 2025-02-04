package ps5;

// 다음과 같이 import를 사용할 수 있습니다.
import java.util.*;

class Solution5_9 {
	public int solution(int number, int target) {
		int[] dp = new int[10001];
		Queue<Integer> q = new LinkedList<Integer>();
		dp[number] = 1;
		q.add(number);
		while(!q.isEmpty()) {
			int x = q.poll();
			if(x==target)
				break;
			if(x+1<10001 && dp[x+1]==0) {
				dp[x+1] = dp[x]+1;
				q.add(x+1);
			}
			if(x-1>=0 && dp[x-1]==0) {
				dp[x-1] = dp[x]+1;
				q.add(x-1);
			}
			if(x*2>=0 && dp[x*2]==0) {
				dp[x*2] = dp[x]+1;
				q.add(x*2);
			}
		}
		
		int answer = dp[target]-1;
		return answer;
	}

	// 아래는 테스트케이스 출력을 해보기 위한 main 메소드입니다.
	public static void main(String[] args) {
		Solution5_9 sol = new Solution5_9();
		int number1 = 5;
		int target1 = 9;
		int ret1 = sol.solution(number1, target1);

		// [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
		System.out.println("solution 메소드의 반환 값은 " + ret1 + " 입니다.");

		int number2 = 3;
		int target2 = 11;
		int ret2 = sol.solution(number2, target2);

		// [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
		System.out.println("solution 메소드의 반환 값은 " + ret2 + " 입니다.");
	}
}