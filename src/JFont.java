/** JFont, a simple Java UFO font editor. */

import java.awt.Point;                  // For (x,y) points

import java.io.FileInputStream;
import java.io.IOException;

import java.util.Arrays;
import java.util.Scanner;               // Get input
import java.util.Random;                // Random

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

public class JFont {

    public static void main(String[] args) {

	// Start input
	Scanner in = new Scanner(System.in);

	// cli();
	// Debug tools
	debug();
	
    } //END Main

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
        prints("Welcome to JFont Alpha!");
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
