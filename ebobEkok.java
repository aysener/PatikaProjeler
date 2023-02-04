package ebobEkok;

import java.util.Scanner;

public class ebobEkok {

	public static void main(String[] args) {
		
		int s1, s2;
		int ebob=0, ekok=1;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Ýlk Sayi: ");
		s1=scan.nextInt();
		System.out.println("Ýkinci Sayi: ");
		s2=scan.nextInt();
		
		
		int i=1;
		while(i<= s1) {
			i++;
			if(s1 % i == 0 && s2 %i ==0)
				ebob=i;
		}
		System.out.println("EBOB: " + ebob);
		
		int k=1;
		while(k <= (s1*s2)) {
			k++;
			if(k % s1 == 0 && k % s2 ==0) {
				System.out.println("EKOK: "+k);
				break;
			}
			
		}
		

	}

	
}
