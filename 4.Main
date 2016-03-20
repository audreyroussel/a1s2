public class Main {
	public static void main(String [] args){
		StdDraw.setXscale(-330, 330);
		StdDraw.setYscale(-660,3);
		
		Balle balle1=new Balle(3,0,1,11,10,3);// création d'une instance d'objet
		//On considère que le plafond se trouve à 3m
		//On calcule vitesse et position toutes les secondes
		float n=(balle1.getinstant())/balle1.getintervalle_temps();
		for (int i=0;i<n;i++){
			balle1.calculvitesse();
			float a=balle1.calculposition();
			StdDraw.filledCircle(1, a, 10);
			StdDraw.show(40);
			StdDraw.clear();
			balle1.affiche_position();
			balle1.affiche_vitesse();
		}
		balle1.affiche_position();
		}
}
