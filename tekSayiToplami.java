import java.util.*;
/* Java döngüler ile tek bir sayý girilene kadar kullanýcýdan 
 * giriþleri kabul eden ve girilen deðerlerden çift ve 4'ün 
 * katlarý olan sayýlarý toplayýp ekrana basan programý yazýyoruz. */

public class tekSayiToplami {

	public static void main(String[] args) {
		int sayi;
		int toplam=0;
		Scanner scan = new Scanner(System.in);
	
		
		do {
			System.out.println("Sayi giriniz:");
			sayi=scan.nextInt();
			if(sayi%2 == 0 || sayi%4 ==0) {
				toplam+=sayi;
				
			}
		}while(sayi %2 == 0);
		System.out.println("Toplam: "+toplam);

	}

}
