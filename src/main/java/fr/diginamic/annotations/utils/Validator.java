package fr.diginamic.annotations.utils;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;

import org.apache.commons.lang3.math.NumberUtils;

import fr.diginamic.annotations.Rule;

/**
 * Valide les contraintes placées sur les attributs d'un objet via
 * l'annotation @Rule (min, max)
 * 
 * @author RichardBONNAMY
 *
 */
public class Validator {

	/**
	 * Valide les contraintes placées sur les attributs d'un objet via
	 * l'annotation @Rule (min, max)
	 * 
	 * @param obj objet à contrôler
	 * @return boolean
	 */
	public static boolean check(Object obj) {
		boolean check = true;

		// On récupère la classe de l'instance courante (Pays)
		Class<?> classe = obj.getClass();

		// On récupère la liste des attributs déclarées dans cette classe.
		Field[] attributs = classe.getDeclaredFields();

		for (Field attribut : attributs) {

			// On regarde si l'attribut possède l'annotation Rule ou non et si l'attribut
			// est de type "nombre"
			if (attribut.isAnnotationPresent(Rule.class) && isNumber(attribut)) {

				// Cela permet d'accéder à l'attribut en lecture même s'il est privé
				attribut.setAccessible(true);

				Rule annotation = attribut.getAnnotation(Rule.class);
				double min = annotation.min();
				double max = annotation.max();

				Object valeurAttribut = null;
				double valeurAsDouble = 0.0;
				try {
					// Récupération de la valeur de l'attribut obj
					valeurAttribut = attribut.get(obj);

					// Teste si la valeur de l'attribut est non nulle et si elle contient bien un
					// nombre ou non
					if (valeurAttribut != null && NumberUtils.isCreatable(valeurAttribut.toString())) {
						valeurAsDouble = Double.parseDouble(valeurAttribut.toString());
					}

				} catch (IllegalArgumentException | IllegalAccessException e) {
					throw new RuntimeException(e);
				}

				check = check && valeurAsDouble > min && valeurAsDouble < max;
			}
		}
		return check;
	}

	/**
	 * Teste le type d'un attribut afin de savoir s'il s'agit d'un nombre ou non
	 * 
	 * @param attribut attribut à tester
	 * @return boolean
	 */
	private static boolean isNumber(Field attribut) {

		List<String> typesNombres = Arrays.asList("byte", "short", "int", "long", "double", "float", "java.lang.Byte",
				"java.lang.Short", "java.lang.Integer", "java.lang.Long", "java.lang.Float", "java.lang.Double");
		return typesNombres.contains(attribut.getGenericType().getTypeName());
	}
}
