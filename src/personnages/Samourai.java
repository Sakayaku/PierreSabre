package personnages;
import personnages.Humain; 

public class Samourai extends Ronin {
	private String Seigneur;
	private String boisson;
	public Samourai(String Seigneur, String nom, String boissonFavorite, int quantiteArgent) {
		super(nom, boissonFavorite, quantiteArgent);
		this.Seigneur=Seigneur;
	}
	@Override
	public void direBonjour() {
		super.direBonjour();
		parler("Je suis fier de servir le seigneur "+Seigneur);
	}
	public void boire(String boisson) {
		parler("Qu'est-ce que je vais chosir comme boisson? Tiens je vais prendre du "+ boisson);
	}
	

}
