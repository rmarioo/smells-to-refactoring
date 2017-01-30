package it.rmarioo.smells_to_refactoring.conditionals;

public class LuxuryCar extends Car
{
  public LuxuryCar(String name)
  {
    super(name);
  }

  @Override
  public int amountForDays(int daysRented)
  {
    return 50 + (daysRented * 5);
  }
}
