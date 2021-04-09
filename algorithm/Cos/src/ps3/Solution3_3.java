package ps3;

// ������ ���� import�� ����� �� �ֽ��ϴ�.
import java.util.*;

class Solution3_3 {
    public int solution(String[] bishops) {
        int[] dx = {-4,-3,-2,-1,1,2,3,4,-4,-3,-2,-1,1,2,3,4};
        int[] dy = {4,3,2,1,1,2,3,4,-4,-3,-2,-1,-1,-2,-3,-4};
    	int[][] arr = new int[8][8];
        for(int i=0; i<bishops.length; i++) {
        	int a = bishops[i].charAt(0)-'A';
        	int b = bishops[i].charAt(1)-'0'-1;
        	arr[a][b] = 1;
        	for(int j=0; j<16; j++) {
        		if(check(a,b,dx[j],dy[j])) {
        			arr[a+dx[j]][b+dy[j]] = 1;
        		}
        	}
        }
        int answer = 0;
        for(int i=0; i<8; i++) {
        	for(int j=0; j<8; j++) {
        		if(arr[i][j]==0) {
        			answer++;
        		}
        	}
        }
        return answer;
    }

    private boolean check(int a, int b, int i, int j) {
		if(a+i<0 || a+i>=8 || b+j<0 || b+j>=8)
			return false;
		return true;
	}

	// �Ʒ��� �׽�Ʈ���̽� ����� �غ��� ���� main �޼ҵ��Դϴ�.
    public static void main(String[] args) {
    	Solution3_3 sol = new Solution3_3();
        String[] bishops1 = {new String("D5")};
        int ret1 = sol.solution(bishops1);
        
        // [����] ��ư�� ������ ��� ���� �� �� �ֽ��ϴ�.
        System.out.println("solution �޼ҵ��� ��ȯ ���� " + ret1 + " �Դϴ�.");

        String[] bishops2 = {new String("D5"), new String("E8"), new String("G2")};
        int ret2 = sol.solution(bishops2);
        
        // [����] ��ư�� ������ ��� ���� �� �� �ֽ��ϴ�.
        System.out.println("solution �޼ҵ��� ��ȯ ���� " + ret2 + " �Դϴ�.");
    }
}