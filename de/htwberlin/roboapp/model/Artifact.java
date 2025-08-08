package de.htwberlin.roboapp.model;

/**
 * Represents an artifact that can be installed onto the shuttle.
 *
 * @author ChatGPT
 */
public class Artifact {

  private final String name;
  private boolean installed;

  /**
   * Creates a new artifact with the given name.
   *
   * @param name artifact name
   */
  public Artifact(String name) {
    this.name = name;
    this.installed = false;
  }

  /**
   * @return the name of the artifact
   */
  public String getName() {
    return name;
  }

  /**
   * @return true if the artifact is installed
   */
  public boolean isInstalled() {
    return installed;
  }

  /**
   * Marks the artifact as installed.
   */
  public void install() {
    this.installed = true;
  }
}
