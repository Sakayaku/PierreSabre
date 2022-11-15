package personnages;

public class Ronin extends Humain {
	private int honneur=1;
	
	public Ronin(String nom, String boissonFavorite, int quantiteArgent) {
		super(nom, boissonFavorite, quantiteArgent);
	}
	public void donner(Commercant beneficiaire) {
		int argentDonne= quantiteArgent/10;
		quantiteArgent-=argentDonne;
		parler(beneficiaire.getNom()+" prend ces "+argentDonne+" sous.");
		beneficiaire.recevoir(argentDonne);
	}
	public void provoquer(Yakuza adversaire) {
		int force=2*honneur;
		if (force>= adversaire.getReputation()) {
			parler("Je t'ai retrouvé vermine, tu vas payer pour ce que tu as fait à ce pauvre marchand!");
			quantiteArgent+=adversaire.quantiteArgent;
			honneur+=1;
			parler("Je t'ai eu petit yakusa!");
			adversaire.perdre();
		}else {
			honneur-=1;
			parler("J'ai perdu contre ce yakuza, mon honneur et ma bourse ont en pris un coup.");
			adversaire.gagner(quantiteArgent);
			quantiteArgent=0;
		}
	}
}
