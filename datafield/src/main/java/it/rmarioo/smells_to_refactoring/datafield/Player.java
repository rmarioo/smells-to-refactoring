package it.rmarioo.smells_to_refactoring.datafield;

public class Player
{
  private final String name;
  private int score;

  public Player(String name)
  {
    this.name = name;
  }

  public String getName()
  {
    return name;
  }

  public int getScore()
  {
    return score;
  }

  public void increaseScores()
  {
    this.score = score +1;
  }
}
