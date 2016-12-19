package it.rmarioo.smells_to_refactoring.datafield;

public class Team
{
  private String[] players;
  private Integer[] scores;

  public Team(String[] players)
  {
    this.players = players;

    this.scores = new Integer[players.length];
    for(int i = 0; i < players.length; i++)
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
      if (players[i].equals(player))
        return i;
    }
    throw new RuntimeException("player " + player + " does not exists");
  }



}