import java.util.Scanner;

public class atmUygulamasi {

	public static void main(String[] args) {
		String userName, password;
        Scanner scan = new Scanner(System.in);
        int right = 3;
        int bakiye = 1500;
        int secim;
        
        System.out.println("Kullan�c� Ad�n�z� Girin: ");
        userName =scan.next();
        System.out.println("�ifrenizi Girin: ");
        password =scan.next();
        
        while (right > 0) {
            System.out.println("Kullan�c� Ad�n�z :");
            userName = scan.nextLine();
            System.out.println("Parolan�z : ");
            password = scan.nextLine();

            if (userName.equals("patika") && password.equals("dev123")) {
                System.out.println("Merhaba, Kodluyoruz Bankas�na Ho�geldiniz!");
                do {
                    System.out.println("1- Para yat�rma\n" +
                            "2- Para �ekme\n" +
                            "3- Bakiye Sorgula\n" +
                            "4- ��k�� Yap");
                    System.out.print("L�tfen yapmak istedi�iniz i�lemi se�iniz : ");
                    secim = scan.nextInt();
                    switch(secim) {
                    case 1:
                        System.out.print("Yat�rmak istedi�iniz miktar: ");
                        int paraYatir = scan.nextInt();
                        bakiye += paraYatir;
                    case 2:
                        System.out.print("�ekmek istedi�iniz miktar: ");
                        int paraCek = scan.nextInt();
                        if (paraCek > bakiye) {
                            System.out.println("Bakiye yetersiz.");
                        } 
                        else {
                            bakiye -= paraCek;
                        }
                    case 3:
                        System.out.println("Bakiyeniz : " + bakiye);
                    
                    }
                    
                }
                while (secim != 4);
                System.out.println("Tekrar g�r��mek �zere.");
                break;
            } 
            else {
                right--;
                System.out.println("Hatal� kullan�c� ad� veya �ifre. Tekrar deneyiniz.");
                if (right == 0) {
                    System.out.println("Hesab�n�z bloke olmu�tur l�tfen banka ile ileti�ime ge�iniz.");
                } else {
                    System.out.println("Kalan Hakk�n�z : " + right);
                }
            }
        }
       

            
	}

}
