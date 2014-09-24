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
		super (); //Trying to access the default ensemble and title constructor that's in Song and pass them through into the partial constructor?
	}
	/*
	 * Partial Constructor
	 * Side-effects: Sets the year of release to 0
	 * @param ensemble the ensemble responsible
	 * @param title the song title
	 */
	// CONSTRUCTOR CODE GOES HERE
	PopSong (String ensemble, String title) {
		this.mYearReleased = 0;
		this.mEnsemble = ensemble;
		this.mTitle = title; 
		// or "this(0, ensemble, title)" ?
	}
	/*
	 * Full Song Constructor
	 * Side-effects: Sets the weeks on billboard to 0
	 * @param ensemble the ensemble responsible
	 * @param title the song title
	 * @param yearReleased the year the song was released
	 */
	// CONSTRUCTOR CODE GOES HERE
	PopSong (String ensemble, String title, int yearReleased) {
		this.mYearReleased = yearReleased;
		this.mEnsemble = ensemble;
		this.mTitle = title;
		this.mWeeksOnBillboard = 0;
		// or this(yearReleased, ensemble, title, 0)?
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
	PopSong (String ensemble, String title, int yearReleased, int weeksOnBillboard) {
		this.mYearReleased = yearReleased;
		this.mEnsemble = ensemble;
		this.mTitle = title;
		// or super(ensemble, title, yearReleased)
		this.mWeeksOnBillboard = weeksOnBillboard;
	}	
}