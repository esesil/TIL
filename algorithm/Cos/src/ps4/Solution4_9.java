package ps4;

// ������ ���� import�� ����� �� �ֽ��ϴ�.
import java.util.*;

class Solution4_9 {
    public String solution(int hour, int minute) {
        // ���⿡ �ڵ带 �ۼ����ּ���.
    	double hr = (360/12)*hour + (360/12/60)*minute;
    	double mr = (360/60)*minute;
    	double ans = 0;
    	ans = Math.abs(hr-mr);
    	if(ans>180)
    		ans = 360-ans;
    	String answer = "";
    	answer += ans;
        return answer;
    }

    // �Ʒ��� �׽�Ʈ���̽� ����� �غ��� ���� main �޼ҵ��Դϴ�.
    public static void main(String[] args) {
    	Solution4_9 sol = new Solution4_9();
        int hour = 2;
        int minute = 50; // �� ���� 145�� �ȳ����°� . . ....�� 120�����Ф�
        String ret = sol.solution(hour, minute);

        // [����] ��ư�� ������ ��� ���� �� �� �ֽ��ϴ�.
        System.out.println("solution �޼ҵ��� ��ȯ ���� " + ret + " �Դϴ�.");
    }
}