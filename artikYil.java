import java.util.Scanner;

public class artikYil {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Hesaplamak istedi�iniz y�l� girin:");
		int year = scan.nextInt();
		
		if(year %4== 0) {	
			if(year % 100 == 0) {
				if(year %400 ==0) {
					System.out.println(year + " Y�l� Bir art�k y�ld�r.");
					
				}
				else {
					System.out.println(year + " Y�l� Bir art�k y�l de�ildir(100 �n kat�).");
				}
						
			}
		
			else{
				System.out.println(year + " Y�l� Bir art�k y�ld�r.");	}			
						
						
		}		
		
		else {
			System.out.println(year + " Y�l� Bir art�k y�l de�ildir.");
		}
		

	}

}
