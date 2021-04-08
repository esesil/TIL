package ps2;

import java.util.*;

class Solution2_8 {
    public int[] solution(int[] arr) {
        int left = 0, right = arr.length - 1;
        int idx = 0;
        int[] answer = new int[arr.length];
        while(left <= right){
            if(left+right==arr.length-1){ // if(idx % 2 == 0) �̰� �־���^^..
                answer[idx] = arr[left];
                left += 1;
            }
            else {
                answer[idx] = arr[right];
                right -= 1;
            }
            idx += 1;
        }
        return answer;
    }

    // �Ʒ��� �׽�Ʈ���̽� ����� �غ��� ���� main �޼ҵ��Դϴ�. main �޼ҵ�� �߸��� �κ��� ������, solution �޼ҵ常 �����ϼ���.
    public static void main(String[] args) {
    	Solution2_8 sol = new Solution2_8();
        int[] arr = {1, 2, 3, 4, 5, 6};
        int[] ret = sol.solution(arr);

        // [����] ��ư�� ������ ��� ���� �� �� �ֽ��ϴ�.
        System.out.println("solution �޼ҵ��� ��ȯ ���� " + Arrays.toString(ret) + " �Դϴ�.");
    }
}