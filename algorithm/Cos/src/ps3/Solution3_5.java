package ps3;

// ������ ���� import�� ����� �� �ֽ��ϴ�.
import java.util.*;

class Solution3_5 {
    public String solution(String phrases, int second) {
        String answer = "";
        second %= 28;
        if(second<=14) {
        	for(int i=0; i<14-second; i++) {
        		answer += "_";
        	}
        	answer += phrases.substring(0, second);
        }
        if(second>14) {
        	answer += phrases.substring(second-14, 14);
        	for(int i=0; i<second-14; i++) {
        		answer+="_";
        	}
        }
        return answer;
        
        /* ���
        String answer = "";
        String display = "";
        display = "______________" + phrases; //���� ���س���
        for(int i = 0; i < second; ++i) {
        	display = display + Character.toString(display.charAt(0)); //�ڿ� �Ǿ���ġ �߰�
        	display = display.substring(1); //�ڿ� �ϳ� �߰������� �տ��� ���ֱ�
        }
        answer = display.substring(0,14);
        return answer;
         */
    }
    
    // �Ʒ��� �׽�Ʈ���̽� ����� �غ��� ���� main �޼ҵ��Դϴ�.
    public static void main(String[] args) {
    	Solution3_5 sol = new Solution3_5();
        String phrases = new String("happy-birthday");
        int second = 15;
        String ret = sol.solution(phrases, second);
        // [����] ��ư�� ������ ��� ���� �� �� �ֽ��ϴ�.
        System.out.println("solution �޼ҵ��� ��ȯ ���� " + ret + " �Դϴ�.");
    }
}