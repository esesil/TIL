package ps5;

// 다음과 같이 import를 사용할 수 있습니다.
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
    
    // 아래는 테스트케이스 출력을 해보기 위한 main 메소드입니다.	
    public static void main(String[] args) {
    	Solution5_6 sol = new Solution5_6();
    	String s1 = new String("112001");
        String s2 = new String("12010");
        int p = 3;
        int q = 8;
    	String ret = sol.solution(s1, s2, p, q);
    	
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + ret + " 입니다.");
   }
}