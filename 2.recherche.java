package ii1202;

public class recherche {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int val=5;
		int[] tab = {9,8,7,6,5,4,3,2,1,0};
		search(val,tab);
	}
	public static void search(int val, int[] tab) {
		// TODO Auto-generated method stub
		int j=-1;
		for (int i=0;i<tab.length;i++){
			if (tab[i]==val){
				j=i;
			}
		}
		System.out.print(j);
	}
}
//exemple 1 : 7 instructions executees
//exemple 2 : 8 instructions
//exemple 3 : 12 instructions
//exemple 4 : 12 instructions 
//Ce nombre dépend de la longueur du tableau
