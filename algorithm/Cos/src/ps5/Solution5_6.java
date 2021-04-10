package ps5;

// ������ ���� import�� ����� �� �ֽ��ϴ�.
import java.util.*;

class Solution5_6 {	
    public String solution(String s1, String s2, int p, int q) {
        String answer = "";
        int a = Integer.parseInt(s1, p);
        int b = Integer.parseInt(s2, p);
        int c = a+b;
        
        while(c>0) {
        	int r = c%q;
        	answer+=r;
        	c /= q;
        }
        answer = new StringBuilder(answer).reverse().toString();
        return answer;
    }
    
    // �Ʒ��� �׽�Ʈ���̽� ����� �غ��� ���� main �޼ҵ��Դϴ�.	
    public static void main(String[] args) {
    	Solution5_6 sol = new Solution5_6();
    	String s1 = new String("112001");
        String s2 = new String("12010");
        int p = 3;
        int q = 8;
    	String ret = sol.solution(s1, s2, p, q);
    	
        // [����] ��ư�� ������ ��� ���� �� �� �ֽ��ϴ�.
        System.out.println("solution �޼ҵ��� ��ȯ ���� " + ret + " �Դϴ�.");
   }
}