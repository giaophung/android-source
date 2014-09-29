package com.bloc.generics;

import com.bloc.generics.things.*;

public class Main extends Object {

	public static void main(String [] args) {

		/*ToyBox toyBox = new ToyBox();*/

		Toy<Spoon> spoon = new Toy<Spoon>(new Spoon());
		Toy<ActionFigure> actionFigure = new Toy<ActionFigure>(new ActionFigure());
		Toy<Book> book = new Toy<Book>(new Book());
		
		/*
		 * Put a bunch of Toys in toyBox!
		 */

		ToyBox toyBox = new ToyBox();
		toyBox.addToy(spoon);
		toyBox.addToy(actionFigure);
		toyBox.addToy(book);
		

		if (toyBox.getToyCount() == 0) {
			System.out.println("Let's get some toys in that box!");
			System.exit(1);
		}

		/*assert toyBox.getToyCount() > 0 : "Let's get some toys in that box!";
		System.out.println("Inside your toybox you've got:");
		for (int i = 0; i < toyBox.getToyCount(); i++) {
			System.out.println("- " + toyBox.getToyAtIndex(i).get());

		}
		System.out.println("Sounds like fun!\n"); */

		System.out.println("/************************/");
		System.out.println("/*                      */");
		System.out.println("/*                      */");
		System.out.println("/*   If you see this,   */");
		System.out.println("/*   congratulations!   */");
		System.out.println("/*                      */");
		System.out.println("/*                      */");
		System.out.println("/************************/\n");
	}
}
