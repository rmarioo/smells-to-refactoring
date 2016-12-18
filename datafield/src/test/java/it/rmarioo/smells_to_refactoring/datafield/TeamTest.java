package it.rmarioo.smells_to_refactoring.datafield;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class TeamTest
{
  private Team team = new Team(new String[]{"Pippo",
                                            "Pluto"});

  @Test
  public void zero_scores_at_beginning()
  {
    assertThat(team.scoresOf("Pippo"), is(0));
    assertThat(team.scoresOf("Pluto"), is(0));
  }

  @Test
  public void player_scores_updated()
  {
    team.increaseScoresFor("Pippo");
    assertThat(team.scoresOf("Pippo"), is(1));
  }

  @Test
  public void team_scores_updated()
  {
    team.increaseScoresFor("Pippo");
    team.increaseScoresFor("Pluto");
    assertThat(team.totalScores(), is(2));
  }
}
