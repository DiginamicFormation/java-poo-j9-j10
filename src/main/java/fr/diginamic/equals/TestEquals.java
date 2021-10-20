package fr.diginamic.equals;

public class TestEquals {

	public static void main(String[] args) {
		// Vérifiez que la méthode equals retourne true pour 2 instances de villes qui
		// ont les mêmes attributs.
		System.out.println("Test d'égalité avec equals des 2 villes suivantes avec des attributs identiques : ");
		Ville v1 = new Ville("Tours", 132000);
		Ville v2 = new Ville("Tours", 132000);

		System.out.println(v1);
		System.out.println(v2);

		boolean egalite = v1.equals(v2);
		System.out.println("le résultat de la comparaison avec méthode equals est : " + egalite);

		System.out.println("----------------------------");

		// Vérifiez maintenant que la méthode retourne false si vous changez un des
		// attributs.
		System.out.println("Test d'égalité avec equals des 2 villes suivantes avec des attributs différents : ");
		v1 = new Ville("Tours", 132001);
		v2 = new Ville("Tours", 132000);

		System.out.println(v1);
		System.out.println(v2);

		egalite = v1.equals(v2);
		System.out.println("le résultat de la comparaison avec méthode equals est : " + egalite);

		System.out.println("----------------------------");

		System.out.println("Test d'égalité avec equals des 2 villes suivantes avec des attributs différents : ");

		v1 = new Ville("Tours", 132000);
		v2 = new Ville("Tour", 132000);

		System.out.println(v1);
		System.out.println(v2);

		egalite = v1.equals(v2);
		System.out.println("le résultat de la comparaison avec méthode equals est : " + egalite);

		System.out.println("----------------------------");

		// Faites le test maintenant en utilisant l’opérateur == avec les mêmes
		// attributs, puis avec des attributs différents.
		// Que constatez-vous ?

		System.out.println("Test d'égalité avec == des 2 villes suivantes avec des attributs identiques : ");

		v1 = new Ville("Tours", 132000);
		v2 = new Ville("Tours", 132000);

		System.out.println(v1);
		System.out.println(v2);

		egalite = v1 == v2;
		System.out.println("le résultat de la comparaison avec opérateur == est : " + egalite);

		System.out.println("----------------------------");

		System.out.println("Test d'égalité avec == des 2 villes suivantes avec des attributs différents : ");

		v1 = new Ville("Tours", 132000);
		v2 = new Ville("Tour", 132000);

		egalite = v1 == v2;
		System.out.println("le résultat de la comparaison avec opérateur == est : " + egalite);

		// Comment faire pour que la comparaison de 2 villes avec l’opérateur ==
		// retourne true.

		System.out.println("----------------------------");

		System.out.println(
				"La seule possibilité pour que l'opérateur == retourne true est d'avoir 2 références (v1 et v2) MAIS 1 seul objet (opérateur new):");
		System.out.println("Ville v1 = new Ville(\"Tours\", 132000);");
		System.out.println("Ville v2 = v1");

	}

}
