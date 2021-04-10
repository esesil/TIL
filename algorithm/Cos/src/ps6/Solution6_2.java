package ps6;

// ������ ���� import�� ����� �� �ֽ��ϴ�.
import java.util.*;

class Solution6_2 {
    public int solution(int K, String[] words) {
        // ���⿡ �ڵ带 �ۼ����ּ���.
        int answer = 1;
        int sum = 0;
        for(int i=0; i<words.length; i++){
            int length = words[i].length();
            if(sum!=0)
                sum++;
            sum += length;
            if(sum > K){
                answer++;
                i--;
                sum = 0;
            }
        }
        
        return answer;
    }

    // �Ʒ��� �׽�Ʈ���̽� ����� �غ��� ���� main �޼ҵ��Դϴ�.
    public static void main(String[] args) {
    	Solution6_2 sol = new Solution6_2();
        int K = 10;
        String[] words = {new String("nice"), new String("happy"), new String("hello"), new String("world"), new String("hi")};
        int ret = sol.solution(K, words);

        // [����] ��ư�� ������ ��� ���� �� �� �ֽ��ϴ�.
        System.out.println("solution �޼��� ��ȯ ���� " + ret + " �Դϴ�.");
    }
}