package com.epam.hw.one;

public class Client extends Person {
    private int currentCredit;
    private int currentDebit;
    private int numberOfCards;

    public void setCurrentCredit(int currentCredit){
        this.currentCredit=currentCredit;
    }

    public void setGetCurrentDebit(int currentDebit){
        this.currentDebit=currentDebit;
    }

    public void numberOfCards(int numberOfCards){
        this.numberOfCards=numberOfCards;
    }

    public int getCurrentCredit(){
        return currentCredit;
    }

    public int getCurrentDebit(){
        return currentDebit;
    }

    public int getNumberOfCards(){
        return numberOfCards;
    }

    @Override
    public String toString(){
        return super.toString() + "\nCredit: " + getCurrentCredit() + "\nDebit: " + getCurrentDebit() + "\nNumber of Cards: " + getNumberOfCards();
    }


}

