package org.velezreyes.quiz.question6;

public class DrinkImpl implements Drink {

    private final String NAME;
    private final boolean FIZZY;
    private final int COST;

    public DrinkImpl(String name, boolean fizzy, int cost) {
        this.NAME = name;
        this.FIZZY = fizzy;
        this.COST = cost;
    }

    @Override
    public String getName() {
        return this.NAME;
    }

    @Override
    public boolean isFizzy() {
        return this.FIZZY;
    }

    public int getCost() {
        return this.COST;
    }
}
