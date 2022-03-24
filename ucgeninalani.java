import java.util.Scanner;

public class ucgeninalani{
    public static void main(){
        int a, b, c;
        double u;
        double A;

        Scanner scan = new Scanner(System.in);
        System.out.println("a kenarını girin");
        a=scan.nextInt();

        System.out.println("b kenarını girin");
        b=scan.nextInt();

        System.out.println("c kenarını girin");
        c=scan.nextInt();

        u=(a+b+c)/2;

        A=Math.sqrt(u*(u-a)*(u-b)*(u-c));
        System.out.println("Üçgenin alani:" + A);

    }
}