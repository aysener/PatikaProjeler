import java.util.Scanner;

public class EtkinlikOner {

	public static void main(String[] args) {
		 System.out.println("Hangi Etkinl�i Yapmal�y�m.");
		 int sicaklik;
		
         Scanner scan =new Scanner(System.in);
         System.out.println("Hava Ka� Derece?");
         sicaklik=scan.nextInt();
       
        if( sicaklik<=5){
        	 System.out.println("Kayak yapabilirsin.");
        }
        if( 5<sicaklik & sicaklik <15){
       	 System.out.println("Sinemaya Gidebilirsin.");
       }
        if(15< sicaklik & sicaklik<25){
       	 System.out.println("Piknik yapabilirsin.");
       }
        if( 25<=sicaklik){
       	 System.out.println("Y�zebilirsin.");
       }
       
         
         

	}

}
