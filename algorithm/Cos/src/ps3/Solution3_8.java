package ps3;

class Solution3_8 {
    public int solution(int k, int[] student) {
        int answer = 0;
        for(int i = 0; i < student.length; i++){
            student[i] -= 4*k;
            if(student[i] <= 0)
                continue;
            answer += (student[i] + k - 1) / k;
        }
        return answer;
    }
    
    // �Ʒ��� �׽�Ʈ���̽� ����� �غ��� ���� main �޼ҵ��Դϴ�. main �޼ҵ�� �߸��� �κ��� ������, solution �޼ҵ常 �����ϼ���.
    public static void main(String[] args) {
    	Solution3_8 sol = new Solution3_8();
        int k1 = 1;
        int[] student1 = {4, 4, 4, 4};
        int ret1 = sol.solution(k1, student1);
        
        // [����] ��ư�� ������ ��� ���� �� �� �ֽ��ϴ�.
        System.out.println("solution �޼ҵ��� ��ȯ ���� " + ret1 + " �Դϴ�.");
        
        int k2 = 3;
        int[] student2 = {15, 17, 19, 10, 23};
        int ret2 = sol.solution(k2, student2);
        
        // [����] ��ư�� ������ ��� ���� �� �� �ֽ��ϴ�.
        System.out.println("solution �޼ҵ��� ��ȯ ���� " + ret2 + " �Դϴ�.");
    }
}