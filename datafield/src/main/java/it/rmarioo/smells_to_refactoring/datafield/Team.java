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

  public void addScoresFor(String name)
  {
    Player player = findByName(name);
    player.setScore(player.getScore() +1);
    this.scores[playerIndex(name)] ++;
  }

  public int scoresOf(String player)
  {
    return findByName(player).getScore();
  }

  public int totalScores()
  {
    return  players.stream()
                   .mapToInt(p-> p.getScore())
                   .sum();
  }

  private Player findByName(String name)
  {
    return this.players
                          .stream()
                          .filter(p-> p.getPlayerName().equals(name))
                          .findFirst()
                          .orElseThrow(() ->new RuntimeException("not found " + name));
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