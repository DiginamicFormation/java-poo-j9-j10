package fr.diginamic.testenumeration;

public class TestEnumeration {

	public static void main(String[] args) {
		// Utilisez une boucle pour affichez toutes les saisons.

		System.out.println("Boucle permettant d'afficher l'ensemble des saisons : ");
		Saison[] saisons = Saison.values();
		for (Saison saison : saisons) {
			System.out.println(saison);
		}
		System.out.println("--------------------------------------------");
		// Soit la chaine de caractères suivante : String nom = « ETE » ;
		System.out.println("Recherche de l'instance de Saison dont le nom (ie. nom de l'instance) est ETE");
		String nom = "ETE";

		// Utilisez une méthode de base des énumérations pour retrouver et afficher le
		// libellé de l’instance de Saison dont le nom est ETE.
		System.out.println("Utilisation de la méthode valueOf(String) qui est une méthode implicite des énumérations.");

		Saison saison = Saison.valueOf(nom);
		System.out.println("Affichage du libellé de la saison trouvée :" + saison.getLibelle());

		System.out.println("--------------------------------------------");
		// Soit la chaine de caractères suivante : String libelle = « Hiver » ;

		String libelle = "Hiver";

		// Utilisez une méthode développée par vos soins dans Saison et qui permet
		// d'extraire une saison à partir de son libellé.
		System.out.println("Recherche de l'instance de Saison dont le libellé (attribut) est Hiver");
		System.out.println("Utilisation d'une méthode spécifique valueOfLibelle(String).");

		saison = Saison.valueOfLibelle(libelle);
		System.out.println("Affichage du libellé de la saison trouvée à partir de son libellé :" + saison.getLibelle());
	}

}
