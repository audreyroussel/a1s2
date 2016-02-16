import java.util.Scanner;

//question 3.1
public class tableau1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Lignes ?");
		int lignes = scan.nextInt();
		System.out.println("Colonnes ?");
		int colonnes = scan.nextInt();
		int[][] valeurs= new int [lignes][colonnes];
		for (int i=0; i<lignes; i++){
			for (int j=0; j<colonnes; j++){
				System.out.println("Prochaine valeur ?");
				valeurs[i][j] = scan.nextInt();
			}
		}
		table_affichage(valeurs, lignes, colonnes);
	}
	public static void table_affichage(int[][] valeurs, int lignes, int colonnes){
		for (int i=0; i<lignes; i++){
			for (int j=0; j<colonnes; j++){
				System.out.print(valeurs[i][j]+ "   ");
			}
			System.out.println("");
		}
	}
	
}
