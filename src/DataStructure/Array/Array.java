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

    //show if it is in the list
    public boolean have(Car car) {
        for (int i = 0; i < cars.length; i++) {
            if (car.equals(cars[i])) {
                return true;
            }
        }
        return false;
    }

    //show the chosen index
    public Car pick(int index) {
        return cars[index];
    }

    @Override
    public String toString() {
        return Arrays.toString(cars);
    }
}