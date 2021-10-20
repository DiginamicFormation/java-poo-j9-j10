package fr.diginamic.annotations;

import java.lang.reflect.Field;

/**
 * Pays : classe contenant un nom, un nb d'habitants et un PIB/habitant
 */
public class Pays implements Comparable<Pays> {

	/** nom */
	@ToString(uppercase = true, separateur = " -> ")
	private String nom;

	/** nbHabitants */
	@ToString(separateur = " millions. ")
	@Rule(min = 0, max = 1500)
	private Long nbHabitants;

	/** pibParHabitant */
	@ToString(separateur = " $/hab.")
	private long pibParHabitant;

	/**
	 * Constructor
	 * 
	 * @param nom            nom
	 * @param nbHabitants
	 * @param pibParHabitant
	 */
	public Pays(String nom, long nbHabitants, long pibParHabitant) {
		super();
		this.nom = nom;
		this.nbHabitants = nbHabitants;
		this.pibParHabitant = pibParHabitant;
	}

	@Override
	public int compareTo(Pays autre) {

		// Cette méthode utilise la méthode compareTo de la classe String qui retourne
		// un nombre > 0, <0 ou 0 suivant l'ordre alphabétique relatif
		return this.nom.compareTo(autre.getNom());
	}

	@Override
	public String toString() {

		StringBuilder builder = new StringBuilder();

		// On récupère la classe de l'instance courante (Pays)
		Class<?> classe = this.getClass();

		// On récupère la liste des attributs déclarées dans cette classe.
		Field[] attributs = classe.getDeclaredFields();

		for (Field attribut : attributs) {

			// On regarde si l'attribut possède l'annotation ToString ou non
			if (attribut.isAnnotationPresent(ToString.class)) {

				// Cela permet d'accéder à l'attribut en lecture même s'il est privé
				attribut.setAccessible(true);

				ToString annotation = attribut.getAnnotation(ToString.class);
				boolean mettreEnMaj = annotation.uppercase();
				String separateur = annotation.separateur();

				Object valeurAttribut = null;
				try {
					// Récupération de la valeur de l'attribut de l'objet courant
					valeurAttribut = attribut.get(this);
				} catch (IllegalArgumentException | IllegalAccessException e) {
					throw new RuntimeException(e);
				}

				// Si la valeur de l'attribut est non null et que mettreEnMaj vaut true
				if (valeurAttribut != null && mettreEnMaj) {
					valeurAttribut = valeurAttribut.toString().toUpperCase();
				}

				// On ajoute à la chaine de caractère la valeur de l'attribut suivie du
				// séparateur
				builder.append(valeurAttribut).append(separateur);

			}
		}
		return builder.toString();

	}

	/**
	 * Fournit le calcul du PIB total
	 * 
	 * @return double
	 */
	public long getPibTotal() {
		return pibParHabitant * nbHabitants;
	}

	/**
	 * Getter
	 * 
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * Getter
	 * 
	 * @return the nbHabitants
	 */
	public long getNbHabitants() {
		return nbHabitants;
	}

	/**
	 * Getter
	 * 
	 * @return the pibParHabitant
	 */
	public long getPibParHabitant() {
		return pibParHabitant;
	}

	/**
	 * Setter
	 * 
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/**
	 * Setter
	 * 
	 * @param nbHabitants the nbHabitants to set
	 */
	public void setNbHabitants(long nbHabitants) {
		this.nbHabitants = nbHabitants;
	}

	/**
	 * Setter
	 * 
	 * @param pibParHabitant the pibParHabitant to set
	 */
	public void setPibParHabitant(long pibParHabitant) {
		this.pibParHabitant = pibParHabitant;
	}

}
