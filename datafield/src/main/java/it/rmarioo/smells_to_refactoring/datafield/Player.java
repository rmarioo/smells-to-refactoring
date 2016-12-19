package it.rmarioo.smells_to_refactoring.datafield;

public class Player
{
  private final String playerName;

  public Player(String playerName)
  {

    this.playerName = playerName;
  }

  public String getPlayerName()
  {
    return playerName;
  }
}
