package org.jt.staticfolderconcept;

public class Student {
    private String name;
    private int roll;
    private double fee;

    public Student() {
    }

    public Student(String name, int roll, double fee) {
        this.name = name;
        this.roll = roll;
        this.fee = fee;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    public double getFee() {
        return fee;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }

}
