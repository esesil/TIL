package ps4;

import java.util.Arrays;

class Solution4_6 {
    public int power(int base, int exponent) {
        int val = 1;
        for (int i = 0; i < exponent; i++) 
            val *= base;
        return val;
    }
    public int[] solution(int k) {
        int range = power(10, k);
        int[] answer = new int[range];
        int count = 0;
        for (int i = range / 10; i < range; i++) {
            int current = i;
            int calculated = 0;
            while (current != 0) {
            	calculated += Math.pow(current%10,k); //
                current/=10;//
            }
            if (calculated == i)
                answer[count++] = i;
        }

        int[] ret = new int[count];
        for (int i = 0; i < count; i++)
            ret[i] = answer[i];
        return ret;
    }

    // �Ʒ��� �׽�Ʈ���̽� ����� �غ��� ���� main �޼ҵ��Դϴ�.
    public static void main(String[] args) {
    	Solution4_6 sol = new Solution4_6();
        int k = 3;
        int[] ret = sol.solution(k);

        // ����] ��ư�� ������ ��°��� �� �� �ֽ��ϴ�.
        System.out.printf("solution �޼ҵ��� ��ȯ ���� ");
        System.out.printf(Arrays.toString(ret));
        System.out.printf(" �Դϴ�.\n");
    }   
}