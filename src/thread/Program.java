package thread;

public class Program {

	private static int y = 3;
	
	public static void main(String[] args) {
		Thread thread = null;
		String x ="ho";
		
		while(true){
			
			System.out.printf("%s �� ~\n",x);
			if(thread == null){
				thread = new Thread(new Runnable(){
					@Override
					public void run() {
						while(true)
						System.out.println("������ �������� �� ���̺�");
					}					
				});
				thread.start();
				
			}
			
		}
		
	}
	

}
