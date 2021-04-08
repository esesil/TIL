package ps2;

// ������ ���� import�� ����� �� �ֽ��ϴ�.
import java.util.*;

class Solution2_5 {
    public int solution(int[] arr) {
    	int n = arr.length;
    	int d[] = new int[n];
    	d[0] = 1;
    	for(int i = 0; i < n; ++i) //�ʱ�ȭ ��������
             d[i] = 1;
//    	if(n>=2) {
//    		if(arr[0]>arr[1])
//    			d[1] = 1;
//    		else
//    			d[1] = 2;
//    	}
    	for(int i=1; i<n; i++) {
    		if(arr[i] > arr[i-1]) {
    			d[i] = d[i-1]+1;
    		}
    	}
    	int answer = 0;
    	for(int i=0; i<n; i++) {
    		if(answer < d[i])
    			answer = d[i];
    	}
        return answer;
    }

    // �Ʒ��� �׽�Ʈ���̽� ����� �غ��� ���� main �޼ҵ��Դϴ�.
    public static void main(String[] args) {
    	Solution2_5 sol = new Solution2_5();
        int[] arr = {3, 1, 2, 4, 5, 1, 2, 2, 3, 4};
        int ret = sol.solution(arr);

        // [����] ��ư�� ������ ��� ���� �� �� �ֽ��ϴ�.
        System.out.println("solution �޼ҵ��� ��ȯ ���� " + ret + " �Դϴ�.");
    }
}