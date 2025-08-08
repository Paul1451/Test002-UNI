package de.htwberlin.roboapp;

import java.util.Scanner;

/**
 * Utility methods for robust console input handling.
 *
 * @author ChatGPT
 */
public final class InputUtil {

  private InputUtil() {
    // utility
  }

  /**
   * Reads an integer in the provided range.
   *
   * @param in     scanner to read from
   * @param prompt message shown to the user
   * @param min    minimum accepted value
   * @param max    maximum accepted value
   * @return validated integer in range
   */
  public static int readIntInRange(Scanner in, String prompt, int min, int max) {
    int value;
    while (true) {
      System.out.print(prompt);
      String line = in.nextLine();
      try {
        value = Integer.parseInt(line.trim());
        if (value >= min && value <= max) {
          return value;
        }
      } catch (NumberFormatException ex) {
        // ignore and reprompt
      }
    }
  }

  /**
   * Reads a non-empty string from console.
   *
   * @param in     scanner to read from
   * @param prompt message shown to the user
   * @return trimmed non-empty string
   */
  public static String readNonEmpty(Scanner in, String prompt) {
    String line;
    do {
      System.out.print(prompt);
      line = in.nextLine().trim();
    } while (line.isEmpty());
    return line;
  }
}
