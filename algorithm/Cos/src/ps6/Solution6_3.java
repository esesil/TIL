package ps6;

// ������ ���� import�� ����� �� �ֽ��ϴ�.
import java.util.*;

class Solution6_3 {
    public int solution(int[] arr, int K) {
    	 Arrays.sort(arr);
         int answer=Integer.MAX_VALUE;
         for(int i=0; i<arr.length-K; i++){
             answer = Math.min(answer, arr[i+K]-arr[i]);
         }
         return answer;
    }

    // �Ʒ��� �׽�Ʈ���̽� ����� �غ��� ���� main �޼ҵ��Դϴ�.
    public static void main(String[] args) {
    	Solution6_3 sol = new Solution6_3();
    	int[] arr = {9, 11, 9, 6, 4, 19};
    	int K = 4;
    	int ret = sol.solution(arr, K);

    	// [����] ��ư�� ������ ��� ���� �� �� �ֽ��ϴ�.
    	System.out.println("solution �޼ҵ��� ��ȯ ���� " + ret + "�Դϴ�.");
    }
}