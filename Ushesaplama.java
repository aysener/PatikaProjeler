import java.util.Scanner;

public class Ushesaplama {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Üssü alýnacak Sayýyý Girin: ");
		int sayi = sc.nextInt();
		System.out.println("Sayýnýn hangi kuvvetini nulmak istiyorsunuz: ");
		int kuvvet=sc.nextInt();
		int us=1;
		
		for(int i =1; i<=kuvvet; i++) {
			us*=sayi;		
			
		}
		System.out.println("Sayýnýn " + kuvvet +". Kuvveti: " + us);
		

	}

}
