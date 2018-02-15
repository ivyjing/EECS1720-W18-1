package Lab01Exercises;

import java.io.PrintStream;
import java.util.Scanner;

/**
 * This app (Exercise03) prompts the user for a time. If the input adheres the
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
 * (3) If the two tokens can be parsed as an int, then the first token, h, has a
 * value 0 < h <=12. The second token, m, has a value 0 <= m <= 59.
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
 * value as described above. Otherwise, there are no guarantees about this app's
 * behaviour. It may crash, or it may output a number that is correct or
 * incorrect.
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
 * Output: unspecified (app may or may not crash, may produce some number,
 * perhaps 140, whereas the actual number of minutes elapsed since the start of
 * the day is 14*60+20=860)
 * 
 * *** End of Samples ***
 * 
 * @author [INSERT YOUR NAME/STUDENT NUMBER HERE]
 * 
 */
public class Exercise03 {

	public static void main(String[] args) {
		PrintStream output = System.out;
		Scanner input = new Scanner(System.in); // place input.close(); as the
												// final statement to eliminate
												// the compiler warning.

		/*
		 * Step 1: Cut and paste your solution from Exercise02 here (reduce the
		 * comments as appropriate).
		 */

		/*
		 * Step 2: Read the comment block above. You will see that we now need
		 * to implement additional behaviours for the app. The program's
		 * behaviour now is conditional upon adherence to requirement (1) and
		 * requirement (2). We already implemented the conditional behaviour for
		 * requirement (1) and now must do the same for requirement (2).
		 * 
		 * Just as was the case for Exercise02, we will use exception-based
		 * programming for this.
		 * 
		 * To start, run the app and examine the output for the following cases:
		 * 
		 * - input "12:x"
		 * 
		 * - input "XX:13"
		 * 
		 * - input "XX:yy"
		 * 
		 * When you type in these types of inputs, what sort of exception is
		 * raised? Make note of it.
		 * 
		 * Locate the two statements that are causing the exception to be
		 * thrown.
		 */

		/*
		 * Step 3: Surround the two statements identified in step 2 above with
		 * another try-catch block. Be very "stingy" - put *only* the statements
		 * that raise the exception in the try block. Position the try-catch
		 * block right in the middle of the list of statements. Leave all of the
		 * preceding statements outside the try-catch, before the try-catch.
		 * Leave all of the successive statements outside the try-catch, after
		 * the try-catch.
		 * 
		 * For the catch block, we want to handle the type of exception that was
		 * raised in Step 2 above.
		 * 
		 * For the catch block, we want to handle a NumberFormatException type
		 * of exception. If such an exception is caught, print the following
		 * message to the console "Non-numeric data!" and then end the program
		 * cleanly using System.exit(0);
		 */


	}
}
