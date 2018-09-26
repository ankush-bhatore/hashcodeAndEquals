package com.cg.test;

import com.cg.bean.Game;

public class Test5 {

	public static void main(String[] args) {

		Game g1 = new Game("Kho Kho");
		Game g2 = new Game("Kho Kho");

		System.out.println("g1, g2 ----- ");

		// equals and hashCode both are overridden and hashCode returns 9
		System.out.println(g1 == g2); // false
		System.out.println(g1.equals(g2)); // true
		System.out.println((g1.hashCode() == g2.hashCode())); // true

		Game g3 = g1;

		System.out.println("g1, g3 ----- ");

		System.out.println(g1 == g3); // true
		System.out.println(g1.equals(g3)); // true
		System.out.println((g1.hashCode() == g3.hashCode())); // true
		
		System.out.println("g1.hashCode() : " + g1.hashCode());
		System.out.println("g2.hashCode() : " + g2.hashCode());
		System.out.println("g3.hashCode() : " + g3.hashCode());
	}

}
