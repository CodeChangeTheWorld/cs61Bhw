/* OpenCommercial.java */

import java.net.*;
import java.io.*;
import java.util.Arrays;
/**  A class that provides a main function to read five lines of a commercial
 *   Web page and print them in reverse order, given the name of a company.
 */

class OpenCommercial {

  /** Prompts the user for the name X of a company (a single string), opens
   *  the Web site corresponding to www.X.com, and prints the first five lines
   *  of the Web page in reverse order.
   *  @param arg is not used.
   *  @exception Exception thrown if there are any problems parsing the 
   *             user's input or opening the connection.
   */
  public static void main(String[] arg) throws Exception {

    BufferedReader keyboard;
    String inputLine;

    keyboard = new BufferedReader(new InputStreamReader(System.in));

    System.out.print("Please enter the name of a company (without spaces): ");
    System.out.flush();        /* Make sure the line is printed immediately. */
    inputLine = keyboard.readLine();

    
    URL urlObj= new URL("http://www.X.com/".replace("X",inputLine));
    BufferedReader reader = new BufferedReader(new InputStreamReader(urlObj.openStream()));
    String currentLine;
    Integer num=4;
    String[] fiveLines= new String[5];
    while ((currentLine = reader.readLine()) != null && num>-1)
          { fiveLines[num]=currentLine + "\n"; 
            num=num-1;}
    System.out.println(Arrays.toString(fiveLines));
  }
}
