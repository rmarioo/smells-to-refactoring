package it.rmarioo.smells_to_refactoring.datafield;

import java.util.ArrayList;
import java.util.List;

public class Team
{
  private List<Player> players;

  public Team(String[] playerNames)
  {
    this.players = new ArrayList<>();
    for(String playerName : playerNames)
      this.players.add(new Player(playerName));
  }

  public void addScoresFor(String name)
  {
    Player player = findByName(name);
    player.increaseScores();
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
}