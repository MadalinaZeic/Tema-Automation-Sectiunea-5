package org.example;

public class Employee extends WorkForce {
    private int salary;
    private boolean raise;
    double semesterReview = 0;

    public Employee (String name){
        this.setName(name);
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public boolean getRaise() {
        return raise;
    }

    public void setRaise(boolean raise) {
        this.raise = raise;
    }


    public double getSemesterReview() {
        return semesterReview;
    }

    public void setSemesterReview(double semesterReview) {
        this.semesterReview = semesterReview;
    }
}


