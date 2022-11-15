package personnages;

public class Yakuza extends Humain{
	private int reputation=0;
	public Yakuza(String nom, String boissonFavorite, int quantiteArgent, String clan) {
		super(nom, boissonFavorite, quantiteArgent);
	}
	public void extorquer(Commercant victime) {
		int argentVictime;
		String nomVictime=victime.getNom();
		parler("Tiens, tiens, ne serait-ce pas un faible marchand qui passe par là?");
		parler(nomVictime+", si tu tiens à la vie donne moi ta bourse!");
		argentVictime=victime.quantiteArgent;
		victime.seFaireExtorquer();
		quantiteArgent+=argentVictime;
		reputation+=1;
		parler("J'ai piqué les "+argentVictime+" sous de "+nomVictime+" ce qui me fait "+quantiteArgent+" sous dans ma poche. Hi! Hi!");
	}
}
