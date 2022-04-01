import java.util.Scanner;
class manavKasa{
  public static void main(String args[]){
    double elmaKilo, elma=3.67;
    double armutKilo, armut=2.14;
    double domatesKilo, domates=1.11;
    double muzKilo, muz=4.50;
    double patlicanKilo, patlican=3.00;

    Scanner kilo = new Scanner(System.in);
    System.out.print("Kaç kilo elma:");
    elmaKilo = kilo.nextInt();
     System.out.print("Kaç kilo armut:");
    armutKilo = kilo.nextInt();
     System.out.print("Kaç kilo domates:");
    domatesKilo = kilo.nextInt();
     System.out.print("Kaç kilo muz:");
    muzKilo = kilo.nextInt();
     System.out.print("Kaç kilo patlican:");
    patlicanKilo = kilo.nextInt();

    double elmaFiyat=elmaKilo * elma;
    double armutFiyat =armutKilo * armut;
    double domatesFiyat=domatesKilo * domates;
    double muzFiyat=muzKilo * muz;
    double patlicanFiyat=patlicanKilo * patlican;

    double toplamFiyat = elmaFiyat +  armutFiyat +  domatesFiyat + muzFiyat + patlicanFiyat;
    System.out.print("odemeniz gereken Toplam ucret: " + toplamFiyat);
    }
}