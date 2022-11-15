package histoire;
import personnages.Humain;
import personnages.Commercant;
import personnages.Yakuza;
import personnages.Ronin;
public class HistoireTP4 {

	public static void main(String[] args) {
		Humain prof;
		prof= new Humain("Prof", "kombucha", 54);
		prof.direBonjour();
		prof.acheter("une boisson", 12);
		prof.boire();
		prof.acheter("un jeu", 2);
		prof.acheter("un kimono", 50);
		Commercant marco;
		marco= new Commercant("Marco", "thé", 20);
		marco.direBonjour();
		marco.seFaireExtorquer();
		marco.recevoir(15);
		marco.boire();
		Yakuza YakuleNoir;
		YakuleNoir= new Yakuza("Yaku Le Noir","whisky",30, "Warsong");
		YakuleNoir.direBonjour();
		YakuleNoir.extorquer(marco);
		Ronin roro;
		roro= new Ronin("Roro","shochu",60);
		roro.direBonjour();
		roro.donner(marco);
		roro.provoquer(YakuleNoir);
		
	}

}
