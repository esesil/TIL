package ps6;

// ������ ���� import�� ����� �� �ֽ��ϴ�.
import java.util.*;


class Solution6_1 {
    public int solution(int[][] garden) {
        int answer = 0;
        int n = garden.length;
        int[] dx = {-1, 1, 0, 0};
        int[] dy = {0, 0, -1, 0};
        Queue<Flower> q = new LinkedList<Flower>();
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(garden[i][j]==1)
                    q.add(new Flower(i,j,0));
            }
        }
        
        while(!q.isEmpty()){
            Flower flower = q.remove();
            for(int i=0; i<4; i++){
                int nextX = flower.x+dx[i];
                int nextY = flower.y+dy[i];
                int nextDay = flower.day+1;
                
                if((0<=nextX && nextX<n && 0<=nextY && nextY<n)&&garden[nextX][nextY]==0){
                    garden[nextX][nextY]=1;
                    answer = nextDay;
                    q.add(new Flower(nextX,nextY,nextDay));
                }
            }
        }
        
        return answer;
    }
    
    // �Ʒ��� �׽�Ʈ���̽� ����� �غ��� ���� main �޼ҵ��Դϴ�.
    public static void main(String[] args) {
    	Solution6_1 sol = new Solution6_1();
        int[][] garden1 = {{0, 0, 0}, {0, 1, 0}, {0, 0, 0}};
        int ret1 = sol.solution(garden1);
        
        // [����] ��ư�� ������ ��� ���� �� �� �ֽ��ϴ�.
        System.out.println("solution �޼ҵ��� ��ȯ ���� " + ret1 + " �Դϴ�.");
        
        int[][] garden2 = {{1, 1}, {1, 1}};
        int ret2 = sol.solution(garden2);
        
        // [����] ��ư�� ������ ��� ���� �� �� �ֽ��ϴ�.
        System.out.println("solution �޼ҵ��� ��ȯ ���� " + ret2 + " �Դϴ�.");
        
    }    
}

class Flower{
    int x, y, day;
    Flower(int x, int y, int day){
        this.x = x;
        this.y = y;
        this.day = day;
    }
}