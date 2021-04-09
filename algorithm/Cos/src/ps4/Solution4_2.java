package ps4;

import java.util.*;

class Solution4_2 {    
    public String solution(String s) {
        s = s.toLowerCase();
        String answer = "";
        char previous = s.charAt(0);
        int counter = 1;
        
        for(int i=1; i<s.length(); i++){
            if(s.charAt(i) == previous)
                counter++;
            else {
                answer += previous;
                answer += counter;
                counter = 1;
                previous = s.charAt(i);
            }
        }
        answer += previous;
        answer += counter;
        return answer;
    }
    
    // �Ʒ��� �׽�Ʈ���̽� ����� �غ��� ���� �ڵ��Դϴ�. �Ʒ����� �߸��� �κ��� ������, ���� �ڵ常 �����ϼ���.
    public static void main(String[] args) {
    	Solution4_2 sol = new Solution4_2();
        String s = new String("YYYYYbbbBbbBBBMmmM");
        String ret = sol.solution(s);
        
        // [����] ��ư�� ������ ��� ���� �� �� �ֽ��ϴ�.
        System.out.println("solution �޼ҵ��� ��ȯ ���� " + ret + " �Դϴ�.");
   }
}