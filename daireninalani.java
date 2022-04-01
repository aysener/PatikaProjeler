import java.util.Scanner;

class daireninalani {
    public static void main(String args[]){
        int r;
        double pi = 3.14;
        int a;
        double alan;

        Scanner scan = new Scanner(System.in);
        System.out.print("yariçapı girin:");
        r = scan.nextInt();
        System.out.print(" daire diliminin açısını girin:");
        a = scan.nextInt();

        alan = pi*r*r*a/360;

        System.out.println("Alan = "+ alan);

        

    }
    
}
