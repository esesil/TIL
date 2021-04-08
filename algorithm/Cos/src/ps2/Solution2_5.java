package ps2;

// 다음과 같이 import를 사용할 수 있습니다.
import java.util.*;

class Solution2_5 {
    public int solution(int[] arr) {
    	int n = arr.length;
    	int d[] = new int[n];
    	d[0] = 1;
    	for(int i = 0; i < n; ++i) //초기화 잊지말자
             d[i] = 1;
//    	if(n>=2) {
//    		if(arr[0]>arr[1])
//    			d[1] = 1;
//    		else
//    			d[1] = 2;
//    	}
    	for(int i=1; i<n; i++) {
    		if(arr[i] > arr[i-1]) {
    			d[i] = d[i-1]+1;
    		}
    	}
    	int answer = 0;
    	for(int i=0; i<n; i++) {
    		if(answer < d[i])
    			answer = d[i];
    	}
        return answer;
    }

    // 아래는 테스트케이스 출력을 해보기 위한 main 메소드입니다.
    public static void main(String[] args) {
    	Solution2_5 sol = new Solution2_5();
        int[] arr = {3, 1, 2, 4, 5, 1, 2, 2, 3, 4};
        int ret = sol.solution(arr);

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + ret + " 입니다.");
    }
}