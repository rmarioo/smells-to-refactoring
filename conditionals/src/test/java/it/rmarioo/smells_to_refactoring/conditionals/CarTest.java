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
    Car car = new MiniCar("Hyundai i10");
    assertThat(car.amountForDays(5), is(20));
  }

  @Test
  public void miniCarRental_moreThan_10_days()
  {
    Car car = new MiniCar("Hyundai i10");
    assertThat(car.amountForDays(15), is(35));
  }

  @Test
  public void economyCarRental()
  {
    Car car = new EconomyCar("Ford Fiesta");
    assertThat(car.amountForDays(5), is(35));
  }

  @Test
  public void luxuryCarRental()
  {
    Car car = new LuxuryCar("BMW");
    assertThat(car.amountForDays(5), is(75));
  }
}