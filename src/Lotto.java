import java.util.Random;

public class Lotto {

	public static void main(String[] args) {

		int[] lotto = new int[6];
		int temp = 0;

		Random rand = new Random();
		
		// ��ȣ ����
		for (int i = 0; i < lotto.length; i++) {

			lotto[i] = rand.nextInt(6) + 1;
		}
		// ��ȣ ���
		for (int j = 0; j < lotto.length; j++) {

			System.out.printf("%d ", lotto[j]);
		}
		// ��ȣ �ڸ��ٲٱ�
		for (int c = 0; c < lotto.length - 1; c++) {

			while (lotto[c] == lotto[c + 1]) {

				lotto[c] = rand.nextInt(6) + 1;
				c = 0;
			}
			if (lotto[c] > lotto[c + 1]) {
				temp = lotto[c];
				lotto[c] = lotto[c + 1];
				lotto[c + 1] = temp;
				c = -1;
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
			}
		}
		// ��ȣ ���
		System.out.println();
		for (int j = 0; j < lotto.length; j++) {

			System.out.printf("%d ", lotto[j]);

		}

	}

}
