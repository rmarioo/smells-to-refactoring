package it.rmarioo.smells_to_refactoring.conditionals;

import org.junit.Test;

import static it.rmarioo.smells_to_refactoring.conditionals.Car.*;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class CarTest
{
  private final Car miniCar = new Car("Hyundai i10", MINI);
  private final Car economyCar = new Car("Ford Fiesta", ECONOMY);
  private final Car luxuryCar = new Car("BMW", LUXURY);

  @Test
  public void miniCarRental_lessThan_10_days() throws Exception
  {
    assertThat(miniCar.amountForDays(5), is(20));
  }

  @Test
  public void miniCarRental_moreThan_10_days() throws Exception
  {
    assertThat(miniCar.amountForDays(15), is(35));
  }

  @Test
  public void economyCarRental() throws Exception
  {
    assertThat(economyCar.amountForDays(5), is(35));
  }

  @Test
  public void luxuryCarRental() throws Exception
  {
    assertThat(luxuryCar.amountForDays(5), is(75));
  }
}