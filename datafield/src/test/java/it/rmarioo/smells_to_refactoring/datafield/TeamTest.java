package it.rmarioo.smells_to_refactoring.datafield;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class TeamTest
{
  private Team team = new Team(new String[]{"Mertens",
                                            "Milik"});

  @Test
  public void zero_scores_at_beginning()
  {
    assertThat(team.scoresOf("Mertens"), is(0));
    assertThat(team.scoresOf("Milik"), is(0));
  }

  @Test
  public void player_scores_updated()
  {
    team.addScoresFor("Mertens");
    assertThat(team.scoresOf("Mertens"), is(1));
  }

  @Test
  public void team_scores_updated()
  {
    team.addScoresFor("Mertens");
    team.addScoresFor("Milik");
    assertThat(team.totalScores(), is(2));
  }
}
