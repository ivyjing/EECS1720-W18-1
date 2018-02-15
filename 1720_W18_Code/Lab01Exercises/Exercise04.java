package Lab01Exercises;

import java.io.PrintStream;
import java.util.Scanner;

/**
 * This app (Exercise04) prompts the user for a time. If the input adheres the
 * input requirements, then the app prints to the console the number of minutes
 * that passed since the start of that day or otherwise the specified feedback
 * message. Otherwise, this app crashes or has possibly incorrect behaviours.
 * 
 * The start of the Xth day is defined as midnight of the (X-1)th day. For
 * instance, the start of the day Tuesday Jan 02, 2018 is defined as the
 * midnight of Monday Jan 1st (12:00am). See
 * http://en.wikipedia.org/wiki/12-hour_clock
 * 
 * The smallest value is 12:00, for which 0 minutes have elapsed since the start
 * of the day (i.e., 0 hours * 60 minutes + 0 minutes = 0 + 0 = 0). The largest
 * value is 11:59, for which 719 minutes have elapsed since the start of the day
 * (i.e., 11 hours * 60 minutes + 59 minutes = 660 + 59 = 719).
 * 
 * *** Required User Input ***
 * 
 * (1) an input that *ideally* contains two colon-delimited tokens (e.g., h:m).
 * Let the tokens be denoted h and m, respectively. But possibly not. If the
 * colon is present, then the colon may be prefixed or suffixed with an
 * arbitrary number of space characters.
 * 
 * (2) if the colon-delimiter is present, then each of the two tokens can
 * *ideally* be parsed as an int. But possibly not.
 * 
 * (3) if the first token, h, can be parsed as an int, then it *ideally* has a
 * value 0 < h <=12, but possibly not. If the second token, m, can be parsed as
 * an int, then *ideally* it has a value 0 <= m <= 59, but possibly not.
 * 
 * 
 * *** App Behaviour: ***
 * 
 * If the user's input does not contain a colon-delimiter, then the app does a
 * clean exit, with the message "Missing Colon!".
 * 
 * If the user's input does contain a colon-delimiter, but the tokens cannot
 * both be parsed as ints, then the app does a clean exit, with the message
 * "Non-Numeric Data!".
 * 
 * If the user's input contains a colon-delimiter and the tokens can be parsed
 * as ints, and if the input adheres to requirement (3), then this app prints a
 * value as described above. Otherwise, the app does a clean exit, with the
 * message "Values out of range!".
 * 
 * If the user input is not ideal for several reasons (e.g., does not have a
 * colon, nor can the tokens be parsed as ints, then the app's behaviour will be
 * determined by the order specified above.
 * 
 * *** Sample 1: ***
 * 
 * Input: 11:50
 * 
 * Output: 710
 * 
 * e.g., 11 * 60 + 50 = 710
 * 
 * *** Sample 2: ***
 * 
 * Input: 12:10  (or 0:10)
 * 
 * Output: 10
 * 
 * e.g., 0 * 60 + 10 = 10 (because 12:00 am is the start of the day, see above
 * for further explanation)
 * 
 * *** Sample 3: ***
 * 
 * Input: 56
 * 
 * Output: Missing Colon!
 * 
 * *** Sample 4: ***
 * 
 * Input: "" (i.e., the empty string)
 * 
 * Output: Missing Colon!
 * 
 * *** Sample 5: ***
 * 
 * Input: asd:asd
 * 
 * Output: Non-numeric data!
 * 
 * *** Sample 6: ***
 * 
 * Input: 14:20
 * 
 * Output: Values out of range!
 * 
 * *** End of Samples ***
 * 
 * 
 * @author [INSERT YOUR NAME/STUDENT NUMBER HERE]
 * 
 */
public class Exercise04 {

	public static void main(String[] args) {
		PrintStream output = System.out;
		Scanner input = new Scanner(System.in); // place input.close(); as the
												// final statement to eliminate
												// the compiler warning.

		/*
		 * Step 1: Cut and paste your solution from Exercise03 here (reduce the
		 * comments as appropriate).
		 */

		/*
		 * Step 2: Read the comment block above. You will see that we now need
		 * to implement additional behaviours for the app. The program's
		 * behaviour now is conditional upon adherence to requirement (1), (2)
		 * and requirement (3). We already implemented the conditional behaviour
		 * for requirements (1) and (2), and now must do the same for
		 * requirement (3).
		 * 
		 * Just as was the case for Exercise02, we will use exception-based
		 * programming for this.
		 * 
		 * To start, run the app and examine the output for the following cases:
		 * 
		 * - input "78:12"
		 * 
		 * - input "12:98"
		 * 
		 * When you type in these types of inputs, you should see that, in both
		 * cases, that the app outputs a number and then exits cleanly. No
		 * exception is thrown! If we want to implement the specified behaviour,
		 * then we will need to raise the exception programmatically.
		 * 
		 * Identify the statements the implement the minutes calculation.
		 * Immediately before that, add a boolean condition that implements the
		 * range validation. Place the boolean condition in a if clause which
		 * conditionally prints "Value out of range!" to the console.
		 * 
		 * Test the app to see it at least prints the correct message to the
		 * console (although it will still crash).
		 */


		/*
		 * Step 3: In this step, you will modify your if clause. Instead of
		 * printing to the console, you will instead raise an exception.
		 * 
		 * You can do this by instantiating the exception and then throwing it.
		 * To instantiate a RuntimeException exception, invoke the constructor
		 * the accepts a single String parameter (use keyword 'new'). Pass the
		 * message "Value out of range!" to the constructor. To throw it,
		 * precede the instantiation with the keywork 'throw'.
		 * 
		 * Invoke the app. You will see that it still crashes. This is because
		 * your if clause raised the exception, but your app does not handle the
		 * raised exception. So the VM instead terminates the app. You should
		 * move to step 4 to rectify this.
		 */

		/*
		 * Step 4: In this step, you will modify your app to catch the raised
		 * exception.
		 * 
		 * Surround the if-clause that you created in step 3 with a try-catch
		 * block. Be very "stingy" - put *only* the if-clause that raises the
		 * exception in the try block. Position the try-catch block right in the
		 * middle of the list of statements. Leave all of the preceding
		 * statements outside the try-catch, before the try-catch. Leave all of
		 * the successive statements outside the try-catch, after the try-catch.
		 * 
		 * For the catch block, we want to handle a RuntimeException type of
		 * exception. If such an exception is thrown, then print the exception's
		 * message to the console. You can use the getMessage() service of
		 * RuntimeExeption. Then end the program cleanly using System.exit(0);
		 * 
		 */


	}
}
