
public class fibonacci {

	public static void main(String[] args) {
		int fibonacci;
		int n1=0, n2=1;
		
		for(int i=0; i<=10; i++) {
			fibonacci = n1+n2;
			System.out.println(fibonacci );
			n1=n2;
			n2=fibonacci;
		}

	}

}
