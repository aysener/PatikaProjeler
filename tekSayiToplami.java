import java.util.*;
/* Java d�ng�ler ile tek bir say� girilene kadar kullan�c�dan 
 * giri�leri kabul eden ve girilen de�erlerden �ift ve 4'�n 
 * katlar� olan say�lar� toplay�p ekrana basan program� yaz�yoruz. */

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
