//question 3.3
public class tri {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] tab = {10,4,2,9,3,6,7,1,2};
		int tri[]=tri1(tab);
		for (int i=0; i<tri.length; i++){
			System.out.print(tab[i]+ "   ");
		}
	}
	public static int[] tri1(int[] tab){
		int temp = 0;
		for (int i=0; i<tab.length; i++){
			for (int j=0; j<tab.length; j++){
				if (tab[i]<tab[j]){
					temp = tab[i];
					tab[i]=tab[j];
					tab[j]=temp;
				}
			}
		}
		return tab;
	}
}
