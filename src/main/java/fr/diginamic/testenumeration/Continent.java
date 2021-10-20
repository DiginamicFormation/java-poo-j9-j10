package fr.diginamic.testenumeration;

/**
 * Représente un continent et fournit les 6 instances de continents.
 * 
 * @author RichardBONNAMY
 *
 */
public enum Continent {

	AFRIQUE("Afrique"), AMERIQUE_NORD("Amérique du nord"), AMERIQUE_SUD("Amérique du sud"), ASIE("Asie"),
	EUROPE("Europe"), OCEANIE("Océanie");

	/** libelle */
	private String libelle;

	/**
	 * Constructeur
	 * 
	 * @param libelle libellé
	 */
	private Continent(String libelle) {
		this.libelle = libelle;
	}

	@Override
	public String toString() {
		return libelle;
	}

	/**
	 * Getter
	 * 
	 * @return the libelle
	 */
	public String getLibelle() {
		return libelle;
	}
}
