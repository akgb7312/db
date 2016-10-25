package struct.omok;

public class OmokList {

	private int index;
	private int amount;
	private int capacity;
	private Omok[] omoks;
	
	public OmokList(){
		this(0,10,10);
	}
	
	public OmokList(int index, int amount, int capacity){
		
		this.index = index;
		this.amount = amount;
		this.capacity = capacity;
		this.omoks = new Omok[capacity];
	}

	public void add(Omok omok){
		
		if(index >= capacity){		//  허용범위 초과시
			Omok[] temp = new Omok[capacity+amount];
	
			for(int i = 0; i<capacity;i++)
				temp[i] = omoks[i];
	
			capacity += amount;
	
			omoks = temp;		
		}

		omoks[index++] = omok;
	}

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}

	public Omok[] getOmoks() {
		return omoks;
	}

	public void setOmoks(Omok[] omoks) {
		this.omoks = omoks;
	}


	
}
