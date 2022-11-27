package personnages;
import java.util.Random;

public class GrandMere extends Humain{
	private enum TypeHumain{
		RONIN("Ronin"),COMMERCANT("Commerçant"),SAMOURAI("Samourai"),GRANDMERE("Grand-mère"),HUMAIN("Habitant");
		private String nom;
		private TypeHumain (String nom) {
			this.nom = nom;
		}
		public String toString() {
			return nom;
		}
	}

	public GrandMere(String nom, int quantiteArgent) {
		super(nom, "tisane", quantiteArgent);
		this.memoire= new Humain[5] ;
	}
	@Override
	protected void memoriser(Humain humain) {
		if (nbConnaissances>=memoire.length) {
			parler("Oh ma tête ! Je ne peux plus retenir le nom d'une personne supplémentaire !");
		}else {
			super.memoriser(humain);
		}
	}
	public String humainHasard() {
		TypeHumain[] types = TypeHumain.values();
		Random rd = new Random();
		int random= rd.nextInt(5);
		return types[random].toString();
	}
	public void ragoter() {
		for (int i=0;i<nbConnaissances;i++) {
			String humainHasard=humainHasard();
			if (memoire[i] instanceof Traitre) {
				parler("Je sais que "+memoire[i].getNom()+" est un traître. Petit chenapan!");
			}else {
				parler("Je crois que "+memoire[i].getNom()+" est un "+humainHasard);

			}
		}
			
	}

}
