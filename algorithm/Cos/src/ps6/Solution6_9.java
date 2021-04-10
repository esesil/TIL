package ps6;

class Solution6_9 {
	final int INC = 0;
	final int DEC = 1;

	int[] func_a(int[] arr) {
		int length = arr.length;
		int[] ret = new int[length];
		ret[0] = 1;
		for (int i = 1; i < length; i++) {
			if (arr[i] != arr[i - 1])
				ret[i] = ret[i - 1] + 1;
			else
				ret[i] = 2;
		}
		return ret;
	}

	int[] func_b(int[] arr) {
		int length = arr.length;
		int[] ret = new int[length];
		ret[0] = -1;
		for (int i = 1; i < length; i++) {
			if (arr[i] > arr[i - 1])
				ret[i] = INC;
			else if (arr[i] < arr[i - 1])
				ret[i] = DEC;
		}
		return ret;
	}

	int func_c(int[] arr) {
		int length = arr.length;
		int ret = 0;
		for (int i = 0; i < length; i++)
			if (ret < arr[i])
				ret = arr[i];
		if (ret == 2)
			return 0;
		return ret;
	}

	public int solution(int[] S) {
		int[] check = func_b(S);
		int[] dp = func_a(check);
		int answer = func_c(dp);
		return answer;
	}

	// �Ʒ��� �׽�Ʈ���̽� ����� �غ��� ���� main �޼ҵ��Դϴ�.
	public static void main(String[] args) {
		Solution6_9 sol = new Solution6_9();
		int[] S1 = { 2, 5, 7, 3, 4, 6, 1, 8, 9 };
		int ret1 = sol.solution(S1);

		// [����] ��ư�� ������ ��� ���� �� �� �ֽ��ϴ�.
		System.out.println("solution �޼ҵ��� ��ȯ ���� " + ret1 + " �Դϴ�.");

		int[] S2 = { 4, 3, 2, 1, 10, 6, 9, 7, 8 };
		int ret2 = sol.solution(S2);

		// [����] ��ư�� ������ ��� ���� �� �� �ֽ��ϴ�.
		System.out.println("solution �޼ҵ��� ��ȯ ���� " + ret2 + " �Դϴ�.");

		int[] S3 = { 1, 2, 3, 4, 5 };
		int ret3 = sol.solution(S3);

		// [����] ��ư�� ������ ��� ���� �� �� �ֽ��ϴ�.
		System.out.println("solution �޼ҵ��� ��ȯ ���� " + ret3 + " �Դϴ�.");
	}
}