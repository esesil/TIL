package ps4;

// 다음과 같이 import를 사용할 수 있습니다.
import java.util.*;

class Solution4_10 {
    public int solution(int a, int b) {
    	int answer = 0;
    	boolean[] check = new boolean[b+1];
    	for(int i=2; i<=b; i++) {
    		if(check[i]==false) {
    			//제곱수, 세제곱수 구하기
    			if(i*i>=a && i*i<=b) {
    				answer++;
    			}
    			if(i*i*i>=a && i*i*i<=b) {
    				answer++;
    			}
    			//소수구하기
    			for(int j=i*i; j<=b; j+=i) {
    				check[j] = true;
    			}
    		}
    	}
        return answer;
    }

    // 아래는 테스트케이스 출력을 해보기 위한 main 메소드입니다.
    public static void main(String[] args){
    	Solution4_10 sol = new Solution4_10();
        int a = 6;
        int b = 30;
        int ret = sol.solution(a, b);

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + ret + " 입니다.");
    }
}