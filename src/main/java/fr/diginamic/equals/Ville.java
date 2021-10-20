package fr.diginamic.equals;

/**
 * Concept de Ville
 * 
 * @author RichardBONNAMY
 *
 */
public class Ville {

	/** nom */
	private String nom;

	/** nbHabitants */
	private int nbHabitants;

	/**
	 * Constructeur
	 * 
	 * @param nom         nom
	 * @param nbHabitants nombre d'habitants
	 */
	public Ville(String nom, int nbHabitants) {
		super();
		this.nom = nom;
		this.nbHabitants = nbHabitants;
	}

	@Override
	public String toString() {
		return nom + " " + nbHabitants;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + nbHabitants;
		result = prime * result + ((nom == null) ? 0 : nom.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Ville)) {
			return false;
		}
		Ville autre = (Ville) obj;
		return autre.getNom().equals(this.nom) && autre.getNbHabitants() == this.nbHabitants;
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
	public int getNbHabitants() {
		return nbHabitants;
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
	public void setNbHabitants(int nbHabitants) {
		this.nbHabitants = nbHabitants;
	}

}
