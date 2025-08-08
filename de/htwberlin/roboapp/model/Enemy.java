package de.htwberlin.roboapp.model;

/**
 * Base class for different enemy types.
 *
 * @author ChatGPT
 */
public abstract class Enemy {

  private final String name;
  private int lifePoints;

  /**
   * Constructs an enemy with the given name and life points.
   *
   * @param name       enemy name
   * @param lifePoints starting life points
   */
  public Enemy(String name, int lifePoints) {
    this.name = name;
    this.lifePoints = lifePoints;
  }

  /**
   * Applies damage to this enemy.
   *
   * @param amount damage to deal
   */
  public void takeDamage(int amount) {
    lifePoints = Math.max(0, lifePoints - amount);
    System.out.println(name + " erleidet " + amount + " Schaden (" + lifePoints + " LP übrig)");
  }

  /**
   * @return true if the enemy has no life points left
   */
  public boolean isDefeated() {
    return lifePoints <= 0;
  }

  /**
   * Performs the enemy's fight action against the robot.
   *
   * @param robot target robot
   */
  public abstract void fight(Robot robot);

  /**
   * @return enemy name
   */
  public String getName() {
    return name;
  }
}
