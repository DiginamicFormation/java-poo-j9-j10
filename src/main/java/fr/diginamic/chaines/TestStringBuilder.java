package fr.diginamic.chaines;

import java.util.stream.IntStream;

public class TestStringBuilder {

	public static void main(String[] args) {

		// Chrométrage du temps mis pour concaténer les nombres de 1 à 100 000 avec
		// StringBuilder et boucle traditionnelle
		long debut = System.currentTimeMillis();

		StringBuilder builder = new StringBuilder();
		for (int i = 1; i <= 100_000; i++) {
			builder.append(i);
		}

		long fin = System.currentTimeMillis();
		System.out.println("Boucle traditionnelle et StringBuilder - Temps écoulé en millisecondes :" + (fin - debut));

		// Chrométrage du temps mis pour concaténer les nombres de 1 à 100 000 avec
		// StringBuilder et boucle foreach sur IntStream
		debut = System.currentTimeMillis();

		final StringBuilder builder2 = new StringBuilder();
		IntStream.range(1, 100_000).forEach(i -> builder2.append(i));

		fin = System.currentTimeMillis();
		System.out
				.println("Boucle IntStream/forEach et StringBuilder - Temps écoulé en millisecondes :" + (fin - debut));

		// Chrométrage du temps mis pour concaténer les nombres de 1 à 100 000 avec
		// String et opérateur de concaténation +
		debut = System.currentTimeMillis();

		String chaine = "";
		for (int i = 1; i <= 100_000; i++) {
			chaine += i;
		}

		fin = System.currentTimeMillis();
		System.out.println("Boucle traditionnelle et opérateur de concaténation - Temps écoulé en millisecondes :"
				+ (fin - debut));
	}

}
