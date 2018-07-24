package com.epam.hw.one;

public class Investor extends Client {
    private String typeOfCard;
    private int countofInvestment;

    public int getCountofInvestment() {
        return countofInvestment;
    }

    public void setCountofInvestment(int countofInvestment) {
        this.countofInvestment = countofInvestment;
    }

    public String getTypeOfCard() {
        return typeOfCard;
    }

    public void setTypeOfCard(String typeOfCard) {
        this.typeOfCard = typeOfCard;
    }

    @Override
    public String toString() {
        return  super.toString() +
                "\nInvestor: " +
                "\ntypeOfCard: " + typeOfCard  +
                "\ncountofInvestment: " + countofInvestment;
    }
}
