package de.htwberlin.roboapp.util;

/**
 * Central place for all constants and messages used in the application.
 *
 * <p>The values are fixed according to the specification.</p>
 *
 * @author ChatGPT
 */
public final class Consts {
  private Consts() {}

  // Allgemein
  public static final String SAVE_FILE = "savegame.dat";
  public static final int MAX_ENERGY = 100;
  public static final int MAX_DAMAGE = 100;
  public static final int EXP_ENEMY_WIN = 5;
  public static final int EXP_ENEMY_LOSE = 1;
  public static final int EXP_ROOM_WIN = 10;
  public static final int EXP_ROOM_LOSE = 1;
  public static final int ENERGY_STEP = 10; // 10% von 100
  public static final int REPAIR_STEP = 15; // Schaden -15 pro Reparatur
  public static final int MIN_XP_FOR_REPAIR_MENU = 50;
  public static final long CHALLENGE_TRY_LIMIT_MS = 30_000L;
  public static final int ROOMS_COUNT = 3; // exakt 3 Räume = 3 Artefakte
  public static final int ESCAPE_SUCCESS_CHANCE_PERCENT = 10;
  public static final int CRIT_CHANCE_PERCENT = 10;
  public static final int WEAK_CHANCE_PERCENT = 10;

  // Artefakte – Namen exakt wie hier (Groß-/Kleinschreibung ignoriert bei Suche)
  public static final String ART_NAV = "Navigationsmodul";
  public static final String ART_CTRL = "Steuerungssystem";
  public static final String ART_ENERGY = "Energiekristall";

  // Hauptmenü (Top-Level, vor Start)
  public static final String[] MAIN_MENU = {
    "1) Spiel starten",
    "2) Spiel fortsetzen",
    "3) Spiel laden",
    "4) Spiel speichern",
    "5) Spiel löschen",
    "6) Programm beenden"
  };

  // Spielmenü (nach Start)
  public static final String[] GAME_MENU = {
    "1) Forschungsstation erkunden",
    "2) Status anzeigen",
    "3) Energie aufladen",
    "4) Reparieren",
    "5) Spiel verlassen"
  };

  // Prompts/Outputs
  public static final String PROMPT_NAME = "Gib den Namen des Roboters ein: ";
  public static final String MSG_WELCOME = "Willkommen auf der verlassenen Forschungsstation.";
  public static final String MSG_NO_SAVE = "Kein gespeichertes Spiel vorhanden.";
  public static final String MSG_SAVED = "Spielstand gespeichert.";
  public static final String MSG_LOADED = "Spielstand geladen.";
  public static final String MSG_DELETED = "Gespeicherter Spielstand gelöscht.";
  public static final String MSG_NEED_STARTED = "Erst ein Spiel starten.";
  public static final String MSG_NEED_XP = "Reparieren erst ab 50 Erfahrungspunkten verfügbar.";
  public static final String MSG_EXIT = "Programm beendet.";
  public static final String MSG_LEAVE_GAME = "Spiel wurde beendet (zurück ins Hauptmenü).";
  public static final String MSG_ENERGY_UP = "+10 Energie (max. 100).";
  public static final String MSG_EXPLORE_START = "[Erkundung] ...";
  public static final String MSG_EXPLORE_NOTHING = "Nichts passiert (50%). Energie -10.";
  public static final String MSG_EXPLORE_ENEMY = "Ein Gegner taucht auf (25%)!";
  public static final String MSG_EXPLORE_ROOM = "Verschlossener Raum gefunden (25%).";
  public static final String MSG_ENCOUNTER_CHOICES = "1) Kämpfen  2) Spiel  3) Fliehen";
  public static final String MSG_ESCAPE_FAIL = "Flucht fehlgeschlagen (10% Chance). Kampf startet!";
  public static final String MSG_ESCAPE_OK = "Flucht gelungen.";
  public static final String MSG_WIN = "Begegnung gewonnen. +5 XP.";
  public static final String MSG_LOSE = "Begegnung verloren. +1 XP.";
  public static final String MSG_TTT_DRAW = "Unentschieden in Tic-Tac-Toe (keine Auswirkung).";
  public static final String MSG_INSTALL_DONE = "Artefakt installiert.";
  public static final String MSG_SHUTTLE_READY = "Alle Artefakte installiert – Shuttle startbereit! (Spiel gewonnen)";
  public static final String MSG_GAME_OVER_ENERGY = "Energie auf 0 – Spiel verloren!";
  public static final String MSG_GAME_OVER_DAMAGE = "Schaden 100 – Spiel verloren!";

  // Gegnernamen
  public static final String ENEMY_STRIKER = "Schlägerdrohne";
  public static final String ENEMY_LEECH = "Stromsauger";

  // Games – Anzeigenamen
  public static final String GAME_TTT = "Tic-Tac-Toe";
  public static final String GAME_NIM = "Nim";
}
