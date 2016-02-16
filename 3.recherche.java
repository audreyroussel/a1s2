//question 3.4
public class recherche {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] tab = {2,4,6,9,3,6,7,1,2};
		int v = 6;
		int a=indice(tab, v);
		System.out.println("Indice : " + a);

	}
	public static int indice(int[] tab, int v){
		int a = 0;
		for (int i=0; i<tab.length; i++){
			if (tab[i]==v){
				a=i;
				break;
			}
		}
		return a;
	}
}
//Si v est au début, il faudra 1 itération
//Si v est a la fin, il faudra tab.length itérations
//En moyenne, il faut tab.length itérations
