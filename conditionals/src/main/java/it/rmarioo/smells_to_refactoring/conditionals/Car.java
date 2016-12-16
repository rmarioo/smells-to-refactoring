package it.rmarioo.smells_to_refactoring.conditionals;

public class Car
{
  public static final int MINI = 0;
  public static final int ECONOMY = 1;
  public static final int LUXURY = 2;

  private String name;
  private int type;

  public Car(String name, int type)
  {
    this.name = name;
    this.type = type;
  }

  public int amountForDays(int daysRented)
  {
    int thisAmount = 0;
    switch(type)
    {
      case MINI:
        if (daysRented < 10)
          thisAmount = 10 + (daysRented * 2);
        else
          thisAmount = 20 + (daysRented * 1);
        break;
      case ECONOMY:
        thisAmount = 20 + (daysRented * 3);
        break;
      case LUXURY:
        thisAmount = 50 + (daysRented * 5);
        break;
    }
    return thisAmount;
  }

}