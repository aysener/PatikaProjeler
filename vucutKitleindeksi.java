import java.util.Scanner;

public class vucutKitleindeksi {
    public static void main(String[] args) {
        double boy;
        int kilo;
        double kitleEndeksi;

        Scanner scan=new Scanner(System.in);
        System.out.print("Boyunuzu girin:");
        boy=scan.nextDouble();
        System.out.print("Kilonuzu girin:");
        kilo=scan.nextInt();

        kitleEndeksi = kilo/(boy*boy);

        System.out.println("Vücut Kitle İndeksiniz:" + kitleEndeksi);

        
        
    }
    
}
