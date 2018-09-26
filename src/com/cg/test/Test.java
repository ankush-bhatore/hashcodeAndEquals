package com.cg.test;

import java.util.HashSet;
import java.util.Set;

import com.cg.bean.Game;

public class Test {

	public static void main(String[] args) {

		Set<Game> games = new HashSet<>();

		games.add(new Game("Kho Kho"));
		games.add(new Game("Kho Kho"));

		// equals and hashCode both are NOT overridden
		System.out.println("games.size() : " + games.size()); // games.size() : 2
	}

}
