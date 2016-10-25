import java.util.Random;

public class LottoProgram {

	public static void main(String[] args) {

		Random rand = new Random();

		int[] lotto = new int[6];

		for (int i = 0; i < lotto.length; i++) { // 로또번호 반복출력

			lotto[i] = rand.nextInt(45) + 1;
			// System.out.printf("for1 의 값 : %d /", lotto[i]);

			for (int j = 0; j < i; j++) { // 중복출력 검사

				if (lotto[i] == lotto[j] && i != j) {

					lotto[i] = rand.nextInt(45) + 1;
					j = -1;

				}

			}
			System.out.printf(" %d ", lotto[i]);
			// System.out.printf("마지막 값 : %d \n", lotto[i]);
		}
	}

}
