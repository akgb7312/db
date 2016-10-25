 import java.util.Random;

public class AlphabetProgram {

	public static void main(String[] args) {
		/*
		 * for (int i = 0; i < 26; i++) {
		 * 
		 * if (i % 2!=0 ) System.out.printf("(%c)", 65 + i); else
		 * System.out.printf("%c", 65 + i);
		 * 
		 * 
		 * }
		 */
		Random r = new Random();

		int src; 
		int dest;
		int temp = 0;
		int[] list = new int[26];

		for (int i = 0; i < 26; i++)
			list[i] = 65 + i;

		for(int i = 0;i<100;i++){
			src = r.nextInt(26);
			dest = r.nextInt(26);
			temp = list[src];
			list[src] = list[dest];
			list[dest] = temp;
		}
		for (int i = 0; i < 26; i++) {
			/*if (i == src)
				System.out.printf("(%c)", list[i]);
			 else if (i == dest) 
				System.out.printf("[%c]", list[i]);
			 else*/
				System.out.printf("%c ", list[i]);

		}

	}

}
