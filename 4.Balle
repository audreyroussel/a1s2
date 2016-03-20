	
public class Balle{
	
	//attributs
	private float position_initiale;
	private float vitesse_initiale;
	private int instant;
	private float intervalle_temps;
	private float rayon;
	private float masse;
	private float vitesse; 
	private float position; 
	
	//constructeur: On initialise les valeurs de notre objet
	public Balle(float position_initiale,float vitesse_initiale,float intervalle_temps,float instant,float rayon,float masse){
		this.position_initiale=position_initiale;
		this.vitesse_initiale=vitesse_initiale;
		this.intervalle_temps=intervalle_temps;
		this.vitesse=vitesse_initiale;
		this.position=position_initiale;
		this.rayon=rayon;
		this.masse=masse;//masse en kg
		this.instant=(int) instant;

	}
	//getters
	public float getposition_initiale(){
		return position_initiale;
	}
	public float getvitesse_initiale(){
		return vitesse_initiale;
	}
	public float getrayon(){
		return rayon;
	}
	public float getmasse(){
		return masse;
	}
	public float getinstant(){
		return instant;
	}
	public float getintervalle_temps(){
		return intervalle_temps;
	}
	public float getvitesse(){
		return vitesse;
	}
	public float getposition(){
		return position;
	}
	public void setvitesse(float vit){
		this.vitesse=vit;
	}
	public void setposition(float pos){
		this.position=pos;
	}
	public float calculvitesse(){
		float g=(float) 9.81;
		vitesse=vitesse + g*intervalle_temps;
		setvitesse(vitesse);
		return vitesse;
	}
	public float calculposition(){
		float position=getposition();
		position=position - vitesse*intervalle_temps;
		
		setposition(position);
		return position;
	}
	public void affiche_vitesse(){
		System.out.println("La vitesse est de :"+getvitesse());
	}
	public void affiche_position(){
		System.out.println("La position est de :"+getposition());
	}
	

}

			
