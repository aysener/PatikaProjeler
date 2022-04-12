import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here
        String  kullaniciAdi ="aysnr";
        String  password ="123456";

        Scanner scan= new Scanner(System.in);
        System.out.println("kullanici adınızı girin:");
        String kullanici  = scan.next();
        System.out.println("şifrenizi girin:");
        String sifre = scan.next();

        if(kullaniciAdi == kullanici && password == sifre){
            System.out.print("Giriş Başarılı Sayfay yönlendiriliyorsunuz...");
        }
        else if(kullaniciAdi == kullanici && password != sifre){
            System.out.print("Hatalı sifre girdiniz");
        }
        else if(kullaniciAdi != kullanici && password == sifre){
            System.out.print("Kullanici adi hatali");
        }
        else if(kullaniciAdi != kullanici && password != sifre){
            System.out.print("Kullanici adi ve şifre hatali \n Bilgilerinizi mi unuttunuz.");
        }

    }
}
