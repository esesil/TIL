package ps4;

class Solution4_5 {
    public String reverse(String number) {
        String reverseNumber = "";
        for(int i = number.length()-1; i >= 0; i--)
            reverseNumber += number.charAt(i); //
        return reverseNumber;
    }

    public String solution(int n) {
        String answer = "";
        for(int i = 0; i < n; i++) {
            answer += Integer.toString(i%9+1);// i%9 �Ф���������...
            answer = reverse(answer);
        }
        return answer;
    }

    // �Ʒ��� �׽�Ʈ���̽� ����� �غ��� ���� main �޼ҵ��Դϴ�.    
    public static void main(String[] args) {
    	Solution4_5 sol = new Solution4_5();
        int n = 5;
        String ret = sol.solution(n);
        
        // [����] ��ư�� ������ ��� ���� �� �� �ֽ��ϴ�.
        System.out.println("solution �޼ҵ��� ��ȯ ���� " + ret + " �Դϴ�.");
    }
}