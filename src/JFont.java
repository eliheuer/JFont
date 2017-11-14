/* JFont, a simple Java UFO font editor. */

// AWT
import java.awt.BasicStroke;            // TODO Info here
import java.awt.Canvas;                 // TODO Info here
import java.awt.Color;                  //
import java.awt.Dimension;              //
import java.awt.Graphics;               //
import java.awt.Graphics2D;             //
import java.awt.Point;                  // For (x,y) points
import java.awt.Rectangle;              //
import java.awt.RenderingHints;         //
// import java.awt.image.*;
import java.awt.geom.Point2D;           //
import java.awt.image.BufferedImage;    //

// Input/Output
import java.io.FileInputStream;         // TODO Info here////
import java.io.IOException;             // TODO Info here
import java.io.*;                       //
import javax.imageio.*;                 //

// Util
import java.util.Arrays;                // TODO Info here
import java.util.ArrayList;             //
import java.util.List;                  //
import java.util.Scanner;               // Get input
import java.util.Random;                // Random

// UFO/XML
import javax.xml.bind.JAXBContext;      // TODO Info here
import javax.xml.bind.JAXBElement;      // TODO Info here
import javax.xml.bind.JAXBException;    // TODO Info here
import javax.xml.bind.Marshaller;       // TODO Info here
import javax.xml.bind.Unmarshaller;     // TODO Info here

// User Interface
import javax.swing.JFrame;              //
import javax.swing.JPanel;              //

public class JFont extends Canvas {
    
    private static final int WIN_HEIGHT = 512;
    private static final int WIN_WIDTH = 512;
    private static final Dimension WIN_SIZE = 
        new Dimension(WIN_WIDTH, WIN_WIDTH);
    private static final Color[] colors = {
        new Color(240, 020, 020),
        new Color(240, 120, 000),
        new Color(240, 240, 20 ),
        new Color(40 , 240, 20 ), 
        new Color(020, 150, 60 ), 
        new Color(020, 150, 200),
        new Color(20 , 40 , 220),
        new Color(150, 20 , 240),
        new Color(240, 020, 130)
    };

    public static void main(String[] args) {

	// Setup
        int mainMenuChoice;
        Scanner input = new Scanner(System.in);

	// Welcome
	prints("\nWelcome to JFont, a simple UFO editor.\n");

	// Main menu
        mainMenuChoice = mainMenu(input);
	System.out.println("Main Menu S = "+mainMenuChoice);

	// Task router
	taskRouter(mainMenuChoice);

	// Debug menu
	// debug();
	
    } //END Main Method

    /** Main Menu */
    public static int mainMenu(Scanner input) {
	
	// Set menu variables
	int selection;

	// Display currently selected UFO file.
	System.out.println("(Now Editing: Sample.UFO)\n");

	// Display Menu 
        System.out.println("Choose from these choices");
        System.out.println("-------------------------");
        System.out.println("1 - Load new UFO");
        System.out.println("2 - Save current UFO");
        System.out.println("3 - Export font current UFO");
        System.out.println("4 - Edit glyphs");
        System.out.println("5 - Edit UFO metadata");
        System.out.println("6 - Test Type");
        System.out.println("7 - Edit Glyph Set");
        System.out.println("8 - Help");
	System.out.println("9 - Quit\n");

	// Get input
	System.out.print("Enter a number: ");
        selection = input.nextInt();
        return selection;    
    }

    /** Task router */
    public static void taskRouter(int task) {
	System.out.println("In task router, task = " + task);
        if (task == 1) {loadUFO();}
        if (task == 2) {saveUFO();}
        if (task == 3) {exportFont();}
        if (task == 4) {editGlyphs();}
        if (task == 5) {editUFO();}
        if (task == 6) {testType();}
        if (task == 7) {editGlyphSet();}
        if (task == 8) {help();}
        if (task == 9) {quit();}
    }

    /** Load UFO : Task 1 */
    public static void loadUFO() {
        System.out.println("Load UFO");
    }

    /** Save UFO : Task 2 */
    public static void saveUFO() {
        System.out.println("Save UFO");
    }

    /** Export Font : Task 3 */
    public static void exportFont() {
        System.out.println("Export Font");
    }

    /** Edit glyphs : Task 4 */
    public static void editGlyphs() {
        System.out.println("Edit Glyphs");
        JFrame frame = new JFrame("Edit Glyphs");
        Canvas JFont = new JFont();
        JFont.setSize(400, 400);
        frame.add(JFont);
        frame.pack();
        frame.setVisible(true);
    }

    /** Edit UFO : Task 5 */
    public static void editUFO() {
        System.out.println("Edit UFO");
    }

    /** Test Type : Task 6 */
    public static void testType() {
        System.out.println("Test Type");
    }
    
    /** Edit Glyph Set : Task 7 */
    public static void editGlyphSet() {
        System.out.println("Edit Glyph Set");
    }

    /** Help : Task 8 */
    public static void help() {
        System.out.println("Help");
    }

    /** Quit : Task 9 */
    public static void quit() {
        System.out.println("Quit");
    }

    public void paint(Graphics g) {
        g.fillOval(100, 100, 200, 200);
    }






    /** Print Point */
    public static void printPoint(Point p) {
	System.out.println("("+p.x+","+p.y+")");
    }

    /** Distance */
    public static double distance(Point p1, Point p2) {
	int dx = p2.x - p1.x;
	int dy = p2.y - p1.y;
	return Math.sqrt(dx * dx + dy * dy);
    }

    /** Unicode */
    public static void unicode() {
	for (int i = 913; i <= 937; i++) {
	    System.out.print((char) i);
	}
	System.out.println();	
    }

    /** Basic bezier method */
    public static int bezier(int n, int t) {
    int sum = 0;
    int k = 12;
    for(int i=0; i<n; i++) {
        sum +=
        (k*(n-k))*(1-t);
        System.out.println(" "+sum);
    }
    return sum;
    }

    public static void prints(String m) {
        System.out.println(m);
    } // END  prints method

    /** Debug */
    public static void debug() {	
        prints("Welcome to The debug menu.");
        int n = 512;
        int t = 256;
        int bez = bezier(n,t);
        System.out.println("bez = "+bez);

	Point blank;
	blank = new Point(3, 4);
	int x = blank.x;
	System.out.println("bx= "+x);
	System.out.println("("+blank.x+","+blank.y+")");
	printPoint(blank);
	System.out.println(blank);
	Point pointA = new Point(0,0);
	Point pointB = new Point(164,64);
	System.out.println(distance(pointA, pointB));
	unicode();
    } //END debug method

} //END JFont class
