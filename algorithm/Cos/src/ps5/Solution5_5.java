package ps5;

// 다음과 같이 import를 사용할 수 있습니다.
import java.util.*;

class Solution5_5 {
    public int solution(int[] enemies, int[] armies) {
    int answer = 0;
    Arrays.sort(enemies);
    Arrays.sort(armies);
    boolean[] check = new boolean[armies.length];
    	for(int i=0; i<enemies.length; i++) {
    	   for(int j=0; j<armies.length; j++) {
    		   if(check[j]==true)
    			   continue;
    		   if(enemies[i]<=armies[j]) {
    			   check[j]=true;
    			   answer++;
    			   break;
    		   }
    	   }
       }
    	
        return answer;
        /*
         Arrays.sort(enemies);
        Arrays.sort(armies);
        int i = 0, j = 0;
        while(i < enemies.length && j < armies.length) {
        	if(enemies[i] <= armies[j]) {
        		answer++;
        		i++;
        		j++;
        	} else {
        		j++;
        	}
        }
        //이게 더 좋아보여~~~ㅠㅠ
         */
    }

    // 아래는 테스트케이스 출력을 해보기 위한 main 메소드입니다.
    public static void main(String[] args) {
    	Solution5_5 sol = new Solution5_5();
    	int[] enemies1 = {1, 4, 3};
    	int[] armies1 = {1, 3};
    	int ret1 = sol.solution(enemies1, armies1);

    	// [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
    	System.out.println("solution 메소드의 반환 값은 " + ret1 + " 입니다.");

    	int[] enemies2 = {1, 1, 1};
    	int[] armies2 = {1, 2, 3, 4};
    	int ret2 = sol.solution(enemies2, armies2);

    	// [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
    	System.out.println("solution 메소드의 반환 값은 " + ret2 + " 입니다.");
    }
}