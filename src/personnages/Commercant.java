package personnages;

public class Commercant extends Humain {

	public Commercant(String nom, String boissonFavorite, int quantiteArgent) {
		super(nom, "thé", quantiteArgent);
		// TODO Auto-generated constructor stub
	}
	public int seFaireExtorquer() {
		parler("J'ai tout perdu! Le monde est trop injuste...");
		quantiteArgent=0;
		return 0;
	}
	public void recevoir(int argent) {
		quantiteArgent+=argent;
		parler(argent+" sous! Je te remercie généreux donateur!");
	}
	
}
