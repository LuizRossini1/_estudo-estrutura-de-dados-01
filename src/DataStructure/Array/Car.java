package DataStructure.Array;

public class Car {
    //variables
    private String model;

    //constructor
    public Car(String model) {
        this.model = model;
    }

    //getter
    public String getModel() {
        return model;
    }

    @Override
    public String toString() {
        return this.model;
    }
}