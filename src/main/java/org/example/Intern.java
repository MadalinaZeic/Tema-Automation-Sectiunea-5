package org.example;

public class Intern extends Employee {

    private boolean isHired;

    public Intern(String name) {
        super(name);
    }


    public boolean getIsHired() {
        return isHired;
    }

    public void setIsHired(boolean hired) {
        isHired = hired;
    }

}
