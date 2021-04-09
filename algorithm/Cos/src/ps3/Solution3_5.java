package ps3;

// 다음과 같이 import를 사용할 수 있습니다.
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
        
        /* 답안
        String answer = "";
        String display = "";
        display = "______________" + phrases; //먼저 더해놓고
        for(int i = 0; i < second; ++i) {
        	display = display + Character.toString(display.charAt(0)); //뒤에 맨앞위치 추가
        	display = display.substring(1); //뒤에 하나 추가했으니 앞에서 빼주기
        }
        answer = display.substring(0,14);
        return answer;
         */
    }
    
    // 아래는 테스트케이스 출력을 해보기 위한 main 메소드입니다.
    public static void main(String[] args) {
    	Solution3_5 sol = new Solution3_5();
        String phrases = new String("happy-birthday");
        int second = 15;
        String ret = sol.solution(phrases, second);
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + ret + " 입니다.");
    }
}