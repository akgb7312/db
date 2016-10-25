/*package struct.omok;

import java.util.Scanner;

public class OmokCon {
	
	private Board board;
	private OmokList list;
	
	public OmokCon(){
		board = new Board();
		list = new OmokList();
	}
	
	public void setOmok(){
		
		Scanner sc = new Scanner(System.in);
		boolean blackTurn = true;
		
		while(true){
			
			print();
			
			System.out.println("��ǥ�� �Է��ض�(x,y) / ���� : -1");
			
			int y = sc.nextInt();
			int x = sc.nextInt();
//			board.buf[x][y] = '��';
		
			Omok omok = new Omok();
			omok.setX(x);
			omok.setY(y);
			omok.setType(blackTurn?1:2);	// true �� 1, false �� 2
			blackTurn = !blackTurn;
			
			list.add(omok);
			
			char[][] buf = board.getBuf();
			Omok[] omoks = list.getOmoks();

			for(int i = 0; i<list.getIndex();i++){

				if(omoks[i].getType() == 2){		// ���� �迭�� type�� ������ �˻�������!
		
					
					buf[omoks[i].getX()][omoks[i].getY()] = 'o';

				}
				else{
					buf[omoks[i].getX()][omoks[i].getY()] = '��';

					}
				

			}
			
			
		}

		
		
	}
	
	public void print(){
//		System.out.println(board.getWidth());
		
		for(int i=0; i<board.getWidth();i++){
			
			
			for(int j = 0; j<board.getHeight();j++){
			
				char[][] buf = board.getBuf();
				System.out.printf("%c ",buf[i][j] );
			
			}
		
			System.out.println();
		
		}

	}
	
	
	


}
*/