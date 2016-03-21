import java.util.Scanner;

public class premier {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("n ?");
		int n = scan.nextInt();
		int[] crible=tableau(n);
		int[] tab={1,2,3,4,5,6,7,8,9};
		eratostheneR(tab);
	}
	public static int[] tableau(int n){
		int[] crible = new int[n+1];
		for (int i=0; i<n+1; i++){
			crible[i]=i;
		}
		crible[1]=0;
		System.out.print(crible[0]+" "+crible[1]+" ");
		for (int i=2; i<n+1; i++){
			if (crible[i]!=0){
				for (int j=i*2; j<n+1; j+=i){
					if (crible[j]%crible[i]==0){
						crible[j]=0;
					}
				}
			}
			System.out.print(crible[i]+ " ");
		}
		return (crible);
		
	}
	public static void eratostheneR(int[] tab){
	for (int i=0; i<tab.length; i++){
		tab[i]=i;
	}
	tab[1]=0;
	eratostheneR(tab);
	}
	
	public static void eratostheneR(int[] tab, int i){
		if (tab[i]==0){
			for (int k=i*i; k<tab.length; k+=1){
				tab[k]=0;
			}
			if (i!=tab.length-1){
				eratostheneR(tab,i+1);
			}
		}
	}
}
