package de.htwberlin.roboapp.model;

import de.htwberlin.roboapp.util.Consts;

/**
 * Represents the shuttle that needs artifacts to be installed before launch.
 *
 * @author ChatGPT
 */
public class Shuttle {

  private final String name;
  private final Artifact[] artifacts = new Artifact[3];

  /**
   * Constructs a shuttle with the default artifacts.
   *
   * @param name shuttle name
   */
  public Shuttle(String name) {
    this.name = name;
    artifacts[0] = new Artifact(Consts.ART_NAV);
    artifacts[1] = new Artifact(Consts.ART_CTRL);
    artifacts[2] = new Artifact(Consts.ART_ENERGY);
  }

  /**
   * Finds an artifact by name (case-insensitive).
   *
   * @param artifactName name to search for
   * @return artifact or {@code null}
   */
  public Artifact getArtifactByName(String artifactName) {
    for (Artifact a : artifacts) {
      if (a.getName().equalsIgnoreCase(artifactName)) {
        return a;
      }
    }
    return null;
  }

  /**
   * Checks if all artifacts are installed.
   *
   * @return true if ready to launch
   */
  public boolean isReadyToLaunch() {
    for (Artifact a : artifacts) {
      if (!a.isInstalled()) {
        return false;
      }
    }
    return true;
  }

  /**
   * @return shuttle name
   */
  public String getName() {
    return name;
  }

  /**
   * @return all artifacts of the shuttle
   */
  public Artifact[] getArtifacts() {
    return artifacts;
  }
}
