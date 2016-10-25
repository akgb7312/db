
public class BitLogicExample {

	public static void main(String[] args) {
		
		
		
		short pos = (7<<8)|5;
		
		System.out.println(toBinaryString(pos) + "(십진수 : " + pos + ")");
		
		int x = pos >>8;
		
		System.out.println(toBinaryString(x) + "(십진수 : " + x + ")");
		
		System.out.printf("x:%d",pos);	
		
		System.out.println();
		
		int y = pos <<24;
		
		System.out.println(toBinaryString(y) + "(십진수 : " + y + ")");
		
		 y = y>>24;
		
		System.out.println(toBinaryString(y) + "(십진수 : " + y + ")");
		
		
		
		System.out.println();
	//	System.out.printf("x:%d",x);
	//	int y = pos >>8;
		

		int v1 = -8;
		int v2 = ~v1;
		int v3 = ~-11;
		
		System.out.println(toBinaryString(y) + "(십진수 : " + y + ")");
		System.out.println(toBinaryString(v2) + "(십진수 : " + v2 + ")");
		System.out.println(toBinaryString(v3) + "(십진수 : " + v3 + ")");
		
		System.out.println();
		
		
		int v4 = 536870911;
		int v5 = ~v4;
		int v6 = ~v4+1;
	
		System.out.println(toBinaryString(v4) + "(십진수 : " + v4 + ")");
		System.out.println(toBinaryString(v5) + "(십진수 : " + v5 + ")");
		System.out.println(toBinaryString(v6) + "(십진수 : " + v6 + ")");
	
	
	}
	
	public static String toBinaryString(int value){
		String str = Integer.toBinaryString(value);
		while(str.length() < -1
				){
			str = "0"  + str;
		}
		
		return str;
	}
	
	

}
