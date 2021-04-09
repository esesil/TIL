package ps4;

// ������ ���� import�� ����� �� �ֽ��ϴ�.
import java.util.*;

class Solution4_8 {
	ArrayList<Integer> list = new ArrayList<Integer>();
    public int solution(int[] card, int n) {
    	int[] check = card_count(card);
    	makenum(0, 0, new int[10], card.length, check);
    	//�迭, level, ����, üũ�迭, ī��迭
    	System.out.println(list);
    	int answer = 0;
    	for(int i=0; i<list.size(); i++) {
    		if(list.get(i)==n) {
    			answer= i+1;
    			break;
    		}
    		else {
    			answer= -1;
    		}
    	}
    	return answer;
    }
    
    private void makenum(int lev, int num, int[] check, int cardlength, int[] max_check) {
		if(lev==cardlength) {
			list.add(num);
			return;
		}
		for(int i=1; i<=9; i++) {
			if(check[i]<max_check[i]) {
				check[i] += 1;
				makenum(lev+1, num*10+i, check, cardlength, max_check);
				check[i] -= 1;
			}
		}
	}

	private int[] card_count(int[] card) {
    	int check[] = new int[10];
		for(int i=0; i<card.length; i++) {
			check[card[i]] += 1;
		}
		return check;
	}

	// �Ʒ��� �׽�Ʈ���̽� ����� �غ��� ���� main �޼ҵ��Դϴ�.
    public static void main(String[] args) {
    	Solution4_8 sol = new Solution4_8();
        int card1[] = {1, 2, 1, 3};
        int n1 = 1312;
        int ret1 = sol.solution(card1, n1);

        // [����] ��ư�� ������ ��� ���� �� �� �ֽ��ϴ�.
        System.out.println("solution �޼ҵ��� ��ȯ ���� " + ret1 + " �Դϴ�.");

        int card2[] = {1, 1, 1, 2};
        int n2 = 1122;
        int ret2 = sol.solution(card2, n2);
        
        // [����] ��ư�� ������ ��� ���� �� �� �ֽ��ϴ�.
        System.out.println("solution �޼ҵ��� ��ȯ ���� " + ret2 + " �Դϴ�.");
    }    
}