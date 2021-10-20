package fr.diginamic.dates;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class TestCalendar {

	public static void main(String[] args) {
		// Utilisez la classe java.util.Calendar pour créer une instance de Date à la
		// date du 19 mai 2016 à 23h59 et 30 secondes

		Calendar cal19mai = Calendar.getInstance();
		cal19mai.set(2016, 4, 19, 23, 59, 30);

		Date date19mai = cal19mai.getTime();

		// affichez-la au format suivant : jour/mois/année

		SimpleDateFormat formateurDate = new SimpleDateFormat("dd/MM/yyyy");
		String dateFormatee = formateurDate.format(date19mai);

		System.out.println(dateFormatee);

		// Utilisez la classe java.util.Calendar pour créer une instance de Date à la
		// date du jour.

		Calendar calJour = Calendar.getInstance();
		Date dateJour = calJour.getTime();

		// Affichez l’instance ainsi créée au format suivant : année/mois/jour
		// heure:minute:seconde

		SimpleDateFormat formateurDateHeure = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		dateFormatee = formateurDateHeure.format(dateJour);

		System.out.println(dateFormatee);

		// Affichez la même instance avec le nom des jours et des mois en français,
		// russe, chinois et allemand.

		SimpleDateFormat formateurAvecNomsJoursMois = new SimpleDateFormat("EEEE dd MMMM yyyy 'à' HH:mm:ss");
		System.out.println(formateurAvecNomsJoursMois.format(dateJour));

		formateurAvecNomsJoursMois = new SimpleDateFormat("EEEE dd MMMM yyyy 'à' HH:mm:ss", new Locale("ru", "RU"));
		System.out.println(formateurAvecNomsJoursMois.format(dateJour));

		formateurAvecNomsJoursMois = new SimpleDateFormat("EEEE dd MMMM yyyy 'à' HH:mm:ss", Locale.CHINA);
		System.out.println(formateurAvecNomsJoursMois.format(dateJour));

		formateurAvecNomsJoursMois = new SimpleDateFormat("EEEE dd MMMM yyyy 'à' HH:mm:ss", Locale.GERMANY);
		System.out.println(formateurAvecNomsJoursMois.format(dateJour));
	}

}
