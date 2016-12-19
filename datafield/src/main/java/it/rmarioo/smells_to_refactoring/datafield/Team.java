package it.rmarioo.smells_to_refactoring.datafield;

public class Team
{
  private String[] playerNames;
  private Integer[] scores;

  public Team(String[] playerNames)
  {
    this.playerNames = playerNames;

    this.scores = new Integer[playerNames.length];
    for(int i = 0; i < playerNames.length; i++)
      this.scores[i] = 0;
  }

  public void addScoresFor(String player)
  {
    this.scores[playerIndex(player)] ++;
  }

  public int scoresOf(String player)
  {
    return this.scores[playerIndex(player)];
  }

  public int totalScores()
  {
    int totalScores =0;
    for(int i = 0; i < this.scores.length; i++)
      totalScores++;
    return totalScores;
  }

  private int playerIndex(String player)
  {
    for(int i = 0; i < player.length(); i++)
    {
      if (playerNames[i].equals(player))
        return i;
    }
    throw new RuntimeException("player " + player + " does not exists");
  }



}