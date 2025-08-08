package de.htwberlin.roboapp.model;

import de.htwberlin.roboapp.Rnd;
import de.htwberlin.roboapp.util.Consts;

/**
 * Represents the player's robot with energy, damage and experience.
 *
 * @author ChatGPT
 */
public class Robot {

  private final String name;
  private int energy = 50;
  private int damage = 0;
  private int experiencePoints = 0;
  private boolean operational = true;

  /**
   * Constructs a robot with the given name.
   *
   * @param name robot name
   */
  public Robot(String name) {
    this.name = name;
  }

  /**
   * @return robot name
   */
  public String getName() {
    return name;
  }

  /**
   * @return current energy
   */
  public int getEnergy() {
    return energy;
  }

  /**
   * @return current damage
   */
  public int getDamage() {
    return damage;
  }

  /**
   * @return experience points
   */
  public int getExperiencePoints() {
    return experiencePoints;
  }

  /**
   * @return whether the robot is operational
   */
  public boolean isOperational() {
    return operational;
  }

  /**
   * Recharges the robot's energy.
   *
   * @param energy amount to add
   */
  public void recharge(int energy) {
    this.energy = Math.min(Consts.MAX_ENERGY, this.energy + energy);
  }

  private static int applyCritWeak(int base) {
    int p = Rnd.get().nextInt(100);
    if (p < Consts.CRIT_CHANCE_PERCENT) {
      return base * 2;
    }
    if (p < Consts.CRIT_CHANCE_PERCENT + Consts.WEAK_CHANCE_PERCENT) {
      return Math.max(1, base / 2);
    }
    return base;
  }

  /**
   * Applies an energy drain with critical/weak chance.
   *
   * @param e base energy to drain
   */
  public void drainEnergy(int e) {
    int delta = applyCritWeak(e);
    energy = Math.max(0, energy - delta);
    if (energy <= 0) {
      operational = false;
    }
  }

  /**
   * Applies damage with critical/weak chance.
   *
   * @param d base damage to take
   */
  public void takeDamage(int d) {
    int delta = applyCritWeak(d);
    damage = Math.min(Consts.MAX_DAMAGE, damage + delta);
    if (damage >= Consts.MAX_DAMAGE) {
      operational = false;
    }
  }

  /**
   * Repairs damage by the given amount.
   *
   * @param d damage to reduce
   */
  public void repairDamage(int d) {
    damage = Math.max(0, damage - d);
  }

  /**
   * Adds experience points.
   *
   * @param xp experience to add
   */
  public void addExperiencePoints(int xp) {
    experiencePoints += xp;
  }

  /**
   * Reduces energy without crit/weak logic.
   *
   * @param amount energy to deduct
   */
  public void reduceEnergyFlat(int amount) {
    energy = Math.max(0, energy - amount);
    if (energy == 0) {
      operational = false;
    }
  }
}
