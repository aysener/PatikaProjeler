import java.util.Scanner;

public class mukemmelSayiBul {

	public static void main(String[] args) {

		int sayi,  toplam=0;
		Scanner scan = new Scanner(System.in);
		System.out.println("sayý Girin: ");
		sayi=scan.nextInt();
		
		for(int i=1; i<sayi; i++) {
			if(sayi %i == 0) {
				
				toplam+=i;
			}
		}
		System.out.println("bölenler toplamý: " + toplam);
		if(toplam==sayi) {
			System.out.println(sayi + " sayisi bir mükemmel sayýdýr: ");
		}
		else {
			System.out.println(sayi + " sayisi bir mükemmel sayý deðildir: ");
		}
		
		
	

	}

}
