import java.text.SimpleDateFormat;
import java.util.Scanner;

public class BurcBul {

	public static void main(String[] args) {
		
		
		int gun, ay;
		
		Scanner scan= new Scanner(System.in);
		System.out.println("Do�du�unuz ay� ve g�n� girin.\nAy:");
		ay=scan.nextInt();
		System.out.println("G�n:");
		gun=scan.nextInt();
		
		if(ay==1) {
			if(gun==1 || gun<=21) {
				System.out.println("O�lak Burcu");
			}
			else if(gun>=22 || gun<=31) {
				System.out.println("Kova Burcu");
			}
			else {
				System.out.println("Girdi�iniz tarih ge�ersiz.");
			}
			
		}
		
		else if(ay==2) {
        	if(gun==1 || gun<=19) {
				System.out.println("Kova Burcu");
			}
        	else if(gun>=20 || gun<=29) {
				System.out.println("Bal�k Burcu");
			}
        	else {
        		System.out.println("Girdi�iniz tarih ge�ersiz. .");
        	}
			
			
		}
        
        
        if(ay==3) {
        	if(gun==1 || gun<=20) {
				System.out.println("Bal�k Burcu");
			}
        	else if(gun>=21 || gun<=31) {
				System.out.println("Ko� Burcu");
			}
			else {
				System.out.println("Girdi�iniz tarih ge�ersiz. ");
			}
			
			
		}

        if(ay==4) {
        	if(gun==1 || gun<=20) {
				System.out.println("Ko� Burcu");
			}
        	else if(gun>=21 || gun<=30) {
				System.out.println("Bo�a Burcu");
			}
			else {
				System.out.println("Girdi�iniz tarih ge�ersiz. .");
			}
	
	
        }


        if(ay==5) {
        	if(gun==1 || gun<=21) {
				System.out.println("Bo�a Burcu");
			}
        	else if(gun>=22 || gun<=31) {
				System.out.println("�kizler Burcu");
			}
			else {
				System.out.println("Girdi�iniz tarih ge�ersiz.");
			}
	
	
        }

        if(ay==6) {
        	if(gun==1 || gun<=22) {
				System.out.println("�kizler Burcu");
			}
        	else if(gun>=23 || gun<=30) {
				System.out.println("Yenge� Burcu");
			}
			else {
				System.out.println("Girdi�iniz tarih ge�ersiz.");
			}
	
	
        }

        if(ay==7) {
        	if(gun==1 || gun<=22) {
				System.out.println("Yenge� Burcu");
			}
        	else if(gun>=23 || gun<=31) {
				System.out.println("Aslan Burcu");
			}
			else {
				System.out.println("Girdi�iniz tarih ge�ersiz. Yeniden girin.");
			}
	
	
        }


        if(ay==8) {
        	if(gun==1 || gun<=22) {
				System.out.println("Aslan Burcu");
			}
        	else if(gun>=23 || gun<=31) {
				System.out.println("Ba�ak Burcu");
			}else {
				System.out.println("Girdi�iniz tarih ge�ersiz. Yeniden girin.");
			}
	
	
        }
        
        if(ay==9) {
        	if(gun==1 || gun<=22) {
				System.out.println("Ba�ak Burcu");
			}
        	else if(gun>=23 || gun<=30) {
				System.out.println("Terazi Burcu");
			}
			else {
				System.out.println("Girdi�iniz tarih ge�ersiz. Yeniden girin.");
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
				System.out.println("Girdi�iniz tarih ge�ersiz. Yeniden girin.");
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
				System.out.println("Girdi�iniz tarih ge�ersiz..");
			}
	
	
        }
        
        if(ay==12) {
        	if(gun==1 || gun<=22) {
				System.out.println("Yay Burcu");
			}
        	else if(gun>=23 || gun<=31) {
				System.out.println("O�lak Burcu");
			}
			else {
				System.out.println("Girdi�iniz tarih ge�ersiz.");
			}
	
	
        }

	
		     

		


	}

}
