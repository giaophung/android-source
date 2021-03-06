package com.bloc.objects;

class Song extends Object {
	// The ensemble which produced it
	Ensemble mEnsemble;
	// Title of the song
	String mTitle;
	// The year it was released
	int mYearReleased;

	/*
	 * Basic Constructor
	 * Side-effects: Assigns some default ensemble, title and
	 *				 and year of your choosing
	 */
	// CONSTRUCTOR CODE GOES HERE
	Song () {
		this.mEnsemble = new Ensemble(new Artist[] {new Artist("Dr.", "Dre")});
		this.mTitle = "TitleABC";
		this.mYearReleased = 2000;
	}
	/*
	 * Partial Constructor
	 * Side-effects: Sets the year of release to 0
	 * @param ensemble the ensemble responsible
	 * @param title the song title
	 */
	// CONSTRUCTOR CODE GOES HERE
	Song (Ensemble ensemble, String title) {
		this.mEnsemble = ensemble;
		this.mTitle = title;
		this.mYearReleased = 0; 
		//or this(emsemble, title, 0)
	}
	/*
	 * Full Constructor
	 * @param ensemble the ensemble responsible
	 * @param title the song title
	 * @param yearReleased the year the song was released
	 */
	// CONSTRUCTOR CODE GOES HERE
	Song (Ensemble ensemble, String title, int yearReleased) {
		this.mEnsemble = ensemble;
		this.mTitle = title;
		this.mYearReleased = yearReleased; 
	
	}	
}