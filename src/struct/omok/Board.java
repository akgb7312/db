/*package struct.omok;

public class Board {
	
	private int width;
	private int height;
	private char[][] buf;

	public Board(){
		this(30,30);
	}
	public Board(int width, int height){
		
		this.width = width;
		this.height = height;
		buf = new char[width][height];
		
		for(int i  = 0; i<width;i++)
			for(int j = 0; j<height;j++)
				buf[i][j] = '��';
				
		decoBoder();
	}
	

	public void decoBoder(){
		
		// ��ܸ� �ٹ̱�
		for(int x = 0; x<width-2;x++)
			buf[0][x+1] = '��';
					
		// ���� �ճ�
		for(int i = 0; i<height-2;i++)
			buf[i+1][0] = '��';
		
		// ���� �ճ�
		for(int i = 0; i<width-2;i++)   
			buf[i+1][width-1] = '��';
		
		// �ϴ� ����
		for(int i = 0; i<width-2;i++)
			buf[height-1][i+1] = '��';
		
		
		buf[0][0] = '��';
		buf[0][width-1] = '��';
		buf[height-1][0] = '��';
		buf[height-1][width-1] = '��';		
	}
	public int getWidth() {
		
		return width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public char[][] getBuf() {
		return buf;
	}
	public void setBuf(char[][] buf) {
		this.buf = buf;
	}
	public void setWidth(int width) {
		this.width = width;
	}


	
	public void init(){
		// ���ۿ� + ���� �ֱ�
		for(int i  = 0; i<width;i++)
			for(int j = 0; j<height;j++)
				buf[i][j] = '��';
				
		decoBoder();
				

	}
	
}


*/