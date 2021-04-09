package ps4;

// 다음과 같이 import를 사용할 수 있습니다.
import java.util.*;

class Solution4_8 {
	ArrayList<Integer> list = new ArrayList<Integer>();
    public int solution(int[] card, int n) {
    	int[] check = card_count(card);
    	makenum(0, 0, new int[10], card.length, check);
    	//배열, level, 숫자, 체크배열, 카드배열
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

	// 아래는 테스트케이스 출력을 해보기 위한 main 메소드입니다.
    public static void main(String[] args) {
    	Solution4_8 sol = new Solution4_8();
        int card1[] = {1, 2, 1, 3};
        int n1 = 1312;
        int ret1 = sol.solution(card1, n1);

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + ret1 + " 입니다.");

        int card2[] = {1, 1, 1, 2};
        int n2 = 1122;
        int ret2 = sol.solution(card2, n2);
        
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + ret2 + " 입니다.");
    }    
}