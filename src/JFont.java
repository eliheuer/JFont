/* JFont, a simple Java UFO font editor. */

import java.awt.Point;                  // For (x,y) points

import java.io.FileInputStream;         // TODO Info here
import java.io.IOException;             // TODO Info here

import java.util.Arrays;                // TODO Info here
import java.util.Scanner;               // Get input
import java.util.Random;                // Random

import javax.xml.bind.JAXBContext;      // TODO Info here
import javax.xml.bind.JAXBElement;      // TODO Info here
import javax.xml.bind.JAXBException;    // TODO Info here
import javax.xml.bind.Marshaller;       // TODO Info here
import javax.xml.bind.Unmarshaller;     // TOdo Info here

public class JFont {

    public static void main(String[] args) {

	// Setup
        int mainMenuChoice;
        Scanner input = new Scanner(System.in);

	// Welcome
	prints("\nWelcome to JFont, a simple UFO editor.\n");

	// Main menu
        mainMenuChoice = mainMenu(input);
	System.out.println("mainMenuChoice: "+mainMenuChoice);

	// Task router
	taskRouter(mainMenuChoice);

	// Debug menu
	debug();
	
    } //END Main Method

    /** Main Menu */
    public static int mainMenu(Scanner input) {
	
	// Set menu variables
	int selection;

	// Display currently selected UFO file.
	System.out.println("(Currently Editing: Sample.UFO)\n");

	// Display Menu 
        System.out.println("Choose from these choices");
        System.out.println("-------------------------");
        System.out.println("1 - Load new UFO");
        System.out.println("2 - Save current UFO");
        System.out.println("3 - Export font  current UFO");
        System.out.println("4 - Edit glyphs");
        System.out.println("5 - Edit UFO metadata");
        System.out.println("6 - Encrypt a number");
        System.out.println("7 - Decrypt a number");
        System.out.println("8 - Help");
	System.out.println("9 - Quit\n");

	// Get input
	System.out.print("Enter a number: ");
        selection = input.nextInt();
        return selection;    
    }

    /** Task router */
    public static void taskRouter(int task) {
	System.out.println("In task router, task is: " + task);
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
