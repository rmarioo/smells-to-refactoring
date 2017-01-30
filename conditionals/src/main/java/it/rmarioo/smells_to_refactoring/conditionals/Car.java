package it.rmarioo.smells_to_refactoring.conditionals;

public abstract class Car
{
  private String name;

  public Car(String name)
  {
    this.name = name;
  }

  public abstract int amountForDays(int daysRented);

}