import java.util.Scanner;

public class SayiSirala {

	public static void main(String[] args) {
		  int [] sayilar = new int[5];
		  int temp;
		  
		  Scanner scan= new Scanner(System.in);
	         
	        for(int i = 0; i<5; i++)
	        {
	        	
	            System.out.print("Dizinin elemanýnlarýný giriniz: ");
	            sayilar[i] = scan.nextInt();
	        }
	        System.out.println("Dizinin kucukten buyuge dogru sýralanmýs hali:\n");
	        for(int i = 0; i < 4; i++)
	        {
	            for(int j = i+1; j <5; j++)
	            {
	                if(sayilar[j] < sayilar[i]) {
	                    temp = sayilar[i];
	                    sayilar[i] = sayilar[j];
	                    sayilar[j] = temp;
	                }
	            }
	        }
	        for(int i = 0; i <5; i++)
	        {
	            System.out.println("Dizinin " + (i+1) + ". elemanýný : " + sayilar[i]);
	        }
	    }
	
			
		}
		
	

	
	


