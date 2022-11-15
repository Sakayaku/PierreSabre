package personnages;

public class Ronin extends Humain {
	private int attributHonneur=1;
	
	public Ronin(String nom, String boissonFavorite, int quantiteArgent) {
		super(nom, boissonFavorite, quantiteArgent);
	}
	public void donner(Commercant beneficiaire) {
		int argentDonne= quantiteArgent/10;
		quantiteArgent-=argentDonne;
		parler(beneficiaire.getNom()+" prend ces "+argentDonne+" sous.");
		beneficiaire.recevoir(argentDonne);
	}
}
