package com.bloc.polymorph;

import com.bloc.polymorph.pets.*;

public class Main extends Object {

	public static void main(String [] args) {

		Dog dog = new Dog();
		Cat cat = new Cat();
		Bird bird = new Bird();
		Snake snake = new Snake();
		Tarantula tarantula = new Tarantula();

		// Accomplish the below using polymorphism

		Pet[] pets = new Pet[5];
		pets[0] = dog;
		pets[1] = cat;
		pets[2] = bird;
		pets[3] = snake;
		pets[4] = tarantula;
		
		for (int i = 0; i < pets.length; i++) {
			pets[i].feed();
			pets[i].wash();
			pets[i].exercise();
		}

		/*dog.feed();
		dog.wash();
		dog.exercise();

		cat.feed();
		cat.wash();
		cat.exercise();

		bird.feed();
		bird.wash();
		bird.exercise();

		snake.feed();
		snake.wash();
		snake.exercise();

		tarantula.feed();
		tarantula.wash();
		tarantula.exercise();

		// Accomplish the above using polymorphism

		assert dog.isFed() && dog.isWashed() && dog.isExercised() : "Your dog needs a little more attention";
		assert cat.isFed() && cat.isWashed() && cat.isExercised() : "Your cat needs a little more attention";
		assert bird.isFed() && bird.isWashed() && bird.isExercised() : "Your bird needs a little more attention";
		assert snake.isFed() && snake.isWashed() && snake.isExercised() : "Your snake needs a little more attention";
		assert tarantula.isFed() && tarantula.isWashed() && tarantula.isExercised() : "Your tarantula needs a little more attention";
		*/

		if (!(dog.isFed() && dog.isWashed() && dog.isExercised())) {
			System.out.println("Your dog needs a little more attention");
			System.exit(1);
		}

		if (!(cat.isFed() && cat.isWashed() && cat.isExercised())) {
			System.out.println("Your cat needs a little more attention");
			System.exit(1);
		}

		if (!(bird.isFed() && bird.isWashed() && bird.isExercised())) {
			System.out.println("Your bird needs a little more attention");
			System.exit(1);
		}

		if (!(snake.isFed() && snake.isWashed() && snake.isExercised())) {
			System.out.println("Your snake needs a little more attention");
			System.exit(1);
		}

		if (!(tarantula.isFed() && tarantula.isWashed() && tarantula.isExercised())) {
			System.out.println("Your tarantula needs a little more attention");
			System.exit(1);
		}
		
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
