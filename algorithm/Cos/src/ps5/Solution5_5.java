package ps5;

// ������ ���� import�� ����� �� �ֽ��ϴ�.
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
        //�̰� �� ���ƺ���~~~�Ф�
         */
    }

    // �Ʒ��� �׽�Ʈ���̽� ����� �غ��� ���� main �޼ҵ��Դϴ�.
    public static void main(String[] args) {
    	Solution5_5 sol = new Solution5_5();
    	int[] enemies1 = {1, 4, 3};
    	int[] armies1 = {1, 3};
    	int ret1 = sol.solution(enemies1, armies1);

    	// [����] ��ư�� ������ ��� ���� �� �� �ֽ��ϴ�.
    	System.out.println("solution �޼ҵ��� ��ȯ ���� " + ret1 + " �Դϴ�.");

    	int[] enemies2 = {1, 1, 1};
    	int[] armies2 = {1, 2, 3, 4};
    	int ret2 = sol.solution(enemies2, armies2);

    	// [����] ��ư�� ������ ��� ���� �� �� �ֽ��ϴ�.
    	System.out.println("solution �޼ҵ��� ��ȯ ���� " + ret2 + " �Դϴ�.");
    }
}