import java.util.Scanner;

public class combinasyonHesapla {
	/* N elemanl� bir k�menin elemanlar� ile 
	 * olu�turulacak r elemanl� farkl� gruplar�n 
	 * say�s� n�in r�li kombinasyonu olarak adland�r�l�r.
	 *  N�in r�li kombinasyonu C(n,r) �eklinde g�sterilir.
	 * C(n,r) = n! / (r! * (n-r)!) */

	public static void main(String[] args) {
		
		
		int array[] = {5,8,11,32,9,7};
		double kombinasyon;
		int fakt=1;
		
		System.out.println("k�me Eleman Say�s�: " + array.length);
		Scanner scan = new Scanner(System.in);			
		System.out.println("Alt K�me Ka� Elemanl�: ");
		int altKume=scan.nextInt();
		int n=array.length;
		int fark=n-altKume;
		int farkf=1;
		int nF=1;
		int altKumeFakt=1;
		
		System.out.println("n-r elemanlar fark�: "+ fark);
		
		for(int i=1; i<= n; i++) {
			nF = nF*i;
		
		}
		System.out.println(n +" elemanl� dizinin fakt�riyeli: "+ nF);
		
		for(int i=1; i <= altKume; i++) {
			altKumeFakt =altKumeFakt*i;
			
		}
		System.out.println(altKume +" elemanl� alt k�menin fakt�riyeli: " + altKumeFakt);
		
		for(int i=1; i<=fark; i++) {
			farkf=farkf*i;
			
		}
		System.out.println("n-r de�erinin fakt�riyeli: "+ farkf);
		
		
		kombinasyon= nF / (altKumeFakt * farkf);
		System.out.println("Combinasyon: "+ kombinasyon);
		
		
		
		
		
		
		

	}

}
