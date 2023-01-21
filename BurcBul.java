import java.text.SimpleDateFormat;
import java.util.Scanner;

public class BurcBul {

	public static void main(String[] args) {
		
		
		int gun, ay;
		
		Scanner scan= new Scanner(System.in);
		System.out.println("Doðduðunuz ayý ve günü girin.\nAy:");
		ay=scan.nextInt();
		System.out.println("Gün:");
		gun=scan.nextInt();
		
		if(ay==1) {
			if(gun==1 || gun<=21) {
				System.out.println("Oðlak Burcu");
			}
			else if(gun>=22 || gun<=31) {
				System.out.println("Kova Burcu");
			}
			else {
				System.out.println("Girdiðiniz tarih geçersiz.");
			}
			
		}
		
		else if(ay==2) {
        	if(gun==1 || gun<=19) {
				System.out.println("Kova Burcu");
			}
        	else if(gun>=20 || gun<=29) {
				System.out.println("Balýk Burcu");
			}
        	else {
        		System.out.println("Girdiðiniz tarih geçersiz. .");
        	}
			
			
		}
        
        
        if(ay==3) {
        	if(gun==1 || gun<=20) {
				System.out.println("Balýk Burcu");
			}
        	else if(gun>=21 || gun<=31) {
				System.out.println("Koç Burcu");
			}
			else {
				System.out.println("Girdiðiniz tarih geçersiz. ");
			}
			
			
		}

        if(ay==4) {
        	if(gun==1 || gun<=20) {
				System.out.println("Koç Burcu");
			}
        	else if(gun>=21 || gun<=30) {
				System.out.println("Boða Burcu");
			}
			else {
				System.out.println("Girdiðiniz tarih geçersiz. .");
			}
	
	
        }


        if(ay==5) {
        	if(gun==1 || gun<=21) {
				System.out.println("Boða Burcu");
			}
        	else if(gun>=22 || gun<=31) {
				System.out.println("Ýkizler Burcu");
			}
			else {
				System.out.println("Girdiðiniz tarih geçersiz.");
			}
	
	
        }

        if(ay==6) {
        	if(gun==1 || gun<=22) {
				System.out.println("Ýkizler Burcu");
			}
        	else if(gun>=23 || gun<=30) {
				System.out.println("Yengeç Burcu");
			}
			else {
				System.out.println("Girdiðiniz tarih geçersiz.");
			}
	
	
        }

        if(ay==7) {
        	if(gun==1 || gun<=22) {
				System.out.println("Yengeç Burcu");
			}
        	else if(gun>=23 || gun<=31) {
				System.out.println("Aslan Burcu");
			}
			else {
				System.out.println("Girdiðiniz tarih geçersiz. Yeniden girin.");
			}
	
	
        }


        if(ay==8) {
        	if(gun==1 || gun<=22) {
				System.out.println("Aslan Burcu");
			}
        	else if(gun>=23 || gun<=31) {
				System.out.println("Baþak Burcu");
			}else {
				System.out.println("Girdiðiniz tarih geçersiz. Yeniden girin.");
			}
	
	
        }
        
        if(ay==9) {
        	if(gun==1 || gun<=22) {
				System.out.println("Baþak Burcu");
			}
        	else if(gun>=23 || gun<=30) {
				System.out.println("Terazi Burcu");
			}
			else {
				System.out.println("Girdiðiniz tarih geçersiz. Yeniden girin.");
			}
	
	
        }
        
        if(ay==10) {
        	if(gun==1 || gun<=22) {
				System.out.println("Terazi Burcu");
			}
        	else if(gun>=23 || gun<=31) {
				System.out.println("Akrep Burcu");
			}
			else {
				System.out.println("Girdiðiniz tarih geçersiz. Yeniden girin.");
			}
	
	
        }
        
        if(ay==11) {
        	if(gun==1 || gun<=22) {
				System.out.println("Akrep Burcu");
			}
        	else if(gun>=23 || gun<=31) {
				System.out.println("Yay Burcu");
			}
			else {
				System.out.println("Girdiðiniz tarih geçersiz..");
			}
	
	
        }
        
        if(ay==12) {
        	if(gun==1 || gun<=22) {
				System.out.println("Yay Burcu");
			}
        	else if(gun>=23 || gun<=31) {
				System.out.println("Oðlak Burcu");
			}
			else {
				System.out.println("Girdiðiniz tarih geçersiz.");
			}
	
	
        }

	
		     

		


	}

}
