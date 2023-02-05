
public class asalSayilar {

	public static void main(String[] args) {
		int sayac, sayi;
		for(int i=2; i<=100; i++){
			sayac=0;
			for(int j=2; j<=i/2 ;j++) {
				if(i % j ==0)
					sayac++;
			}
			
			if(sayac ==0) {
				System.out.println(+i);
			}
				
		}

	}

}
