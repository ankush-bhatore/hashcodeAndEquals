package com.cg.test;

import com.cg.bean.Game;

public class Test8 {

	public static void main(String[] args) {

		Game g1 = new Game("Kho Kho");
		Game g2 = new Game("Kho Kho");

		System.out.println("g1, g2 ----- ");

		// equals and hashCode both are overridden using STS Tool
		System.out.println(g1 == g2); // false
		System.out.println(g1.equals(g2)); // true
		System.out.println((g1.hashCode() == g2.hashCode())); // true

		Game g3 = g1;

		System.out.println("g1, g3 ----- ");

		System.out.println(g1 == g3); // true
		System.out.println(g1.equals(g3)); // true
		System.out.println((g1.hashCode() == g3.hashCode())); // true

		Game g4 = new Game("Cricket");

		System.out.println("g1, g4 ----- ");

		System.out.println(g1 == g4); // false
		System.out.println(g1.equals(g4)); // false
		System.out.println((g1.hashCode() == g4.hashCode())); // false

		Game g5 = new Game("Football");

		System.out.println("g1, g5 ----- ");

		System.out.println(g1 == g5); // false
		System.out.println(g1.equals(g5)); // false
		System.out.println((g1.hashCode() == g5.hashCode())); // false

		System.out.println("g1.hashCode() : " + g1.hashCode());
		System.out.println("g2.hashCode() : " + g2.hashCode());
		System.out.println("g3.hashCode() : " + g3.hashCode());
		System.out.println("g4.hashCode() : " + g4.hashCode());
		System.out.println("g5.hashCode() : " + g5.hashCode());
	}

}
