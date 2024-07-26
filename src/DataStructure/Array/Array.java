package DataStructure.Array;

import java.util.Arrays;

public class Array {
    //defining array
    private Car[] cars = new Car[10];

    //variables
    private int totalList;

    //getter
    public int getTotalList() {
        return totalList;
    }

    //adding index
    public void adding(Car car) {
        this.cars[totalList] = car;
        totalList++;
    }

    //removing index
    public void remove(int index) {
    }

    //show indexes
    public int show() {
        return getTotalList();
    }

    @Override
    public String toString() {
        return Arrays.toString(cars);
    }
}