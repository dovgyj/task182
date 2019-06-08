package com.softserve.academy.task178.task;

public class Resault {

    private int quantity;
    private int sum;

    Resault(int q, int s)
    {
        quantity = q;
        sum = s;
    }

    public int getQuantity()
    {
        return quantity;
    }

    public int getSum()
    {
        return sum;
    }

    @Override
    public String toString() {
        return "Resault is quantity " + quantity + " sum " + sum;
    }
}
