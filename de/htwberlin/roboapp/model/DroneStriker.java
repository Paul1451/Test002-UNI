package de.htwberlin.roboapp.model;

import de.htwberlin.roboapp.Rnd;

/**
 * Enemy that deals direct damage to the robot.
 *
 * @author ChatGPT
 */
public class DroneStriker extends Enemy {

  /**
   * Creates a new DroneStriker.
   *
   * @param name      enemy name
   * @param lifePoints starting life points
   */
  public DroneStriker(String name, int lifePoints) {
    super(name, lifePoints);
  }

  @Override
  public void fight(Robot robot) {
    int d = 5 + Rnd.get().nextInt(11);
    robot.takeDamage(d);
  }
}
