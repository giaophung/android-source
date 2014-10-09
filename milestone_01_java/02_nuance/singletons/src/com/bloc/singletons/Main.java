package com.bloc.singletons;

import com.bloc.singletons.listeners.*;
import com.bloc.singletons.talkers.*;

public class Main extends Object {

	public static void main(String [] args) {
		// Instantiate some talkers and some listeners
		Parent parent = new Parent();
		Singer singer = new Singer();
		PetOwner petOwner = new PetOwner();
		AudienceMember audMem = new AudienceMember();
		Child child = new Child();
		Pet pet = new Pet();

		// Register listeners
		Speakerphone speakerphone = Speakerphone.get();
		speakerphone.addListener(audMem);
		speakerphone.addListener(child);
		speakerphone.addListener(pet);

		// Send messages!
		speakerphone.shoutMessage(parent);
		speakerphone.shoutMessage(petOwner, pet.getClass());
		speakerphone.shoutMessage(singer);
	}
}
