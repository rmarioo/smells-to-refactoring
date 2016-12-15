package it.rmarioo.smells_to_refactoring.conditionals;

import org.junit.Test;

import static it.rmarioo.smells_to_refactoring.conditionals.Car.*;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class CarTest
{
  @Test
  public void mini() throws Exception
  {
    Car car = new Car("Hyundai i10", MINI);
    assertThat(car.amount(5), is(20));
  }

  @Test
  public void economy() throws Exception
  {
    Car car = new Car("Ford Fiesta", ECONOMY);
    assertThat(car.amount(5), is(35));
  }

  @Test
  public void luxury() throws Exception
  {
    Car car = new Car("", LUXURY);
    assertThat(car.amount(5), is(75));
  }
}