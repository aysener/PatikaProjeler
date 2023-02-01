import java.util.Scanner;

public class numberSum {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Sayý Giriniz :");
		int number = input.nextInt();
		int count= 0, basSum=0;
		
        
        while (number != 0){
        	int basValue =number %10 ;
            basSum = basSum + basValue;
            number  = number/10;
            count++;
        }
        System.out.println("Sayýnýn basamak deðerleri toplamý: "+ basSum);       

    }
}
