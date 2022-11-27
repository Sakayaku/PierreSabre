package personnages;

public class Humain {
	private String nom;
	private String boissonFavorite;
	protected int quantiteArgent;
	protected int nbConnaissances=0;
	protected Humain[] memoire = new Humain [30];
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
	private void repondre(Humain humain) {
		humain.direBonjour();
	}
	protected void memoriser(Humain humain) {
		if (nbConnaissances<memoire.length) {
			memoire[nbConnaissances]=humain;
			nbConnaissances+=1;
		}else {
			for (int i=0;i<memoire.length-1;i++) {
				memoire[i]=memoire[i+1];
			}
			memoire[memoire.length-1]=humain;
		}
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
	protected void parler(String texte) {
		System.out.println(this.nom+"~ "+texte);
	}
	public void faireConnaissanceAvec(Humain humain) {
		direBonjour();
		repondre(humain);
		humain.memoriser(this);
		memoriser(humain);
	}
	public void listerConnaissance() {
		parler("Je connais beaucoup de monde dont: ");
		for (int i=0; i< nbConnaissances ;i++) {
			System.out.print(memoire[i].getNom()+" ");
		}
		System.out.println("");
	}
	public Humain(String nom, String boissonFavorite, int quantiteArgent) {
		super();
		this.nom = nom;
		this.boissonFavorite = boissonFavorite;
		this.quantiteArgent = quantiteArgent;
	}
	
}
