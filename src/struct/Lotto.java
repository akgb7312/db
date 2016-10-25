package struct;

import java.util.Random;

public class Lotto {

	// �Լ� ����
	public static void getLotto(int[] lotto) {
		Random rand = new Random();
		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = rand.nextInt(45) + 1;
		}
	}

	
	public static void LottoPrint(int[] lotto) {
		for (int j = 0; j < lotto.length; j++) {

			System.out.printf("%d ", lotto[j]);
			
		}
		System.out.println();
	}

	
	public static void rangeLotto(int[] lotto) {
		Random rand = new Random();
		int temp = 0;
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
	}

/*	
	public static void LottoPrint2(int[] lotto) {
		System.out.println();
		for (int j = 0; j < lotto.length; j++) {

			System.out.printf("%d ", lotto[j]);
		}
	}
*/
	public static void main(String[] args) {

		int[] lotto = new int[6];

		getLotto(lotto); //��ȣ����
		LottoPrint(lotto);    
		rangeLotto(lotto);
		LottoPrint(lotto);    
//		LottoPrint2(lotto);
		
		
//		Random rand = new Random();
		
		/*
		 * // ��ȣ ���� for (int i = 0; i < lotto.length; i++) { for (int i = 0; i <
		 * lotto.length; i++) { lotto[i] = rand.nextInt(45) + 1; } �ζǹ�ȣ ����()
		 */
		/*
		 * // ��ȣ ��� for (int j = 0; j < lotto.length; j++) {
		 * 
		 * System.out.printf("%d ", lotto[j]); }
		 * 
		 * // ��ȣ �ڸ��ٲٱ� for (int c = 0; c < lotto.length - 1; c++) {
		 * 
		 * while (lotto[c] == lotto[c + 1]) {
		 * 
		 * lotto[c] = rand.nextInt(6) + 1; c = 0; } if (lotto[c] > lotto[c + 1])
		 * { temp = lotto[c]; lotto[c] = lotto[c + 1]; lotto[c + 1] = temp; c =
		 * -1; } } // ��ȣ ��� System.out.println(); for (int j = 0; j <
		 * lotto.length; j++) {
		 * 
		 * System.out.printf("%d ", lotto[j]);
		 * 
		 * }
		 */
	}

}
