import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	int a,b,secim;
    Scanner scan = new Scanner(System.in);
    System.out.print("ilk sayiyi girin: ");
    a = scan.nextInt();
    System.out.print("ikinci sayiyi girin: ");
    b = scan.nextInt();

    System.out.print("Bir işlem seçin: ");

    System.out.print("1-Toplama \n 2-Cıkarma \n 3-Carpma \n 4-Bolme\n");
    secim = scan.nextInt();

    switch (secim){
        case 1:
            System.out.println("Toplam =" + (a+b));
            break;
        case 2:
            System.out.print("Toplam =" + (a+b));
            break;
        case 3:
            System.out.print("Toplam =" + (a+b));
            break;
        case 4:
            System.out.print("Toplam =" + (a+b));
            break;
        default:
            System.out.print("geçersiz işlem. Lüten 1 ile 4 arasında bir sayı seçin.");

    }

    }
}
