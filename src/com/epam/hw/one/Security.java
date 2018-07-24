package com.epam.hw.one;

public class Security extends Employee{
    private int floorNumber;
    private int lockerNumber;
    private boolean isHavePistol;



    public void setFloorNumber(int floorNumber) {
        this.floorNumber = floorNumber;
    }

    public void setLockerNumber(int lockerNumber) {
        this.lockerNumber = lockerNumber;
    }

    public void setHavePistol(boolean havePistol) {
        isHavePistol = havePistol;
    }

    public int getFloorNumber() {
        return floorNumber;
    }

    public int getLockerNumber() {
        return lockerNumber;
    }

    public boolean isHavePistol() {
        return isHavePistol;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nPosition: " + getClass().getName() +
                "\nfloorNumber: " + floorNumber +
                "\nlockerNumber: " + lockerNumber +
                "\nisHavePistol: " + isHavePistol;
    }
}
