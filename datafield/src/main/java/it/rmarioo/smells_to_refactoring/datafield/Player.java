package it.rmarioo.smells_to_refactoring.datafield;

public class Player
{
  private final String playerName;
  private int score;

  public Player(String playerName)
  {

    this.playerName = playerName;
  }

  public String getPlayerName()
  {
    return playerName;
  }

  public int getScore()
  {
    return score;
  }

  public void setScore(int score)
  {
    this.score = score;
  }
}
