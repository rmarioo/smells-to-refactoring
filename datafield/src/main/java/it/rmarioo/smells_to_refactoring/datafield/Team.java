package it.rmarioo.smells_to_refactoring.datafield;

import java.util.ArrayList;
import java.util.List;

public class Team
{
  private Integer[] scores;
  private List<Player> players;

  public Team(String[] playerNames)
  {
    this.players = new ArrayList<>();
    for(String playerName : playerNames)
      this.players.add(new Player(playerName));

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

  private String[] getPlayerNames()
  {
   return players.stream()
           .map(p -> p.getPlayerName())
           .toArray(String[]::new);
  }

  private int playerIndex(String player)
  {
    for(int i = 0; i < player.length(); i++)
    {
      if (getPlayerNames()[i].equals(player))
        return i;
    }
    throw new RuntimeException("player " + player + " does not exists");
  }



}