package ps4;

// 다음과 같이 import를 사용할 수 있습니다.
import java.util.*;

class Solution4_9 {
    public String solution(int hour, int minute) {
        // 여기에 코드를 작성해주세요.
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

    // 아래는 테스트케이스 출력을 해보기 위한 main 메소드입니다.
    public static void main(String[] args) {
    	Solution4_9 sol = new Solution4_9();
        int hour = 2;
        int minute = 50; // 왜 나는 145가 안나오는가 . . ....왜 120이지ㅠㅠ
        String ret = sol.solution(hour, minute);

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + ret + " 입니다.");
    }
}