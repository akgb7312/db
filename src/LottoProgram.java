import java.util.Random;

public class LottoProgram {

	public static void main(String[] args) {

		Random rand = new Random();

		int[] lotto = new int[6];

		for (int i = 0; i < lotto.length; i++) { // �ζǹ�ȣ �ݺ����

			lotto[i] = rand.nextInt(45) + 1;
			// System.out.printf("for1 �� �� : %d /", lotto[i]);

			for (int j = 0; j < i; j++) { // �ߺ���� �˻�

				if (lotto[i] == lotto[j] && i != j) {

					lotto[i] = rand.nextInt(45) + 1;
					j = -1;

				}

			}
			System.out.printf(" %d ", lotto[i]);
			// System.out.printf("������ �� : %d \n", lotto[i]);
		}
	}

}
