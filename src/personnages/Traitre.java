package personnages;
import java.util.Random;

public class Traitre extends Samourai{
	private int niveauTraitrise=0;

	public Traitre(String Seigneur, String nom, String boissonFavorite, int quantiteArgent) {
		super(Seigneur, nom, boissonFavorite, quantiteArgent);
	}

	@Override
	public void direBonjour() {
		super.direBonjour();
		parler("Mais je suis un traître et mon niveau de traitrise est: "+niveauTraitrise+". Chut!");
	}
	public void ranconner(Commercant commercant) {
		if (niveauTraitrise<3) {
			int argentRanconner=commercant.getQuantiteArgent()*2/10;
			commercant.perdreArgent(argentRanconner);
			this.gagnerArgent(argentRanconner);
			niveauTraitrise+=1;
			parler("Si tu veux ma protection contre les Yakuzas, il va falloir payer! Donne-moi "+argentRanconner+" sous ou gare à toi!");
			commercant.parler("Tout de suite grand "+getNom()+".");
		}else {
			parler("Mince je ne peux plus rançonner personne sinon un samouraï risque de me démasquer!");
		}
	}
	public void faireLeGentil() {
		if (nbConnaissances<1) {
			parler("Je ne peux faire ami ami avec personne car je ne connais personne! Snif.");
		}else {
			Random r = new Random();
	        int n = r.nextInt(nbConnaissances);
	        int don= quantiteArgent*1/20;
	        String nomAmi= memoire[n].getNom();
	        parler("Il faut absolument remonter ma cote de confiance. Je vais faire ami ami avec "+nomAmi+".");
	        parler("Bonjour l'ami! Je voudrais vous aider en vous donnant "+don+" sous.");
	        memoire[n].gagnerArgent(don);
	        perdreArgent(don);
	        String nom=getNom();
	        memoire[n].parler("Merci "+nom+". Vous êtes quelqu'un de bien.");
	        if (niveauTraitrise>1) {
	        	niveauTraitrise-=1;
	        }
		}
	}
}
