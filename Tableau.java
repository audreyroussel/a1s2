package ii1202;

public class Tableau {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		table(10);
	}
	public static void table(int n){
		for (int i=0;i<=n;i++){
			for (int j=0;j<=n;j++){
				System.out.print(i*j);
				System.out.print(" ");
			}

			System.out.println();
		}
	}
}
