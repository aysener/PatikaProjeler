import java.util.Scanner;

public class usAlma {

	public static void main(String[] args) {
		
		int n=1;
		int m=1;
        
		Scanner scan = new Scanner(System.in);
		System.out.println("S�n�r de�erini belirleyin: ");
		int sayi= scan.nextInt();
		
		for(int i =1; i<= sayi; i++) {
			
			n=n*4;			
			System.out.println("4'�n " + i + ". kuvveti: " + n);			
			
		}
		System.out.println("---------------------");
		
		for(int i =1; i<= sayi; i++) {			
					
			m=m*5;
			System.out.println("5'in "+ i +". kuvveti: " + m);
		}
		
		
			
		
		

	}

}
