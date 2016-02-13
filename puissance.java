package ii1202;

import java.util.Scanner;

public class regle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Longueur ?");
		int longueur = scan.nextInt();
		System.out.println("Intervalle ?");
		int intervalle = scan.nextInt();
		regle(longueur,intervalle);
	}
	public static void regle(int l, int i){
		for (int n=1; n<=l+1; n++){
			System.out.print("-");
			if (n%i==0){
				System.out.print("|");
			}
		}
	}

}
