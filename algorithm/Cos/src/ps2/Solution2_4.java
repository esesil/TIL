package ps2;

// ������ ���� import�� ����� �� �ֽ��ϴ�.
import java.util.*;

class Solution2_4 {
    public int solution(int[] arr, int K) {    	
    	int answer = 0;
    	int n = arr.length;
    	for(int i=0; i<n; i++) {
    		for(int j=i+1; i<j && j<n; j++) {
    			for(int k=j+1; j<k && k<n; k++) {
    				int sum = arr[i]+arr[j]+arr[k];
    				if(sum%K==0) {
    					answer++;
    				}
    			}
    		}
    	}
        return answer;
    }

    // �Ʒ��� �׽�Ʈ���̽� ����� �غ��� ���� main �޼ҵ��Դϴ�.
    public static void main(String[] args) {
    	Solution2_4 sol = new Solution2_4();
        int[] arr = {1, 2, 3, 4, 5};
        int K = 3;
        int ret = sol.solution(arr, K);


        // [����] ��ư�� ������ ��� ���� �� �� �ֽ��ϴ�.
        System.out.println("solution �޼ҵ��� ��ȯ ���� " + ret + " �Դϴ�.");
    }
}