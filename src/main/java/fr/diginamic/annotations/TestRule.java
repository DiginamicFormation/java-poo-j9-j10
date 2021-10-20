package fr.diginamic.annotations;

import fr.diginamic.annotations.utils.Validator;

public class TestRule {

	public static void main(String[] args) {
		Pays usa = new Pays("USA", 350, 52000);
		boolean isOk = Validator.check(usa);

		System.out.println(isOk);

		Pays bizarre = new Pays("Bizarre", -10, 30);
		isOk = Validator.check(bizarre);

		System.out.println(isOk);

	}

}
