package ps1;

class Solution1_3 {
	public int solution(String pos) {
		//�� �������� Ǯ�̤�
		char[] now = new char[2];
		now[0] = pos.charAt(0);
		now[1] = pos.charAt(1);
		int i = now[0] - 'A';
		int j = 0;
		System.out.println(now[0] + " " + now[1]);
		if(now[1]=='8') {
			j = 0;
		} else if(now[1]=='7') {
			j = 1;
		} else if(now[1]=='6') {
			j= 2;
		} else if(now[1]=='5') {
			j=3;
		} else if(now[1]=='4') {
			j=4;
		} else if(now[1]=='3') {
			j=5;
		} else if(now[1]=='2') {
			j=6;
		} else if(now[1]=='1') {
			j=7;
		}
		System.out.println(i + " " + j);
		
		int[] dx = {-2,-1,1,2,-2,-1,1,2};
		int[] dy = {1,2,2,1,-1,-2,-2,-1};
		
		int answer = 0;
		for(int k=0; k<8; k++) {
			if(i+dx[k]>0&&i+dx[k]<8&&j+dy[k]>0&&j+dy[k]<8) {
				answer++;
			}
		}
		
		//����Ǯ��^^���..
		int cx = pos.charAt(0) - 'A';
    	int cy = pos.charAt(1) - '0' - 1; //��Ī�̴ϱ�...���� ��ó�� 8->0���� �ٲ� �ʿ� ������
    	System.out.println(cx + " " + cy);
		
        return answer;
    }


	// The following is main method to output testcase.
    public static void main(String[] args) {
    	Solution1_3 sol = new Solution1_3();
        String pos = "A7";
        int ret = sol.solution(pos);

        // Press Run button to receive output. 
        System.out.println("Solution: return value of the method is " + ret + " .");
    }
}