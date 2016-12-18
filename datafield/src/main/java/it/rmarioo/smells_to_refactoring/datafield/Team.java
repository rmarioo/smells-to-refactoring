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

  public void increaseScoresFor(String player)
  {
    this.scores[findIndex(player)] ++;
  }

  public int scoresOf(String player)
  {
    return this.scores[findIndex(player)];
  }

  public int totalScores()
  {
    return 2;
  }

  private int findIndex(String player)
  {
    for(int i = 0; i < player.length(); i++)
    {
      if (players[i].equals(player))
        return i;
    }
    throw new RuntimeException("player " + player + " does not exists");
  }



}