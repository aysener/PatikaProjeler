import java.util.Scanner;

public class zodyakTakvimi {

	public static void main(String[] args) {
	
		
		Scanner scan =new Scanner(System.in);
		
		System.out.println("Doðduðunuz yýlý girin:");
		int dogumYili=scan.nextInt();
		
		int zodyak=dogumYili % 12;
		if(zodyak == 0) {
			System.out.println("Zodyak Burcunuz: Maymun");
		}
		
		if(zodyak == 1) {
			System.out.println("Zodyak Burcunuz: Horoz");
		}
		
		if(zodyak == 2) {
			System.out.println("Zodyak Burcunuz: Köpek");
		}
		
		if(zodyak == 3) {
			System.out.println("Zodyak Burcunuz: Domuz");
		}
		
		if(zodyak == 4) {
			System.out.println("Zodyak Burcunuz: Fare");
		}
		
		if(zodyak == 5) {
			System.out.println("Zodyak Burcunuz: Öküz");
		}
		
		if(zodyak == 6) {
			System.out.println("Zodyak Burcunuz: Kaplan");
		}
		
		if(zodyak == 7) {
			System.out.println("Zodyak Burcunuz: Tavþan");
		}
		
		if(zodyak == 8) {
			System.out.println("Zodyak Burcunuz: Ejderha");
		}
		
		if(zodyak == 9) {
			System.out.println("Zodyak Burcunuz: Yýlan");
		}
		if(zodyak == 10) {
			System.out.println("Zodyak Burcunuz:At");
		}
		
		if(zodyak == 11) {
			System.out.println("Zodyak Burcunuz: Koyun");
		}
		

	}

}
