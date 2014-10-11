package com.bloc.singletons;

import java.util.ArrayList;
import java.util.Iterator;
import java.lang.Class;


/*
 * This is a singleton class which maintains communication
 * between classes and Listeners
 */
public class Speakerphone extends Object {
	private static Speakerphone sSpeakerphone;
	private ArrayList<Listener> listenerList;;

	private Speakerphone() {
		listenerList = new ArrayList<Listener>();
	}
	/*
	 * get
	 * @return the singleton instance of Speakerphone
	 */
	public static Speakerphone get() {
		if (sSpeakerphone == null) {
			sSpeakerphone = new Speakerphone();
		}
		return sSpeakerphone;
	}

	/*
	 * addListener
	 * Add a listener to Speakerphone's list
	 * @param listener an instance of the Listener interface
	 */
	public void addListener(Listener listener) {
		if (listenerList == null) {
			listenerList = new ArrayList<Listener>();
		}
		listenerList.add(listener);
	}

	/*
	 * removeListener
	 * Remove a Listener from the Speakerphone's list
	 * @param listener the Listener to remove
	 */
	public void removeListener(Listener listener) {
		listenerList.remove(listener);
	}

	/*
	 * shoutMessage
	 * Sends the message to all of the Listeners tracked by Speakerphone
	 * @param talker a Talker whose message will be sent
	 */
	public void shoutMessage(Talker talker) {
		Iterator<Listener> listenerItr = listenerList.iterator();
		String msg = talker.getMessage();
		while (listenerItr.hasNext()) {
			listenerItr.next().onMessageReceived(msg);
		}
	}

	/*
	 * shoutMessage
	 * Sends the message to all of the Listeners which are instances of
	 * the class parameter
	 * @param talker a Talker whose message will be sent
	 * @param cls a Class object representing the type which the Listener
	 *			  should extend from in order to receive the message
	 *
	 * HINT: see Class.isAssignableFrom()
	 *		 http://docs.oracle.com/javase/7/docs/api/java/lang/Class.html#isAssignableFrom(java.lang.Class)
	 */
	public void shoutMessage(Talker talker, Class cls) {
		Iterator<Listener> listenerItr = listenerList.iterator();
		String msg = talker.getMessage();

		while (listenerItr.hasNext()) {
			Listener nextListener = listenerItr.next();
			if (cls.isAssignableFrom(nextListener.getClass())) {
				nextListener.onMessageReceived(msg);
			} else {
				System.out.println("I don't know what yerr saying!");
			}
		}
	}

	/*
	 * removeAll
	 * Removes all Listeners from Speakerphone
	 */
	public void removeAll(){
		listenerList = new ArrayList<Listener>();
	}

}