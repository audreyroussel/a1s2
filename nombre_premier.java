package ii1202;

import java.util.Scanner;

public class nombre_premier {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("n ?");
		int n = scan.nextInt();
		nombre_premier_bis(n);
		
		
	}
	public static void nombre_premier_bis(int n){
		int b=1;
		if (n>=2) {
			for (int i=2; i<n; i++){
				if (n%i==0){
					b=0; 
				}
			}
		}
		System.out.println(b);
				
	}
}
