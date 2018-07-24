package com.epam.hw.one;

public class IThelper extends Employee {
    private boolean isHaveAccess;
    private int accessLevel;

    @Override
    public String toString() {
        return  super.toString() +
                "\nPosition: " + getClass().getName() +
                "\nisHaveAccess: " + isHaveAccess +
                "\naccessLevel: " + accessLevel;
    }

    public boolean isHaveAccess() {
        return isHaveAccess;
    }

    public void setHaveAccess(boolean haveAccess) {
        isHaveAccess = haveAccess;
    }

    public int getAcessLevel() {
        return accessLevel;
    }

    public void setAcessLevel(int acessLevel) {
        this.accessLevel = acessLevel;
    }
}
