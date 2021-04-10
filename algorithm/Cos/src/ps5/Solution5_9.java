package ps5;

// ������ ���� import�� ����� �� �ֽ��ϴ�.
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

	// �Ʒ��� �׽�Ʈ���̽� ����� �غ��� ���� main �޼ҵ��Դϴ�.
	public static void main(String[] args) {
		Solution5_9 sol = new Solution5_9();
		int number1 = 5;
		int target1 = 9;
		int ret1 = sol.solution(number1, target1);

		// [����] ��ư�� ������ ��� ���� �� �� �ֽ��ϴ�.
		System.out.println("solution �޼ҵ��� ��ȯ ���� " + ret1 + " �Դϴ�.");

		int number2 = 3;
		int target2 = 11;
		int ret2 = sol.solution(number2, target2);

		// [����] ��ư�� ������ ��� ���� �� �� �ֽ��ϴ�.
		System.out.println("solution �޼ҵ��� ��ȯ ���� " + ret2 + " �Դϴ�.");
	}
}