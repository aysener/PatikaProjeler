import java.util.Scanner;

public class avarageOddNumber {

	public static void main(String[] args) {
		
		int sum=0;
		int count=0;
		float avarage;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lütfen Bir sayý Giriniz.");
		int number=scan.nextInt();
		
		for(int i=1; i<= number; i++) {
			if(i%3 == 0 && i%4 == 0) {
				sum=sum+i;
				count=count+1;
				
				
			}
			
		}
		System.out.println("Toplam:"+sum );
		avarage = sum/count;
		System.out.println("Ortalama:"+avarage );
		
	

	}

}
