package com.bloc.securitypackages.apples;

import com.bloc.securitypackages.Fruit;
import com.bloc.securitypackages.Color; //or is it colors?

public abstract class Apple extends Fruit {

	public Apple(String name, int calories, Color color, double weight) {
		super (name, calories, color, weight);
	}

	abstract void bite();

}

