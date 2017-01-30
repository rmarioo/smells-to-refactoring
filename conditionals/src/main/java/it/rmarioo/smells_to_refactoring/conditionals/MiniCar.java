package it.rmarioo.smells_to_refactoring.conditionals;

public class MiniCar extends Car
{
  public MiniCar(String name)
  {
    super(name);
  }

  @Override
  public int amountForDays(int daysRented)
  {
    return (daysRented < 10) ? 10 + (daysRented * 2)
                             : 20 + (daysRented * 1);
  }
}
