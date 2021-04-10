package ps5;

class Solution5_1 {
    public int solution(int n) {
        int answer = 0;

        int[] steps = new int[n+1];
        steps[1] = 1;
        steps[2] = 2;
        steps[3] = 4;
        for(int i = 4; i <= n; i++)
        	steps[i] = steps[i-1]+steps[i-2]+steps[i-3];
        answer = steps[n];

        return answer;
    }

    // �Ʒ��� �׽�Ʈ���̽� ����� �غ��� ���� main �޼ҵ��Դϴ�.
    public static void main(String[] args) {
    	Solution5_1 sol = new Solution5_1();
    	int n1 = 3;
    	int ret1 = sol.solution(n1);

    	// [����] ��ư�� ������ ��� ���� �� �� �ֽ��ϴ�.
    	System.out.println("solution �޼ҵ��� ��ȯ ���� " + ret1 + " �Դϴ�.");

    	int n2 = 4;
    	int ret2 = sol.solution(n2);

    	// [����] ��ư�� ������ ��� ���� �� �� �ֽ��ϴ�.
    	System.out.println("solution �޼ҵ��� ��ȯ ���� " + ret2 + " �Դϴ�.");
    }
}