//question 3.2.1
public class moyenne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] tab = {2,4,2,9,3,6,7,1,2};
		double mean=mean(tab);
		System.out.println("Moyenne : ");
		System.out.println(mean);
		int a = indice(tab,mean);
		System.out.println("Indice : ");
		System.out.println(a);
		System.out.println("Partition : ");
		int part[]=partition(tab, mean);
		for (int i=0; i<tab.length; i++){
			System.out.print(tab[i]+ "   ");
		}
	}
	
	public static double mean(int[] tab){
		double somme=0;
		double n=0;
		for (int i=0; i<tab.length; i++){
			somme=somme+tab[i];
			n=n+1;
		}
		double m=somme/n;
		return (m);
	}
	public static int indice(int[] tab, double mean){
		int a = 0;
		for (int i=0; i<tab.length; i++){
			if (mean-tab[i]<0.00001){
				a=i;
				break;
			}
		}
		return a;
	}
	public static int[] partition (int[] tab, double mean){
		int temp, a=0;
		int b=tab.length-1;
		for (int i=0; i<tab.length && (b-a>0); ++i){
			if (tab[a]>=mean && tab[b]<mean){
				temp = tab[a];
				tab[a]=tab[b];
				tab[b]=temp;
				++a; --b;
			}
			if (tab[a]<mean){
				++a;
			}
			if (tab[b]>mean){
				--b;
			}
		}
		return tab;
	}
}
