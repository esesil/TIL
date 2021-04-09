package ps4;

// ������ ���� import�� ����� �� �ֽ��ϴ�.
import java.util.*;

class Solution4_10 {
    public int solution(int a, int b) {
    	int answer = 0;
    	boolean[] check = new boolean[b+1];
    	for(int i=2; i<=b; i++) {
    		if(check[i]==false) {
    			//������, �������� ���ϱ�
    			if(i*i>=a && i*i<=b) {
    				answer++;
    			}
    			if(i*i*i>=a && i*i*i<=b) {
    				answer++;
    			}
    			//�Ҽ����ϱ�
    			for(int j=i*i; j<=b; j+=i) {
    				check[j] = true;
    			}
    		}
    	}
        return answer;
    }

    // �Ʒ��� �׽�Ʈ���̽� ����� �غ��� ���� main �޼ҵ��Դϴ�.
    public static void main(String[] args){
    	Solution4_10 sol = new Solution4_10();
        int a = 6;
        int b = 30;
        int ret = sol.solution(a, b);

        // [����] ��ư�� ������ ��� ���� �� �� �ֽ��ϴ�.
        System.out.println("solution �޼ҵ��� ��ȯ ���� " + ret + " �Դϴ�.");
    }
}