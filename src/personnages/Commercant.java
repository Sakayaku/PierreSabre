package personnages;

public class Commercant extends Humain {

	public Commercant(String nom, int quantiteArgent) {
		super(nom, "thé", quantiteArgent);
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
