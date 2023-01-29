import java.util.Scanner;

public class combinasyonHesapla {
	/* N elemanlý bir kümenin elemanlarý ile 
	 * oluþturulacak r elemanlý farklý gruplarýn 
	 * sayýsý n’in r’li kombinasyonu olarak adlandýrýlýr.
	 *  N’in r’li kombinasyonu C(n,r) þeklinde gösterilir.
	 * C(n,r) = n! / (r! * (n-r)!) */

	public static void main(String[] args) {
		
		
		int array[] = {5,8,11,32,9,7};
		double kombinasyon;
		int fakt=1;
		
		System.out.println("küme Eleman Sayýsý: " + array.length);
		Scanner scan = new Scanner(System.in);			
		System.out.println("Alt Küme Kaç Elemanlý: ");
		int altKume=scan.nextInt();
		int n=array.length;
		int fark=n-altKume;
		int farkf=1;
		int nF=1;
		int altKumeFakt=1;
		
		System.out.println("n-r elemanlar farký: "+ fark);
		
		for(int i=1; i<= n; i++) {
			nF = nF*i;
		
		}
		System.out.println(n +" elemanlý dizinin faktöriyeli: "+ nF);
		
		for(int i=1; i <= altKume; i++) {
			altKumeFakt =altKumeFakt*i;
			
		}
		System.out.println(altKume +" elemanlý alt kümenin faktöriyeli: " + altKumeFakt);
		
		for(int i=1; i<=fark; i++) {
			farkf=farkf*i;
			
		}
		System.out.println("n-r deðerinin faktöriyeli: "+ farkf);
		
		
		kombinasyon= nF / (altKumeFakt * farkf);
		System.out.println("Combinasyon: "+ kombinasyon);
		
		
		
		
		
		
		

	}

}
