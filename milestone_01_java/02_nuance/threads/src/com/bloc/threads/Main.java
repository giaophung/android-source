package com.bloc.threads;

public class Main extends Object {

	public static void main(String [] args) {

		// Extract content beneath to ImageGetter

		// ^^^ Extract the above to ImageGetter

		new ImageGetter().run();

		// This shouldn't exist yet, therefore we should be able to print 
		//if (exists == false) {
			System.out.println("/************************/");
			System.out.println("/*                      */");
			System.out.println("/*                      */");
			System.out.println("/*   If you see this,   */");
			System.out.println("/*   congratulations!   */");
			System.out.println("/*                      */");
			System.out.println("/*                      */");
			System.out.println("/************************/");	
	}
}
