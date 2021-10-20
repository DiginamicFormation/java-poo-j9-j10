package fr.diginamic.dates;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TestDates {

	public static void main(String[] args) {
		// Créez une instance de la classe java.util.Date à la date du jour en utilisant
		// un de ses constructeurs
		Date dateJour = new Date();

		// Affichez l’instance ainsi créée au format suivant : jour/mois/année (sans la
		// partie heure)
		SimpleDateFormat formateurDate = new SimpleDateFormat("dd/MM/yyyy");
		String dateFormatee = formateurDate.format(dateJour);

		System.out.println(dateFormatee);

		// Créez une instance de la classe Date à la date du 19/05/2016 à 23:59:30
		// secondes
		Date date19mai = new Date(116, 4, 19, 23, 59, 30);

		// Affichez l’instance ainsi créée au format suivant : année/mois/jour
		// heure:minute:seconde
		SimpleDateFormat formateurDateHeure = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		dateFormatee = formateurDateHeure.format(date19mai);

		System.out.println(dateFormatee);

		// Créez une instance de Date contenant la date/heure système et affichez-la au
		// même format que ci-dessus.
		Date dateSys = new Date(); // idem dateJour
		dateFormatee = formateurDateHeure.format(dateSys);

		System.out.println(dateFormatee);

	}

}
