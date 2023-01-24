import java.util.Scanner;

public class artikYil {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Hesaplamak istediðiniz yýlý girin:");
		int year = scan.nextInt();
		
		if(year %4== 0) {	
			if(year % 100 == 0) {
				if(year %400 ==0) {
					System.out.println(year + " Yýlý Bir artýk yýldýr.");
					
				}
				else {
					System.out.println(year + " Yýlý Bir artýk yýl deðildir(100 ün katý).");
				}
						
			}
		
			else{
				System.out.println(year + " Yýlý Bir artýk yýldýr.");	}			
						
						
		}		
		
		else {
			System.out.println(year + " Yýlý Bir artýk yýl deðildir.");
		}
		

	}

}
