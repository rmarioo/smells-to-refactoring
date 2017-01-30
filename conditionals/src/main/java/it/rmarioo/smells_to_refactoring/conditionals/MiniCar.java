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
    int thisAmount = 0;
        if (daysRented < 10)
          thisAmount = 10 + (daysRented * 2);
        else
          thisAmount = 20 + (daysRented * 1);
    return thisAmount;
  }
}
