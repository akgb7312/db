package struct;

import java.util.Random;

public class Lotto {

	// 함수 구현
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

		getLotto(lotto); //번호생성
		LottoPrint(lotto);    
		rangeLotto(lotto);
		LottoPrint(lotto);    
//		LottoPrint2(lotto);
		
		
//		Random rand = new Random();
		
		/*
		 * // 번호 생성 for (int i = 0; i < lotto.length; i++) { for (int i = 0; i <
		 * lotto.length; i++) { lotto[i] = rand.nextInt(45) + 1; } 로또번호 생성()
		 */
		/*
		 * // 번호 출력 for (int j = 0; j < lotto.length; j++) {
		 * 
		 * System.out.printf("%d ", lotto[j]); }
		 * 
		 * // 번호 자리바꾸기 for (int c = 0; c < lotto.length - 1; c++) {
		 * 
		 * while (lotto[c] == lotto[c + 1]) {
		 * 
		 * lotto[c] = rand.nextInt(6) + 1; c = 0; } if (lotto[c] > lotto[c + 1])
		 * { temp = lotto[c]; lotto[c] = lotto[c + 1]; lotto[c + 1] = temp; c =
		 * -1; } } // 번호 출력 System.out.println(); for (int j = 0; j <
		 * lotto.length; j++) {
		 * 
		 * System.out.printf("%d ", lotto[j]);
		 * 
		 * }
		 */
	}

}
