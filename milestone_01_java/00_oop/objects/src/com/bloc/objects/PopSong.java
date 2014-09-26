package com.bloc.objects;

class PopSong extends Song {
	// The number of weeks this song stayed on Billboard's top 100
	int mWeeksOnBillboard;

	/*
	 * Basic Constructor
	 * Side-effects: Assigns some default ensemble, title,
	 *				 year and weeks on billboard
	 */
	// CONSTRUCTOR CODE GOES HERE
	PopSong () {
		super (); //Default ensemble and title constructor?
	}
	/*
	 * Partial Constructor
	 * Side-effects: Sets the year of release to 0
	 * @param ensemble the ensemble responsible
	 * @param title the song title
	 */
	// CONSTRUCTOR CODE GOES HERE
	PopSong (Ensemble ensemble, String title) {
		this.mYearReleased = 0;
		this.mEnsemble = ensemble;
		this.mTitle = title; 
		// Or "this(ensemble, title, 0)" ?
		// Should  mYearReleased be seperated?
	}
	/*
	 * Full Song Constructor
	 * Side-effects: Sets the weeks on billboard to 0
	 * @param ensemble the ensemble responsible
	 * @param title the song title
	 * @param yearReleased the year the song was released
	 */
	// CONSTRUCTOR CODE GOES HERE
	PopSong (Ensemble ensemble, String title, int yearReleased) {
		this.mYearReleased = yearReleased;
		this.mEnsemble = ensemble;
		this.mTitle = title;
		this.mWeeksOnBillboard = 0;
		// Or this(yearReleased, ensemble, title, 0); ?
		// Should mWeeksOnBillboard be seperated?
	}	
	/*
	 * Full PopSong Constructor
	 * @param ensemble the ensemble responsible
	 * @param title the song title
	 * @param yearReleased the year the song was released
	 * @param weeksOnBillboard number of weeks this song lasted on the
	 *		  				   Billboard's top 100
	 */
	// CONSTRUCTOR CODE GOES HERE
	PopSong (Ensemble ensemble, String title, int yearReleased, int weeksOnBillboard) {
		this.mYearReleased = yearReleased;
		this.mEnsemble = ensemble;
		this.mTitle = title;
		// or super(ensemble, title, yearReleased); ?
		this.mWeeksOnBillboard = weeksOnBillboard;
		this.mWeeksOnBillboard = 0; //Should this be included too?
	}	
}