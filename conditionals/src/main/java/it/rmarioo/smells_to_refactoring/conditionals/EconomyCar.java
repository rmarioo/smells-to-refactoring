package it.rmarioo.smells_to_refactoring.conditionals;

public class EconomyCar extends Car
{
  public EconomyCar(String name)
  {
    super(name,ECONOMY);
  }

  @Override
  public int amountForDays(int daysRented)
  {
    return 20 + (daysRented * 3);
  }
}
