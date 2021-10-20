package fr.diginamic.testenumeration;

import java.util.ArrayList;

public class TestContinentAvecEnum {

	public static void main(String[] args) {
		ArrayList<Ville> villes = new ArrayList<>(); // <- position iterateur
		villes.add(new Ville("New-York", 17, Continent.AMERIQUE_NORD));
		villes.add(new Ville("Paris", 10, Continent.EUROPE));
		villes.add(new Ville("Moscou", 11, Continent.ASIE));
		villes.add(new Ville("Beijing", 23, Continent.ASIE));
		villes.add(new Ville("Berlin", 4, Continent.EUROPE));
		villes.add(new Ville("Sydney", 4, Continent.OCEANIE));
		villes.add(new Ville("Sao Paulo", 23, Continent.AMERIQUE_SUD));
		villes.add(new Ville("Dakar", 8, Continent.AFRIQUE));

		for (Ville ville : villes) {
			System.out.println(ville);
		}

	}

}
