import java.util.Scanner;

public class harmonikSayi {

	public static void main(String[] args) {
		int sayi;
		double Toplam=0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("sayi Girin: ");
		sayi = sc.nextInt();
		
		for(double i =1; i<=sayi; i++) {
			double harmonik = 1/i;
			Toplam = Toplam + harmonik;		
			
		}
		
		System.out.println("harmonik toplam: "+ Toplam);	
		
	}
	
}
