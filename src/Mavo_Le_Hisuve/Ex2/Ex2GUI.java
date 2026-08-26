// User-interface layer for the spreadsheet. It renders cells, translates user actions into sheet updates, and uses the cell type to select a display colour.

package Mavo_Le_Hisuve.Ex2;


import java.awt.*;
import java.io.IOException;


/**
 * ArielU. Intro2CS, Ex2: https://docs.google.com/document/d/1-18T-dj00apE4k1qmpXGOaqttxLn-Kwi/edit?usp=sharing&ouid=113711744349547563645&rtpof=true&sd=true
 * DO NOT CHANGE THIS INTERFACE!!
 * This is NOT a Junit class - as it tests GUI components which
 * should not be tested using Junit.
 * 
 * The Code uses the STDDraw class:
 * https://introcs.cs.princeton.edu/java/stdlib/javadoc/StdDraw.html
 * Note: a few minor changes were added to STDDraw suit the logic of Ex2:
 * @author boaz.benmoshe
 *
 */
public class Ex2GUI {


	private static Sheet table; // this is the main data (an implementation of the Sheet interface).
	private static Index2D cord = null; // a table entry used by the GUI of setting up a cell value / form
	public Ex2GUI() {;}  // an empty (redundant) constructor.


	/** The main function for running Ex2 */
	public static void main(String[] a) {
		table = new Ex2Sheet(Ex2Utils.WIDTH, Ex2Utils.HEIGHT);
		testSimpleGUI(table);
	}


	/**
	 * This function runs the main (endlees) loop of the GUI
	 * @param table the SpreadSheet - note: this class is written as a naive implementation of "singleton" (i.e., all static).
	 */
	public static void testSimpleGUI(Sheet table) {
		// init parameters
		StdDrawEx2.setCanvasSize(Ex2Utils.WINDOW_WIDTH, Ex2Utils.WINDOW_HEIGHT);
