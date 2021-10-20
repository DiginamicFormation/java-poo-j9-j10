package fr.diginamic.testenumeration;

/**
 * Concept de Ville
 * 
 * @author RichardBONNAMY
 *
 */
public class Ville {

	/** nom */
	private String nom;

	/** nbHabitants en millions */
	private int nbHabitants;

	/** continent d'appartenance */
	private Continent continent;

	/**
	 * Constructeur
	 * 
	 * @param nom         nom
	 * @param nbHabitants nombre d'habitants en millions
	 * @param continent   continent d'appartenance
	 */
	public Ville(String nom, int nbHabitants, Continent continent) {
		super();
		this.nom = nom;
		this.nbHabitants = nbHabitants;
		this.continent = continent;
	}

	@Override
	public String toString() {
		return nom + " : " + nbHabitants + " millions d'habitants. Continent :" + continent.getLibelle();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((continent == null) ? 0 : continent.hashCode());
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
		return autre.getNom().equals(this.nom) && autre.getNbHabitants() == this.nbHabitants
				&& autre.getContinent().equals(this.continent);
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

	/**
	 * Getter
	 * 
	 * @return the continent
	 */
	public Continent getContinent() {
		return continent;
	}

	/**
	 * Setter
	 * 
	 * @param continent the continent to set
	 */
	public void setContinent(Continent continent) {
		this.continent = continent;
	}

}
