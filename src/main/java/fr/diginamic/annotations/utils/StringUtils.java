package fr.diginamic.annotations.utils;

import java.lang.reflect.Field;

import fr.diginamic.annotations.ToString;

/**
 * Classe fournissant des services de traitement ou génération de chaines de
 * caractères
 * 
 * @author RichardBONNAMY
 *
 */
public class StringUtils {

	/**
	 * Génère une chaine de caractères pour l'objet passé en paramètre. <br>
	 * <br>
	 * Seuls les attributs annotés de @ToString apparaissent dans la chaine de
	 * caractères.
	 * 
	 * @param obj objet
	 * @return String
	 */
	public static String toString(Object obj) {

		StringBuilder builder = new StringBuilder();

		// On récupère la classe de l'instance courante (Pays)
		Class<?> classe = obj.getClass();

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
					// Récupération de la valeur de l'attribut obj
					valeurAttribut = attribut.get(obj);
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
}
