package ps1;

class Solution1_2 {
	int[][] arr;
	int[] dx = {0,1,0,-1};
	int[] dy = {1,0,-1,0};
	
	public boolean check(int i, int j, int n) {
		return (i>=0 && i<n && j>=0 && j<n);
	}
	
    public int solution(int n) {
    	arr = new int[n][n];
    	int nx = 0;
    	int ny = 0;
    	int num = 1;
    	while(check(nx,ny,n)&&arr[nx][ny]==0) { //������, �������� ���������� ������
    		for(int k=0; k<4; k++) { //dx,dy�� �����µ�
    			if(check(nx,ny,n)&&arr[nx][ny]!=0) //�������ε� �������� �� ������ break
    				break;
    			while(true) {
    				arr[nx][ny] = num++;
    				int fx = nx + dx[k]; //�� Ǯ�̿��� dy[k]�� ������?
    				int fy = ny + dy[k];
    				if(!check(fx,fy,n) || arr[fx][fy]!=0) {
    					//�������̰ų� �̷���ǥ�� ���� �ִٸ� dx,dy�� �������� �ϰ� nx,ny���� �ٲ� �� break
    					nx += dx[(k+1)%4];
    					ny += dy[(k+1)%4];
    					break;
    				}
    				nx = fx;
    				ny = fy;
    			}
    		}
    	}
    	int ans = 0;
    	for(int i=0; i<n; i++) {
    		ans += arr[i][i];
    	}
    	return ans;
    }

    // The following is main method to output testcase.
    public static void main(String[] args) {
        Solution1_2 sol = new Solution1_2();
        int n1 = 3;
        int ret1 = sol.solution(n1);

        
        // Press Run button to receive output. 
        System.out.println("Solution: return value of the method is " + ret1 + " .");
        
        int n2 = 2;
        int ret2 = sol.solution(n2);
        
        // Press Run button to receive output. 
        System.out.println("Solution: return value of the method is " + ret2 + " .");
    }
}