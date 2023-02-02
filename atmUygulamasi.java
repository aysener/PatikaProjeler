import java.util.Scanner;

public class atmUygulamasi {

	public static void main(String[] args) {
		String userName, password;
        Scanner scan = new Scanner(System.in);
        int right = 3;
        int bakiye = 1500;
        int secim;
        
        System.out.println("Kullanýcý Adýnýzý Girin: ");
        userName =scan.next();
        System.out.println("Þifrenizi Girin: ");
        password =scan.next();
        
        while (right > 0) {
            System.out.println("Kullanýcý Adýnýz :");
            userName = scan.nextLine();
            System.out.println("Parolanýz : ");
            password = scan.nextLine();

            if (userName.equals("patika") && password.equals("dev123")) {
                System.out.println("Merhaba, Kodluyoruz Bankasýna Hoþgeldiniz!");
                do {
                    System.out.println("1- Para yatýrma\n" +
                            "2- Para Çekme\n" +
                            "3- Bakiye Sorgula\n" +
                            "4- Çýkýþ Yap");
                    System.out.print("Lütfen yapmak istediðiniz iþlemi seçiniz : ");
                    secim = scan.nextInt();
                    switch(secim) {
                    case 1:
                        System.out.print("Yatýrmak istediðiniz miktar: ");
                        int paraYatir = scan.nextInt();
                        bakiye += paraYatir;
                    case 2:
                        System.out.print("Çekmek istediðiniz miktar: ");
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
                System.out.println("Tekrar görüþmek üzere.");
                break;
            } 
            else {
                right--;
                System.out.println("Hatalý kullanýcý adý veya þifre. Tekrar deneyiniz.");
                if (right == 0) {
                    System.out.println("Hesabýnýz bloke olmuþtur lütfen banka ile iletiþime geçiniz.");
                } else {
                    System.out.println("Kalan Hakkýnýz : " + right);
                }
            }
        }
       

            
	}

}
