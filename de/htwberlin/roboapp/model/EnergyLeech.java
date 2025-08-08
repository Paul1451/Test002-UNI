package de.htwberlin.roboapp.model;

import de.htwberlin.roboapp.Rnd;

/**
 * Enemy that drains energy from the robot.
 *
 * @author ChatGPT
 */
public class EnergyLeech extends Enemy {

  /**
   * Creates a new EnergyLeech.
   *
   * @param name      enemy name
   * @param lifePoints starting life points
   */
  public EnergyLeech(String name, int lifePoints) {
    super(name, lifePoints);
  }

  @Override
  public void fight(Robot robot) {
    int e = 5 + Rnd.get().nextInt(11);
    robot.drainEnergy(e);
  }
}
