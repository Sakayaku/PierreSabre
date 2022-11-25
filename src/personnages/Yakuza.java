package personnages;

public class Yakuza extends Humain{
	private int reputation=0;
	private String clan;
	public Yakuza(String nom, String boissonFavorite, int quantiteArgent, String clan) {
		super(nom, boissonFavorite, quantiteArgent);
		this.clan=clan;
	}
	public void extorquer(Commercant victime) {
		int argentVictime;
		String nomVictime=victime.getNom();
		parler("Tiens, tiens, ne serait-ce pas un faible marchand qui passe par là?");
		parler(nomVictime+", si tu tiens à la vie donne moi ta bourse!");
		argentVictime=victime.quantiteArgent;
		victime.seFaireExtorquer();
		quantiteArgent+=argentVictime;
		setReputation(getReputation() + 1);
		parler("J'ai piqué les "+argentVictime+" sous de "+nomVictime+" ce qui me fait "+quantiteArgent+" sous dans ma poche. Hi! Hi!");
	}
	public int perdre() {
		setReputation(getReputation() - 1);
		parler("J'ai perdu mon duel et mes "+quantiteArgent+" sous, snif... J'ai déshonoré le clan de "+clan);
		quantiteArgent=0;
		return 0;
	}
	public int gagner(int gain) {
		quantiteArgent+=gain;
		setReputation(getReputation() + 1);
		parler("Ce ronin pensait vraiment battre "+getNom()+" du clan de "+clan+" ? Je l'ai dépouillé de ses "+gain+" sous.");
		return 0;
	}
	public int getReputation() {
		return reputation;
	}
	public void setReputation(int reputation) {
		this.reputation = reputation;
	}
	@Override
	public void direBonjour() {
		super.direBonjour();
		parler("Mon clan est celui de "+clan+".");
	}
}
