import java.util.Scanner;
public class taksimetre {
    public static void main(String argsp[]) {
        double acilis= 10;
        double kmUcreti=2.20;
        double km;

        System.out.println(acilis);

        Scanner scan =new Scanner(System.in);   
        km=scan.nextInt();
        System.out.println("kaç km yol aldınız:" + km);

        double ucret = acilis + km*kmUcreti;
        if (ucret<= 20){
            ucret = 20;

            System.out.println(ucret);

        }
    }
    
}
