import java.util.Scanner;

public class ucakBiletiFiyati {

	public static void main(String[] args) {
		int yas;
		float mesafe, indirimliTutar;
		int yolculuk;
		
		
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Gidece�iniz mesafeyi Km olarak girin:");
		mesafe=scan.nextFloat();
		System.out.println("Ya��n�z:");
		yas=scan.nextInt();
		
		
		double anaTutar=mesafe * 0.10;
		System.out.println("Fiyat:" + anaTutar);
		
		
		System.out.println("L�tfen yolculuk Tipini se�in ?\n 1-tek y�n \n 2- �ift y�n");
		yolculuk=scan.nextInt();
		
		
		
		if(yas<=12) {
			indirimliTutar= (float) (anaTutar * 0.50);
			System.out.println("�ndirimli yeni Fiyat:" + indirimliTutar);
			if(yolculuk==2) {
				indirimliTutar=(float) (indirimliTutar*0.8);
				System.out.println("%20 �ndirimli yeni Fiyat:" + indirimliTutar);
				
			}
			
		}
		else if(yas<=24) {
			indirimliTutar= (float) (anaTutar * 0.90);
			System.out.println("�ndirimli yeni Fiyat:" + indirimliTutar);
			if(yolculuk==2) {
				indirimliTutar=(float) (indirimliTutar*0.8);
				System.out.println("%20 �ndirimli yeni Fiyat:" + indirimliTutar);
				
			}
		}
		else if(yas>=65) {
			indirimliTutar= (float) (anaTutar * 0.70);
			System.out.println("�ndirimli yeni Fiyat:" + indirimliTutar);
			if(yolculuk==2) {
				indirimliTutar=(float) (indirimliTutar*0.8);
				System.out.println("%20 �ndirimli yeni Fiyat:" + indirimliTutar);
				
			}
			
		}
		else {
			System.out.println("�demeniz gereken fiyat:" + anaTutar);
		}

	}

}
