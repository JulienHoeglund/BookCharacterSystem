//----------Imports & Packages----------//
package controllers;

/**
 * @author Daniel Quinlan
 * @studentNumber 01133940
 * @course Entertainment Systems Yr 2
 * 
 * @param <T>
 */
public class Driver {
	private CLI cli;
	
	public Driver() {
		cli= new CLI();
		cli.console();
	}

	public static void main(String[] args) {
		Driver app = new Driver();
	}

}
