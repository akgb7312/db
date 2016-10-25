import java.util.Scanner;

public class Project_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int roommen = 8;
		int board = 0;
		int check = 0;

		// 詭檣Щ煎斜極 衛濛
		startmenu:
		while(true) {
			System.out.println("忙式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式忖");
			System.out.println("弛﹛﹛﹛﹛﹛﹛﹛﹛﹛﹛﹛﹛﹛﹛﹛﹛﹛﹛﹛﹛﹛﹛﹛﹛﹛﹛﹛弛");
			System.out.println("弛                詭檣 詭景                    弛");
			System.out.println("弛﹛﹛﹛﹛﹛﹛﹛﹛﹛﹛﹛﹛﹛﹛﹛﹛﹛﹛﹛﹛﹛﹛﹛﹛﹛﹛﹛弛");
			System.out.println("弛﹛  1. 殮濰ж晦                  2.謙猿ж晦﹛﹛弛");
			System.out.println("戌式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式戎");

			int start = sc.nextInt();
			int checkout;
			
			submenu:
			switch (start) {

			
			case 1:
				
				
				System.out.println("忙式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式忖");
				System.out.println("弛﹛1.寞虜菟晦﹛﹛﹛﹛﹛﹛﹛﹛﹛﹛﹛﹛﹛﹛﹛2.撲薑 ﹛弛");
				System.out.println("弛式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式弛");
				System.out.println("弛                 寞 跡 煙                    弛");
				System.out.println("弛式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式弛");
				System.out.println("弛19.                                       弛");
				System.out.println("弛式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式弛");
				System.out.println("弛18.                                       弛");
				System.out.println("弛式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式弛");
				System.out.println("弛17.                                       弛");
				System.out.println("弛式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式弛");
				System.out.println("弛16.                                       弛");
				System.out.println("弛式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式弛");
				System.out.println("弛15.                                       弛");
				System.out.println("弛式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式弛");
				System.out.println("弛14.                                       弛");
				System.out.println("弛式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式弛");
				System.out.println("弛13.                                       弛");
				System.out.println("弛式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式弛");
				System.out.println("弛12.                                       弛");
				System.out.println("弛式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式弛");
				System.out.println("弛11.                                       弛");
				System.out.println("弛式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式弛");
				System.out.println("弛﹛﹛﹛﹛﹛﹛﹛﹛﹛﹛﹛﹛﹛﹛﹛﹛﹛﹛﹛﹛﹛﹛﹛﹛﹛﹛﹛弛");
				System.out.println("弛式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式弛");
				System.out.println("弛100.頂 薑爾                                    弛");
				System.out.println("弛                                          弛");
				System.out.println("弛﹛﹛﹛﹛﹛﹛﹛﹛﹛﹛﹛﹛﹛﹛﹛﹛﹛﹛﹛﹛﹛﹛﹛﹛﹛﹛﹛弛");
				System.out.println("弛                              99.詭檣詭景  弛");
				System.out.println("戌式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式戎");

				int division = sc.nextInt();
				mainmenu:
				switch (division) {

				case 1:
					System.out.println("寞 薯跡擊 殮溘п 輿褊衛螃");
					System.out.print(">");
					String roomname = sc.next();
					System.out.println("寞 檣錳擊 殮溘п 輿褊衛螃(4~8)");
					System.out.print(">");
					roommen = sc.nextInt();
					System.out.println(roomname+" 寞檜 儅撩腎歷蝗棲棻(1/"+roommen+")");
					System.out.println("忙式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式忖");
					System.out.println("弛﹛寞薯  : "+roomname+"﹛﹛﹛寞釭陛晦(0) (1/"+roommen+")弛");
					System.out.println("弛式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式弛");
					System.out.println("弛                                          弛");
					System.out.println("弛                                          弛");
					System.out.println("弛                                          弛");
					System.out.println("弛                                          弛");
					System.out.println("弛                                          弛");
					System.out.println("弛                                          弛");
					System.out.println("弛                                          弛");
					System.out.println("弛                                          弛");
					System.out.println("弛                                          弛");
					System.out.println("弛                                          弛");
					System.out.println("弛                                          弛");
					System.out.println("弛                                          弛");
					System.out.println("弛                                          弛");
					System.out.println("弛                                          弛");
					System.out.println("弛式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式弛");
					System.out.println("弛                                          弛");
					System.out.println("弛﹛﹛﹛﹛﹛﹛﹛﹛﹛﹛﹛﹛﹛﹛﹛﹛﹛﹛﹛﹛﹛﹛﹛﹛﹛﹛﹛弛");
					System.out.println("弛                                          弛");
					System.out.println("戌式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式戎");
					
					checkout = sc.nextInt();
						if(checkout == 0){
							System.out.println("寞擊 釭骨棲棻."); 
							break mainmenu;
							}
						
					break;
					
				case 2:
					System.out.println("撲薑璽戲煎 檜翕м棲棻.");
					break;
				case 19:
					System.out.println(division + "廓寞縑 殮濰ж樟蝗棲棻.");
					break;
				case 18:
					System.out.println(division + "廓寞縑 殮濰ж樟蝗棲棻.");
					break;
				case 17:
					System.out.println(division + "廓寞縑 殮濰ж樟蝗棲棻.");
					break;
				case 16:
					System.out.println(division + "廓寞縑 殮濰ж樟蝗棲棻.");
					break;
				case 15:
					System.out.println(division + "廓寞縑 殮濰ж樟蝗棲棻.");
					break;
				case 14:
					System.out.println(division + "廓寞縑 殮濰ж樟蝗棲棻.");
					break;
				case 13:
					System.out.println(division + "廓寞縑 殮濰ж樟蝗棲棻.");
					break;
				case 12:
					System.out.println(division + "廓寞縑 殮濰ж樟蝗棲棻.");
					break;
				case 11:
					System.out.println(division + "廓寞縑 殮濰ж樟蝗棲棻.");
					System.out.println("忙式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式忖");
					System.out.println("弛﹛"+division+"﹛﹛﹛寞釭陛晦(0) (1/"+roommen+")弛");
					System.out.println("弛式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式弛");
					System.out.println("弛                                          弛");
					System.out.println("弛                                          弛");
					System.out.println("弛                                          弛");
					System.out.println("弛                                          弛");
					System.out.println("弛                                          弛");
					System.out.println("弛                                          弛");
					System.out.println("弛                                          弛");
					System.out.println("弛                                          弛");
					System.out.println("弛                                          弛");
					System.out.println("弛                                          弛");
					System.out.println("弛                                          弛");
					System.out.println("弛                                          弛");
					System.out.println("弛                                          弛");
					System.out.println("弛                                          弛");
					System.out.println("弛式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式弛");
					System.out.println("弛                                          弛");
					System.out.println("弛﹛﹛﹛﹛﹛﹛﹛﹛﹛﹛﹛﹛﹛﹛﹛﹛﹛﹛﹛﹛﹛﹛﹛﹛﹛﹛﹛弛");
					System.out.println("弛                                          弛");
					System.out.println("戌式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式戎");
					break;
				case 99:
					System.out.println();
					System.out.println("詭檣詭景煎 給嬴骨棲棻.");
					System.out.println();
					break;

				case 100:
					System.out.println("頂薑爾 轎溘脾");
				}

				break; //寞 殮濰 馨檜蝶1 break;

			case 2:
				System.out.println("Щ煎斜極擊 謙猿м棲棻.");
				break startmenu;

			default:
				System.out.println();
				System.out.println();
				System.out.println("澀跤脹 殮溘殮棲棻.");
				System.out.println();
				System.out.println();
				

			}
		}

	}

}
