package fr.diginamic.annotations;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

/**
 * Annotation à poser sur un attribut d'instance de classe et qui permet
 * d'indiquer des contraintes sur la valeur de cet attribut.<br>
 * <br>
 * Cette annotation est prise en compte par la classe Validator. <br>
 * <br>
 * Exemples de contraintes sur un attribut de type nombre:<br>
 * min=0,<br>
 * max=10000,<br>
 * 
 * @author RichardBONNAMY
 *
 */
@Retention(RUNTIME)
@Target(ElementType.FIELD)
public @interface Rule {

	/**
	 * Permet d'indiquer une valeur minimum pour un attribut de type nombre
	 * 
	 * @return double
	 */
	double min() default Double.MIN_VALUE;

	/**
	 * Permet d'indiquer une valeur maximum pour un attribut de type nombre
	 * 
	 * @return double
	 */
	double max() default Double.MAX_VALUE;
}
