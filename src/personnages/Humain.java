package personnages;

public class Humain {
	private String nom;
	private String boissonFavorite;
	private int quantiteArgent;
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public int getQuantiteArgent() {
		return quantiteArgent;
	}
	public void setQuantiteArgent(int quantiteArgent) {
		this.quantiteArgent = quantiteArgent;
	}
	public void direBonjour() {
		parler("Bonjour! Je m'apelle "+this.nom+" et j'aime boire du "+this.boissonFavorite);
	}
	public void boire() {
		parler("Mmmm, un bon verre de "+this.boissonFavorite+"! Gloups!");
	}
	public void acheter(String bien, int prix) {
		if (prix<quantiteArgent) {
			parler("J'ai "+this.quantiteArgent+" sous en poche. "+"Je vais pouvoir m'offrir "+bien+" à "+prix+" sous.");
			perdreArgent(prix);
		}else {
			parler("Je n'ai plus que "+this.quantiteArgent+" sous en poche. "+"Je ne peux même pas m'offrir "+bien+" à "+prix+" sous.");
		}
	}
	public void gagnerArgent(int gain) {
		quantiteArgent+=gain;
	}
	public void perdreArgent(int perte) {
		quantiteArgent-=perte;
	}
	private void parler(String texte) {
		System.out.println(this.nom+"~ "+texte);
	}
	public Humain(String nom, String boissonFavorite, int quantiteArgent) {
		super();
		this.nom = nom;
		this.boissonFavorite = boissonFavorite;
		this.quantiteArgent = quantiteArgent;
	}
	
}
