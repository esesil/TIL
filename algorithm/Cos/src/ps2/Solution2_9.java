package ps2;

class Solution2_9 {
    public boolean solution(String password) {
        int length = password.length();
        for(int i = 0; i < length - 2; ++i){
            int firstCheck = password.charAt(i + 1) - password.charAt(i);
            int secondCheck = password.charAt(i+2) - password.charAt(i+1);
            if(firstCheck == secondCheck && (firstCheck == 1 || firstCheck == -1))
                return false;
        }
        return true;
    }


    // �Ʒ��� �׽�Ʈ���̽� ����� �غ��� ���� main �޼ҵ��Դϴ�. main �޼ҵ�� �߸��� �κ��� ������, solution �޼ҵ常 �����ϼ���.
    public static void main(String[] args) {
    	Solution2_9 sol = new Solution2_9();
        String password1 = "cospro890";
        boolean ret1 = sol.solution(password1);

        // [����] ��ư�� ������ ��� ���� �� �� �ֽ��ϴ�.
        System.out.println("solution �޼ҵ��� ��ȯ ���� " + ret1 + " �Դϴ�.");


        String password2 = "cba323";
        boolean ret2 = sol.solution(password2);

        // [����] ��ư�� ������ ��� ���� �� �� �ֽ��ϴ�.
        System.out.println("solution �޼ҵ��� ��ȯ ���� " + ret2+ " �Դϴ�.");       
    }
}