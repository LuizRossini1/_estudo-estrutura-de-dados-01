package DataStructure.Array;

public class Main {
    public static void main(String[] args) {
        var car1 = new Car("BMW");
        var car2 = new Car("Ferrai");

        var list = new Array();

       list.adding(car1);
       list.adding(car2);
       list.show();
    }
}