package ps6;

// 다음과 같이 import를 사용할 수 있습니다.
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
    
    // 아래는 테스트케이스 출력을 해보기 위한 main 메소드입니다.
    public static void main(String[] args) {
    	Solution6_1 sol = new Solution6_1();
        int[][] garden1 = {{0, 0, 0}, {0, 1, 0}, {0, 0, 0}};
        int ret1 = sol.solution(garden1);
        
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + ret1 + " 입니다.");
        
        int[][] garden2 = {{1, 1}, {1, 1}};
        int ret2 = sol.solution(garden2);
        
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + ret2 + " 입니다.");
        
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