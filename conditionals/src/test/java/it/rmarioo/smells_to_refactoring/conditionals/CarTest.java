package it.rmarioo.smells_to_refactoring.conditionals;

import org.junit.Test;

import static it.rmarioo.smells_to_refactoring.conditionals.Car.*;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class CarTest
{
  @Test
  public void miniCarRental_lessThan_10_days()
  {
    Car car = new Car("Hyundai i10", MINI);
    assertThat(car.amountForDays(5), is(20));
  }

  @Test
  public void miniCarRental_moreThan_10_days()
  {
    Car car = new Car("Hyundai i10", MINI);
    assertThat(car.amountForDays(15), is(35));
  }

  @Test
  public void economyCarRental()
  {
    Car car = new Car("Ford Fiesta", ECONOMY);
    assertThat(car.amountForDays(5), is(35));
  }

  @Test
  public void luxuryCarRental()
  {
    Car car = new Car("BMW", LUXURY);
    assertThat(car.amountForDays(5), is(75));
  }
}