import java.util.Scanner;
public class notHesaplama{
    public static void main(String[] args) {
        int matematik, fizik,kimya,turkce;
        int ortalama;
        Scanner scan = new Scanner(System.in);

        System.out.println("Matematik notunuz:");
        matematik =scan.nextInt();

        System.out.println("Fizik notunuz:");
        fizik = scan.nextInt();

        System.out.println("Kimya notunuz:");
        kimya = scan.nextInt();

        System.out.println("Turkce notunuz:");
        turkce =scan.nextInt();

        ortalama = (matematik + fizik + turkce + kimya)/4;
        System.out.println("Ortalamanız: " + ortalama);

        System.out.print("bir cae seçin:");

        switch (ortalama) {
            case 1:
                System.out.println("geçtiniz..");                
                break;
            case 2:
                System.out.println("kaldınız:");
                break;        
            default:
                System.out.println("gçersiz not.");
                break;
        }
    
    }
}



