package ebobEkok;

import java.util.Scanner;


public class maxminHesapla {

	public static void main(String[] args) {
		//Java ile klavyeden girilen N tane sayma 
		//sayýsýndan en büyük ve en küçük sayýlarý bulan ve bu sayýlarý ekrana yazan program
		
		int n;
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Kaçtane Sayýyý Sýralayacaksýnýz: ");
		n= scan.nextInt();
		int array[] = new int[n];
		System.out.println("Sýralamak istediðiniz Sayýlarý Girin: ");
		for(int i=0; i<n; i++) {			
			array[i]= scan.nextInt();					
			
		}
		
		int enKucuk=array[0];
		int enBuyuk=array[1];
		
		for(int i=0; i<n; i++) {			
			if(array[i]<enKucuk) {
				enKucuk =array[i];
				
			}
			if(array[i]>enBuyuk) {
				enBuyuk =array[i];
				
			}
			
			
		}
		System.out.println("en kucuk: "+ enKucuk);
		System.out.println("en buyuk: "+ enBuyuk);		
		

	}

}
