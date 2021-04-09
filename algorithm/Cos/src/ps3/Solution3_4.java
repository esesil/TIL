package ps3;

// 다음과 같이 import를 사용할 수 있습니다.
import java.util.*;

class Solution3_4 {
    public int solution(String s1, String s2) {
    	int len1 = s1.length();
    	int len2 = s2.length();
    	int count = 1;
    	String answer1 = "";
    	String answer2 = "";
    	for(int i=1; i<len1; i++) {
    		String a = s1.substring(0, i);
    		String b = s2.substring(len2-i,len2);
    		if(a.equals(b)) {
    			answer1 = s2 + s1.substring(i, len1);
    			break;
    		}
    	}
    	for(int i=1; i<len2; i++) {
    		String b = s1.substring(len1-i,len1);
    		String a = s2.substring(0, i);
    		if(a.equals(b)) {
    			answer2 = s1 + s2.substring(i, len2);
    			break;
    		}
    	}
    	if(answer1.length()>answer2.length()) {
    		return answer2.length();
    	}    	
    	return answer1.length();
    }
    
    // 아래는 테스트케이스 출력을 해보기 위한 main 메소드입니다.
    public static void main(String[] args) {
    	Solution3_4 sol = new Solution3_4();
        String s1 = new String("ababc");
        String s2 = new String("abcdab");
        int ret = sol.solution(s1, s2);
        
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + ret + " 입니다.");
    }
}