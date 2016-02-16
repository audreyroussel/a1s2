//a rendre
//indice -1 si echec
public class dichotomie {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] tab = {1,2,3,4,5,6,7,8,9};
		int v=9;
		int indicemin=0;
		int indicemax=tab.length;
		int a= tab.length/2;
		int n=0;
		while (tab[a]!=v){
			if (tab[a]>v){
				indicemax=tab[a];
				a=(indicemax+indicemin)/2;
				n=a;
			}
			if (tab[a]<v){
				indicemin=tab[a];
				a=(indicemax+indicemin)/2;
				n=a;
			}
		}
		System.out.println("Indice : " + n);
	}

}
