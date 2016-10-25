import java.util.Random;

public class Lotto {

	public static void main(String[] args) {

		int[] lotto = new int[6];
		int temp = 0;

		Random rand = new Random();
		
		// 번호 생성
		for (int i = 0; i < lotto.length; i++) {

			lotto[i] = rand.nextInt(6) + 1;
		}
		// 번호 출력
		for (int j = 0; j < lotto.length; j++) {

			System.out.printf("%d ", lotto[j]);
		}
		// 번호 자리바꾸기
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
		// 번호 출력
		System.out.println();
		for (int j = 0; j < lotto.length; j++) {

			System.out.printf("%d ", lotto[j]);

		}

	}

}
