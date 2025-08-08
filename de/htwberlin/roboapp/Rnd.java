package de.htwberlin.roboapp;

import java.util.Random;

/**
 * Provides a single Random instance with a fixed seed for deterministic behavior.
 *
 * @author ChatGPT
 */
public final class Rnd {

  private static final Random R = new Random(42);

  private Rnd() {
    // utility
  }

  /**
   * Returns the shared Random instance.
   *
   * @return random instance seeded with 42
   */
  public static Random get() {
    return R;
  }
}
