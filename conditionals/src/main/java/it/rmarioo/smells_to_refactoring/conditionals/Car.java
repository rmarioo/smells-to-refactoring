package it.rmarioo.smells_to_refactoring.conditionals;

public abstract class Car
{
  public static final int MINI = 0;
  public static final int ECONOMY = 1;
  public static final int LUXURY = 2;

  private String name;
  protected int type;

  public Car(String name, int type)
  {
    this.name = name;
    this.type = type;
  }

  public abstract int amountForDays(int daysRented);

}