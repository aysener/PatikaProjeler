import java.util.*;
public class kdvHesaplama {

    Scanner scan= new Scanner(System.in);
    System.out.print("bir sayi girin:" );
    int sayi = scan.nextInt();
    if(sayi>0 && sayi<=1000){
        double kdv=0.18;

    }
    else if(sayi>1000){
       double  kdv = 0.08;
    }
    kdvliFiyat=kdv*sayi + sayi;
    System.out.println("KDV'li yeni fiyat:"+kdvliFiyat);

    System.out.println("KDV'li yeni fiyat:");
    System.out.println("KDV'li yeni fiyat1:");
    
}
}
