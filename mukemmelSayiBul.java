import java.util.Scanner;

public class mukemmelSayiBul {

	public static void main(String[] args) {

		int sayi,  toplam=0;
		Scanner scan = new Scanner(System.in);
		System.out.println("say� Girin: ");
		sayi=scan.nextInt();
		
		for(int i=1; i<sayi; i++) {
			if(sayi %i == 0) {
				
				toplam+=i;
			}
		}
		System.out.println("b�lenler toplam�: " + toplam);
		if(toplam==sayi) {
			System.out.println(sayi + " sayisi bir m�kemmel say�d�r: ");
		}
		else {
			System.out.println(sayi + " sayisi bir m�kemmel say� de�ildir: ");
		}
		
		
	

	}

}
