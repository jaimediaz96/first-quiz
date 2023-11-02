package org.velezreyes.quiz.question6;

public class VendingMachineImpl implements VendingMachine {
  private int currentMoney = 0;

  public static VendingMachine getInstance() {
    return new VendingMachineImpl();
  }

  @Override
  public void insertQuarter() {
    currentMoney += 25;
  }

  @Override
  public Drink pressButton(String name) throws NotEnoughMoneyException, UnknownDrinkException {
    if (currentMoney == 0) throw new NotEnoughMoneyException();

    DrinkImpl drink;
    if (name.equals("ScottCola")) {
      drink = new DrinkImpl("ScottCola", true, 75);
    }
    else if (name.equals("KarenTea")) {
      drink = new DrinkImpl("KarenTea", false, 100);
    }
    else {
      throw new UnknownDrinkException();
    }

    if (currentMoney != drink.getCost()) {
      throw new NotEnoughMoneyException();
    }

    currentMoney = 0;

    return drink;
  }
}
