package ps2;

// ������ ���� import�� ����� �� �ֽ��ϴ�.
import java.util.*;

class Solution2_6 {
    public int[] solution(String commands) {
        int[] answer = {0,0};
        for(int i=0; i<commands.length(); i++) {
        	if(commands.charAt(i)=='U') {
        		answer[1] += 1;
        	}
        	else if(commands.charAt(i)=='D') {
        		answer[1] -= 1;
        	}
        	else if(commands.charAt(i)=='L') {
        		answer[0] -= 1;
        	}
        	else if(commands.charAt(i)=='R') {
        		answer[0] += 1;
        	}
        }
        return answer;
    }

    // �Ʒ��� �׽�Ʈ���̽� ����� �غ��� ���� main �޼ҵ��Դϴ�.
    public static void main(String[] args) {
    	Solution2_6 sol = new Solution2_6();
        String commands = "URDDL";
        int[] ret = sol.solution(commands);

        // [����] ��ư�� ������ ��� ���� �� �� �ֽ��ϴ�.
        System.out.println("solution �޼ҵ��� ��ȯ ���� " + Arrays.toString(ret) + " �Դϴ�.");
    }
}