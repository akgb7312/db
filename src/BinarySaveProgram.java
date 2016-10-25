import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class BinarySaveProgram {

	public static void main(String[] args) throws IOException {
	
		
		FileInputStream fos = new FileInputStream("res/photo.bmp");
		
		final int FH_SIZE = 14;
		final int IH_SIZE = 92;
		
		byte[] fh = new byte[FH_SIZE];
		byte[] ih = new byte[IH_SIZE];
		
		fos.read(fh,0,FH_SIZE);
		fos.read(ih, 0,IH_SIZE );
		
		int imgWidth =      (int)ih[7]<<24|(int)ih[6] <<16|(int)ih[5] <<8 |((int)ih[4])& (0x000000ff);
		System.out.printf("width : %d\n",imgWidth);
				
				
		
		
		fos.close();
		
		
		/*
		FileOutputStream fos = new FileOutputStream("res/bin.data");
		
		 
		int x = 65;
		int y = 50;
		
		byte[] hi = new byte[4];
		
		
		
		hi[0] = (byte)x;
		hi[1] = (byte)(x>>8);
		hi[2] = (byte)(x>>16);
		hi[3] = (byte)(x>>32);
		
		fos.write(x);
		*/
		/*		
		PrintStream out = new PrintStream(fos);
		
		out.printf("%d", x);
		
		out.close();
		*/
		
		//fos.close();
		

	}

}
